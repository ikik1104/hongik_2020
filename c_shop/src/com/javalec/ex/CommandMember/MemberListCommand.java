package com.javalec.ex.CommandMember;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;
import com.javalec.ex.DTO.MemberDto;

public class MemberListCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		ArrayList<MemberDto> dtos = new ArrayList<MemberDto>();
		
		dtos = dao.allUser();

		request.setAttribute("mdto", dtos);
	}

}
