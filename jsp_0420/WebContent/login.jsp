<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%if(session.getAttribute("authUser")!=null){%>
<jsp:forward page="main.jsp"/>
<%}%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
<script type="text/javascript" src="js/login.js"></script>
</head>
<body>
	<h1>로그인</h1>
	<form action="login_ok.jsp" name="login" method="post"> 
		<label>
		아이디 : <input type="text" name="id">
		</label><br>
		
		<label>
		패스워드 : <input type="text" name="pw">
		</label><br><br>
		<input type="button" onclick="login_check()" value="로그인">
		<input type="button" onclick="location.href='join.jsp'" value="회원가입">
	</form>
</body>
</html>