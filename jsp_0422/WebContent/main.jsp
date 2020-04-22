<%@page import="com.javalec.ec.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.ec.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h1{text-align: center; margin-top: 50px;}th{background-color: #efefef;} td{height: 40px;}
	span{color:#666666; font-size: 13px;}
</style>
</head>
<body>
	<h1>게시물 리스트 <input type="button" value="게시물 작성하기" onclick="location.href='upload_form.jsp'"></h1>
	<table border="1" style="width: 1200px; text-align: center; border-collapse: collapse; margin: 50 auto;">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>첨부파일</th>
			<th>다운로드</th>
		</tr>
<%
	BoardDao bdao = BoardDao.getInstance();
	ArrayList list = bdao.getBoards();
	
	for(int i=0;i<list.size();i++){
		BoardDto bdto = (BoardDto) list.get(i);
		
%>
		<tr>
			<td><%=bdto.getB_num()%></td>
			<td><a href="board_view.jsp?b_num=<%=bdto.getB_num()%>"><%=bdto.getB_title()%></a></td>
			<td><%=bdto.getB_content()%></td>
			<td><%=bdto.getB_user()%></td>
			
			<%if(bdto.getB_file()!=null){ %>
			<td><%=bdto.getB_file()%></td>
			<td><a href="upload/<%=bdto.getB_file()%>">다운로드</a></td>
			<%}else{%>
			<td colspan="2"><span>첨부파일 없음</span></td>
			<%}%>
		</tr>

	<% } %>		
		
	</table>
</body>
</html>