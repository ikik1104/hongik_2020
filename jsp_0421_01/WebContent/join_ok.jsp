<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="mdto" class="com.javalec.ex.MemberDto" />
<jsp:setProperty property="*" name="mdto"/>
<%
	MemberDao mdao = MemberDao.getInstance();
	int chk = mdao.id_chk(mdto.getId());
	
	if(chk==1){
		int check = mdao.join(mdto);
		if(check==1){
%>
		<script type="text/javascript">
			alert("회원가입이 완료되었습니다.");
			location.href='main.jsp';
		</script>
<%		
			}else{
%>
		<script type="text/javascript">
			alert("회원가입에 실패 하였습니다.");
			history.back();
		</script>
<%		
			}
%>
<%		
	}else{
%>
		<script type="text/javascript">
			alert("이미 존재하는 아이디 입니다.");
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