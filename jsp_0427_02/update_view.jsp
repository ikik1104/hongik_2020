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
<form name="update" action="update.do?bid=${dto.getBid()}" method="post">
	<table border="1" style="border-collapse:collapse; width: 1200px; ">
		<tr>
			<th>글 번호 </th>
			<td>${dto.getBid()}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="btitle" value="${dto.getBtitle()}"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="bname" value="${dto.getBname()}"></td>
		</tr>
		<tr style="height: 300px;">
			<th>내용</th>
			<td><input type="text" name="bcontent" value="${dto.getBcontent()}" style="height: 500px;"></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="submit" value="수정완료">
			<input type="button" onclick="script:history.back()" value="취소">
			</td>
		</tr>
	</table>
</form>
</body>
</html>