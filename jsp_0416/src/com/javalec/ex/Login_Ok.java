package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login_Ok")
public class Login_Ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String id,pw,sql;
	
    public Login_Ok() {
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
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		
		sql="select id,pw from lms_member where id='"+id+"' and pw='"+pw+"'";
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				while(rs.next()) {
					id = rs.getString("id");
					pw = rs.getString("pw");
				}
				
				//세션 추가
				HttpSession session =  request.getSession(); //서블릿에는 이거 들고와야한다.(객체로 만들어서 사용해야한다.)jsp-걍 사용
				session.setAttribute("user_id", id);
				session.setAttribute("user_pw", pw);
				session.setAttribute("authUser", id);
				
				response.sendRedirect("main.jsp");
			}else {
				String str;
				str="<script type=\"text/javascript\">\r\n" + 
						"      alert(\"아이디,패스워드가 잘못되었습니다. 다시 입력해주세요.\");\r\n" + 
						"      location.href='login.jsp';\r\n" + 
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
			String str;
			   str="<script type=\"text/javascript\">\r\n" + 
			     "      alert(\"아이디,패스워드가 잘못되었습니다. 다시 입력해주세요.\");\r\n" + 
			     "      location.href='login.jsp';\r\n" + 
			     "   </script>";
			PrintWriter writer=response.getWriter();
			writer.println("<html><head><meta charset='utf-8'></head><body>");
			writer.println(str);
			writer.println("</body>");
			writer.println("</html>");
			writer.close();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
				String str;
				   str="<script type=\"text/javascript\">\r\n" + 
				     "      alert(\"아이디,패스워드가 잘못되었습니다. 다시 입력해주세요.\");\r\n" + 
				     "      location.href='login.jsp';\r\n" + 
				     "   </script>";
				PrintWriter writer=response.getWriter();
				writer.println("<html><head><meta charset='utf-8'></head><body>");
				writer.println(str);
				writer.println("</body>");
				writer.println("</html>");
				writer.close();
			}
		}
		
	}

}
