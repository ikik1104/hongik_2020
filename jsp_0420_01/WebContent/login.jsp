<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<script type="text/javascript">

	function login_chk(){
		
	login.submit();
	}
</script>
</head>
<body>
	<h2>로그인</h2>
	<form action="login_ok.jsp" name="login" method="post">
		아이디 : <input type="text" name="id"><br>
		패스워드 :<input type="text" name="pw"><br>
		<input type="button" onclick="login_chk" value="로그인"> 
		<input type="button" onclick="location.href='join.jsp'" value="회원가입">
	</form>
</body>
</html>