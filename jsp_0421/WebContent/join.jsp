<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/join.js"></script>
</head>
<body>
	<form action="join_ok.jsp" name="join" method="post">
		<label> 아이디 : <input type="text" name="id"></label><br>
		<label> 패스워드 : <input type="password" name="pw" id="pw"></label><br>
		<label> 패스워드 확인 : <input type="password"  name="pw2"></label><br>
		<label>이름 : <input type="text"  name="name"></label><br>
		<label> 이메일 : <input type="email" name="email"></label><br>
		<label> 주소 : <input type="text" name="address"></label><br>
		<input type="button" onclick="join_check()" value="회원가입">
		<input type="button" onclick="location.href='login.jsp'" value="취소"> 
	</form>
</body>
</html>