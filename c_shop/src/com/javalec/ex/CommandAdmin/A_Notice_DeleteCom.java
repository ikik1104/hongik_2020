package com.javalec.ex.CommandAdmin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.AdminDao;
import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class A_Notice_DeleteCom implements AdminCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
			int id = Integer.parseInt(request.getParameter("bid"));
			AdminDao dao = new AdminDao();
			int check = dao.Bdelete(id);
			if(check == 1) {
				request.setAttribute("text", "게시물 삭제를 완료하였습니다.");
			}else {
				request.setAttribute("text", "죄송합니다. 게시물 삭제에 실패했습니다.");
			}
	}

}
