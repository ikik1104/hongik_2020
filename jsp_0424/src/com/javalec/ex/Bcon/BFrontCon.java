package com.javalec.ex.Bcon;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;
import com.javalec.ex.DTO.MemberDto;

/**
 * Servlet implementation class BFrontCon
 */
@WebServlet("*.do")
public class BFrontCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BFrontCon() {
    
    }
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("doGet 들어옴");
    	actionDo(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 들어옴");
		actionDo(request,response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException{
		//페이지 이동에 사용하는 변수
		String viewPage = null;
		
		System.out.println("actionDo 들어옴");
		request.setCharacterEncoding("utf-8");
		//url = http://localhost:8181/jsp_0424/insert
		String uri = request.getRequestURI();
		System.out.println("uri : "+uri);
		//uri = jsp_0424/insert
		String conPath = request.getContextPath();
		System.out.println("conPath : "+conPath);
		//contextPath = /jsp_0424
		String com = uri.substring(conPath.length());
		System.out.println("com : "+com);
		//file명 = /insert
		
		if(com.equals("/insert.do")) {
			System.out.println("insert페이지를 요청하였습니다.");
			//dao메소드 호출해서 값을 받아서 request.setAttribute
			request.setAttribute("insert_com", com);
			//insert.jsp로 forwarding
			viewPage = "insert.jsp";
		}else if(com.equals("/update.do")) {
			System.out.println("update페이지를 요청하였습니다.");
			request.setAttribute("update_com", com);
			//update.jsp로 forwarding
			viewPage = "update.jsp";
		}else if(com.equals("/select.do")) {
			System.out.println("select페이지를 요청하였습니다.");
			//dao메소드 호출
			ArrayList<MemberDto> list = new ArrayList<MemberDto>(); 
			MemberDao mdao = MemberDao.getInstance();
			list = mdao.getMembers();
			request.setAttribute("dtos", list);
			request.setAttribute("select_address", com);
			viewPage = "select.jsp";
		}else if(com.equals("/delete.do")) {
			System.out.println("delete페이지를 요청하였습니다.");
			request.setAttribute("delete_com", com);
			//delete.jsp로 forwarding
			viewPage = "delete.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
		
		
	}
}
