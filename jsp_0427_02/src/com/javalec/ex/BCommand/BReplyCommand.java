package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		String name = request.getParameter("bname");
		String title = request.getParameter("btitle");
		String content = request.getParameter("bcontent");
		int group = Integer.parseInt(request.getParameter("bgroup"));
		int step = Integer.parseInt(request.getParameter("bstep"));
		int indent = Integer.parseInt(request.getParameter("bindent"));
		System.out.println("group : "+group);
		System.out.println("indent : "+indent);
		System.out.println("step : "+step);
		BDto dto = new BDto(0,name,title,content, null, 0, group, step, indent);
		
		dao.reply(dto); //insert
	}

}
