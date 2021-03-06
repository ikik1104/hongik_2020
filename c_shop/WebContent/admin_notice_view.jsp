<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
		<script type="text/javascript">
		
		$(document).ready(function() { 
			
			var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="notice_view.Ado?bid=${bid}";
				 }
			
		});
		
		
		function b_delete(id) {
			if(confirm("게시글을 삭제하시겠습니까?")){
				location.href = "notice_delete.Ado?bid="+id;	
			}
			return false;
		}
</script>
		<link rel="stylesheet" type="text/css" href="css/admin_notice_view.css">
	</head>
	<body>
	<jsp:include page="admin_header.jsp"/>
	<section>
		<h1>공지사항</h1>
		<div>
			<div>
				<h2>
					${dto.btitle}<span>작성일 : <fmt:formatDate value="${dto.bdate}" pattern="yyyy-MM-dd"/></span>   <span>조회수 : ${dto.bhit}</span>
				</h2>
			</div>

			<div>
				<div>
					<c:if test="${not empty dto.bfile}">
					<p style="text-align:center;">
						<img src="${pageContext.request.contextPath}/upload2/${dto.bfile}" style="width:60%; height:500px;margin-bottom: 50px;" >
					</p>
					</c:if>
					<p style="text-align: center; margin-bottom: 100px;">${dto.bcontent}</p>
				</div>
			</div>

			<div></div>
			
			<div>
				<a onclick="b_delete('${dto.bid}')" style="width: 100px;">삭제</a>
				<a href="notice_update_form.Ado?bid=${dto.bid}" style="width: 100px;">수정</a>
				<a href="notice_list.Ado" style="width: 100px;" >목록</a>
			</div>
		</div>
	</section>
	</body>
</html>