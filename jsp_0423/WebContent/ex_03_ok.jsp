<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("utf-8"); %>   
<jsp:useBean id="ldto" class="com.javalec.ex.MemberInfo" scope="page"/>
<jsp:setProperty property="*" name="ldto"/>    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>EL 태그 사용</h2>
이름 : ${ldto.name}<br>
아이디 : ${ldto.id}<br>
패스워드 : ${ldto.pw}<br>
------------------------------------<br>
<h2>useBean을 사용하지 않는</h2>
이름 : ${param.name}<br>
아이디 : ${param.id}<br>
패스워드 : ${param.pw}<br>
------------------------------------<br>
<h2>스크립트릿 태그</h2>
이름 : <%=request.getParameter("name")%><br>
아이디 : <%=request.getParameter("id")%><br>
패스워드 : <%=request.getParameter("pw")%><br>
------------------------------------<br>
<h2>내장 객체</h2>
applicationScope : ${applicationScope.appUser_id}<br>
sessionScope : ${sessionScope.seUser_id}<br>
pageScope : ${pageScope.pageUser_id}<br>
requestScope : ${requestScope.req_admin}
</body>
</html>