package com.javalec.ex.BCommand;

import java.sql.Timestamp;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BoardDao;
import com.javalec.ex.DTO.BoardDto;

public class BCommandAll implements BCommand {
	BoardDao dao = new BoardDao();
	BoardDto dto = null;
	ArrayList<BoardDto> list = null;
	int id,check;
	
	@Override //전체 목록 가져오기
	public void list(HttpServletRequest request, HttpServletResponse response) {
		list = dao.list();
		request.setAttribute("dto", list);
	}

	@Override //게시물 상세보기
	public void board_view(HttpServletRequest request, HttpServletResponse response) {
		id = Integer.parseInt(request.getParameter("bid"));
		dao.add_hit(id); //조회수 증가
		dto = dao.detail(id);// 게시물 가져오기
		request.setAttribute("dto", dto);
	}

	@Override //게시물 insert
	public void insert(HttpServletRequest request, HttpServletResponse response) {
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		dto = new BoardDto(0, bname, btitle, bcontent, null, 0, 0, 0, 0);
		check = dao.insert(dto);
	}

	@Override //게시물 update Form
	public void updateForm(HttpServletRequest request, HttpServletResponse response) {
		id = Integer.parseInt(request.getParameter("bid"));
		dto = dao.detail(id);
		request.setAttribute("dto", dto);
	}

	@Override //게시물 update
	public void update(HttpServletRequest request, HttpServletResponse response) {
		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		dto = new BoardDto(bid, bname, btitle, bcontent, null, 0, 0, 0, 0);
		check = dao.update(dto);
	}

	@Override //게시물 delete
	public void delete(HttpServletRequest request, HttpServletResponse response) {
		id = Integer.parseInt(request.getParameter("bid"));
		check = dao.delete(id);
	}

	@Override //답글Form
	public void replyFrom(HttpServletRequest request, HttpServletResponse response) {
		int bid = Integer.parseInt(request.getParameter("bid"));
		dto = dao.detail(id);
		request.setAttribute("dto", dto);
	}

	@Override //답글달기
	public void reply(HttpServletRequest request, HttpServletResponse response) {
		int bid = Integer.parseInt(request.getParameter("bid"));
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		int bgroup = Integer.parseInt(request.getParameter("bgroup"));
		int bstep = Integer.parseInt(request.getParameter("bstep"));
		int bindent = Integer.parseInt(request.getParameter("bindent"));
		dto = new BoardDto(bid, bname, btitle, bcontent, null, 0, bgroup, bstep, bindent);
		check = dao.reply_insert(dto);
	}

}
