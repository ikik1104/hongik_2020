package com.javalec.ex.CommandEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.EventDao;
import com.javalec.ex.DTO.EventDto;

public class EventDetailCommand implements EventCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		EventDao dao = new EventDao();
		EventDto dto = new EventDto();
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		dto = dao.detail(num);
		
		request.setAttribute("dto", dto);

	}

}
