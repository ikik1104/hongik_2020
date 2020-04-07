<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String name1 = request.getParameter("name1");
	String value1 = request.getParameter("value1");
	String name2 = request.getParameter("name2");
	String value2 = request.getParameter("value2");

	session.setAttribute(name1,value1);
	session.setAttribute(name2,value2);
%>

	<h2>세션 저장이 완료되었습니다.</h2>
	<button onclick="location.href='ex01_form3.jsp'">세션보기</button>
</body>
</html>