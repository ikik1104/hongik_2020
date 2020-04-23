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
<table border="1" style="width: 500px; text-align: center; border-collapse: collapse;">
<c:set var="sum" value="0"/>
<!-- 구구단을 표현식으로... -->
<c:forEach var="i" begin="2" end="9" step="1">
	<c:forEach var="j" begin="1" end="9" step="2">
 	<tr>
 	<c:if test="${j==1}">
 		<tr>
 			<td style="background: #dddddd;">${i} 단</td>
 		</tr>
 	</c:if>
 		<tr>
 			<td>${i}  *  ${j}   =  ${i*j}</td>
 		</tr>
	</c:forEach>
</c:forEach>
</table>
</body>
</html>