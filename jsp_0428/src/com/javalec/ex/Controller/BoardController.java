package com.javalec.ex.Controller;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.BCommand.BCommandAll;

import sun.rmi.server.Dispatcher;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BoardController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request,response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo 들어옴");
		request.setCharacterEncoding("utf-8");
		String viewPage = null;
		BCommand bcom = new BCommandAll();
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
	
		if(com.equals("/list.do")) {
			bcom.list(request, response);
			viewPage = "list.jsp";
			
		}else if(com.equals("/board_view.do")) {
			bcom.board_view(request, response);
			viewPage = "view.jsp";
			
		}else if(com.equals("/insertForm.do")) {
			viewPage = "insert.jsp";
			
		}else if(com.equals("/insert.do")) {
			bcom.insert(request, response);
			viewPage = "list.do";
			
		}else if(com.equals("/updateForm.do")) {
			bcom.updateForm(request, response);
			viewPage = "update_form.jsp";
			
		}else if(com.equals("/update.do")) {
			bcom.update(request, response);
			viewPage = "redirect:board_view.do";
			
		}else if(com.equals("/delete.do")) {
			bcom.delete(request, response);
			viewPage = "redirect:list.do";
			
		}else if(com.equals("/replyForm.do")) {
			bcom.replyFrom(request, response);
			viewPage = "reply_form.jsp";
		}else if(com.equals("/reply.do")) {
			bcom.reply(request, response);
			viewPage = "redirect:list.do";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	
	
	
	}
}
