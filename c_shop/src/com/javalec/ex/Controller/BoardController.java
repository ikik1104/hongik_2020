package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.CommandBoard.BCommand;
import com.javalec.ex.CommandBoard.BContentCommand;
import com.javalec.ex.CommandBoard.BListCommand;
import com.javalec.ex.CommandBoard.BReplyCommand;
import com.javalec.ex.CommandBoard.BReplyFormCommand;

@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BoardController() { }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//넘어온 request 한글처리 
		request.setCharacterEncoding("utf-8");
		String pageView = null;
		BCommand bcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/notice_list.do")) { //공지사항 리스트
			bcom = new BListCommand();
			bcom.execute(request, response);
			pageView = "notice_list.jsp";
			
		}else if(com.equals("/notice_view.do")) { //공지사항 상세보기
			bcom = new BContentCommand();
			bcom.execute(request, response);
			pageView = "notice_view.jsp";
			
		}else if(com.equals("/search.do")) { //검색기능
			bcom = new BListCommand();
			bcom.execute(request, response);
			pageView = "notice_list.jsp";
			
		}else if(com.equals("/reply_Form.do")) {  //답글 Form
			bcom = new BReplyFormCommand();
			bcom.execute(request, response);
			pageView = "reply_form.jsp";
			
		}else if(com.equals("/reply.do")) { //답글 insert
			bcom = new BReplyCommand();
			bcom.execute(request, response);
			pageView = "notice_list.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}

}
