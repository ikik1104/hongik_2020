<%@page import="com.javalec.ec.BoardDao"%>
<%@page import="com.javalec.ec.BoardDto"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int b_num=0;
	String b_title="";
	String b_content="";
	String b_user="";
	String del_file="";

	//저장경로 지정
	String path = request.getRealPath("upload"); // 파일을 저장할 위치를 어디로?!
	//파일 사이즈 - 업로드 파일 용량 제한
	int size = 1024 * 1024 * 10 ; // 10메가 용량 제한
	//파일 이름 최종 설정
	String file1="";
	//예전 파일이름
	String orifile1="";
	
	//외부와 연결은 무조건 try-catch
	try{
		BoardDao bdao = BoardDao.getInstance();
		
		//request, 파일 저장경로, 용량, 인코딩타입, 중복파일명에 대한 정책 ) 들을 넣어줘야한다.
		MultipartRequest multi = new MultipartRequest(request,path,size,"utf-8",new DefaultFileRenamePolicy()); 
		//new DefaultFileRenamePolicy() 똑같은 이름이 있으면 이름 뒤 1,2,3...
		b_num = Integer.parseInt(multi.getParameter("b_num"));
		b_title = multi.getParameter("b_title");
		b_content = multi.getParameter("b_content");
		b_user = multi.getParameter("b_user");
		del_file = multi.getParameter("del_file");
		
		
		//파일이름 가져오기
		Enumeration files =  multi.getFileNames();//파일들의 이름을 가져온다
		String name1 = (String) files.nextElement(); //위에서 가져온 이름리스트의 이름을 가져온다. form->name값 (지금은 하나) 
		file1 = multi.getFilesystemName(name1);//새로 등록한 파일의 이름 가져오고 저장한다.
		
		if(file1==null){ //새로 선택한 파일이 있는 경우 
			file1 = multi.getParameter("file"); //기존 파일 명 가져옴
			bdao.delFile(b_num);//기존파일 삭제
		}
		if(del_file!=null){
			bdao.delFile(b_num);
		}
		
		BoardDto bdto = new BoardDto(b_num,b_title,b_content,b_user,file1);
		int check = bdao.updateBoard(bdto);
		if(check==1){
%>
	<script type="text/javascript">
		alert("수정이 완료되었습니다.");
		location.href='main.jsp';
	</script>
<%			
		}else{
%>	
	<script type="text/javascript">
		alert("수정에 실패하였습니다.");
		history.back();
	</script>
<%		
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파일업로드</title>
</head>
<body>
	<h2>목록</h2>
	<table border="1" style="width: 1000px; height: 40px; text-align: center; border-collapse: collapse;">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>파일이름</th>
			<th>예전이름</th>
			<th>다운로드</th>
		</tr>
		<tr>
			<td><%=b_num%></td>
			<td><%=b_title%></td>
			<td><%=b_content%></td>
			<td><%=b_user%></td>
			<td><%=file1%></td>
			<td><%=orifile1%></td>
			<td><a href="upload/<%=file1%>">다운로드</a></td>
			<!-- 저렇게 하면 다운로드가 된다...? -->
		</tr>
	</table>
</body>
</html>