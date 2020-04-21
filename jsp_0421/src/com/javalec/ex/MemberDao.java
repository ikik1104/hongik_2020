package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Context context = null;
	String sql="";

	//MemberDao mDao = new MemberDao(); 와 똑같다.
	//싱글톤?
	private static MemberDao instance = new MemberDao(); //static 프로그램이 구동하는 동시에 실행된다.
	public static MemberDao getInstance() {
		return instance;
	}
	
	//회원 삭제
	public int deleteMember(String id) {
		System.out.println("------- 회원 1명 삭제 메소드 -------");
		int check = 0;
		sql = "delete b_member where id=?";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		System.out.println("회원삭제 결과 (1:성공,0:실패): "+check);
		return check;
	}
	
	//회원정보 수정
	public int updateMember(MemberDto mdto) {
		System.out.println("------- 회원정보수정 메소드  -------");
		int check = 0;
		sql = "update b_member set pw=?, name=?,email=?,address=? where id=? ";
		try {
			con = getConnection(); //context에서 커넥션 가져오기
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getPw());
			pstmt.setString(2, mdto.getName());
			pstmt.setString(3, mdto.getEmail());
			pstmt.setString(4, mdto.getAddress());
			pstmt.setString(5, mdto.getId());
			check = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);		
		}
		System.out.println("회원정보 수정결과 (1:성공,0:실패): "+check);
		return check;
	}
	
	//아이디 중복체크(회원가입)
	public int confirmId(String id) {
		System.out.println("------- 아이디중복체크 메소드  -------");
		int check = 0;
		sql = "select id from b_member where id=?";
		
		try {
			con = getConnection(); //context에서 커넥션 가져오기
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				check = 1; //데이터가 있다.
			}else {
				check = 0; //데이터가 없다.
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);		
		}
		System.out.println("중복체크 결과 (1:중복,0:중복없음): "+check);
		return check;
	}
	
	//회원가입 
	public int insertMember(MemberDto mdto) {
		System.out.println("------- 회원가입 메소드  -------");
		int check = 0;
		
		sql = "insert into b_member(id,pw,name,email,address) values(?,?,?,?,?)";
		System.out.println(mdto.getId()+" "+mdto.getId()+" "+mdto.getPw()+" "+mdto.getName()+" "+
				mdto.getEmail()+" "+mdto.getAddress());
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getAddress());
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);	
		}
		System.out.println("회원가입 결과 (1:성공,0:실패): "+check);
		return check;
	}
	
	
	//user 정보
	public MemberDto getMember(String id) {
		System.out.println("------- 유저한명의 정보 메소드 -------");
		sql = "select * from b_member where id=?";
		String pw,name,email,address;
		Timestamp b_date;
		MemberDto mdto = null;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
				while(rs.next()) {
					//이렇게 해도 되나? 되겠지??
					pw = rs.getString("pw");
					name = rs.getString("name");
					email = rs.getString("email");
					address = rs.getString("address");
					b_date = rs.getTimestamp("b_date");
					mdto = new MemberDto(id,pw,name,email,address,b_date);
				}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);		
		}
		return mdto;
	}
	
	//로그인 메소드
	public int userCheck(String id, String pw) {
		System.out.println("------- 로그인 메소드  -------");
		int check = 0;
		String sql = "select id,pw from b_member where id=?";
		String ch_pw;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//데이터가 있으면
				ch_pw = rs.getString("pw");
				if(ch_pw.equals(pw)) { //패스워드가 일치하면
					check=1;
				}else { //패스워드가 일치하지 않으면
					check=0;
				}
			}else { //데이터가 없으면
				check=-1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);		
		}
		System.out.println("로그인 결과 (1:성공,0:실패): "+check);
		return check;
	}//userCheck
	
	
	//회원 전체 목록 가져오기
	public ArrayList<MemberDto> all_list(){
		System.out.println("------- 회원 전체 목록 메소드  -------");
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		String sql = "select * from b_member";
		String id,pw,name,email,address;
		Timestamp b_date;
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//이렇게 해도 되나? 되겠지??
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address = rs.getString("address");
				b_date = rs.getTimestamp("b_date");
				list.add(new MemberDto(id,pw,name,email,address,b_date));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return list;
	}
	
	
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!= null)rs.close();
			if(pstmt!= null)pstmt.close();
			if(con!= null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">> 연결 close()");
	}
	
//	//커넥션 풀에서 1개의 커넥션을 가져오는 메소드
		private Connection getConnection() {
			System.out.println(">> Connection 진행 ");
			Connection con = null;
			Context context = null;
			DataSource ds = null;
			
			try {
				context = new InitialContext();
				ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
				con = ds.getConnection();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return con;
		}
	
	
}
