package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.CommandEvent.EventCommand;
import com.javalec.ex.CommandEvent.EventDeleteCommand;
import com.javalec.ex.CommandEvent.EventDetailCommand;
import com.javalec.ex.CommandEvent.EventInsertCommand;
import com.javalec.ex.CommandEvent.EventListCommand;


@WebServlet("*.Edo")
public class EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EventController() { }
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
		EventCommand ecom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println("con : "+com);
		
		if(com.equals("/event_list.Edo")) { //이벤트 리스트
			ecom = new EventListCommand();
			ecom.execute(request, response);
			pageView = "event_list.jsp";
		}else if(com.equals("/event_view.Edo")) { //이벤트 상세보기
			ecom = new EventDetailCommand();
			ecom.execute(request, response);
			pageView = "event_view.jsp";
		}
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}

}
