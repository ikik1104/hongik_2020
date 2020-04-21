<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	MemberDao mdao = MemberDao.getInstance();
	int check = mdao.deleteMember(id);
	if(check==1){
%>
	<script type="text/javascript">
	alert("회원 삭제가 완료되었습니다.");
	location.href="main.jsp";
	</script>
<%		
	}else{
%>
	<script type="text/javascript">
	alert("회원삭제 실패");
	location.href="main.jsp";
	</script>
<%		
	}
    
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>