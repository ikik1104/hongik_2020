<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function b_delete(id) {
		if(confirm("게시글을 삭제하시겠습니까?")){
			location.href = "delete.do?bid="+id;	
		}
	}
</script>
</head>
<body>
<table border="1" style="border-collapse:collapse; width: 1200px; ">
	<tr>
		<th>글 번호 </th>
		<td>${dto.getBid()}</td>
	</tr>
	<tr>
		<th>제목</th>
		<td>${dto.getBtitle()}</td>
	</tr>
	<tr>
		<th>작성자</th>
		<td>${dto.getBname()}</td>
	</tr>
	<tr>
		<th>조회수</th>
		<td>${dto.getBhit()}</td>
	</tr>
	<tr style="height: 300px;">
		<th>내용</th>
		<td>${dto.getBcontent()}</td>
	</tr>
	<tr>
		<td colspan="2">
		<input type="button" onclick="location.href='update_view.jsp?bid=${dto.getBid()}'" value="수정">
		<input type="button" onclick="b_delete('${dto.getBid()}')" value="삭제">
		<input type="button" onclick="location.href='list.do'" value="목록">
		</td>
	</tr>
</table>
</body>
</html>