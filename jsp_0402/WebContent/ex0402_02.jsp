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
		font-size: 15px;
	}
	
	table,tr,td{
		border: 1px solid black;
	}
	td:nth-child(1) {
		width: 100px; height: 16px;
	}
	td:nth-child(2) {
		width: 800px;
	}
</style>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); 




%>
	<table>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("name") %></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id") %></td>	
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
		<tr>
			<td>휴대전화</td>
			<td><%= request.getParameter("tel") %></td>
		</tr>
		<tr>
			<td>직업</td>
			<td><%
				switch(request.getParameter("job")){
				case "j01":
					out.println("학생");
					break;
				case "j02":
					out.println("회사원");
					break;
				case "j03":
					out.println("자영업자");
					break;
				case "j04":
					out.println("전업주부");
					break;
				case "j05":
					out.println("기타");
					break;
				}
			%></td>
		</tr>
		<tr>
			<td>결혼여부</td>
			<td><%
				switch(request.getParameter("m_chk")){
				case "y":
					out.println("예");
					break;
				case "n":
					out.println("아니오");
					break;
				}
			 %></td>
		</tr>
		<tr>
			<td>관심사</td>
			<td><%
				String[] hobby = request.getParameterValues("hobby");
				for(int i= 0; i<hobby.length; i++){
					switch(hobby[i]){
					case "h01":
						hobby[i] = "컴퓨터/인터넷";
						break;
					case "h02":
						hobby[i] = "영화/비디오";
						break;
					case "h03":
						hobby[i] = "음악";
						break;
					case "h04":
						hobby[i] = "쇼핑";
						break;
					case "h05":
						hobby[i] = "게임";
						break;
					case "h06":
						hobby[i] = "문화/예술";
						break;
					case "h07":
						hobby[i] = "요리";
						break;
					case "h08":
						hobby[i] = "인테리어";
						break;
					case "h09":
						hobby[i] = "레저/여가";
						break;
					case "h10":
						hobby[i] = "건강/다이어트";
						break;
					}
				}
			
				for(int i=0; i<hobby.length; i++){
					if(i==hobby.length-1){
						out.println(hobby[i]);
					}else{
					out.println(hobby[i]+",");
					}
				}
			 %></td>
		</tr>
	</table>
</body>
</html>