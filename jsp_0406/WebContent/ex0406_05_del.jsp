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
		Cookie[] cookies =  request.getCookies();
		for(int i = 0; i<cookies.length; i++){
// 			if(cookies[i].getName().equals("naver_id")){ //네이버 아이디가 있니?
// 				cookies[i].setMaxAge(0); // 쿠키 유지 초기화
// 				response.addCookie(cookies[i]);
// 			}
			
			//쿠키 전체 삭제 
// 			/*
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
// 			*/
		}
	%>
	<a href="ex0406_05_cookieChk.jsp">쿠키 확인</a>
</body>
</html>