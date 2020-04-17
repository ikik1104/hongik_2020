package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin_main
 */
@WebServlet("/Admin_modify")
public class Admin_modify extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement psmt;
	int check;
	
	String id,pw,name,address,email,phone,gender,news,sms,birth;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=utf-8");
		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		address = request.getParameter("address");
		email = request.getParameter("email");
		phone = request.getParameter("phone");
		birth = request.getParameter("birth");
		gender = request.getParameter("gender");
		news = request.getParameter("news");
		sms = request.getParameter("sms");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			psmt = con.prepareStatement("update lms_member set pw=?,name=?,address=?,email=?,phone=?,"
					+ "birth=?,gender=?,news=?,sms=? where id=?");
			psmt.setString(1, pw);
			psmt.setString(2, name);
			psmt.setString(3, address);
			psmt.setString(4, email);
			psmt.setString(5, phone);
			psmt.setString(6, birth);
			psmt.setString(7, gender);
			psmt.setString(8, news);
			psmt.setString(9, sms);
			psmt.setString(10, id);
			check = psmt.executeUpdate();
			
			if(check==1){
				System.out.println(">> 업데이트 성공");
				System.out.println(">> 업데이트 실패");
				PrintWriter pw = response.getWriter();
				pw.println("<html><head></head><body>");
				pw.println("<script>alert('회원수정이 완료되었습니다.');");
				pw.println("location.href='admin_main.jsp';</script>");
				pw.println("</body></html>");
			}else {
				System.out.println(">> 업데이트 실패");
				PrintWriter pw = response.getWriter();
				pw.println("<html><head></head><body>");
				pw.println("<script>alert('업데이트에 실패하였습니다.');");
				pw.println("history.back(-1);</script>");
				pw.println("</body></html>");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(psmt!=null) psmt.close();
				if(con!=null)con.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
	
	
	}
}
