<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		border-collapse: collapse;
		font-size: 20px;
		text-align: center;
	}
	th,td{
		width: 100px;
	}
</style>
</head>
<body>
	<%
		int start = Integer.parseInt(request.getParameter("start"));
		int end = Integer.parseInt(request.getParameter("end"));
	%>
	<%!
		int sum = 0;
		double multi = 1;
		
		public int sum (int a, int b){
			for(int i=a;i<=b;i++){
				sum += i;
			}
			return sum;
		}
	
		public double multi (int a, int b){
			for(int i=a;i<=b;i++){
				multi *= i;
			}
			return multi;
		}
	%>
	<h1>계산</h1>
	<table border="1">
		<tr>
			<th>범위</th>
			<th>더하기</th>
			<th>곱하기</th>
		</tr>
		<tr>
			<td><%=start+"~"+end%></td>
			<td><%=sum(start,end)%></td>
			<td><%=multi(start,end)%></td>
		</tr>
		
	</table>
</body>
</html>