<%@page import="jsp_0417_1.MemberDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp_0417_1.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onclick="location.href='insert_form.jsp'">회원 입력</button>
<table border="1">
		<tr>
			<th>회원 번호 </th>
			<th>회원 아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>이메일</th>
			<th>주소</th>
			<th>휴대전화</th>
			<th>생년월일</th>
			<th>성별</th>
			<th>뉴스레터 수신여부</th>
			<th>SMS 수신여부</th>
			<th>가입 일자 </th>
		</tr>
<%
	MemberDao mdao = new MemberDao();
	ArrayList dtos;
	MemberDto mdto;
	
	dtos = mdao.select_all();
	
	for(int i=0;i<dtos.size();i++){
		mdto = (MemberDto)dtos.get(i);
%>		
		<tr>
			<td><%=mdto.getNum()%></td>
			<td><a href="#"><%=mdto.getId()%></a></td>
			<td><%=mdto.getPw()%></td>
			<td><%=mdto.getName()%></td>
			<td><%=mdto.getEmail()%></td>
			<td><%=mdto.getAddress()%></td>
			<td><%=mdto.getPhone()%></td>
			<td><%=mdto.getBirth()%></td>
			<td><%=mdto.getGender()%></td>
			<td><%=mdto.getNews()%></td>
			<td><%=mdto.getSms()%></td>
			<td><%=mdto.getM_date()%></td>							
		</tr>
<%
}
%>		
</table>
</body>
</html>