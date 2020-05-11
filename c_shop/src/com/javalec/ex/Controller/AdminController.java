package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.CommandAdmin.A_Notice_ListCom;
import com.javalec.ex.CommandAdmin.AdminCommand;
import com.javalec.ex.CommandBoard.BCommand;
import com.javalec.ex.CommandBoard.BContentCommand;
import com.javalec.ex.CommandBoard.BDeleteCommand;
import com.javalec.ex.CommandBoard.BInsertCommand;
import com.javalec.ex.CommandBoard.BListCommand;
import com.javalec.ex.CommandBoard.BReplyCommand;
import com.javalec.ex.CommandBoard.BReplyFormCommand;
import com.javalec.ex.CommandBoard.BUpdateCommand;
import com.javalec.ex.CommandBoard.BUpdateFormCommand;
import com.javalec.ex.CommandEvent.EventCommand;
import com.javalec.ex.CommandEvent.EventDeleteCommand;
import com.javalec.ex.CommandEvent.EventDetailCommand;
import com.javalec.ex.CommandEvent.EventInsertCommand;
import com.javalec.ex.CommandEvent.EventListCommand;
import com.javalec.ex.CommandMember.MemberCommand;
import com.javalec.ex.CommandMember.MemberListCommand;
import com.javalec.ex.CommandMember.MemberLoginCommand;

@WebServlet("*.Ado")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminController() { }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		actionDo(request, response);
	}
	
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo");
		//넘어온 request 한글처리 
		request.setCharacterEncoding("utf-8");
		String pageView = null;
		BCommand bcom = null;
		EventCommand ecom = null;
		MemberCommand mcom = null;
		AdminCommand acom = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		if(com.equals("/admin_main.Ado")) { //어드민 메인
			bcom = new BListCommand();
			ecom = new EventListCommand();
			mcom = new MemberListCommand();
			bcom.execute(request, response);
			ecom.execute(request, response);
			mcom.execute(request, response);
			pageView = "admin_main.jsp";
		}else if(com.equals("/notice_list.Ado")) { //공지사항 리스트
			acom = new A_Notice_ListCom();
			acom.execute(request, response);
			pageView = "admin_notice_list.jsp";
			
		}else if(com.equals("/notice_view.Ado")) { //공지사항 상세보기
			bcom = new BContentCommand();
			bcom.execute(request, response);
			pageView = "admin_notice_view.jsp";
			
		}else if(com.equals("/search.Ado")) { //검색기능
			bcom = new BListCommand();
			bcom.execute(request, response);
			pageView = "notice_list.Ado";
			
		}else if(com.equals("/no_insertForm.Ado")) { //공지사항 입력Form
			pageView = "admin_notice_insertForm.jsp";
			
		}else if(com.equals("/no_insert.Ado")) { //공지사항 insert
			bcom = new BInsertCommand();
			bcom.execute(request, response);
			pageView = "admin_notice_list.jsp";
		}else if(com.equals("/notice_delete.Ado")) {  //공지 삭제하기
			bcom = new BDeleteCommand();
			bcom.execute(request, response);
			pageView = "notice_list.Ado";
			
		}else if(com.equals("/reply_Form.Ado")) {  //답글 Form
			bcom = new BReplyFormCommand();
			bcom.execute(request, response);
			pageView = "reply_form.jsp";
		}else if(com.equals("/reply.Ado")) { //답글 insert
			bcom = new BReplyCommand();
			bcom.execute(request, response);
			pageView = "notice_list.Ado";
		}else if(com.equals("/update_form.Ado")) { //업데이트 Form
			bcom = new BUpdateFormCommand();
			bcom.execute(request, response);
			pageView = "notice_update.jsp";
		}else if(com.equals("/notice_update.Ado")) { //공지사항 update
			bcom = new BUpdateCommand();
			bcom.execute(request, response);
			pageView = "admin_notice_view.Ado";
		}
		
		//이벤트
		else if(com.equals("/event_list.Ado")) {
			ecom = new EventListCommand();
			ecom.execute(request, response);
			pageView = "admin_event_list.jsp";
		}if(com.equals("/event_insertForm.Ado")) { // 이벤트 입력페이지로 이동
			pageView = "admin_event_insertForm.jsp";
		}else if(com.equals("/insert_event.Ado")) { //이벤트 insert
			ecom = new EventInsertCommand();
			ecom.execute(request, response);
			pageView = "event_list.Ado";
		}else if(com.equals("/event_view.Ado")) { //이벤트 상세보기
			ecom = new EventDetailCommand();
			ecom.execute(request, response);
			pageView = "admin_event_view.jsp";
		}else if(com.equals("/event_updateForm.Ado")) { //이벤트 수정 페이지로 이동
			ecom = new EventDetailCommand(); // 상세보기와 같이 게시물의 데이터를 가져온다
			ecom.execute(request, response);
			pageView = "admin_event_updateForm.jsp";
		}else if(com.equals("/event_delete.Ado")){
			ecom = new EventDeleteCommand(); // 이벤트 삭제
			ecom.execute(request, response);
			pageView = "event_list.Ado";
		}
		else if(com.equals("/main_change.Ado")){
			 // 배너변경
			pageView = "img_change.jsp";
		}
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}

}
