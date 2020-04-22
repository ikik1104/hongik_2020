<%@page import="com.javalec.ec.BoardDto"%>
<%@page import="com.javalec.ec.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = Integer.parseInt(request.getParameter("b_num"));
	BoardDao bdao = BoardDao.getInstance();
	BoardDto bdto = bdao.viewBoard(num);
%>    
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function del_board(num) {
		if(confirm("이 게시물을 삭제하시겠습니까?")){location.href="board_delete.jsp?b_num="+num;}
	}
</script>
<style type="text/css">
h1{text-align: center; margin-top: 50px;}th{background-color: #efefef;} td{height: 40px;}
</style>
</head>
<body>
	<h1><%=bdto.getB_user()%>님 의 게시물</h1>
		<table border="1" style="width:1000px; height: 40px; text-align: center; border-collapse: collapse; margin:50 auto;">
			<tr>
				<th>제목</th>
				<td><%=bdto.getB_title()%></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><%=bdto.getB_content()%></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><%=bdto.getB_user()%></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<%if(bdto.getB_file()!=null){ %>
				<td><a href="upload/<%=bdto.getB_file()%>"><%=bdto.getB_file()%></a></td>
				<%}else{%>
				<td>첨부파일 없음</td>
				<%}%>
			</tr>
			<tr>
				<td colspan="2">
				<button type="button" onclick="location.href='main.jsp'">목록으로</button>  
				<button type="button" onclick="location.href='board_update.jsp?b_num=<%=bdto.getB_num()%>'">수정</button>  
				<button type="button" onclick="del_board('<%=bdto.getB_num()%>')">삭제</button>
				</td>
			</tr>
		</table>
</body>
</html>