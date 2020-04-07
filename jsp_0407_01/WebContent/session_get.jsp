<%@page import="java.util.Enumeration"%>
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
	Object obj1 =  session.getAttribute("auth_user");
	String auth_user = (String)obj1;
	out.println("session 값 :"+auth_user+"<br>");
	
	Object obj2 = session.getAttribute("naver_id");
	String naver_id = (String) obj2;
	out.println("session 값 : "+naver_id+"<br>");

	Object obj3 = session.getAttribute("pw");
	Integer pw = (Integer) obj3;
	out.println("session 값 : "+pw+"<br>");
	
	Object obj4 = session.getAttribute("nick_name");
	String nick_name = (String) obj4;
	out.println("session 값 : "+nick_name+"<br>");
	
	out.println("----------------------------------------<br>");
	
	String session_n;
	String session_v;
	
	Enumeration enum1 =  session.getAttributeNames();
	while(enum1.hasMoreElements()){
		session_n = enum1.nextElement().toString();
		session_v = session.getAttribute(session_n).toString();
		out.println("세션: name - "+session_n+" ");
		out.println("value - "+session_v+"<br>");
	}
	
	out.println("----------------------------------------<br>");
	String sessionId = session.getId();
	out.println("세션 고유번호 :"+sessionId+"<br>");
	
	out.println("----------------------------------------<br>");
	int inter = session.getMaxInactiveInterval();
	out.println("세션 유효시간 : "+inter+"<br>");
	out.println("----------------------------------------<br>");
	
	
	session.removeAttribute("auth_user");
%>
<a href="session_del.jsp">세션 지우기</a>
</body>
</html>