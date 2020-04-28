package com.javalec.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.BDto;

public class BDao {
	Connection con = null;
	Context context = null;
	DataSource ds = null;
	//객체 선언
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	//
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto = new BDto();
	
	public BDao(){
		//생성자 커넥션 풀
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//insert 메소드
		public void insert(BDto dto) {
			int check = 0;
			sql = "insert into mvc_board values(MVC_BOARD_SEQ.nextval,?,?,?,sysdate,0,MVC_BOARD_SEQ.currval,0,0)";
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getBname());
				pstmt.setString(2, dto.getBtitle());
				pstmt.setString(3, dto.getBcontent());
				check =  pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(con, pstmt, rs);
			}
			if(check == 0) {
				System.out.println("insert를 실패하였습니다.");
			}
			
		}	
		
		
		//update 메소드
			public void update(BDto dto) {
				int check = 0;
				sql = "update mvc_board set bname = ?,btitle=?, bcontent=? where bid=?";
				try {
					con = ds.getConnection();
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, dto.getBname());
					pstmt.setString(2, dto.getBtitle());
					pstmt.setString(3, dto.getBcontent());
					pstmt.setInt(4, dto.getBid());
					check =  pstmt.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					close(con, pstmt, rs);
				}
				if(check == 0) {
					System.out.println("수정을 실패하였습니다.");
				}
				
			}
			
	//게시글 삭제
	public int delete(int bid) {
		int check = 0;
		sql = "delete mvc_board where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			check =  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		if(check == 0) {
			System.out.println("삭제를 실패하였습니다.");
		}
		
		return check;
	}
	
	//리스트를 불러오는 메소드
	public ArrayList<BDto> list (){
		String name , title, content;
		int id,hit,group,indent,step;
		Timestamp date;
		sql = "select * from mvc_board order by bgroup desc, bstep asc";
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
				
				dtos.add(new BDto(id, name, title, content, date, group, hit, step, indent));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return dtos;
	}
	
	//상세보기 메소드 겸 게시글 정보 하나 가져오기
		public BDto detail(int bid){
			String bname , btitle, bcontent;
			int bhit,bgroup,bindent,bstep;
			Timestamp bdate;
			sql = "select * from mvc_board where bid=?";
			
			
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bid);
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					//성공일시 안찍음
					bid = rs.getInt("bid");
					bname = rs.getString("bname");
					btitle = rs.getString("btitle");
					bcontent = rs.getString("bcontent");
					bdate = rs.getTimestamp("bdate");
					bhit = rs.getInt("bhit");
					bgroup = rs.getInt("bgroup");
					bindent = rs.getInt("bindent");
					bstep = rs.getInt("bstep");
					
					dto = new BDto(bid, bname, btitle, bcontent, bdate, bgroup, bhit, bstep, bindent);
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(con, pstmt, rs);
			}
			
			return dto;
		}
	
		
		//조회수 증가 메소드
		public void hit_up(int bid) {
			int check = 0;
			sql = "update mvc_board set bhit = bhit+1 where bid = ?";
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, bid);
				check =  pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(con, pstmt, rs);
			}
			
			if(check == 0) {
				System.out.println("조회수 증가 실패");
			}
		}
		
		
	
	//close
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
