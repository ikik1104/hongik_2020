<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>쿠키 3개가 저장되었습니다.</h2>
		<%
			Cookie cookie = new Cookie("naver_id","amdin");
			cookie.setMaxAge(60*30); //1800초 30분
			response.addCookie(cookie); // 서버에서 유저로 보내는response 
			
			Cookie co2 = new Cookie("naver_pw","1234");
			co2.setMaxAge(1800); //1800초 30분
			response.addCookie(co2); // 서버에서 유저로 보내는response
			
			Cookie co3 = new Cookie("nick_name","koitt");
			co3.setMaxAge(1800); //1800초 30분
			response.addCookie(co3); // 서버에서 유저로 보내는response
			
		%>
		<a href="ex0406_05_cookie.jsp">쿠키 정보 읽기</a>
	</body>
</html>