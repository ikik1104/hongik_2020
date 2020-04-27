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
<h2>출력</h2>
<h2>파일명${requestScope.select_address}</h2>
<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>이메일</th>
		<th>주소</th>
		<th>날짜</th>
	</tr>
<c:forEach var="dto" items="${dtos}">
	<tr>
		<td><a href="update.jsp?id=${dto.getId()}">${dto.getId()}</a></td>
		<td>${dto.getPw()}</td>
		<td>${dto.getName()}</td>
		<td>${dto.getEmail()}</td>
		<td>${dto.getAddress()}</td>
		<td>${dto.getB_date()}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>