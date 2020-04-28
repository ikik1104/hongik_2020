package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BUpdateCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		int bid = Integer.parseInt(request.getParameter("bid"));
		String name = request.getParameter("bname");
		String title = request.getParameter("btitle");
		String content = request.getParameter("bcontent");
		int group = Integer.parseInt(request.getParameter("bgroup"));
		int indent = Integer.parseInt(request.getParameter("bindent"));
		int step = Integer.parseInt(request.getParameter("bstep"));
		BDto dto = new BDto(bid,name,title,content, null, 0, group, step, indent);
		
		dao.update(dto); //insert
		request.setAttribute("bid", bid);
	}

}