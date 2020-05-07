package com.javalec.ex.CommandBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("bid"));
		BDao dao = new BDao();
		
		dao.Bhit_add(id); //조회수 증가
		
		BDto dtos = dao.Bdetail(id); //증가 후 정보 가져오기
		request.setAttribute("dto", dtos);
	}

	/*
	@Override
	public void detail(HttpServletRequest request, HttpServletResponse response, int bid) {
		// TODO Auto-generated method stub

	}
	*/
}
