package com.javalec.ex.BCommand;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.BCommand.BCommand;
import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// BCommand 인터페이스를 상속받음 ( 인터페이스는 꼭 필요한 애들 적어놓고 오버라이딩해서 사용함 )
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		request.setAttribute("list", dtos);
	}


	/*
	@Override
	public void detail(HttpServletRequest request, HttpServletResponse response, int bid) {
		// TODO Auto-generated method stub
		BDao  dao = new BDao();
		BDto dto = dao.detail(bid);
		request.setAttribute("dto", dto);
	}
	*/
}
