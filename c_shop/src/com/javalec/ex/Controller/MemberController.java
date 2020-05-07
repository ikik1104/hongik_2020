package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.CommandEvent.EventCommand;
import com.javalec.ex.CommandEvent.EventDetailCommand;
import com.javalec.ex.CommandEvent.EventInsertCommand;
import com.javalec.ex.CommandEvent.EventListCommand;
import com.javalec.ex.CommandMember.MemberCommand;
import com.javalec.ex.CommandMember.MemberInsertCommand;
import com.javalec.ex.CommandMember.MemberLoginCommand;

@WebServlet("*.Mdo")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		//넘어온 request 한글처리 
		request.setCharacterEncoding("utf-8");
		String pageView = null;
		MemberCommand mcom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println("con : "+com);
		
		if(com.equals("/index.Mdo")) { // 인덱스 페이지 이동
			pageView = "index.jsp";
		}else if(com.equals("/joinForm.Mdo")) { // 회원가입페이지로 이동
			pageView = "join.jsp";
		}else if(com.equals("/join.Mdo")) { // 회원가입
			mcom = new MemberInsertCommand();
			mcom.execute(request, response);
			pageView = "index.Mdo";
		}else if(com.equals("/idChk.Mdo")) { // 아이디 중복체크
			mcom = new MemberIdChkCommand();
			mcom.execute(request, response);
			pageView = "join_id_pop.jsp";
		}else if(com.equals("/loginForm.Mdo")) { // 로그인 페이지로
			pageView = "login.jsp";
		}else if(com.equals("/login.Mdo")) { // 로그인
			mcom = new MemberLoginCommand();
			mcom.execute(request, response);
			pageView = (String) request.getAttribute("page");
		}else if(com.equals("/loginOut.Mdo")) { // 로그인
			mcom = new MemberOutCommand();
			mcom.execute(request, response);
			pageView = "index.Mdo";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}

}

