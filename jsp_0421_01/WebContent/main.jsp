<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 리스트</h2>
<input type="button" onclick="location.href='logout.jsp'" value="로그아웃">
<table border="1">
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>이메일</th>
		<th>우편번호</th>
		<th>주소</th>
		<th>상세주소</th>
		<th>가입일</th>
		<th>수정일</th>
	</tr>
<%
	ArrayList<MemberDto> mdto = new ArrayList<MemberDto>();
	MemberDao mdao = MemberDao.getInstance();
	mdto = mdao.all_list();
	
	for(int i=0; i<mdto.size();i++){
		MemberDto list =  (MemberDto)mdto.get(i);
%>
		<tr>
			<td><a href="modify.jsp?id=<%=list.getId()%>"><%=list.getId()%></a></td>
			<td><%=list.getPw()%></td>
			<td><%=list.getName()%></td>
			<td><%=list.getEmail()%></td>
			<td><%=list.getAddress1()%></td>
			<td><%=list.getAddress2()%></td>
			<td><%=list.getAddress3()%></td>
			<td><%=list.getB_date()%></td>
			<td><%=list.getU_date()%></td>
		</tr>

<%		
	}


%>	
</table>
</body>
</html>