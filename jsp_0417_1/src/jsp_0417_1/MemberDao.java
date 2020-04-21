package jsp_0417_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDao {

	public MemberDao() {
	
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Connection con = null;
	DataSource dataSource;
	ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String id,pw,name,email,address,phone,gender,news,sms,sql;
	Timestamp birth,m_date;
	int num;
	
	
	public ArrayList<MemberDto> select_all(){
		try {
			//db연결
			//connection 연결
			sql = "select * from member3 order by num asc";
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			con = dataSource.getConnection();
			//prepareStatement 연결
			pstmt = con.prepareStatement(sql);
			//executeQuery(). excuteUpdate()	
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("select성공");
				num = rs.getInt("num");
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				phone = rs.getString("phone");
				address= rs.getString("address");
				birth = rs.getTimestamp("birth");
				gender = rs.getString("gender");
				news = rs.getString("news");
				sms = rs.getString("sms");
				m_date = rs.getTimestamp("m_date");
				
				
				dtos.add(new MemberDto(num,id,pw,name,email,address,phone,birth,gender,news,sms,m_date));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(con!=null)con.close();
				if(pstmt!=null)pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return dtos;
	}
	
	//매개변수는 데이터 입력 값 전부가 되어야 함.
	public int member_insert(String id,String pw, String name,String email,String address, String phone,
			String birth, String gender, String news, String sms) {
		int chk=0;
		//db연결
		//connection 연결
		sql = "insert into member3 values(mem3_seq.nextval,?,?,?,?,?,?,?,?,?,?,sysdate)";
		try {
			con = dataSource.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, address);
			pstmt.setString(6, phone);
			pstmt.setString(7, birth);
			pstmt.setString(8, gender);
			pstmt.setString(9, news);
			pstmt.setString(10, sms);
			
			chk = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null)pstmt.close();
				if(con!= null)con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return chk;
	}
	
}
