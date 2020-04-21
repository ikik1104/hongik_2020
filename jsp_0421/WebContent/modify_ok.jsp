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
	int check = mdao.updateMember(mdto);
	if(check==1){ //수정 성공
%>
		<script type="text/javascript">
	 	alert("회원정보 수정이 완료되었습니다.");
	 	location.href="main.jsp";
	 	</script>
<% 			
	}else{ //수정 실패
		%>
		<script type="text/javascript">
	 	alert("회원정보 수정에 실패하였습니다.");
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
</head>
<body>

</body>
</html>