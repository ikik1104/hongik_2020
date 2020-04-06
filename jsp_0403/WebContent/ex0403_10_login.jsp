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
	if(request.getParameter("id")!=null){
		out.println(request.getParameter("id")+"가 잘못 입력되었습니다.<br> 다시 한번 확인해 주세요.");
	}	

%>
	<form name="form" action="ex0403_10_check.jsp" method="get">
	아이디 : <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="pw"><br>
	<input type="submit" value="로그인">
	</form>
</body>
</html>