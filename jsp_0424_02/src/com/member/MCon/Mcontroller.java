package com.member.MCon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class Mcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Mcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String viewPage = null;
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String con = uri.substring(conPath.length());
		
		if(con.equals("/select.do")) {
			viewPage = "select.jsp";
		}else if(con.equals("/insert.do")) {
			
		}else if(con.equals("/update.do")) {
			
		}else if(con.equals("/delete.do")) {
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}
	
	
}
