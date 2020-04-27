<%@page import="com.javalec.ex.Bcon.Login"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ArrayList 객체 (복수)</h1>
<table border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>패스워드</th>		
	</tr>
<c:forEach var="dto" items="${test}" >
	<tr>
		<td>${dto.getNum()}</td>
		<td>${dto.getId()}</td>
		<td>${dto.getPw()}</td>
	</tr>
</c:forEach>	
</table>
<hr>
<h2>class 1개 출력</h2>
<table border="1">
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>패스워드</th>		
	</tr>
	<tr>
		<td>${requestScope.ldto.getNum()}</td>
		<td>${requestScope.ldto.getId()}</td>
		<td>${requestScope.ldto.getPw()}</td>
</table>
<hr>
<%
	String id = (String)request.getAttribute("user_id");
	String pw = (String)request.getAttribute("user_pw");
	String name = (String)request.getAttribute("user_name");
%>
아이디 : <%=id%><br>
패스워드 : <%=pw%><br>
이름 : <%=name%><br>

<hr>
아이디 : ${requestScope.user_id}<br>
패스워드 : ${requestScope.user_pw}<br>
이름 : ${requestScope.user_name}<br>

</body>
</html>