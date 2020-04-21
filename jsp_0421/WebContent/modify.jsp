<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	String id = request.getParameter("id");
 	MemberDao mdao = MemberDao.getInstance();
 	MemberDto mdto = mdao.getMember(id);
 %>   
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/join.js"></script>
</head>
<body>
	<form action="modify_ok.jsp" name="update_join" method="post">
		<label> 아이디 : <input type="text" name="id" value=<%=mdto.getId()%> readonly></label><br>
		<label> 패스워드 : <input type="password" name="pw" id="pw" value=<%=mdto.getPw()%> readonly></label><br>
		<label> 패스워드 확인 : <input type="password"  name="pw2" value=<%=mdto.getPw()%> readonly></label><br>
		<label>이름 : <input type="text"  name="name" value=<%=mdto.getName()%>></label><br>
		<label> 이메일 : <input type="email" name="email" value=<%=mdto.getEmail()%>></label><br>
		<label> 주소 : <input type="text" name="address" value=<%=mdto.getAddress()%>></label><br>
		<input type="button" onclick="update_chk()" value="회원정보 수정">
		<input type="button" onclick="location.href='main.jsp'" value="취소"> 
		<input type="button" onclick="u_delete('<%=mdto.getId()%>')" value="회원 삭제">
	</form>
</body>
</html>