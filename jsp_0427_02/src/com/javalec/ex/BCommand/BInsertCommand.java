package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BInsertCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		BDao dao = new BDao();
		String name = request.getParameter("bname");
		String title = request.getParameter("btitle");
		String content = request.getParameter("bcontent");
		BDto dto = new BDto(0,name,title,content, null, 0, 0, 0, 0);
		
		dao.insert(dto); //insert
	}

}
