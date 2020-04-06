<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>[로그인 정보]</h2>
	<p>------------------------------------</p>
	<%
		Cookie[] cookies = request.getCookies(); //유저에서 나한테 던지거
		
		for(int i = 0; i<cookies.length; i++){
			String str = cookies[i].getName();
			
			if(str.equals("naver_id")){
				out.println("네이버 로그인이 되었습니다.<br>");
				out.println("네이버 아이디 : "+cookies[i].getValue()+"<br>");
				out.println("---------------------------------<br>");
				out.println("<h2>쿠키에 저장되어 있는 모든 정보</h2>");
				continue;
			}
			out.println(cookies[i].getName()+" ");
			out.println(cookies[i].getValue()+"<br>");
		}
	%>
	
	<a href="ex0406_05_del.jsp">쿠키 삭제</a>
</body>
</html>