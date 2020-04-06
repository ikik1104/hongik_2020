<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String hak = request.getParameter("hak_num");
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int sum = kor+eng+math;
		double avg = sum/0.3;
		
		int[] arr = {1,2,3};
		out.println(Arrays.toString(arr));
	%>
	<%!
		public int sum(int a, int b, int c){
			return a+b+c;
		}
	
		public double avg(int a, int b, int c){
			return (a+b+c)/3;
		}
	%>
	<h1>학생성적 입력 완료</h1>
	<p>학번 : <%=hak%><p>
	<p>이름 : <%=name%><p>
	<p>국어 : <%=kor%><p>
	<p>영어 : <%=eng%><p>
	<p>수학 : <%=math%><p>
	<p>합계 : <%=sum%><p>
	<p>평균 : <%=avg%><p>
</body>
</html>