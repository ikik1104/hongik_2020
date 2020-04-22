<%@page import="com.javalec.ec.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	int num = Integer.parseInt(request.getParameter("b_num"));
	BoardDao bdao = BoardDao.getInstance();
	int check = bdao.deleteBoard(num);
	if(check==1){
	%>
	<script type="text/javascript">
	alert("게시물이 삭제되었습니다.");
	location.href="main.jsp";
	</script>
	<%	
	}else{
	%>
	<script type="text/javascript">
	alert("게시물 삭제에 실패하였습니다.");
	history.back();
	</script>
	<%	
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>