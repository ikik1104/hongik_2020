package com.javalec.ex.CommandMember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;
import com.javalec.ex.DTO.MemberDto;

public class MemberDetailCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberDao dao = new MemberDao();
		MemberDto dto = new MemberDto();
		
		int mnum = Integer.parseInt(request.getParameter("mnum"));
		
		dto = dao.userInfo(mnum);

		request.setAttribute("mdto", dto);
	}

}
