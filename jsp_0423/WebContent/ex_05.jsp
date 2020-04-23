<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:out value="${param.user_id}"></c:out><br>

<!-- 89점 학점 B 를 if 비교문 만들어보세요. -->
<c:set var="score" value="${(param.kor+param.eng+param.math)/3}" />
<c:if test="${score>=90}">
 학점 : A / 점수 : <fmt:formatNumber value="${score}" pattern=".00"/><br>
</c:if>
<c:if test="${score>=80 && score<90}">
 학점 : B / 점수 : <fmt:formatNumber value="${score}" pattern=".00"/><br>
</c:if>
<c:if test="${score>=70 && score<80}">
 학점 : C / 점수 : <fmt:formatNumber value="${score}" pattern=".00"/><br>
</c:if>
<c:if test="${score<70}">
 학점 : D / 점수 : <fmt:formatNumber value="${score}" pattern=".00"/><br>
</c:if>

<c:if test="${param.name=='홍길동'}">
	<p>${param.name} 입니다.</p>
</c:if>
<c:if test="${param.name !='홍길동'}">
	<p>홍길동이 아닙니다. 이름 : ${param.name}</p>
</c:if>
</body>
</html>