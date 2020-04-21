<%@page import="java.sql.Timestamp"%>
<%@page import="com.javalec.ex.MemberDto"%>
<%@page import="com.javalec.ex.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <% request.setCharacterEncoding("utf-8");%>
 <jsp:useBean id="mdto"  class="com.javalec.ex.MemberDto"/>
 <jsp:setProperty property="*" name="mdto"/>   
 <%
 	//현재 시간을 자바에서 입력
 	mdto.setB_date (new Timestamp(System.currentTimeMillis()));
 	MemberDao mdao = MemberDao.getInstance(); //싱글톤 패턴
	int check = mdao.confirmId(mdto.getId()); 
 	
 	if(check == 1){	//아이디가 있을 경우
 %>
 	<script type="text/javascript">
 	alert("해당 아이디가 존재합니다. 다시 입력하세요.");
 	history.back();
 	</script>
 <%		
 	}else{ //아이디가 없을 경우
 		int check2 = mdao.insertMember(mdto);
 		if(check2==1){
 			//데이터 저장 완료
%>
		<script type="text/javascript">
	 	alert("회원가입이 완료 되었습니다. 로그인 페이지로 이동합니다.");
	 	location.href="login.jsp";
	 	</script>
<% 			
 		}else{
 			//저장 실패
%>
		<script type="text/javascript">
 		 alert("회원가입에 실패하였습니다.");
		history.back();
 		 </script>
<% 			
 		}
 	}
 	
 %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>