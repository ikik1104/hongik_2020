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
<%
	String uri = request.getRequestURI();
//	uri = /jsp_0424/ex_05.jsp
	String conPath = request.getContextPath();
//	conPath = /jsp_0424
	String com = uri.substring(conPath.length());
//	19.subString(9);  /ex_05.jsp
	String str = "abcdefg";
	String result = str.substring(4);
%>
</body>
</html>