package com.javalec.ex.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.javalec.ex.DTO.EventDto;
import com.javalec.ex.DTO.MemberDto;

import oracle.net.aso.p;

public class MemberDao {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Context context = null;
	DataSource ds = null;
	ArrayList<MemberDto> mdtos = new ArrayList<MemberDto>(); //이벤트 arrayList
	MemberDto mdto = new MemberDto();
	
	int mnum;
	String id,pw,name,email,postcode,address,address2,address3,day2,
	phone,gender,news,sms,sql,birth;
	Timestamp joindate;
	
	public MemberDao(){
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
			con = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//로그인
	public int login(String id,String pw) {
		System.out.println(">> 로그인 메소드");
		System.out.println("입력 id : "+id+" |  입력 pw : "+pw);
		int check = 0;
		sql = "select * from member where id=? and pw=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				check = 1;
				System.out.println("일치하는 회원 존재");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return check ;
	}
	
	//회원가입
	public int joinMember(MemberDto mdto) {
		System.out.println(">> 회원가입 메소드");
		int check = 0;
		sql = "insert into member values(member_seq.nextval,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,sysdate)";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getPostcode());
			pstmt.setString(6, mdto.getAddress());
			pstmt.setString(7, mdto.getAddress2());
			pstmt.setString(8, mdto.getAddress3());
			pstmt.setString(9, mdto.getPhone());
			pstmt.setString(10, mdto.getBirth());
			pstmt.setString(11, mdto.getDay2());
			pstmt.setString(12, mdto.getGender());
			pstmt.setString(13, mdto.getNews());
			pstmt.setString(14, mdto.getSms());
			
			check = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		System.out.println("회원가입 성공 여부 (1:성공,0실패) : "+check);
		return check ;
	}
	
	//회원정보 가져오기
	public MemberDto userInfo(int mnum) {
		System.out.println(">> 회원정보 메소드");
		System.out.println("조회할 회원 번호 : "+mnum);
		sql = "select * from member where mnum = ?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mnum);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return mdto ;
	}
	
	//아이디 중복체크
	public int idChk(String id) {
		System.out.println("id : "+id);
		System.out.println(">> 아이디중복체크 메소드");
		int check = 0;
		sql = "select * from member where id=?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				check = 1;
				System.out.println("__존재하는 아이디");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return check ;
		
	}
	
	//회원정보수정
	public int updateUser(MemberDto mdto) {
		System.out.println(">> 회원정보수정 메소드");
		int check = 0;
		sql = "update member set pw=?,name=?,email=?,postcode=?,address=?,address2=?,address3=?,phone=?,birth=?,"
				+ "day2=?,gender=?,news=?,sms=? where mnum = ?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getId());
			pstmt.setString(2, mdto.getPw());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setString(5, mdto.getPostcode());
			pstmt.setString(6, mdto.getAddress());
			pstmt.setString(7, mdto.getAddress2());
			pstmt.setString(8, mdto.getAddress3());
			pstmt.setString(9, mdto.getPhone());
			pstmt.setString(10, mdto.getBirth());
			pstmt.setString(11, mdto.getDay2());
			pstmt.setString(12, mdto.getGender());
			pstmt.setString(13, mdto.getNews());
			pstmt.setString(14, mdto.getSms());
			pstmt.setInt(15, mdto.getMnum());

			check = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		System.out.println("회원정보수정 성공여부 (1:성공,0:실패) : "+check);
		return check ;
		
	}
	
	//회원탈퇴
	public int delUser(int mnum) {
		System.out.println(">> 회원탈퇴 메소드");
		int check = 0;
		sql = "delete form member where mnum = ?";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, mnum);
			check = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		System.out.println("회원탈퇴 성공여부 (1:성공,0:실패) :"+check);
		return check ;
		
	}
	
	//회원 전체목록
	public ArrayList<MemberDto> allUser() {
		System.out.println(">> 회원 리스트  메소드");

		sql = "select mnum,id,pw,name,email,postcode,address,address2,address3,phone,to_char(birth,'YYYY-MM-DD')as birth,"+
				"day2,gender,news,sms,joindate from member";
		try {
			con = ds.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				mnum = rs.getInt("mnum");
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				postcode = rs.getString("postcode");
				address = rs.getString("address");
				address2 = rs.getString("address2");
				address3 = rs.getString("address3");
				phone = rs.getString("phone");
				birth = rs.getString("birth");
				day2 = rs.getString("day2");
				gender = rs.getString("gender");
				news = rs.getString("news");
				sms = rs.getString("sms");
				joindate = rs.getTimestamp("joindate");
				
				mdtos.add(new MemberDto(mnum, id, pw, name, email, postcode, address, address2, address3, phone, birth,day2, gender, news, sms, joindate));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		
		return mdtos;
		
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
