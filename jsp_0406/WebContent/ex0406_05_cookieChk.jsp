<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>남아있는 쿠키 정보</h2>
<%
	Cookie[] cookies = request.getCookies();
	
	if(cookies != null){
		for(int i = 0; i<cookies.length;i++){
			out.println("쿠키 name : "+cookies[i].getName()+"<br>");
			out.println("쿠키 value : "+cookies[i].getValue()+"<br>");
			out.println("-------------------------<br>");
		}
	}

%>
</body>
</html>