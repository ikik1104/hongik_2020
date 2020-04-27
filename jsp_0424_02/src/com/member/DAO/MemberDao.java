package com.member.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import com.member.DTO.MemberDto;

public class MemberDao {

	private MemberDao() {
		
	}
	
	//싱글톤 패턴
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance () {
		return instance;
	}
	
	
	//select 전체
	public ArrayList<MemberDto> getMembers(){
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		
		
		return list;
	}

	public int updateMember(MemberDto mdto) {
		int check = 0;
		
		return check;
	}
	
	public int insertMember(String id) {
		int check = 0;
		return check;
	}
	
	public int deleteMember(String id) {
		int check = 0;
		return check;
	}
	
	
//	close
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con!=null) con.close();
			if(pstmt!=null) pstmt.close();
			if(rs!= null) rs.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//커넥션 풀
	public Connection getConnection() {
		Connection con= null;
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
	}
}
