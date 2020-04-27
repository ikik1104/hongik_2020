package com.javalec.ex.BFront;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.Bcommand.BListcommand;
import com.javalec.ex.Bcommand.Bcommand;

@WebServlet("*.do")
public class BFront extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BFront() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo 들어옴");
		
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		Bcommand comm = null;
		
		String uri = request.getRequestURI(); //  			/jsp_0467/list.do
 		String conPath = request.getContextPath();// 		/jsp_0467
		String com = uri.substring(conPath.length());// 	/list.do
		
		//호출 페이지 분기
		if(com.equals("/list.do")) {
			comm = new BListcommand();
			comm.excute(request, response);
			viewPage = "list.jsp";
		}
		
//		else if(com.equals("/content_view.do")) {
//			comm = new BContentcommand();
//			comm.excute(request, response);
//			viewPage = "content_view.jsp";
//		}else if(com.equals("/write_view.do")) {
//			comm = new BWritecommand();
//			comm.excute(request, response);
//			viewPage = "content_view.jsp";
//		}else if(com.equals("/reply_view.do")) {
//			comm = new BReplycommand();
//			comm.excute(request, response);
//			viewPage = "content_view.jsp";
//		}
		
		//호출한 페이지로 request와 이동
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
