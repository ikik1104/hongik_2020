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

@WebServlet("/Modify_ok")
public class Modify_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;
	Connection con=null;
	Statement stmt = null;
	String id,pw,name,phone1,phone2,phone3,gender;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 접근");
		actionDo(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 접근");
		actionDo(request,response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		session = request.getSession();
		id = (String)session.getAttribute("authUser");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");		
		
		if(pw_chk()) {
			System.out.println("pw_chk메소드의 결과 :"+pw_chk());
			
			String sql = "update member2 set name='"+name+"', phone1='"+phone1+"', phone2='"+phone2+"', phone3='"+phone3
					+"', gender='"+gender+"' where id='"+id+"'";
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");	
				stmt = con.createStatement();
				int ch = stmt.executeUpdate(sql);
				
				if(ch==1) {
					response.sendRedirect("index.jsp");
				}else {
					response.setContentType("text/html; charset=utf-8");
					PrintWriter pw = response.getWriter();
					pw.println("<html><head><meta charset='UTF-8'></head><body>");
					pw.println("<script>");
					pw.println("alert('비밀번호가 틀립니다.');");
					pw.println("history.go(-1);");
					pw.println("</script>");
					pw.println("</body></html>");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
				response.sendRedirect("modify.jsp");
			}finally {
				try {
					if(stmt!=null) stmt.close();
					if(con!=null) con.close();
				}catch(Exception e2) {
					e2.printStackTrace();
					response.sendRedirect("modify.jsp");
				}
			}
			
		}else {
			response.sendRedirect("modify.jsp");
		}
		
	}
	
	//parameter 넘어온 pw와 섹션의 pw가 같은지 비교
	public boolean pw_chk() {
		boolean chk = false;
		String user_pw = (String)session.getAttribute("user_pw");
		if(user_pw.equals(pw)) {
			chk = true;
		}
		return chk;
	}
}
