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
		Cookie[] coo1 = request.getCookies();
		
		for(int i=0;i<coo1.length;i++){
			String c_name = coo1[i].getName();
			if(c_name.equals("anthUser")){
				coo1[i].setMaxAge(0);
				response.addCookie(coo1[i]);
			}
			if(c_name.equals("nick_name")){
				coo1[i].setMaxAge(0);
				response.addCookie(coo1[i]);
			}
			if(c_name.equals("user_id")){
				coo1[i].setMaxAge(0);
				response.addCookie(coo1[i]);
			}
		}
// 			response.sendRedirect("login.html");
	%>
	<h2>쿠기가 삭제되었습니다.</h2>
	<a href="cookie_get.jsp">쿠키 정보 읽기</a>
</body>
</html>