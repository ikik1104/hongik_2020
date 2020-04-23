<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="id" value="admin" />
<c:set var="pw" value="1234" />
<c:set var="str" value="?!"/>

<h2>jstl core 태그</h2>
아이디 : <c:out value="${id}" /><br>
패스워드 : <c:out value="${pw}" /><br>
문자 : <c:out value="${str}"/><br>
-----------------------------------<br>
<h2>catch</h2>
<c:catch var="error">
	<%=2/0%>
</c:catch>
<c:out value="${error}"/><br>
<hr>
<c:if test="${id == 'admin'}">
 패스워드가 일치합니다. 패스워드는 <c:out value="${id}"/><br>
</c:if>
<c:if test="${id != 'admin'}">
 패스워드가 일치하지 않습니다. 불일치 <c:out value="${id}"/>
</c:if>
</body>
</html>