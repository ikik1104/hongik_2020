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
	request.setAttribute("user_id", "admin");
	request.setAttribute("user_pw", "1234");
	request.setAttribute("user_name", "홍길동");
	response.sendRedirect("result.jsp");
%>
</body>
</html>