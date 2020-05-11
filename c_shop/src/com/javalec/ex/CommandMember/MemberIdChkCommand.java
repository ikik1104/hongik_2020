package com.javalec.ex.CommandMember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;

public class MemberIdChkCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		MemberDao mdao = new MemberDao();
		String id = request.getParameter("id_check");
		
		String msg = "";
		int check = mdao.idChk(id);
		
		if(check == 1) {
			msg = "이미 존재하는 아이디 입니다";
			request.setAttribute("chk", "n");
		}else {
			msg = "사용 가능한 아이디 입니다";
			request.setAttribute("chk", "y");
		}
		
		request.setAttribute("id", id);
		request.setAttribute("msg", msg);

	}

}
