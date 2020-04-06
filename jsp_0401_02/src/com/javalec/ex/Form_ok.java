package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form_ok
 */
@WebServlet("/F_ok")
public class Form_ok extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
		System.out.println("객체 생성시 init() 메서드 실행");
	}

	public void destroy() {
		System.out.println("객체 종료시 destroy() 메서드 실행");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 메소드 실행");
		//name,id,pw,hobby,major,address 전부 String으로 넘어온다.
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobby = request.getParameterValues("hobby");
		
		String major = request.getParameter("major");
		String address = request.getParameter("address");
		
		//이제부터 html이야
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("이름: "+name+"<br>");
		writer.println("아이디 : "+id+"<br>");
		writer.println("패스워드 : "+pw+"<br>");
		writer.println("취미 : "+Arrays.toString(hobby)+"<br>");
		writer.println("전공 : "+major+"<br>");
		writer.println("주소 : "+address+"<br>");
		writer.println("</body></html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost() 메소드 실행");
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		String[] hobby = request.getParameterValues("hobby");
		
		String major = request.getParameter("major");
		String address = request.getParameter("address");
		
		//이제부터 html이야
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("이름: "+name+"<br>");
		writer.println("아이디 : "+id+"<br>");
		writer.println("패스워드 : "+pw+"<br>");
		writer.println("취미 : "+Arrays.toString(hobby)+"<br>");
		writer.println("전공 : "+major+"<br>");
		writer.println("주소 : "+address+"<br>");
		writer.println("</body></html>");
		
	}

}
