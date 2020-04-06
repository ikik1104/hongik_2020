<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		border-collapse: collapse;
		width: 600px;
		margin: 0 auto;
		font-size: 20px;
}
	tr,td{
		border: 1px solid black;
	}
	
	td:nth-child(1) {
		width: 200px;
}
	td:nth-child(2) {
		width: 400px;
}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
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
			<td><%=URLDecoder.decode(request.getParameter("name"), "UTF-8") %></td>
		</tr>
	</table>
</body>
</html>