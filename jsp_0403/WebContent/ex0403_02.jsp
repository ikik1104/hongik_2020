<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border-collapse: collapse; text-align: center;
	}
	tr,td,th{
		height: 20px;
		border: 1px solid black;
	}
	td:nth-child(1) {
		width: 100px;
	}
	td:nth-child(2) {
		width: 300px;
	}	
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>단</th>
			<th>계산식</th>
		</tr>
		<%
			for(int i=2; i<=3; i++){
				for(int j=1; j<=9; j++){
				out.println("<tr>");
				out.println("<td>"+i+"단</td>");
				out.println("<td>"+i+" * "+j+" = "+(i*j)+"</td>");
				out.println("</tr>");
				}
			}
		
		%>
	</table>
</body>
</html>