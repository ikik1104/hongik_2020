<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String pw,name,phone1,phone2,phone3,gender;
	
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("authUser");
	String sql = "select * from member2 where id='"+id+"'";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		
		if(rs!=null){
			//정보가 존재하면
			while(rs.next()){
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone1 = rs.getString("phone1");
				phone2 = rs.getString("phone2");
				phone3 = rs.getString("phone3");				
				gender = rs.getString("gender");
			}
		}else{
			//정보가 없을 때
			response.sendRedirect("index.jsp");
		}
		
		
		
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(con!=null) con.close();
		}catch(Exception e2){
			e2.printStackTrace();
		}
	}
%>
	<form name="join" action="Modify_ok" method="post"> 
		<h2>회원가입</h2>
		<label>이름 ) <input type="text" name="name" value="<%=name%>"></label><br>	
		<label>아이디  ) <%=id%>    <span>* 아이디는 영문,숫자만 가능</span></label><br>
		<label>패스워드  ) <input type="password" name="pw"></label><br>
<script type="text/javascript">
var opt = document.querySelectorAll("#select option");
for (var i = 0; i < opt.length; i++) {
	if (opt[i].value == '<%=phone1%>') {
		$("#select option:eq("+i+")").attr("selected","selected");	
		break;
	}
}
</script>		
		전화번호  ) <select name="phone1" id="select">
					<option value="010">010</option>
					<option value="016">016</option>
					<option value="017">017</option>
					<option value="018">018</option>
					<option value="019">019</option>
					<option value="011">011</option>
				</select>
		- <input type="text" name="phone2" value="<%=phone2%>"> - <input type="text" name="phone3" value="<%=phone3%>"><br>
		<%
		if(gender=="남자"){
		%>
			성별  ) <label><input type="radio" name="gender" value="남자" checked="checked">남자</label>   
					 <label><input type="radio" name="gender" value="여자">여자</label><br>
		<%		
		}else{
		%>
			성별  ) <label><input type="radio" name="gender" value="남자">남자</label>   
					 <label><input type="radio" name="gender" value="여자" checked="checked">여자</label><br>
		<%		
		}
		%>
			 <input type="submit" value="회원가입">
			 <input type="reset" value="취소">
	</form>
</body>
</html>