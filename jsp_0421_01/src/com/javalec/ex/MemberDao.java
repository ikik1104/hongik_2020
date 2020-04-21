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
	
	MemberDao(){
		
	}
	

	//싱글톤..?
	private static MemberDao instatnce = new MemberDao();
	public static MemberDao getInstance() {
		return instatnce;
	}
	
	//유저 삭제
	public int del_user(String id) {
		int check = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement("delete from b_member2 where id=?");
			pstmt.setString(1, id);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return check;
	}
	
	
	//회원정보수정
	public int update_user(MemberDto mdto) {
		int check = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement("update b_member2 set name=?,email=?,address1=?,address2=?,address3=?,u_date=sysdate where id=?");
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getEmail());
			pstmt.setString(3, mdto.getAddress1());
			pstmt.setString(4, mdto.getAddress2());
			pstmt.setString(5, mdto.getAddress3());
			pstmt.setString(6, mdto.getId());
			check = pstmt.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		return check;
	}
	
	
	//회원 한명의 정보 가져오기 
	public MemberDto user_info (String id) {
		System.out.println("회원의 아이디 : "+id);
		MemberDto mdto = null;
		String pw,name,email,address1,address2,address3;
		Timestamp b_date,u_date;
		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from b_member2 where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pw = rs.getString("pw");
				System.out.println(pw);
				name = rs.getString("name");
				email = rs.getString("email");
				address1 = rs.getString("address1");
				address2 = rs.getString("address2");
				address3 = rs.getString("address3");
				b_date = rs.getTimestamp("b_date");
				u_date = rs.getTimestamp("u_date");
				mdto = new MemberDto(id,pw,name,email,address1,address2,address3,b_date,u_date);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			close(con,pstmt,rs);
		}
		
		return mdto;
		
	}
	
	
	//로그인
	
	public int login(String id, String pw) {
		int check = 0;
		String pw2;
		
		String sql = "select * from b_member2 where id=? and pw =?";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				pw2 = rs.getString("pw");
				if(pw2.equals(pw)) {
					check = 1;
				}else {
					check = 0;
				}
			}else {
				check = -1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		return check;
	}
	
	//회원 전체 목록
	public ArrayList<MemberDto> all_list(){
		System.out.println("전체목록 가져오기");
		ArrayList<MemberDto> mdto = new ArrayList<MemberDto>();
		String id,pw,name,email,address1,address2,address3;
		Timestamp b_date,u_date;
		String sql = "select * from b_member2";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("탄다!!");
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address1 = rs.getString("address1");
				address2 = rs.getString("address2");
				address3 = rs.getString("address3");
				b_date = rs.getTimestamp("b_date");
				u_date = rs.getTimestamp("u_date");
				mdto.add(new MemberDto(id,pw,name,email,address1,address2,address3,b_date,u_date));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		return mdto;
	}
	
	
	//아이디 중복 확인
	public int id_chk(String id) {
		int check = 0;
		
		String sql = "select * from b_member2 where id=?";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				check=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		
		
		return check;
	}
	
	
	//회원가입
	public int join(MemberDto mdto) {
		int check = 0;
		String sql = "insert into b_member2 values(?,?,?,?,?,?,?,sysdate,sysdate)";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getAddress1());
			pstmt.setString(6, mdto.getAddress2());
			pstmt.setString(7, mdto.getAddress3());
			check = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		return check;
	}
	
	
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Connection getConnection() {
		System.out.println(">> Connection 진행 ");
		Connection con = null;
		Context context = null;
		DataSource ds = null;
		
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
	
}
