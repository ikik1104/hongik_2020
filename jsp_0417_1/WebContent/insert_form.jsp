<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  입력 폼을 만들어 주세요.  -->
<form action="insert_ok.jsp" name="form" method="post">
아이디 : <input type="text" name="id"><br>
패스워드 : <input type="password" name="pw"><br>
이름 : <input type="text" name="name"><br>
이메일 : <input type="text" name="email"><br>
주소: <input type="text" name="address"><br>
번호 : <input type="text" name="phone"><br>
생일 : <input type="date" name="birth"><br>
<p>성별 : </p>
<input type="radio" name="gender" value="남성">남성
<input type="radio" name="gender" value="여성">여성<br>
<p>뉴스레터 수신여부 : </p>
<input type="radio" name="news" value="예">예
<input type="radio" name="news" value="아니오">아니오<br>
<p>sms 수신여부 : </p>
<input type="radio" name="sms" value="예">예
<input type="radio" name="sms" value="아니오">아니오<br>
<input type="submit" value="전송">
</form>
</body>
</html>