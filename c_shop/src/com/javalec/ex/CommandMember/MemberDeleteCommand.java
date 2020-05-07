package com.javalec.ex.CommandMember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;

public class MemberDeleteCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		MemberDao dao = new MemberDao();
		
		int mnum = Integer.parseInt("mnum");
		int check = dao.delUser(mnum);
		
		if(check == 1) {
			request.setAttribute("text", "회원탈퇴가 정상적으로 처리되었습니다.");
		}else {
			request.setAttribute("text", "죄송합니다. 회원탈퇴에 실패하였습니다.");
		}

	}

}
