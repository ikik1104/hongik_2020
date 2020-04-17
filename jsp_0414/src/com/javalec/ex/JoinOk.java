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

@WebServlet("/JoinOk")
public class JoinOk extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 으로 들어옴");
		actionDo(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 로 들어옴");
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id,pw,name,phone1,phone2,phone3,gender;
		Connection conn = null;
		Statement stmt = null;
//		ResultSet rs; select일 때만 사용
		
		request.setCharacterEncoding("utf-8"); //request로 받아오는게 있으면 꼭! 써둔다.
		response.setContentType("text/html; charset=UTF-8"); // servlet은 꼭 ! 써준다.

		
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		name = request.getParameter("name");
		phone1 = request.getParameter("phone1");
		phone2 = request.getParameter("phone2");
		phone3 = request.getParameter("phone3");
		gender = request.getParameter("gender");
		
		String sql = "insert into member2 values('"+id+"','"+pw+"','"+name+"','"+phone1+"','"+phone2+"','"+phone3+"','"+gender+"')";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			stmt = conn.createStatement();
			//저장ok - 1, 저장 x - 0 리턴
			int result = stmt.executeUpdate(sql);  //insert,update,delete - update()   / select - executeQuery(sql)
			
			//저장결과 페이지 분리
			if(result==1) {
				response.sendRedirect("joinResult.jsp");
			}else {
				PrintWriter writer = response.getWriter();
				writer.println("<html><head><meta charset='UTF-8'></head><body>");
				writer.println("<script>alert('저장이 되지 않았습니다. 다시 입력해주세요.');");
				writer.println("location.href='join.html';</script>");
				writer.println("</body></html>");
				writer.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("join.html");
		}finally {
			try {
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	
	
	}

	
	
	
}
