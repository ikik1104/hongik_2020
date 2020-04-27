package com.javalec.ex.BDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.BDto.BDto;

public class BDao {
	//connection
	Connection con = null;
	Context context = null;
	DataSource ds = null;
	
	//객체선언
	ArrayList<BDto> list = new ArrayList<BDto>();
	BDto bdto = new BDto();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	public BDao() {
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp.env.jdbc.Oracle11g");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//싱글톤 패턴
	private static BDao instance = new BDao();
	public static BDao getInstance() {
		return instance;
	}

	
	//전체 select
	public ArrayList<BDto> list(){
		sql = "select * from mvc_board";
		String name,title,content;
		int id,hit,group,step,indent;
		Timestamp date;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getInt("bid");
				name = rs.getString("bname"); 
				title = rs.getString("btitle");
				content = rs.getString("bcontent");
				date  = rs.getTimestamp("bdate");
				hit = rs.getInt("bhit");
				group = rs.getInt("bgroup");
				step = rs.getInt("bstep");
				indent = rs.getInt("bindent");
				
				list.add(new BDto(id,name,title,content,date,hit,group,step,indent));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			close(con,pstmt,rs);
		}
		
		
		return list;
	}
	
	
	private void close(Connection con , PreparedStatement pstmt , ResultSet rs) {
		
		try {
			if(con!=null)con.close();
			if(pstmt!=null)pstmt.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	private Connection getConnection() {
		Connection con = null;
		Context context = null;
		DataSource ds = null;
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp.env.jdbc.Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
