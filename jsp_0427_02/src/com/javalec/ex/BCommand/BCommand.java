package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {

	
	void execute(HttpServletRequest request, HttpServletResponse response); // 리스트를 가져오는 메소드..?

//	void detail(HttpServletRequest request, HttpServletResponse response, int bid); //상세보기?
	
}
