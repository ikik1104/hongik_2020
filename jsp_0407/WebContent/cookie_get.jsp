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
		Cookie[] coo = request.getCookies(); //저장된 쿠키 모두 읽어오기
		
	
			for(int i=0;i<coo.length;i++){
				String c_name = coo[i].getName();
				if(c_name.equals("anthUser")){
					out.println("아이디 : "+coo[i].getValue()+"님 안녕하세요.<br>");
// 					response.sendRedirect("main.jsp");
				}else{
// 					response.sendRedirect("login.html");
				}
			}
	%>
	<p>------------------------------------------------------------------</p>
	<%
		for(int i=0; i<coo.length;i++){
			out.println((i+1)+"번째 쿠키 정보   :   "+coo[i].getName()+" / ");
			out.println(coo[i].getValue()+"<br>");
		}
	%>
	<a href="cookie_del.jsp">쿠키정보 지우기</a>
</body>
</html>