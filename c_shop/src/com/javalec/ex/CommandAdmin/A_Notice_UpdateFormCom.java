package com.javalec.ex.CommandAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class A_Notice_UpdateFormCom implements AdminCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("bid"));
		BDao dao = new BDao();
		BDto dtos = dao.Bdetail(id); //게시글 정보 가져오기
		request.setAttribute("bdto", dtos);
	}

	/*
	@Override
	public void detail(HttpServletRequest request, HttpServletResponse response, int bid) {
		// TODO Auto-generated method stub

	}
	*/
}
