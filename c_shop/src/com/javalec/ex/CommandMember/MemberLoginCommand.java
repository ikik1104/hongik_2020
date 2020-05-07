package com.javalec.ex.CommandMember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.ex.DAO.MemberDao;

public class MemberLoginCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		MemberDao dao = new MemberDao();
		String page = "";
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		int check = dao.login(id, pw);
		
		if(check == 1) {
			session.setAttribute("User", id);
			System.out.println("세션에 유저 담기");
			page = "index.Mdo";
		}else{
			request.setAttribute("text", "존재하는 회원이 없습니다. 아이디, 비밀번호를 다시 입력해주세요.");
			page = "loginForm.Mdo";
		}

		request.setAttribute("page", page);
		
	}

}
