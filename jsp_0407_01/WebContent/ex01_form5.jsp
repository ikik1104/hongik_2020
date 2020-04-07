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
	session.invalidate();//전체 삭제

	if(request.isRequestedSessionIdValid()){ //세션에 값이 있니~?
		Enumeration enumeration = session.getAttributeNames();
	
		while(enumeration.hasMoreElements()){
			String name = (String)enumeration.nextElement();
			String value = (String)session.getAttribute(name);
			out.println("세션 이름: "+name+"<br>");
			out.println("세션 값 : "+value+"<br>");
			out.println("--------------------------");
		}
	}else{
%>
	<h1>전체 삭제 되었습니다.</h1>
<%		
	}
%>

</body>
</html>