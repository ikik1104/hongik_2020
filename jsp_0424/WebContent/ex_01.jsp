<%@page import="com.javalec.ex.Bcon.Login"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<% 	
	ArrayList list = new ArrayList();
	

Login log = null;
	for(int i=0;i<5;i++){
		log = new Login();
		log.setNum(i+1);
		log.setId("admin"+i);
		log.setPw("abc"+i); 
		list.add(log);
	}
	request.setAttribute("test", list);
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ArrayList 출력</h2>
<c:set var="test1" value="function test" />
입력된 문자 : ${test1}<br>
대문자 출력 : ${fn:toUpperCase(test1)}<br>
<hr>
<c:set var="test2" value="  name : 홍         길동   " />
공백문자 포함 : ${test2}<br>
공백문자 제거 : ${fn:trim(test2)}<br>
<hr>

<c:if test="${fn:contains(test2,'동')==true}">
	 이름 : ${test2} / 동이라는 이름이 포함되어 있습니다.
</c:if>
<c:if test="${fn:contains(test2,'동')==false}">
	 이름 : ${test2} / 동이라는 이름이 포함되어 있지 않습니다.
</c:if>
<br>
당신의 이름에는 길이라는 이름이 포함되어 있습니다.
${fn:contains(test2,'동')}<br>
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
<h2>저장된 지역 출력</h2>
<hr>
<c:forEach var="item" items="서울,부산,경기,인천,대전">
	지역 : ${item}<br>
</c:forEach>
<c:set var="sum" value="0" />
<c:forEach var="i" begin="0" end="100" step="1">
	${sum = sum+1}<br>
</c:forEach>
<hr>
</body>
</html>