package com.javalec.ex.CommandEvent;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.EventDao;
import com.javalec.ex.DTO.EventDto;

public class EventListCommand implements EventCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int page = 1; //최초 기본 1페이지 세팅
		int limit = 9; //1page = 게시글 10개
		String searchFlag = null; //검색체크
		
		//넘어온 page가 있을때 - 예) 4페이지
		if(request.getParameter("page")!=null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
		EventDao dao = new EventDao();
		//페이지별 리스트 개수 가져오기
		ArrayList<EventDto> dtos = dao.evnetList(page,limit);
		//전체 게시글 count(*)
		int listcount = dao.getlistCount();
		//최대 페이지 수
		int maxpage = (int)((double)listcount/limit+0.95);
		//처음페이지
		int startpage = ((int)((double)page/10+0.9)-1)*10+1;
		//마지막 페이지
		int endpage = maxpage; //1~10까지는 maxpage가 endpage가 됨
		if(endpage>startpage+10-1) endpage = startpage+10-1;
		
		System.out.println("listcount :"+ listcount);
		System.out.println("page :"+ page);
		System.out.println("maxpage :"+ maxpage);
		System.out.println("startpage :"+ startpage);
		System.out.println("endpage :"+ endpage);

		
		request.setAttribute("dto", dtos);
		request.setAttribute("listcount", listcount);
		request.setAttribute("page", page);
		request.setAttribute("maxpage", maxpage);
		request.setAttribute("startpage", startpage);
		request.setAttribute("endpage", endpage);
		
		if(request.getAttribute("text")!=null) {
			request.setAttribute("text", request.getAttribute("text"));
		}
		
	}

}
