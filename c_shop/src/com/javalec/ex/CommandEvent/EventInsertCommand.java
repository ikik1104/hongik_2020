package com.javalec.ex.CommandEvent;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.EventDao;
import com.javalec.ex.DTO.EventDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class EventInsertCommand implements EventCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		EventDao edao = new EventDao();
		EventDto edto = null;
		
		int b_num=0;
		

		//저장경로 지정
		String path = "D:/upload2";// 파일을 저장할 위치를 어디로?!
//		String path = request.getSession().getServletContext().getRealPath("upload");파일을 저장할 위치를 어디로?!
		//파일 사이즈 - 업로드 파일 용량 제한
		int size = 1024 * 1024 * 10 ; // 10메가 용량 제한
		//파일 이름 최종 설정
		String file1=""; //썸네일
		String file2=""; //그 내용 사진
		//예전 파일이름
		String orifile1="";
		String orifile2="";	
		try{
			//request, 파일 저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책 ) 들을 넣어줘야한다.
			MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy()); 
			//new DefaultFileRenamePolicy() 똑같은 이름이 있으면 이름 뒤 1,2,3...
			
			String title = multi.getParameter("title"); 
			String content = multi.getParameter("content");
			String start_day= multi.getParameter("start_day");
			String end_day= multi.getParameter("end_day");
			//파일이름 가져오기

			file1 = multi.getFilesystemName("file1");//똑가튼 이름이 있으면 뒤에 숫자를 1,2,3
			file2 = multi.getFilesystemName("file2");//똑가튼 이름이 있으면 뒤에 숫자를 1,2,3
			
			edto = new EventDto(0, title, content, file1, file2, start_day, end_day, 0);
			int check = edao.insert_event(edto);
			
			if(check==1) {
				request.setAttribute("text", "이벤트 입력이 완료되었습니다.");
			}else {
				request.setAttribute("text", "죄송합니다. 이벤트 입력에 실패하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
