<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%
	String authUser = (String)session.getAttribute("authUser");	
	if(authUser==null){
		out.println("<script>alert('로그인이 되어있지 않습니다.'); location.href='login.jsp';</script>");
	}

%>
<%!
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	int check;
	
	String id,pw,name,email,address,phone,gender,news,sms,sql;
	Timestamp birth;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		id = request.getParameter("id");
		try{
			sql = "select * from lms_member where id=?";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ora_user", "1234");
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
				while(rs.next()){
					id = rs.getString("id");
					pw = rs.getString("pw");
					name = rs.getString("name");
					email = rs.getString("email");
					address = rs.getString("address");
					phone = rs.getString("phone");
					birth = rs.getTimestamp("birth");
					gender = rs.getString("gender");
					news = rs.getString("news");
					sms = rs.getString("sms");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
%>
	<h2>회원정보 수정</h2>
	<form name="modify" action="Modify_Ok" method="post">
		아이디 : <input type="text" name="id" value=<%=id%> readonly><br>
		패스워드 : <input type="password" name="pw" value=<%=pw%> ><br>
		이름 : <input type="text" name="name" value=<%=name%> ><br>
		이메일 주소 : <input type="email" name="email" value=<%=email%> ><br>
		주소 : <input type="text" name="address" value=<%=address%> ><br>
		전화번호 : <input type="text" name="phone" value=<%=phone%> ><br>
		생일 : <input type="date" name="birth" value=<%=birth%> ><br>
		<p>성별</p>
		<input type="radio" name="gender" value="남성">남성
		<input type="radio" name="gender" value="여성">여성<br>
		<p>뉴스레터 받기 여부</p>
		<input type="radio" name="news" value="예">예
		<input type="radio" name="news" value="아니오">아니오<br>
		<p>SMS 받기 여부</p>
		<input type="radio" name="sms" value="예">예
		<input type="radio" name="sms" value="아니오">아니오<br>
		<input type="submit" value="전송"><input type="reset" value="취소">
	</form>
	<script type="text/javascript">
			var gender = document.getElementsByName("gender");
			var news = document.getElementsByName("news");
			var sms = document.getElementsByName("sms");
			//성별
			for (var i = 0; i < gender.length; i++) {
				if(gender[i].value=='<%=gender%>'){
					gender[i].checked=true;
				}
			}
			
			//뉴스레터
			for (var i = 0; i < news.length; i++) {
				if(news[i].value=='<%=news%>'){
					news[i].checked=true;
				}
			}
			
			//sms
			for (var i = 0; i < sms.length; i++) {
				if(sms[i].value=='<%=sms%>'){
					sms[i].checked=true;
				}
			}
		</script>
</body>
</html>