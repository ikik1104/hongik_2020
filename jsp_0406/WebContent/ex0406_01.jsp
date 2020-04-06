<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String[] hobby = request.getParameterValues("hobby");
		String gender = request.getParameter("gender");
		
		Enumeration enumeration =  request.getParameterNames();
	%>
<h1>회원 정보</h1>
<p>아이디 : <%=id%></p>		
<p>패스워드 : <%=pw%></p>	
<p>이름 : <%=name%></p>
<p>취미 : <%=Arrays.toString(hobby) %></p>	
<p>성별 : <%=gender%></p>	
=================================================<br>
<%--request로 넘어온 이름들을 출력 --%>
	<%
		while(enumeration.hasMoreElements()){
			String e_name = enumeration.nextElement().toString();
			out.println(e_name);
		}
	%>
</body>
</html>