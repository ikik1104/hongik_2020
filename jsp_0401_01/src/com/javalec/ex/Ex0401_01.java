package com.javalec.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex0401_01
 */
@WebServlet("/Ex1")
public class Ex0401_01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex0401_01() {
        super();
    }

    //주소로 바로 접슨기 doGet화면이 열림
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet열림");
		
		//이제부터 html문서로 작성이 됨
		response.setContentType("text/html; charset=utf-8");
		//html 화면으로 출력을 해주는 객체
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>servlet 페이지</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>doGet로그인 페이지</h1>");
		writer.println("<p>로그인하기 위해서 Form태그로 화면을 작성함.</p>");
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost열림");
		//이제부터 html문서로 작성이 됨
			response.setContentType("text/html; charset=utf-8");
			//html 화면으로 출력을 해주는 객체
			PrintWriter writer = response.getWriter();
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<title>servlet 페이지</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h1>doPost로그인 페이지</h1>");
			writer.println("<p>로그인하기 위해서 Form태그로 화면을 작성함.</p>");
			writer.println("</body>");
			writer.println("</html>");
				
			writer.close();
	}

}
