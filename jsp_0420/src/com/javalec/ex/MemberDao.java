package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Context context = null;
	DataSource ds = null;
	
	//생성자 jdbc연결
	public MemberDao(){
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	//MemberDao mDao = new MemberDao(); 와 똑같다.
	//싱글톤?
	private static MemberDao instance = new MemberDao(); //static 프로그램이 구동하는 동시에 실행된다.
	public static MemberDao getInstance() {
		return instance;
	}
	
	//user 정보
	public MemberDto getMember(String id) {
		String sql = "select * from b_member where id=?";
		String pw,name,email,address;
		Timestamp b_date;
		MemberDto mdto = null;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
				while(rs.next()) {
					//이렇게 해도 되나? 되겠지??
					id = rs.getString("id");
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
		int check = 0;
		String sql = "select id,pw from b_member where id=?";
		String ch_id,ch_pw;
		try {
			
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//데이터가 있으면
				ch_id = rs.getString("id");
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
		return check;
	}//userCheck
	
	
	//회원 전체 목록 가져오기
	public ArrayList<MemberDto> all_list(){
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		String sql = "select * from b_member";
		String id,pw,name,email,address;
		Timestamp b_date;
		try {
			con = ds.getConnection();
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
	
	
	
	//연결 끊기
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs ){
		try {
			if(con!=null)con.close();
			if(pstmt!=null)pstmt.close();
			if(rs!= null) rs.close();
			System.out.println(">> 연결 해제 성공");
		} catch (Exception e2) {
			e2.printStackTrace();
		}		
	}
	
	
	
	
}
