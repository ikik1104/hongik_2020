<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 600px;
		border-collapse: collapse;
		font-size: 20px;
	}
	
	table,tr,td{
		border: 1px solid black;
	}
	td:nth-child(1) {
		width: 200px; height: 20px;
	}
	td:nth-child(2) {
		width: 400px;
	}
	
</style>
</head>
<body>
	<form action="" name="form" method="post">
		<h1>회원가입</h1>
		<table>
			<tr>
				<td>아이디</td>
				<td><%=request.getParameter("id")%></td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td><%=request.getParameter("pw")%></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><%=request.getParameter("name")%></td>
			</tr>
			<tr>
				<td>취미</td>
				<td><% 
				String[] hobby = request.getParameterValues("hobby");
				for (int i = 0; i < hobby.length; i++) {
					switch(hobby[i]){
					case "read":
						hobby[i] = "독서";
						break;
					case "run":
						hobby[i] = "조깅";
						break;
					case "cook":
						hobby[i] = "요리";
						break;
					case "swim":
						hobby[i] = "수영";
						break;
					}
				}
				//출력
				for(int i=0; i<hobby.length; i++) {
					if(i==hobby.length-1) {
						out.println(hobby[i]);
					}else {
						out.println(hobby[i]+",");
					}
				}
				
				%></td>
			</tr>
			<tr>
				<td>전공</td>
				<td><%
				switch(request.getParameter("major")){
				case "kor":
					out.println("국문학과");
					break;
				case "eng":
					out.println("영어영문학과");
					break;
				case "math":
					out.println("수학과");
					break;
				case "design":
					out.println("디자인학과");
					break;
				}
				%></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><%
				switch(request.getParameter("address")){
				case "seoul":
					out.println("서울");
					break;
				case "gyeonggi":
					out.println("경기");
					break;
				case "busan":
					out.println("부산");
					break;
				}
				%></td>
			</tr>
		</table>
	</form>
</body>
</html>