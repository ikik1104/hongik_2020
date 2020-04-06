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
		width: 100px;
	}
		
}
</style>
</head>
<body>
	<%!
		int sum = 0;
		double multi = 1;
		
		public int sum(int a, int b){
			for(int i=a; i<=b;i++){
				sum += i;
			}
			return sum;
		}

		public double multi(int a, int b){
			for(int i=a; i<=b;i++){
				multi *= i;
			}
			return multi;
		}
	%>
	<table>
		<tr>
			<th>범위</th>
			<th>더하기</th>
			<th>곱하기</th>			
		</tr>
		<tr>
			<td>1~10</td>
			<td><%= sum(1,10) %></td>
			<td><%= multi(1,10) %></td>
		</tr>
		<tr>
			<td>1~50</td>
			<td><%= sum(1,50) %></td>
			<td><%= multi(1,50) %></td>
		</tr>
		<tr>
			<td>1~100</td>
			<td><%= sum(1,100) %></td>
			<td><%= multi(1,100) %></td>
		</tr>
	
	</table>
</body>
</html>