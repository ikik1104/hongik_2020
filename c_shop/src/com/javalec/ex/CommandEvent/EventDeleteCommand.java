package com.javalec.ex.CommandEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.EventDao;
import com.javalec.ex.DTO.EventDto;

public class EventDeleteCommand implements EventCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		EventDao edao = new EventDao();
		int num  = Integer.parseInt(request.getParameter("num"));
		int check = edao.delEvent(num);
		
		if(check==1) {
			request.setAttribute("text", "해당 이벤트 삭제가 완료되었습니다.");
		}else {
			request.setAttribute("text", "죄송합니다. 해당 이벤트 삭제에 실패하였습니다.");
		}

	}

}
