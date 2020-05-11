package com.javalec.ex.CommandAdmin;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.AdminDao;
import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;

public class A_Notice_ListCom implements AdminCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String searchFlag = null; //검색체크
		String opt = request.getParameter("opt");
		String search = request.getParameter("search");

		if(opt==null || search==null) {
			opt = "";
			search = "";
		}
		
		AdminDao dao = new AdminDao();
		//페이지별 리스트 개수 가져오기
		ArrayList<BDto> dtos = dao.notice_list(opt,search);

		if(search!="") {
			request.setAttribute("opt", opt);
			request.setAttribute("search", search);
		}
		
		request.setAttribute("bdto", dtos);
		
		if(request.getAttribute("text")!=null) {
			request.setAttribute("text", request.getAttribute("text"));
		}
		
	}

}
