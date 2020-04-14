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
	
	String product;
	String p_code;
	String p_name;
	String u_name;
	String yn;
	String phone;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<h2>악기 대여</h2>
<table>
	<tr>
		<th>상품구분</th>
		<th>상품코드</th>
		<th>상품명</th>
		<th>임대인</th>
		<th>보증여부</th>
		<th>연락처</th>
	</tr>
<%
	
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from instrument");
		
		while(rs.next()){
			product = rs.getString("product");
			p_code = rs.getString("p_code");
			p_name = rs.getString("p_name");
			u_name = rs.getString("u_name");
			yn = rs.getString("yn");
			phone = rs.getString("phone");
			
			out.println("<tr>");
			out.println("<td>"+product+"</td>");
			out.println("<td>"+p_code+"</td>");
			out.println("<td>"+p_name+"</td>");
			out.println("<td>"+u_name+"</td>");
			out.println("<td>"+yn+"</td>");
			out.println("<td>"+phone+"</td>");
			out.println("</tr>");
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
		}catch(Exception e2){
			e2.printStackTrace();
		}
		
	}
	


%>
</table>
</body>
</html>