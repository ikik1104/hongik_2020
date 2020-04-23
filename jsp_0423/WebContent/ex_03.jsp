<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="ex_03_ok.jsp" method="post" name="ex03">
	이름 <input type="text" name="name" ><br>
	아이디 <input type="text" name="id"><br>
	비밀번호 <input type="password" name="pw"><br>
	<input type="submit" value="전송">
	</form>

<%
	//서버 종료가 될 때 까지 유지
	application.setAttribute("appUser_id", "app_admin");
	//세션이 유지 될 때 까지 유지
	session.setAttribute("seUser_id", "se_admin");
	
	//다른페이로 넘어가면 사라진다.
	pageContext.setAttribute("pageUser_id", "page_id");
	
	//이 페이지에는 설정했지만 다른페이지로 넘어가면 사라짐 (그래서 함께 넘겨주는게 필요함)
	//주로 이걸로 보낸다.
	request.setAttribute("reqUser_id", "req_admin");
%>	
</body>
</html>