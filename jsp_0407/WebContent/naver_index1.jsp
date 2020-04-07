<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/naver.css" rel="stylesheet" type="text/css">
<style type="text/css">

</style>
</head>
<body>
<%
	String naver_user="";
	// user가 naver_index2.jsp로 바로 접근해도 페이지가 열리지 않도록 함.
	Cookie[] coo = request.getCookies();
	
		for(int i =0;i<coo.length;i++){
			String c_chk = coo[i].getName();
			if(c_chk.equals("naver_user")){
				naver_user = coo[i].getValue();
			}
		}

	if(naver_user.equals("") || naver_user == null){
%>
<!-- 로그인 안됨 -->
	<div  id="login_no">
		<p>네이버를 안전하고 편리하게 이용하세요.</p>
		<button id="login_bnt" onclick="location.href='naver_login.html'">naver 로그인</button><br>
		<span><a>아이디/비밀번호 찾기</a></span><span><a>회원가입</a></span>
	</div>
<%
	}else{
%>
	<div id="login_ok">
	<div>
	<div id="box">이미지</div>
	<p><%=naver_user%> 님 <span><a>내정보</a></span></p>
	<a>메일<span>10</span> </a>
	<a>쪽지<span>12</span></a>
	<button id="logout_bnt" onclick="location.href='naver_logout.jsp'">로그아웃</button>
	</div>

	<div>
	<ul>
		<li>알림</li>
		<li>MY구독</li>
		<li>메일</li>
		<li>카페</li>
		<li>블로그</li>
		<li>페이</li>
		<li>></li>
	</ul>
	</div>
</div>
<%
	}

%>	
<!-- 로그인 된 부분 -->	
</body>
</html>