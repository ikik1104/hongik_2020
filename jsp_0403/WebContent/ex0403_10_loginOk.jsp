<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 완료</h1>
	<p>' <%=request.getParameter("name")%> ' 회원님 로그인되었습니다.</p>
	<p>아이디 : <%=request.getParameter("id") %></p>
	<p>비밀번호 : <%=request.getParameter("pw") %></p>
</body>
</html>