package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join_Ok")
public class Join_Ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con;
    PreparedStatement pstmt;
    int check;
    
    String id,pw,name,email,address,phone,gender,news,sms,birth,sql;
  
	
    public Join_Ok() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 들어옴");
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 들어옴");
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8 ");
		request.setCharacterEncoding("utf-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		email = request.getParameter("email");
		address = request.getParameter("address");
		phone = request.getParameter("phone");
		birth = request.getParameter("birth");
		gender = request.getParameter("gender");
		news = request.getParameter("news");
		sms = request.getParameter("sms");
		
		sql = "insert into lms_member values(?,?,?,?,?,?,?,?,?,?)";
		
		//db연결
		try {
			System.out.println("****  DB접속 시작  ****");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			System.out.println(" >> DB연결 성공");
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,id);
			pstmt.setString(2,pw);
			pstmt.setString(3,name);
			pstmt.setString(4,email);
			pstmt.setString(5,address);
			pstmt.setString(6,phone);
			pstmt.setString(7,birth);
			pstmt.setString(8,gender);
			pstmt.setString(9,news);
			pstmt.setString(10,sms);
			
			check = pstmt.executeUpdate();
			
			if(check==1) {
				System.out.println(" >> insert에 성공");
				response.sendRedirect("main.jsp");
			}else {
				//데이터 저장 실해
				System.out.println(" >> insert 실패");
				String str;
				str="<script type=\"text/javascript\">\r\n" + 
						"      alert(\"저장실패,  다시 시도해주세요.\");\r\n" + 
						"      history.back(-1);\r\n" + 
						"   </script>";
				PrintWriter writer=response.getWriter();
				writer.println("<html><head><meta charset='utf-8'></head><body>");
				writer.println(str);
				writer.println("</body>");
				writer.println("</html>");
				writer.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
