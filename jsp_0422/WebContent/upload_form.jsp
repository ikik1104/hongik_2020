<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1{text-align: center; margin-top: 50px;}th{background-color: #efefef;} td{height: 40px;}
input{width: 100%;height: 100%; border: none; padding-left: 20px;}
</style>
</head>
<body>
	<h1>게시물 작성하기</h1>
	<form action="upload_formOk.jsp" name="form" method="post" enctype="multipart/form-data">
		<table border="1" style="width:1000px; height: 40px; text-align: center; border-collapse: collapse; margin:50 auto;">
			<tr>
				<th>제목</th>
				<td><input type="text" name="b_title" placeholder="제목을 입력하세요."></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><input type="text" name="b_content" placeholder="내용을 입력하세요."></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="b_user" placeholder="작성자를 입력하세요."></td>
			</tr>
			<tr>
				<th>파일첨부1</th>
				<td><input type="file" name="file"></td>
			</tr>
			<tr>
				<td colspan="2"><button type="submit">저장</button>  <button type="button" onclick="location.href='main.jsp'">취소</button></td>
			</tr>
		</table>
	</form>
</body>
</html>