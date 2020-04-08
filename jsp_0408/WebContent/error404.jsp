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
		width : 1200px;
		margin: 50px auto;
	}
	img{
		width: 1200px;
	}
</style>
</head>
<body>
<div>
	<a><img alt="404" src="images/error404.jpg"></a>
	<%= exception.getMessage() %>
</div>
</body>
</html>