<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String authUser = (String)session.getAttribute("authUser");

	if(authUser==null){
		String str="<script type=\"text/javascript\">\r\n" + 
		     "      alert(\"로그인을 하지 않았습니다. 로그인 페이지로 이동합니다.\");\r\n" + 
		     "      location.href='login.jsp';\r\n" + 
		     "   </script>";
		         out.println(str);
	}
%>
<%!
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String id,pw,name,email,address,phone,gender,news,sms,sql;
	Timestamp birth;

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 전체 리스트</title>
</head>
<body>
<h2>회원전체 리스트</h2>
<p><a href="join.jsp">회원 정보 추가</a></p>
<table border="1">
	<tr>
		<th>회원 아이디</th>
		<th>패스워드</th>
		<th>이름</th>
		<th>이메일</th>
		<th>주소</th>
		<th>휴대전화</th>
		<th>생년월일</th>
		<th>성별</th>
		<th>뉴스레터 수신여부</th>
		<th>SMS 수신여부</th>
	</tr>
<%

	sql = "select * from lms_member order by id asc";
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		
			while(rs.next()){
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				email = rs.getString("email");
				address = rs.getString("address");
				phone = rs.getString("phone");
				gender = rs.getString("gender");
				news = rs.getString("news");
				sms = rs.getString("sms");
				birth = rs.getTimestamp("birth");
				
%>
		<tr>
			<td class="table_left"><a href="modify.jsp?id=<%=id%>"><%=id%></a></td>
			<td class="table_left"><%=pw%></td>
			<td class="table_left"><%=name%></td>
			<td class="table_left"><%=email%></td>
			<td><%=address%></td>
			<td><%=phone%></td>
			<td><%=birth%></td>
			<td><%=gender%></td>
			<td><%=news%></td>
			<td><%=sms%></td>						
		</tr>
<%				
		}//while문 닫기
	}catch (Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
	%>
</table>
</body>
</html>