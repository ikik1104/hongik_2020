package com.javalec.ex.CommandEvent;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.EventDao;
import com.javalec.ex.DTO.EventDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class EventUpdateCommand implements EventCommand {

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

		try{
			//request, 파일 저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책 ) 들을 넣어줘야한다.
			MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy()); 
			//new DefaultFileRenamePolicy() 똑같은 이름이 있으면 이름 뒤 1,2,3...
			
			int num = Integer.parseInt(multi.getParameter("num"));
			String title = multi.getParameter("title"); 
			String content = multi.getParameter("content");
			String start_day= multi.getParameter("start_day");
			String end_day= multi.getParameter("end_day");
			
			String orifile1= multi.getParameter("ori_file");
			String orifile2= multi.getParameter("ori_file2");
			
			//썸네일 삭제 체크
			String del_chk = multi.getParameter("del_chk");
			//상세보기 이미지 삭제 체크
			String del_chk2 = multi.getParameter("del_chk2");
			
			
			if(del_chk.equals("y")) { //파일삭제를 클릭했으면
				edao.delFile(orifile1);  //기존 썸네일 명을 보내 삭제
				file1 = multi.getFilesystemName("file1");//새로 선택한 이미지가 있으면 file1에 담는다.
			}else if(del_chk.equals("n")) { //삭제한 파일이 없으면
				if(multi.getFilesystemName("file1_1")==null){ //새로 선택한 파일이 없으면
					file1 = orifile1; //기존파일 그대로
				}else{
					file1 = multi.getFilesystemName("file1_1");
				}
			}
			
			if(del_chk2.equals("y")) { //파일삭제를 클릭했으면
				edao.delFile(orifile2);  //기존 썸네일 명을 보내 삭제
				file2 = multi.getFilesystemName("file2");//새로 선택한 이미지가 있으면 file1에 담는다.
			}else if(del_chk.equals("n")) { //삭제한 파일이 없으면
				if(multi.getFilesystemName("file2_1")==null){ //새로 선택한 파일이 없으면
					file2 = orifile2; //기존파일 그대로
				}else{
					file2 = multi.getFilesystemName("file2_1");
				}
			}
			
			
			edto = new EventDto(num, title, content, file1, file2, start_day, end_day, 0);
			int check = edao.insert_event(edto);
			
			if(check==1) {
				request.setAttribute("text", "이벤트 수정이 완료되었습니다.");
			}else {
				request.setAttribute("text", "죄송합니다. 이벤트 수정에 실패하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
