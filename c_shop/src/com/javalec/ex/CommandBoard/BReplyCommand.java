package com.javalec.ex.CommandBoard;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		BDao dao = new BDao();
		BDto dto = new BDto();
		
		String path = "D:/upload";
//				request.getSession().getServletContext().getRealPath("upload");  파일을 저장할 위치를 어디로?!
		//파일 사이즈 - 업로드 파일 용량 제한
		int size = 1024 * 1024 * 10 ; // 10메가 용량 제한
		//파일 이름 최종 설정
		String file1=""; //썸네일
		//예전 파일이름
		String orifile1="";
		try{
			//request, 파일 저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책 ) 들을 넣어줘야한다.
			MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy()); 
			//new DefaultFileRenamePolicy() 똑같은 이름이 있으면 이름 뒤 1,2,3...
			
			String name = multi.getParameter("bname");
			String title = multi.getParameter("btitle");
			String content = multi.getParameter("bcontent");
			int group = Integer.parseInt(multi.getParameter("bgroup"));
			int step = Integer.parseInt(multi.getParameter("bstep"));
			int indent = Integer.parseInt(multi.getParameter("bindent"));
			//파일이름 가져오기
			Enumeration files =  multi.getFileNames();//파일들의 이름을 가져온다
			String name1 = (String) files.nextElement(); //위에서 가져온 이름의 값!!??
			file1 = multi.getFilesystemName(name1);//똑가튼 이름이 있으면 뒤에 숫자를 1,2,3
			orifile1= multi.getOriginalFileName(name1);//예전 이름을 여기에 저장 (필수사항 아님)
			
			System.out.println("???A?A?"+group);
			dto = new BDto(0,name,title,content, null, file1, 0, group, step, indent);
			int check = dao.Breply(dto);
			
			if(check==1) {
				request.setAttribute("text", "답글 입력이 완료되었습니다.");
			}else {
				request.setAttribute("text", "죄송합니다. 답글 입력에 실패하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
