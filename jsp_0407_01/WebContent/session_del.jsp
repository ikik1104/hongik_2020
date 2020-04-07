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
	String auth_user = (String) session.getAttribute("auth_user");
	if(auth_user==null){
		out.println("auth_user 세션이 없습니다.");
	}else{
		out.println(auth_user+"가 있습니다.");
	}
	
	session.invalidate();
	
%>
<a href="session_allDel.jsp">세션 모두 지우기</a>
</body>
</html>