package com.javalec.ec;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql="";
	
	
	private static BoardDao instance = new BoardDao();
	public static BoardDao getInstance () {
		return instance;
	}
	
	
	//파일 삭제 메소드?
	public int delFile(int num) {
		System.out.println("파일 삭제 하러 옴");
		int check =0;
		//파일명을 가져오기 위해서~~
		BoardDto bdto = viewBoard(num);
		
		//c:의 주소
		File file = new File("D:/workspace_ox/jsp_0422/WebContent/upload/"+bdto.getB_file());
		if( file.exists() ){
    		if(file.delete()){
    			System.out.println("****** 파일삭제 성공  ******");
    			check = 1;
    		}else{
    			System.out.println("****** 파일삭제 실패 ******");
    			check = 0;
    		}
    	}else{
    		System.out.println("파일이 존재하지 않습니다.");
    	}
		
		return check;
	}
	
	//게시판 삭제
	public int deleteBoard(int num) {
		System.out.println("게시판 삭제 메소드 들어옴");
		
		//파일을 먼저 삭제해 줌
		System.out.println("파일을 먼저 삭제해 주로 감");
		delFile(num); //파일삭제 메소드
		
		int check = 0;
		try {
			con = getConnection();
			pstmt = con.prepareStatement("delete from b_board where b_num = ?");
			pstmt.setInt(1, num);
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return check;
	}
	
	
	//게시판 상세보기
	public BoardDto viewBoard(int num) {
		System.out.println("게시판 상세보기 메소드 들어옴");
		BoardDto bdto = null;
		String b_title,b_content,b_user,b_file;
		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from b_board where b_num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				b_title = rs.getString("b_title");
				b_content = rs.getString("b_content");
				b_user = rs.getString("b_user");
				b_file = rs.getString("b_file");
				bdto = new BoardDto(num,b_title,b_content,b_user,b_file);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return bdto;
	}
	
	//게시판 수정하기
	public int updateBoard(BoardDto bdto) {
		System.out.println("게시판 수정 메소드 들어옴");
		int check = 0;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement("update b_board set b_title=?,b_content=?,b_user=?,b_file=? where b_num=?");
			pstmt.setString(1, bdto.getB_title());
			pstmt.setString(2, bdto.getB_content());
			pstmt.setString(3, bdto.getB_user());
			pstmt.setString(4, bdto.getB_file());
			pstmt.setInt(5, bdto.getB_num());
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return check;
	}
	
	
	//게시판 입력하기
	public int insertBoard(BoardDto bdto) {
		if(bdto!=null) {
			System.out.println("bdto는 null이다!");
		}
		System.out.println("insert메소드 들어옴");
		int check = 0;
		sql = "insert into b_board values(board_seq.nextval,?,?,?,?)";
		try {
			con = getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,bdto.getB_user());
			pstmt.setString(2,bdto.getB_title());
			pstmt.setString(3,bdto.getB_content());
			pstmt.setString(4,bdto.getB_file());
			check = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		System.out.println("insert 결과 (0:실패,1:성공)"+check);
		return check;
	}
	
	//게시판 목록 전체 불러오기
	public ArrayList<BoardDto> getBoards(){
		System.out.println("getBoard 메소드 들어옴");
		ArrayList<BoardDto> bdto = new ArrayList<BoardDto>();
		int num;
		String user,title,content,file;
		
		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from b_board order by b_num desc");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				num = rs.getInt("b_num");
				title = rs.getString("b_title");
				content = rs.getString("b_content");
				user = rs.getString("b_user");
				file = rs.getString("b_file");
				bdto.add(new BoardDto(num,title,content,user,file));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,pstmt,rs);
		}
		return bdto;
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
	
	
	private Connection getConnection() {
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
