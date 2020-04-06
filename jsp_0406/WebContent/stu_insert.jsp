<%@page import="jsp_0406.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>학생 입력 저장</title>
<style type="text/css">
	*{
	margin: 0;
	padding: 0;
	}
	table {
	margin: 0 auto;
	border-collapse: collapse;
	font-size: 18px;
	text-align: center;
	}
	td,th{
	width: 100px; height: 50px;
	}
	th{
	background: #eee;
	}
	div,h1{
	text-align: center;
	}
	button{
	width:200px; height: 35px; font-size:15px;
	margin-top:50px; margin-left: 10px;
	}
	a{
	color: black;
	text-decoration: none;
	}
	a:hover {
	color : red;
}
</style>
</head>
<body>
	<%! ArrayList list = new ArrayList(); %>
	<%-- 회원 추가 --%>
	
	<%
	request.setCharacterEncoding("utf-8");
	
	String s_num = request.getParameter("s_num");
	String s_name = request.getParameter("s_name");
	int s_kor = Integer.parseInt(request.getParameter("s_kor")); 
	int s_eng = Integer.parseInt(request.getParameter("s_eng")); 
	int s_math = Integer.parseInt(request.getParameter("s_math"));
	
	list.add(new Student(s_num,s_name,s_kor,s_eng,s_math));
	%>
	
	<%-- 회원정보 출력 --%>
		<h1>[	학생 성적 리스트	]</h1>
		<table border="1">
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>합계</th>
				<th>평균</th>
				<th>등수</th>
			</tr>
	<%
		for(int i = 0; i<list.size();i++){
			Student stu1 = (Student) list.get(i);
	%>		
	
			<tr>
				<td><a href="stu_modify.jsp?s_num=k01&s_name=홍길동&s_kor=100&s_eng=100&s_math=90"><%=stu1.getS_num()%></a></td>
				<td><%=stu1.getS_name()%></td>
				<td><%=stu1.getS_kor()%></td>
				<td><%=stu1.getS_eng()%></td>
				<td><%=stu1.getS_math()%></td>
				<td><%=stu1.getS_total()%></td>
				<td><%=stu1.getS_avg()%></td>
				<td><%=stu1.getRank()%></td>
			</tr>
	<%
		}
	%>
		</table>
		<br>
		<div>
		<button onclick="location.href='stu_inform.html'"> 회원 추가 </button>
		<button onclick="location.href='stu_list.html'"> 처음 화면으로 </button>
		</div>
</body>
</html>