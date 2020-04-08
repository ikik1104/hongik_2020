<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="user" class="com.javalec.ex.User" scope="page"/>
<jsp:setProperty property="*" name="user"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%=user.getName()%><br>
아이디 : <%=user.getId()%><br>
패스워드 : <%=user.getPw()%><br>
성별 : <%=user.getGender()%><br>
주소 : <%=user.getAddr()%><br>
</body>
</html>