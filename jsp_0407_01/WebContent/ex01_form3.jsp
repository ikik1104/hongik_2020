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
	Enumeration enume1 =  session.getAttributeNames();

	while(enume1.hasMoreElements()){ //있으면 돌아라
		String name = (String)enume1.nextElement();
		String value = (String)session.getAttribute(name);
		out.println("세션 name : "+name +"<br>");
		out.println("세션 value : "+value+"<br>");
		out.println("-----------------------------------<br>");
	}
%>
<form name="form" action="ex01_form4.jsp" method="post">
삭제 할 세션 name : <input type="text" name="del_name">
<button type="submit">삭제</button>
</form>
</body>
</html>