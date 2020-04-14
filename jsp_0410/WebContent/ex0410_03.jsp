<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%!
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	int num;
	int hak;
	String name;
	String yn;
	String sub;
	int money;
	String kind;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<title>Insert title here</title>
<style type="text/css">
	h2{
		width: 1000px; margin: 30px auto; text-align: center; font-size: 30px;
	}
	table{
		width: 1000px;
		border-collapse: collapse;
		text-align: center;
		font-size: 20px;
		margin: 50px auto;
	}
	tr,th,td{
		border:1px solid black;
	}
</style>
</head>
<body>
<table>
	<tr>
		<th>번호</th>
		<th>학년</th>
		<th>이름</th>
		<th>납부</th>
		<th>과목</th>
		<th>금액</th>
		<th>납부유형</th>
	</tr>
<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from member3");
		
		while(rs.next()){
			num = rs.getInt("num");
			hak = rs.getInt("hak");
			name = rs.getString("name");
			yn = rs.getString("yn");
			sub = rs.getString("sub");
			money = rs.getInt("money");
			kind = rs.getString("kind");
			
			out.println("<tr>");
			out.println("<td>"+num+"</td>");
			out.println("<td>"+hak+"</td>");
			out.println("<td>"+name+"</td>");
			out.println("<td>"+yn+"</td>");
			out.println("<td>"+sub+"</td>");
			out.println("<td>"+money+"</td>");
			out.println("<td>"+kind+"</td>");
			out.println("</tr>");
			
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(conn!=null) conn.close();		
			if(stmt!=null) stmt.close();		
			if(rs!=null) rs.close();		
			
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}



%>	
</table>
</body>
</html>