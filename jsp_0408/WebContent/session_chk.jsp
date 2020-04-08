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
	
	if(request.isRequestedSessionIdValid()){
		Enumeration enumeration = session.getAttributeNames();
			out.println("현재 세션이 있습니다.");
		
		while(enumeration.hasMoreElements()){
			String auth = (String)enumeration.nextElement(); //이누머레이션으로 넘어온 이름을 auth에 담는다.
			String value = (String)session.getAttribute(auth);
			out.println("세션명 : "+auth+"<br>");
			out.println("세션값 : "+value+"<br>");
			out.println("------------------------------------<br>");
		}
	}else{
		out.println("현재 세션이 없습니다.");
	}
	
%>
</body>
</html>