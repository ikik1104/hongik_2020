<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String id = (String)session.getAttribute("authUser");
 	if(id!=null){
 		response.sendRedirect("main.jsp");
 	}
 %>   
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login_ok.jsp" method="post" name="join">
아이디 : <input type="text" name="id"><br>
비밀번호 : <input type="password" name="pw"><br>
<input type="submit" value="로그인">
</form>
</body>
</html>