package com.javalec.ex.CommandBoard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BReplyFormCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("bid"));
		BDao dao = new BDao();
		BDto dtos = dao.Bdetail(id); //게시글 정보 가져오기
		System.out.println("리플폼커멘드 : "+dtos.getBgroup());
		request.setAttribute("dto", dtos);
		
	}

}
