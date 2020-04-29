package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BContentCommand;
import com.javalec.ex.BCommand.BDeleteCommand;
import com.javalec.ex.BCommand.BInsertCommand;
import com.javalec.ex.BCommand.BListCommand;
import com.javalec.ex.BCommand.BReplyCommand;
import com.javalec.ex.BCommand.BReplyFormCommand;
import com.javalec.ex.BCommand.BUpdateCommand;
import com.javalec.ex.BCommand.BUpdateFormCommand;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class BController
 */
@WebServlet("*.do")
public class BController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		BCommand  bcom = null;
		
		String uri = request.getRequestURI(); //주소 가져오기?
		String conPath = request.getContextPath();// 프로젝트 명?
		String com = uri.substring(conPath.length()); //프로젝트의 길이를 잘라서 넘어온 호출이름? 을 가져오나?
		
		if(com.equals("/list.do")) { //전체화면출력
			System.out.println("리스트.do");
			bcom = new BListCommand();
			bcom.execute(request, response);
			viewPage = "list.jsp";
			
		}else if(com.equals("/detail.do")) { //게시물 상세보기
			bcom = new BContentCommand();
			bcom.execute(request, response);
			viewPage = "detail.jsp";
			
		}else if(com.equals("/update_view.do")) { //수정페이지로 가기?
			bcom = new BUpdateFormCommand();
			bcom.execute(request, response);
			viewPage = "update_view.jsp";
			
		}else if(com.equals("/update.do")) {  //수정하기
			bcom = new BUpdateCommand();
			bcom.execute(request, response);
			viewPage = "detail.do";
			
		}else if(com.equals("/insert_view.do")) {  //입력 페이지로 가기
			viewPage = "insert.jsp";
			
		}else if(com.equals("/insert.do")) {  //입력하기
			System.out.println("인썰트.do");
			bcom = new BInsertCommand();
			bcom.execute(request, response);
			viewPage = "list.do";
			
		}else if(com.equals("/delete.do")) {  //삭제하기
			bcom = new BDeleteCommand();
			bcom.execute(request, response);
			viewPage = "list.do";
			
		}else if(com.equals("/reply_view.do")) {  //삭제하기
			bcom = new BReplyFormCommand();
			bcom.execute(request, response);
			viewPage = "reply_view.jsp";
		}else if(com.equals("/reply.do")) {
			bcom = new BReplyCommand();
			bcom.execute(request, response);
			viewPage = "list.do";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	}

}
