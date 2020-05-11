package com.javalec.ex.CommandAdmin;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.ex.DAO.AdminDao;
import com.javalec.ex.DAO.BDao;
import com.javalec.ex.DTO.BDto;
import com.javalec.ex.DTO.EventDto;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class A_Notice_UpdateCom implements AdminCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		AdminDao dao = new AdminDao();
		BDto dto = new BDto();
		
		//저장경로 지정
				String path = "D:/upload2";// 파일을 저장할 위치를 어디로?!
				//파일 사이즈 - 업로드 파일 용량 제한
				int size = 1024 * 1024 * 10 ; // 10메가 용량 제한
				//파일 이름 최종 설정
				String file1=""; //썸네일
				try{
					//request, 파일 저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책 ) 들을 넣어줘야한다.
					MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy()); 
					//new DefaultFileRenamePolicy() 똑같은 이름이 있으면 이름 뒤 1,2,3...
					
					int bid = Integer.parseInt(multi.getParameter("bid"));
					System.out.println("bid : "+bid);
					String bname = multi.getParameter("bname");
					String btitle = multi.getParameter("btitle"); 
					String bcontent = multi.getParameter("bcontent");
					String ori_file = multi.getParameter("ori_file");
					String del_chk = multi.getParameter("del_chk");
					
					if(del_chk.equals("y")) { //파일삭제를 클릭했으면
						dao.delFile(bid); //파일을 삭제한다.
						file1 = multi.getFilesystemName("file2");//새로 선택한 이미지가 있으면 file1에 담는다.
					}else if(del_chk.equals("n")) { //삭제한 파일이 없으면
						if(multi.getFilesystemName("file1")==null){ //새로 선택한 파일이 없으면
							file1 = ori_file; //기존파일 그대로
						}else{
							file1 = multi.getFilesystemName("file1");
						}
					}
					
					dto = new BDto(bid, bname, btitle, bcontent, null, file1, 0, 0, 0, 0);
					int check = dao.update(dto);
					
					request.setAttribute("bid", bid);
					if(check==1) {
						request.setAttribute("text", "공지사항 수정이 완료되었습니다.");
					}else {
						request.setAttribute("text", "죄송합니다. 공지사항 수정에 실패하였습니다.");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				
		
	

	}

}
