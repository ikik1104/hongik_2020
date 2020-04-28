package com.javalec.ex.BCommand;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {

	//전체 목록 가져오기
	void list (HttpServletRequest request, HttpServletResponse response);
	
	//게시물 상세보기
	void board_view(HttpServletRequest request, HttpServletResponse response);
	
	//게시물 insert
	void insert(HttpServletRequest request, HttpServletResponse response);
	
	//게시물 update Form
	void updateForm(HttpServletRequest request, HttpServletResponse response);
	
	//게시물 update
	void update(HttpServletRequest request, HttpServletResponse response); 
	
	//게시물 delete
	void delete(HttpServletRequest request, HttpServletResponse response);
	
	//답글Form
	void replyFrom(HttpServletRequest request, HttpServletResponse response);
	
	//답글달기
	void reply(HttpServletRequest request, HttpServletResponse response); 
	
	
}
