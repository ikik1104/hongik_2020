package com.javalec.ex.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javalec.ex.CommandMember.MemberCommand;

public class MemberOutCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		session.invalidate();//세션 전부 삭제
		
		request.setAttribute("text", "로그아웃합니다.");
		
	}

}
