package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin_login
 */
@WebServlet("/Admin_login")
public class Admin_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String id,pw;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 들어옴");
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost들어옴");
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		id = request.getParameter("admin_id");
		pw = request.getParameter("admin_pw");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			ptmt = con.prepareStatement("select * from lms_member where id=? and pw=?");
			ptmt.setString(1, id);
			ptmt.setString(2, pw);
			System.out.println("넘어온 아이디 :"+id);
			System.out.println("넘어온 비밀번호 : "+pw);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				while(rs.next()) {
					id = rs.getString("id");
					pw = rs.getString("pw");
				}
				HttpSession session =  request.getSession();
				session.setAttribute("user_id", id);
				session.setAttribute("authUser", id);
				session.setAttribute("user_pw", pw);
				
				response.sendRedirect("admin_main.jsp");
			}else {
				PrintWriter pw = response.getWriter();
				
				pw.println("<html><head></head><body>");
				pw.println("<script>alert('존재하지 않는 회원'); history.back(-1);</script>");
				pw.println("</body></html>");
				pw.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ptmt!=null)ptmt.close();
				if(con!=null)con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}

}
