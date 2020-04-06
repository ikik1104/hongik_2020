package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form_login
 */
@WebServlet("/f_login")
public class Form_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Form_login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get접근");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<title>servlet 열림</title");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("<h1>doGet form 페이지 입니다.</h1>");
		writer.println("<p>아이디 : "+id+"</p>");
		writer.println("<p>패스워드 : "+pw+"</p>");
		writer.println("<p>이름 : "+name+"</p>");
		writer.println("<p>로그인 되었습니다.</p>");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post 접근");
		
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<title>servlet 열림</title");
		writer.println("<head>");
		writer.println("<body>");
		writer.println("<h1>doPost form 페이지 입니다.</h1>");
		writer.println("<p>아이디 : "+id+"</p>");
		writer.println("<p>패스워드 : "+pw+"</p>");
		writer.println("<p>이름 : "+name+"</p>");
		writer.println("<p>로그인 되었습니다.</p>");
		writer.println("</body>");
		writer.println("</head>");
		writer.println("</html>");

	}

}
