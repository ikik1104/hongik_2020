<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>    
<jsp:useBean id="mem1" class="com.javalec.ex.Member" scope="session"/>
<jsp:setProperty property="*" name="mem1"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 확인</title>
</head>
<body>
이름 : <%=mem1.getName()%><br>
아이디 : <%=mem1.getId()%><br>
닉네임 : <%=mem1.getNick_name()%><br>
패스워드 : <%=mem1.getPw()%><br>
성별 : <%=mem1.getGender()%><br>
직업 : <%=mem1.getJob()%><br>
취미 : <%=Arrays.toString(mem1.getHobby())%><br>
취미 : <%
	String[] job = mem1.getHobby();
	for(int i=0;i<job.length;i++){
		if(i==job.length-1){
			out.println(job[i]);
		}else{
		out.println(job[i]+", ");
		}
	}
%>
<br>
<a href="index.jsp">메인으로</a>
</body>
</html>