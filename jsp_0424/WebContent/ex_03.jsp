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
	//ArrayList 객체
	request.setAttribute("test", list);

	Login lo1 = new Login(90,"naver","12345");
	//class 1개 객체
	request.setAttribute("ldto", lo1);
	
	request.setAttribute("user_id", "admin");
	request.setAttribute("user_pw", "1234");
	request.setAttribute("user_name", "홍길동");
	
	//request로 넘겨도 받을 수 있게 하는 것!
	RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
	dispatcher.forward(request, response);
%>
</body>
</html>