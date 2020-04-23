<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
<c:set var="money1" value="100000000" />
<jsp:useBean id="t_date" class="java.util.Date"/>
 <h2>현재 날짜 : <fmt:formatDate value="${t_date}" pattern="yyyy/MM/dd" /></h2>
 날짜와 시간 : <fmt:formatDate value="<%=new Date()%>" type="both"/><br>
 <!--  date 객체에는 날짜와 시간이 있다. both 는 둘다 출력한다는 얘기 -->
 날짜 : <fmt:formatDate value="<%=new Date() %>" type="date"/><br>
 시간 : <fmt:formatDate value="<%=new Date() %>" type="time"/>
 <hr>
 <fmt:formatNumber value="${money1}" groupingUsed="true"/><br>
 <fmt:formatNumber value="3.1412314" pattern="0000" />
 <fmt:formatNumber value="1" pattern="0000" />
  <fmt:formatNumber value="314" pattern="####" />
 <!-- groupingUsed 천 단위로 쉼표 찍힘 -->
</body>
</html>