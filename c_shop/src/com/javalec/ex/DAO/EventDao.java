package com.javalec.ex.DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.BDto;
import com.javalec.ex.DTO.EventDto;

public class EventDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Context context = null;
	DataSource ds = null;
	ArrayList<EventDto> edtos = new ArrayList<EventDto>(); //이벤트 arrayList
	EventDto dto = new EventDto();
	
	int num, hit;
	String title,content,file1,file2;
	String start_day, end_day;
	String sql = null;
	
	
	public EventDao(){
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//이벤트 업로드
	public int insert_event(EventDto edto) {
		System.out.println(">> 이벤트 업로드  메소드");
		int check = 0;
		sql = "insert into event values(event_seq.nextval,?,?,?,?,?,?,0)";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, edto.getTitle());
			pstmt.setString(2, edto.getContent());
			pstmt.setString(3, edto.getFile1());
			pstmt.setString(4, edto.getFile2());
			pstmt.setString(5, edto.getStart_day());
			pstmt.setString(6, edto.getEnd_day());
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}

		System.out.println("이벤트 업로드 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	
	//이벤트 전체 리스트
	public ArrayList<EventDto> evnetList (int page, int limit){
		System.out.println(">> 이벤트 전체 리스트 메소드( 페이징 )");
		int startrow = (page-1)*10+1;
		int endrow = startrow+limit-1;
		
		sql = "select * from " + 
				"(select rownum rnum, num,title,content,file1,file2,to_char(start_day,'YYYY.MM.DD')as start_day,"
				+ "to_char(end_day,'YYYY.MM.DD')as end_day,hit from " + 
				"(select * from event order by num desc)) " + 
				"where rnum>=? and rnum <=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, startrow);
			pstmt.setInt(2, endrow);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				num = rs.getInt("num");
				title = rs.getString("title");
				content = rs.getString("content");
				file1 = rs.getString("file1");
				file2 = rs.getString("file2");
				start_day = rs.getString("start_day");
				end_day = rs.getString("end_day");
				hit = rs.getInt("hit");
				edtos.add(new EventDto(num, title, content, file1, file2, start_day, end_day, hit));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return edtos;
	}
	
	
	//이벤트 조회수 증가
	public int evnetHit(int num){
		System.out.println(">> 이벤트 조회수 증가  메소드");
		int check = 0;
			sql = "update event set hit=hit+1 where num=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			check = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("이벤트 조회수 증가 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	
	//이벤트 상세보기
	public EventDto detail(int num) {
		System.out.println(">> 이벤트 상세정보  메소드");
		sql = "select num,title,content,file1,file2,to_char(start_day,'YYYY.MM.DD')as start_day"
				+ ",to_char(end_day,'YYYY.MM.DD')as end_day,hit from event where num = ?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				num = rs.getInt("num");
				title = rs.getString("title");
				content = rs.getString("content");
				file1 = rs.getString("file1");
				file2 = rs.getString("file2");
				start_day = rs.getString("start_day");
				end_day = rs.getString("end_day");
				hit = rs.getInt("hit");
				
				dto = new EventDto(num, title, content, file1, file2, start_day, end_day, hit);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return dto;
	}
	
	//게시물의 총 개수
	public int getlistCount () {
		System.out.println(">> 이벤트 총 게시글 수 메소드");
		sql = "select count(*)as count from event";
		int check = 0;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				check = rs.getInt("count");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return check;
	}
	
	//해당 이벤트 삭제
	public int delEvent(int num) {
		System.out.println(">> 이벤트 삭제 메소드");
		sql = "delete from event where num = ?";
		int check = 0;
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("이벤트 삭제 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}

	//이벤트 수정
		public int updateEvent(EventDto dto){
			System.out.println(">> 이벤트 조회수 증가  메소드");
			int check = 0;
				sql = "update event set title=?,content=?,file1=?,file2=?,start_day=?,end_day=?"
						+ " where num=?";
			try {
				con = ds.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getContent());
				pstmt.setString(3, dto.getFile1());
				pstmt.setString(4, dto.getFile2());
				pstmt.setString(5, dto.getStart_day());
				pstmt.setString(6, dto.getEnd_day());
				pstmt.setInt(7, num);
				check = pstmt.executeUpdate();
			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				close(con, pstmt,rs);
			}
			System.out.println("이벤트 조회수 증가 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
			return check;
		}
		
		
	//파일 삭제
		public int delFile(String fileName) {
			System.out.println(">> 이벤트 파일 삭제 메소드");
			int check =0;
			
			//c:의 주소
			File file = new File("D:/upload2/"+fileName);
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
	
		
	//커넥션 close
	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con!=null)con.close();
			if(pstmt !=null)pstmt.close();
			if(rs!=null)rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



}
