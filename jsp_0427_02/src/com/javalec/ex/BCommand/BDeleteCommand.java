package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BDeleteCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
			int id = Integer.parseInt(request.getParameter("bid"));
			BDao dao = new BDao();
			int check = dao.delete(id); //게시글 정보 가져오기
	}

}
