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

public class AdminDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Context context = null;
	DataSource ds = null;
	ArrayList<BDto> dtos = new ArrayList<BDto>();
	BDto dto = null;
	
	int bid,bhit,bgroup,bstep,bindent;
	String bname,btitle,bcontent,bfile;
	Timestamp bdate;
	String sql = null;
	
	public AdminDao(){
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//전체 select 
	public ArrayList<BDto> notice_list(String opt, String search) {
		System.out.println(">> (admin) 공지사항 리스트 메소드");
		switch (opt) {
		case "" :
			sql = "select * from " + 
					"(select rownum rnum, bid,bname,btitle,bcontent,bdate,bfile,bhit,bgroup,bstep,bindent from " + 
					"(select * from mvc_board order by bgroup desc,bid asc)) " ;
			break;
		case "all":
			sql = "select * from " + 
					"(select rownum rnum, bid,bname,btitle,bcontent,bdate,bfile,bhit,bgroup,bstep,bindent from " + 
					"(select * from mvc_board where btitle like ? or bcontent like ? order by bgroup desc,bid asc)) ";
			break;
		case "tit":
			sql = "select * from " + 
					"(select rownum rnum, bid,bname,btitle,bcontent,bdate,bfile,bhit,bgroup,bstep,bindent from " + 
					"(select * from mvc_board where btitle like ? order by bgroup desc,bid asc)) " ;
			break;
		case "con":
			sql = "select * from " + 
					"(select rownum rnum, bid,bname,btitle,bcontent,bdate,bfile,bhit,bgroup,bstep,bindent from " + 
					"(select * from mvc_board where bcontent like ?  order by bgroup desc,bid asc)) " ;
			break;
		}
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			if(opt.equals("all")) {
				pstmt.setString(1, "%"+search+"%");
				pstmt.setString(2, "%"+search+"%");
			}else if(opt.equals("tit") || opt.equals("con")) {
				pstmt.setString(1, "%"+search+"%");
			}
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				bid = rs.getInt("bid");
				bname = rs.getString("bname");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bfile = rs.getString("bfile");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				
				dtos.add(new BDto(bid, bname, btitle, bcontent, bdate, bfile,  bhit, bgroup, bstep, bindent));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return dtos;
	}
	
	
	
	//게시글 전체 개수
	public int getlistCount(String opt, String search) {
		System.out.println(">> (admin) 공지사항 전체 개수 메소드");
		int check = 0;
		
		switch (opt) {
		case "" :
			sql = "select count(*) as count from mvc_board";
			break;
		case "all":
			sql = "select count(*) as count from mvc_board where bcontent like ? or btitle like ?";
			break;
		case "tit":
			sql = "select count(*) as count from mvc_board where btitle like ?";
			break;
		case "con":
			sql = "select count(*) as count from mvc_board where bcontent like ?";
			break;
		}
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			if(opt.equals("all")) {
				pstmt.setString(1, "%"+search+"%");
				pstmt.setString(2, "%"+search+"%");
			}else if(opt.equals("tit") || opt.equals("con")) {
				pstmt.setString(1, "%"+search+"%");
			}
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
	
	//게시글 입력하기
	public int Binsert(BDto dto) {
		System.out.println(">> (admin) 공지사항 입력 메소드");
		int check = 0;
		
		sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,?,0,mvc_board_seq.currval,0,0)";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			pstmt.setString(4, dto.getBfile());
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("공지사항 입력 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	
	//update 메소드
	public int update(BDto dto) {
		System.out.println(">> (admin) 공지사항 수정 메소드");
		int check = 0;
		sql = "update mvc_board set bname = ?,btitle=?, bcontent=?,bfile=?"
				+ "  where bid=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			System.out.println(dto.getBname());
			System.out.println(dto.getBtitle());
			System.out.println(dto.getBcontent());
			System.out.println(dto.getBfile());
			System.out.println(dto.getBid());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			pstmt.setString(4, dto.getBfile());
			pstmt.setInt(5, dto.getBid());
			check =  pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		
		System.out.println("공지사항 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check ;
		
	}
	
	//파일 삭제 메소드?
		public int delFile(int num) {
			System.out.println(">> (admin) 공지사항 파일 삭제 메소드");
			int check =0;
			//파일명을 가져오기 위해서~~
			//공지사항은 파일이 1개이니까 걍 num으로 굴려서... 그냥 파일명을 받아와서 지워도 될듯~
			BDto bdto = Bdetail(num);
			
			//c:의 주소
			File file = new File("D:/upload2/"+bdto.getBfile());
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
	
	//게시글 삭제하기
	public int Bdelete(int bid) {
		System.out.println(">> (admin) 공지사항 게시글 삭제 메소드");
		int check = 0;
		
		sql = "delete from mvc_board where bid=? or bgroup=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			pstmt.setInt(2, bid);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		return check;
	}
	//게시글 상세보기
	public BDto Bdetail(int bid) {
		System.out.println(">> (admin) 공지사항 상세정보 메소드");
		sql = "select * from mvc_board where bid = ?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bid = rs.getInt("bid");
				bname = rs.getString("bname");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bdate = rs.getTimestamp("bdate");
				bfile = rs.getString("bfile");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				
				dto = new BDto(bid, bname, btitle, bcontent, bdate, bfile, bhit, bgroup, bstep, bindent);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	
	//조회수 증가
	public int Bhit_add(int bid) {
		System.out.println(">> (admin) 공지사항 조회수 증가 메소드");
		int check = 0;
		
		sql = "update mvc_board set bhit = bhit+1 where bid=?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bid);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("조회수 증가 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	
	//답글달기
	public int Breply(BDto dto) {
		System.out.println(">> (admin) 공지사항 답글달기 메소드");
		int check = 0;
		//그 먼저step올리기
		Breply_step(dto.getBgroup(),dto.getBstep());
		
		sql = "insert into mvc_board values(mvc_board_seq.nextval,?,?,?,sysdate,?,0,?,?,?)";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getBname());
			pstmt.setString(2, dto.getBtitle());
			pstmt.setString(3, dto.getBcontent());
			pstmt.setString(4, dto.getBfile());
			pstmt.setInt(5, dto.getBgroup());
			pstmt.setInt(6, (dto.getBstep()+1));
			pstmt.setInt(7, (dto.getBindent()+1));
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("답글달기 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	//답글달린 게시물 step증가
	public int Breply_step(int bgroup, int bstep) {
		System.out.println(">> (admin) 공지사항 답글 step증가 메소드");
		int check = 0;
		
		sql = "update mvc_board set bstep=bstep+1 where bgroup=? and bstep>?";
		
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bgroup);
			pstmt.setInt(2, bstep);
			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt,rs);
		}
		System.out.println("step증가 성공유무 (1:성공, 0: 실패 )>>>>> "+ check);
		return check;
	}
	
	//커넥션 닫기
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
