<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	page isErrorPage="true" %>    
<% response.setStatus(200); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
	margin: 0; padding: 0;
	}
	div{
		width : 1000px;
		margin: 50px auto;
	}
	img{
		width: 1000px;
	}
</style>
</head>
<body>
<div>
<img alt="에러 500페이지" src="images/error500.png">
<%= exception.getMessage() %>

</div>
</body>
</html>