package com.javalec.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	public MemberDao(){
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	//****
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance(){
		return instance;
	}
	
	
	//로그인
	public int login(String id, String pw) {
		String sql = "select id,pw from d_member where id = ?";
		int check = 0;
		String ch_id, ch_pw;
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				ch_id = rs.getString("id");
				ch_pw = rs.getString("pw");
				
				if(pw.equals(ch_pw)) {
					check=1;
				}else {
					check=0;
				}
			}else {
				check = -1;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		
		return check;
	}
	
	//유저 한명
	public MemberDto user_info(String id) {
		MemberDto mdto =null;
		String pw,name,email,address;
		Timestamp b_date;

		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement("select * from b_member id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address = rs.getString("address");
				b_date = rs.getTimestamp("b_date");
				mdto = new MemberDto(id,pw,name,email,address,b_date);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return mdto;
	}
	//유저 전체
	public ArrayList<MemberDto> user_list(){
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		String id,pw,name,email,address;
		Timestamp b_date;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement("select * from b_member");
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address = rs.getString("address");
				b_date = rs.getTimestamp("b_date");
				list.add(new MemberDto(id,pw,name,email,address,b_date));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return list;
	}
	
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con!=null)con.close();
			if(pstmt!=null)pstmt.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
