<%@page import="java.sql.Timestamp"%>
<%@page import="jsp_0417_1.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 데이터 입력된 값을 모드 메소드로 전송 -->
<!-- 리턴값 체크해서 1이면 저장 완료 0이면 저장이 안되었음 -->

<!-- 입력이 되었으면 m_select.jsp 리다이렉트 해줄것 -->
<%
	request.setCharacterEncoding("utf-8");
	String id,pw,name,email,address,phone,gender,news,sms,birth;
	
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	name = request.getParameter("name");
	email = request.getParameter("email");
	address = request.getParameter("address");
	phone = request.getParameter("phone");
	birth = request.getParameter("birth");
	gender = request.getParameter("gender");
	news = request.getParameter("news");
	sms = request.getParameter("sms");
	
	MemberDao mdao = new MemberDao();
	int check = mdao.member_insert(id,pw,name,email,address,phone,birth,gender,news,sms);
	
	if(check==1){
%>
	<script type="text/javascript">
	 alert("회원가입이 완료 되었습니다.");
	 location.href='main.jsp';
	</script>
<%		
	}else{
%>
	<script type="text/javascript">
	 alert("회원가입이 실패");
	 location.href='main.jsp';
	</script>
<%		
	}

%>
</body>
</html>