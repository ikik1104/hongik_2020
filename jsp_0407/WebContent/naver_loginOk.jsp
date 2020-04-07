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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//DB로 이동해서 id,pw를 체크하게 됨 - 결과 값을 리턴
		if(id.equals("admin")&& pw.equals("1234")){
			Cookie co1 = new Cookie("naver_user","admin");
			co1.setMaxAge(1800);
			response.addCookie(co1);
			
			Cookie co2 = new Cookie("nick_name","goldStar");
			co1.setMaxAge(1800);
			response.addCookie(co2);
			
			response.sendRedirect("naver_index1.jsp");
		}else{
	%>
	<script type="text/javascript">
		alert("아이디/패스워드가 일치하지 않습니다.\n 다시 로그인 해주세요.");
	</script>
	<%
			response.sendRedirect("naver_login.html");
		}
	%>
	<a href="naver_index1.jsp">다음페이지 이동</a>
</body>
</html>