package jsp_0417;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDao {
	//생성자되면jdbc로딩을 한다.
	public MemberDao() {//생성자
		try {
		Context context = new InitialContext();
		dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g"); //context의 위치 : java:comp.env
															//jdbc/Oracle11g --> context.xml에 설정한 name
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	ArrayList<MemberDto> dtos =new ArrayList<MemberDto>();
	
	String id,pw,name,phone1,phone2,phone3,gender,sql;
	DataSource dataSource;
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	//전체 리스트 출력
	public ArrayList<MemberDto> member_Select() {
		//데이터 출력
		try {
			//db연결
			//connection 연결
			sql = "select * from member2";
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			con = dataSource.getConnection();
			//prepareStatement 연결
			pstmt = con.prepareStatement(sql);
			//executeQuery(). excuteUpdate()	
			rs = pstmt.executeQuery();

			//데이터 담기
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone1 = rs.getString("phone1");
				phone2 = rs.getString("phone2");
				phone3 = rs.getString("phone3");
				gender = rs.getString("gender");
				
				dtos.add(new MemberDto(id,pw,name,phone1,phone2,phone3,gender));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		//리턴 값으로 돌려줌
		return dtos;
		
	}
	

}
