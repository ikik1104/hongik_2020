<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 600px;
		border-collapse: collapse;	
	}
	table,tr,td{
		border: 1px solid black;
	}
	td:nth-child(1) {
		width: 200px; height: 20px; text-align: center;
	}	
	td:nth-child(2) {
		width: 400px; height: 20px;
	}	
}
</style>
</head>
<%request.setCharacterEncoding("utf-8");%>
<body>
	<h1>회원가입 정보</h1>
	<table>
		<tr>
			<td>아이디</td>
			<td><%=request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%=request.getParameter("pw") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>취미</td>
			<td><%=Arrays.toString(request.getParameterValues("hobby"))%></td>
		</tr>
		<tr>
			<td>전공</td>
			<td><%=request.getParameter("major") %></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=request.getParameter("address") %></td>
		</tr>
	
	</table>
</body>
</html>