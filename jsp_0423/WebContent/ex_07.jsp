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
<c:set var="check" value="1"/>

<c:choose>
	<c:when test="${check==1}">
	<p>10개의 풀옵션 차량을 선택하셨습니다.</p>
	<c:set var="user_id" value="admin" />
	<c:redirect url="ex_05.jsp?user_id=${user_id}"/>
	</c:when>
	<c:when test="${check==2}">
	<p>5개의 옵션 차량을 선택하셨습니다.</p>
	</c:when>
	<c:when test="${check==3}">
		<p>3개의 옵션 차량을 선택하셨습니다.</p>
	</c:when>
	<c:otherwise>
		<p>선택한 옵션이 없습니다.</p>
	</c:otherwise>
</c:choose>
</body>
</html>