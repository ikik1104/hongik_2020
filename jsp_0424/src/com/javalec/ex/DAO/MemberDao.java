package com.javalec.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.MemberDto;
import com.sun.prism.Presentable;

public class MemberDao {

	private MemberDao() {
	}
	
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	
	//객체 선언
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	MemberDao mdao = null;
	MemberDto mdto = null;
	String sql = "";
	
	//select 전체
	public ArrayList<MemberDto> getMembers() {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		sql = "select * from b_member order by b_date desc";
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String address = rs.getString("address");
				Timestamp b_date = rs.getTimestamp("b_date");
				list.add(new MemberDto(id,pw,name,email,address,b_date));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
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
	}//close

	//커넥션 풀
	public Connection getConnection() {
		Connection con = null;
		Context context = null;
		DataSource ds = null;
		
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}//커넥션 풀
}
