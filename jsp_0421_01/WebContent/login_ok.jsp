<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	
	MemberDao mdao = MemberDao.getInstance();
	int check = mdao.login(id, pw);
	if(check==1){
		session.setAttribute("id", id);
		session.setAttribute("authUser", id);
		session.setAttribute("pw", pw);
		response.sendRedirect("main.jsp");
	}else if(check==0){
%>
<script type="text/javascript">
	alert("비밀번호가 일치하지 않습니다.");
	history.back();
</script>
<%		
	}else{
%>
<script type="text/javascript">
	alert("존재하는 회원이 없습니다.");
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