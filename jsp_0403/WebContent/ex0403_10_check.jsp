<%@page import="java.net.URLEncoder"%>
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
	String id = request.getParameter("id");
	String name = URLEncoder.encode(request.getParameter("name"),"utf-8");
	String pw = request.getParameter("pw");
	
	if(id.equals("admin") && pw.equals("777")){
		response.sendRedirect("ex0403_10_loginOk.jsp?id="+id+"&name="+name+"&pw="+pw);
	}else{
		response.sendRedirect("ex0403_10_login.jsp?id="+id);
	}
%>
</body>
</html>