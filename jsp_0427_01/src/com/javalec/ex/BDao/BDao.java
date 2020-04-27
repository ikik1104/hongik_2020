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

	//커넥션 풀에 필요한 친구들
	Connection con = null;
	Context context = null;
	DataSource ds = null;
	//DB접속
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//데이터를 담는 친구들
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto = new BDto();

	int bId,bGroup,bHit,bStep,bIndent;
	String bName,bTitle,bContent;
	Timestamp bDate;
	String sql = null;
	
	//생성자 - 커넥션 풀 연결 (객체선언)
	public BDao() {
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	public ArrayList<BDto> list(){
		sql = "select * from mvc_board";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bId = rs.getInt("bId");
				bName = rs.getString("bName");
				bTitle = rs.getString("bTitle");
				bContent = rs.getString("bContent");
				bDate = rs.getTimestamp("bDate");
				bHit = rs.getInt("bHit");
				bGroup = rs.getInt("bGroup");
				bStep = rs.getInt("bStep");
				bIndent = rs.getInt("bIndent");
				
				dtos.add(new BDto(bId,bName,bTitle,bContent,bDate,bHit,bGroup,bStep,bIndent));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			close(con, pstmt, rs);
		}
		
		return dtos;
	}
	

	
	private void close(Connection con , PreparedStatement pstmt, ResultSet rs) {
			
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null)pstmt.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
