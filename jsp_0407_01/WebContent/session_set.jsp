<%@page import="javax.websocket.Session"%>
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
		session.setAttribute("auth_user", "admin");
		session.setAttribute("naver_id", "admin");
		session.setAttribute("pw", 1234);
		session.setAttribute("nick_name", "goldStar");
	%>
	<h2>세션이 저장 되었습니다.</h2>
	<a href="session_get.jsp">세션 보기</a>
</body>
</html>