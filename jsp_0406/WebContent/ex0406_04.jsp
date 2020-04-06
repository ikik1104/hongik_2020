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
	<jsp:forward page="ex0406_04_param.jsp" >
		<jsp:param name="id" value="admin"/>
		<jsp:param name="pw" value="1234"/>
		<jsp:param name="name" value='<%=URLEncoder.encode("홍길동", "UTF-8")%>'/>
	</jsp:forward>
</body>
</html>