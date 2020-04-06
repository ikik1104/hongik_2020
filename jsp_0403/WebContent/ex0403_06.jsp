<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		width: 1600px; height: 160px;
		margin:  0 auto;
		border: 1px solid black;
	}
	ul{
		width:1500px;
		list-style: none;
	}
	li{ 
		height: 50px;
		width:250px;
		box-sizing: border-box;
		padding: 10px 0;
		font-size:20px;
		text-align: center;
		float: left;
		margin-right: 10px;
		border: 1px solid black;
	}
</style>
</head>
<body>
	<div>
		<%@ include file="menu.jsp" %>
	</div>
	<div>
		<p>main의 내용이 들어가는 부분</p>
	</div>
</body>
</html>