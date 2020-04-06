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
		out.println("ContextPath : "+request.getContextPath()+"<br>");
		out.println("서버의 이름  getServerName : "+request.getServerName()+"<br>");
		out.println("포트 번호 : "+request.getServerPort()+"<br>");
		out.println("method 방식 : "+request.getMethod()+"<br>");
		out.println("세션 객체 (현재 없음): "+request.getSession()+"<br>");
		out.println("프로토콜 : "+request.getProtocol()+"<br>");
		out.println("url 주소 : "+request.getRequestURL()+"<br>");
		out.println("uri 주소 : "+request.getRequestURI()+"<br>");
		out.println("쿼리 스트링 : "+request.getQueryString()+"<br>");
		out.println("ip주소 : "+request.getRemoteAddr());
	%>
</body>
</html>