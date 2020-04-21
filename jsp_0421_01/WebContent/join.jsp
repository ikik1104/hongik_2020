<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="js/postcode_v2.js"></script>
<style type="text/css">
	*{
		margin: 0;
		padding : 0;
	}
	table{
		border-collapse: collapse;
	}
	td{
		height: 50px;
	}
	input {
		height: 30px;
		margin:5px; 
	}
	#address{
		width: 362px;
	}
</style>
</head>
<body>
	<form action="join_ok.jsp" name="join" method="post">
	<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id"></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><input type="password" name="pw" id="pw"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text"  name="name"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="email" name="email"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
			<input type="text" id="postcode" placeholder="우편번호" name="address1">
			<input type="button" onclick="execDaumPostcode()" value="우편번호 찾기"><br>
			<input type="text" id="address" placeholder="주소" name="address2"><br>
			<input type="text" id="detailAddress" placeholder="상세주소" name="address3">
			<input type="text" id="extraAddress" placeholder="참고항목">
			</td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="회원가입">
<!-- 			<input type="button" onclick="location.href='login.jsp'" value="취소">  -->
			</td>
		</tr>
	</table>
	</form>
</body>
</html>