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
	
	int employee_id;
	String emp_name;
	float salary;
	String job_id;
	
	String sql;
	String sql2;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		text-align: center;
	}
	th{
		background: #efefef;
		width: 100px;
	}
	th:nth-last-of-type(1) {
		width: 300px;	
	}
	th,td{
		height: 50px;
	}
</style>
</head>
<body>
<table border="1">
	<tr>
		<th>사원번호</th>
		<th>사원이름</th>
		<th>월급</th>
		<th>부서명</th>
	</tr>
<%!



%>
<%
		request.setCharacterEncoding("utf-8");

		String in1 = request.getParameter("name1"); //첫번째 input
		String in2 = request.getParameter("name2"); //두번째 input
		
		String select = request.getParameter("select"); //select option 가져옴
		
		String list = request.getParameter("list"); //radio ( 정렬 기준 )
		
		switch(list){
		case "emp_l":
			sql2 = "order by employee_id asc";
			break;
		case "emp_h":
			sql2 = "order by employee_id desc";
			break;
		case "sal_l":
			sql2 = "order by salary asc";
			break;
		case "sal_h":
			sql2 = "order by salary desc";
			break;
		}
		
		if(select.equals("n_search")){
			//이름 검색
			sql = "select employee_id, emp_name,salary,job_id from employees where emp_name like '%"+in1+"%' "+sql2;
		}else{
			//월급검색
			sql = "select employee_id, emp_name,salary,job_id from employees where salary between '"+in1+"' and '"+in2+"' "+sql2;
		}

		try{
			//jdbc연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			stmt = conn.createStatement();
			rs  = stmt.executeQuery(sql);
			
			while(rs.next()){
				employee_id = rs.getInt("employee_id");
				emp_name = rs.getString("emp_name");
				salary = rs.getFloat("salary");
				job_id = rs.getString("job_id");
				
				out.println("<tr>");
				out.println("<td>"+employee_id+"</td>");
				out.println("<td>"+emp_name+"</td>");
				out.println("<td>"+salary+"</td>");
				out.println("<td>"+job_id+"</td>");
				out.println("</tr>");
			}
			out.println("<tr><td colspan='4'><a href='form.html'>다시 검색하기</a></td></tr>");
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