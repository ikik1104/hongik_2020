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
	session.invalidate(); // 전체삭제
	
	if(request.isRequestedSessionIdValid()){
		Enumeration enumeration = session.getAttributeNames();
		
		while(enumeration.hasMoreElements()){
			String auth = enumeration.nextElement().toString(); //이누머레이션으로 넘어온 이름을 auth에 담는다.
			String value = session.getAttribute(auth).toString();
			out.println("세션명 : "+auth+"<br>");
			out.println("세션값 : "+value+"<br>");
			out.println("------------------------------------<br>");
		}
	}else{
		response.sendRedirect("index.jsp");
	}
	
%>
</body>
</html>