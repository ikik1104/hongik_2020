<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		
		Cookie coo = new Cookie(name,value);
		coo.setMaxAge(1800);
		response.addCookie(coo);
	%>
	<h1>저장된 쿠키</h1>
	<%
		Cookie[] co_list = request.getCookies();
		for(int i=0; i<co_list.length;i++){
			out.println("쿠키 name : "+co_list[i].getName()+"<br>");
			out.println("쿠키 value : "+co_list[i].getValue()+"<br>");
			out.println("------------------------------<br>");
		}
	%>
	<a href="co_form3.jsp">쿠키 삭제 후 읽기</a>
</body>
</html>