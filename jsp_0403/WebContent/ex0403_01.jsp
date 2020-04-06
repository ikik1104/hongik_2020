<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
		table{
			font-size: 20px; border-collapse: collapse;
		}
		tr,td,table{
			border-bottom: 1px solid black;
		}
}
</style>
</head>
<body>
	<%-- jsp주석 : html 소스보기에서 나타나지 않음 --%>
	<!-- html 주석 : html 소스보기에서 나타남 -->
	<h1>구구단 출력</h1>
	<table>
		<%
		for(int i=1; i<=9; i++){
			out.println("<tr><td> 2 *"+i+" = </td>");
			out.println("<td>"+(2*i)+" </td></tr>");
		}
		 %>
	
	</table>

</body>
</html>