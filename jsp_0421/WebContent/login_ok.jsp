<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%
	//form 태그로 넘어온 데이터 한글처히
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	MemberDao mdao =  MemberDao.getInstance(); //mdao가져옴
	int check = mdao.userCheck(id, pw);
	if(check==-1){
%>
	<script type="text/javascript">
	alert("아이디가 존재하지 않습니다. 다시 입력하세요.");
	history.back();
	</script>
<%
	}else if(check==0){
%>
	<script type="text/javascript">
	alert("패스워드가 일치하지 않습니다. 다시 입력하세요.");
	history.back();
	</script>
<%		
	}else if(check==1){
	MemberDto mdto = mdao.getMember(id);
	session.setAttribute("id", id);
	session.setAttribute("pw", pw);
	session.setAttribute("name", mdto.getName());
	session.setAttribute("authUser", id);
	response.sendRedirect("main.jsp");
%>
	<!-- 닉네임을 가지고 와야 하는 경우 -->	
	<!-- 세션에 id,pw,name,authUser -->
<%		
	}
%>
</body>
</html>