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
		
		int check = dao.reply(dto); //insert
		if(check == 1) {
			request.setAttribute("text", "답글 등록을 완료하였습니다.");
		}else {
			request.setAttribute("text", "죄송합니다. 답글등록에 실패했습니다.");
		}
	}

}
