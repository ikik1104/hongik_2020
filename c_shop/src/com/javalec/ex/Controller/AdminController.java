package com.javalec.ex.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.CommandAdmin.A_Notice_ContentCom;
import com.javalec.ex.CommandAdmin.A_Notice_DeleteCom;
import com.javalec.ex.CommandAdmin.A_Notice_InsertCom;
import com.javalec.ex.CommandAdmin.A_Notice_ListCom;
import com.javalec.ex.CommandAdmin.A_Notice_UpdateCom;
import com.javalec.ex.CommandAdmin.A_Notice_UpdateFormCom;
import com.javalec.ex.CommandAdmin.AdminCommand;
import com.javalec.ex.CommandBoard.BCommand;
import com.javalec.ex.CommandBoard.BListCommand;
import com.javalec.ex.CommandBoard.BReplyCommand;
import com.javalec.ex.CommandBoard.BReplyFormCommand;
import com.javalec.ex.CommandEvent.EventCommand;
import com.javalec.ex.CommandEvent.EventDeleteCommand;
import com.javalec.ex.CommandEvent.EventDetailCommand;
import com.javalec.ex.CommandEvent.EventInsertCommand;
import com.javalec.ex.CommandEvent.EventListCommand;
import com.javalec.ex.CommandEvent.EventUpdateCommand;
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
		//넘어온 request 한글처리 
		request.setCharacterEncoding("utf-8");
		String pageView = null;
		BCommand bcom = null; //공지사항
		EventCommand ecom = null; //이벤트
		MemberCommand mcom = null; //회원
		AdminCommand acom = null; //관리자
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		//어드민 메인
		if(com.equals("/admin_main.Ado")) { 
			bcom = new BListCommand();
			ecom = new EventListCommand();
			mcom = new MemberListCommand();
			bcom.execute(request, response);
			ecom.execute(request, response);
			mcom.execute(request, response);
			pageView = "admin_main.jsp";
	
		//admin 공지사항 리스트	
		}else if(com.equals("/notice_list.Ado")) { 
			acom = new A_Notice_ListCom();
			acom.execute(request, response);
			pageView = "admin_notice_list.jsp";
		
		//admin 공지사항 상세보기
		}else if(com.equals("/notice_view.Ado")) { 
			acom = new A_Notice_ContentCom();
			acom.execute(request, response);
			pageView = "admin_notice_view.jsp";
		
		//admin 공지사항 검색			
		}else if(com.equals("/search.Ado")) { 
			acom = new A_Notice_ListCom();
			acom.execute(request, response);
			pageView = "notice_list.Ado";
			
		//공지사항 입력Form
		}else if(com.equals("/no_insertForm.Ado")) { 
			pageView = "admin_notice_insertForm.jsp";
			
		//공지사항 insert
		}else if(com.equals("/no_insert.Ado")) { 
			acom = new A_Notice_InsertCom();
			acom.execute(request, response);
			pageView = "admin_notice_list.jsp";
			
		//공지 삭제하기
		}else if(com.equals("/notice_delete.Ado")) {  
			acom = new A_Notice_DeleteCom();
			acom.execute(request, response);
			pageView = "notice_list.Ado";
		
		//답글 Form
		}else if(com.equals("/reply_Form.Ado")) {  
			bcom = new BReplyFormCommand();
			bcom.execute(request, response);
			pageView = "reply_form.jsp";
		
		//답글 insert	
		}else if(com.equals("/reply.Ado")) { //답글 insert
			bcom = new BReplyCommand();
			bcom.execute(request, response);
			pageView = "notice_list.Ado";
			
		//업데이트 Form
		}else if(com.equals("/notice_update_form.Ado")) { 
			acom = new A_Notice_UpdateFormCom();
			acom.execute(request, response);
			pageView = "admin_notice_updateForm.jsp";
		
		//공지사항 update	
		}else if(com.equals("/notice_update.Ado")) { 
			acom = new A_Notice_UpdateCom();
			acom.execute(request, response);
			pageView = "admin_notice_view.jsp";
		}
		
		//이벤트--------------------------------------------------------
		//admin 이벤트 리스트
		else if(com.equals("/event_list.Ado")) { 
			ecom = new EventListCommand();
			ecom.execute(request, response);
			pageView = "admin_event_list.jsp";
			
		// 이벤트 입력페이지로 이동
		}else if(com.equals("/event_insertForm.Ado")) {
			pageView = "admin_event_insertForm.jsp";
		
		//이벤트 insert
		}else if(com.equals("/insert_event.Ado")) {
			ecom = new EventInsertCommand();
			ecom.execute(request, response);
			pageView = "event_list.Ado";
		
		//admin 이벤트 상세보기	
		}else if(com.equals("/event_view.Ado")) { 
			ecom = new EventDetailCommand();
			ecom.execute(request, response);
			pageView = "admin_event_view.jsp";
			
			
		//이벤트 수정 페이지로 이동
		}else if(com.equals("/event_updateForm.Ado")) { 
			ecom = new EventDetailCommand(); 
			ecom.execute(request, response);
			pageView = "admin_event_updateForm.jsp";
			
		//이벤트 수정
		}else if(com.equals("/event_update.Ado")) { 
			ecom = new EventUpdateCommand(); 
			ecom.execute(request, response);
			pageView = "admin_event_view.jsp";
			
		// 이벤트 삭제
		}else if(com.equals("/event_delete.Ado")){
			ecom = new EventDeleteCommand(); 
			ecom.execute(request, response);
			pageView = "event_list.Ado";
		}
		
	
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(pageView);
		dispatcher.forward(request, response);
	}

}
