<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="mem1" class="com.javalec.ex.Member" scope="session"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	if(id.equals(mem1.getId()) && pw.equals(mem1.getPw())){
		session.setAttribute("auth_user", id);
		session.setAttribute("nick_name", mem1.getNick_name());
		response.sendRedirect("index.jsp");
	}else{
	%>
		<script type="text/javascript">
			alert("존재하지 않는 회원입니다.");
			history.back(-1);
		</script>
	<%
	}
%>
</body>
</html>