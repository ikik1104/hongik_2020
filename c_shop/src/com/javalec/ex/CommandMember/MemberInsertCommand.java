package com.javalec.ex.CommandMember;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.MemberDao;
import com.javalec.ex.DTO.MemberDto;

public class MemberInsertCommand implements MemberCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		MemberDao dao = new MemberDao();
		MemberDto mdto = new MemberDto();
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String postcode = request.getParameter("postcode");
		String address = request.getParameter("address");
		String address2 = request.getParameter("address2");
		String address3 = request.getParameter("address3");
		String phone = request.getParameter("phone");
		String birth = request.getParameter("birth");
		String day2 = request.getParameter("day2");
		String gender = request.getParameter("gender");
		String news = request.getParameter("news");
		String sms = request.getParameter("sms");
		
		mdto = new MemberDto(0, id, pw, name, email, postcode, address, address2, address3, phone, birth, day2, gender, news, sms, null);
		
		int check = dao.joinMember(mdto);
		
		if(check == 1) {
			request.setAttribute("text", "회원가입에 완료하였습니다.");
		}else {
			request.setAttribute("text", "죄송합니다. 회원가입에 실패하였습니다.");
		}

	}

}
