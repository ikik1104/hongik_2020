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
		Cookie co1 = new Cookie("user_id","amdin");
		co1.setMaxAge(1800);
		response.addCookie(co1);
		
		Cookie co2 = new Cookie("nick_name","goldstar");
		co2.setMaxAge(1800);
		response.addCookie(co2);
		
		Cookie co3 = new Cookie("anthUser","admin");
		co3.setMaxAge(1800);
		response.addCookie(co3);
		
	%>
		<h2>쿠키 3개가 저장되었습니다.</h2>
		<a href="cookie_get.jsp">쿠키보기</a>
</body>
</html>