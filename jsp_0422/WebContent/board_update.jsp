<%@page import="java.io.File"%>
<%@page import="com.javalec.ec.BoardDto"%>
<%@page import="com.javalec.ec.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("b_num"));
	BoardDao bdao = BoardDao.getInstance();
	BoardDto bdto = bdao.viewBoard(num);
%> 
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<style type="text/css">
h1{text-align: center; margin-top: 50px;}th{background-color: #efefef; text-align: center;} td{height: 40px;} input[name=file]{width: 200px;}
input{width: 90%;height: 100%; border: none; padding-left: 20px;} button{height: 100%;}
</style>
<script type="text/javascript">
	function file_del() {
		if($('input[name=file]').val()==""){
			$('input[name=file]').val("<%=bdto.getB_file()%>");
			$('#del_btn').text('파일삭제');
		}else{
			$('input[name=file]').val("");
			$('#del_btn').text('파일복구');
		}
	
	}
	
</script>
</head>
<body>
	<h1>게시물 수정</h1>
	<form action="updateOk.jsp" name="form" method="post" enctype="multipart/form-data">
		<table border="1" style="width:1000px; height: 40px;  border-collapse: collapse; margin:50 auto;">
			<tr>
				<th>제목</th>
				<td><input type="text" name="b_title" autofocus  value=<%=bdto.getB_title()%> ></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><input type="text" name="b_content" value=<%=bdto.getB_content()%>></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="b_user" value=<%=bdto.getB_user()%>></td>
			</tr>
			<tr>
				<th>현재 첨부파일 </th>
				<%if(bdto.getB_file()!=null){ %>
				<td><input type="text" name="file" readonly value="<%=bdto.getB_file()%>"><button type="button" onclick="file_del()" id="del_btn">파일삭제</button></td>
				<%}else{%>
				<td>첨부파일 없음</td>
				<%}%>
			</tr>
			<tr>
				<th>수정파일</th>
				<td><input type="file" name="file2"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">수정</button> 
				<input type="hidden" name="b_num" value=<%=bdto.getB_num()%>> 
				<button type="button" onclick="location.href='javascript:history.back();'">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>