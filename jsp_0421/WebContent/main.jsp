<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE>
<!-- 세션이 있는지 없는지 확인main.jsp로 보냄 -->
<% if(session.getAttribute("authUser")==null){  %>
	<script type="text/javascript">alert("로그인 하고 오세요~"); location.href='login.jsp';</script>
<%}

ArrayList list;
String id = (String)session.getAttribute("id");
MemberDao mdao = MemberDao.getInstance();
list = mdao.all_list();
request.setAttribute("dtos", list);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>관리자 페이지</h2>
<p><%=session.getAttribute("name")%>님 로그인하였습니다.</p>
<table border="1">
	<tr>
		<th>아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>이메일</th>
		<th>주소</th>
		<th>가입일자</th>
	</tr>
<c:forEach var="mdto" items="${dtos}">
	<tr>
		<td><a href="modify.jsp?id=${mdto.getId()}">${mdto.getId()}</a></td>
		<td>${mdto.getPw()}</td>
		<td>${mdto.getName()}</td>
		<td>${mdto.getEmail()}</td>
		<td>${mdto.getAddress()}</td>
		<td>${mdto.getB_date()}</td>
	</tr>
</c:forEach>
</table>
</body>
</html>