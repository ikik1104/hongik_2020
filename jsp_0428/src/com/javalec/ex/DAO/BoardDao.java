package com.javalec.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.BoardDto;

public class BoardDao {
	Connection con = null;
	Context context = null;
	DataSource ds = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	ArrayList<BoardDto> dtos = new ArrayList<BoardDto>();
	BoardDto dto = new BoardDto();
	
	
	//커넥션 풀~~
	public BoardDao(){
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//전체목록 가져오기
	public ArrayList<BoardDto> list(){
		System.out.println("전체 목록 가져오기 메소드");
		sql = "select * from mvc_board order by bgroup desc,bstep asc";
		String name, title, content;
		int id, hit, group, indent, step;
		Timestamp date;
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getInt("bid");
				name = rs.getString("bname");
				title = rs.getString("btitle");
				content = rs.getString("bcontent");
				date = rs.getTimestamp("bdate");
				hit = rs.getInt("bhit");
				group = rs.getInt("bgroup");
				indent = rs.getInt("bindent");
				step = rs.getInt("bstep");

				dtos.add(new BoardDto(id, name, title, content, date, hit, group, step, indent));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
			return dtos;
	}
	
	//게시물 상세보기
	public BoardDto detail(int id) {
		System.out.println("게시물 상세보기 메소드");
		sql = "select * from mvc_board where bid=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("bname");
				String title = rs.getString("btitle");
				String content = rs.getString("bcontent");
				Timestamp date = rs.getTimestamp("bdate");
				int hit = rs.getInt("bhit");
				int group = rs.getInt("bgroup");
				int step = rs.getInt("bstep");
				int indent = rs.getInt("bindent");
				dto = new BoardDto(id, name, title, content, date, hit, group, step, indent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	//조회수 증가
	public void add_hit(int bid) {
		System.out.println("조회수 증가 메소드");
		int check = 0;
		sql = "update mvc_board set bhit=bhit+1 where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		if(check == 1) {
			System.out.println("조회수 증가 완료");
		}else {
			System.out.println("조회수 증가 실패..");
		}
	}
	
	//게시물 insert
	public int insert(BoardDto dto) {
		System.out.println("게시물 insert 메소드");
		int check = 0;
		sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,0,0,0)";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		if(check==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return check;
	}
	
	//게시물 update
	public int update(BoardDto dto) {
		System.out.println("게시물update 메소드");
		int check = 0;
		sql = "update mvc_board set bname=?,btitle=?,bcontent=? where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			pstmt.setInt(4, dto.getBid());
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		if(check==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return check;
	}
	
	
	//게시물 delete
	public int delete(int id) {
		System.out.println("게시물 delete 메소드");
		int check = 0;
		sql = "delete from mvc_board where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		if(check==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return check;
	}
	
	
	//답글 insert
	public int reply_insert(BoardDto dto) {
		System.out.println("답글 insert 메소드");
		int check = 0;
		sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,0,?,?,?)";
		
		//답글 step증가
		add_step(dto.getBgroup(),dto.getBstep());
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			pstmt.setInt(4, dto.getBgroup());
			pstmt.setInt(5, (dto.getBstep()+1));
			pstmt.setInt(6, (dto.getBindent()+1));
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		if(check==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return check;
	}
	
	
	//답글 step증가
	public int add_step(int bgroup, int bstep) {
		System.out.println("답글 step증가 메소드");
		int check = 0;
		sql = "update mvc_board set bstep=bstep+1 where bgroup=? and bstep>?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bgroup);
			pstmt.setInt(2, bstep);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		if(check==1) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		return check;
	}
	
	
	//커넥션 닫기
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		System.out.println("커넥션 연결을 해제 합니다.");
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
