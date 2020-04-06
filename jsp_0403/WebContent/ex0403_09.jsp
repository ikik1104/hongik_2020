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
		int age = Integer.parseInt(request.getParameter("age"));
		
		if(age>=20){
			//페이지 이동 파라미터 값으로 age 넘겨줌.
			response.sendRedirect("ex0403_09_pass.jsp?age="+age);
		}else{
			response.sendRedirect("ex0403_09_error.jsp?age="+age);
		}
	%>
</body>
</html>