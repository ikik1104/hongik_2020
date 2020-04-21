<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="mdto" class="com.javalec.ex.MemberDto"/>
<jsp:setProperty property="*" name="mdto"/>
<%
	MemberDao mdao = MemberDao.getInstance();
	int check = mdao.update_user(mdto);
	
	if(check==1){
%>
<script type="text/javascript">
	alert("수정이 완료되었습니다.");
	location.href="main.jsp";
</script>
<%		
	}else{
%>
<script type="text/javascript">
	alert("수정에 실패하였습니다.");
	history.back();
</script>
<%		
	}
%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"></script>
</head>
<body>

</body>
</html>