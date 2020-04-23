<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="com.javalec.ex.MemberInfo" scope="page"/>    
<jsp:setProperty property="name" name="member" value="홍길동"/>
<jsp:setProperty property="id" name="member" value="admin"/>
<jsp:setProperty property="pw" name="member" value="1234"/>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>빈태그 사용</h2>
<jsp:getProperty property="name" name="member"/><br>
<jsp:getProperty property="id" name="member"/><br>
<jsp:getProperty property="pw" name="member"/><br>

<h2>EL태그</h2>
${member.name}<br>
${member.id}<br>
${member.pw}<br>
</body>
</html>