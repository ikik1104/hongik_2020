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
		<script type="text/javascript">
		window.onload = load();
		function load(){
			var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="event_list.Ado";
				 }
		}
		
		
		function e_delete(id) {
			if(confirm("게시글을 삭제하시겠습니까?")){
				location.href = "event_delete.Ado?num="+id;	
			}
		}
</script>
		<link rel="stylesheet" type="text/css" href="css/admin_notice_view.css">
	</head>
	<body>
	<jsp:include page="admin_header.jsp"/>
	<section>
		<h1>이벤트</h1>
		<div>
			<div>
				<h2>
					${dto.title}<span>${dto.start_day}~${dto.end_day}</span> <span>조회수 : ${dto.hit}</span>
				</h2>
			</div>

			<div>
				<div>
					<p style="text-align:center;">
						<img src="${pageContext.request.contextPath}/upload2/${dto.file2}" style="width:60%; height:500px;margin-bottom: 50px;" >
					</p>
					<p style="text-align: center; margin-bottom: 100px;">${dto.content}</p>
				</div>
			</div>

			<div></div>
			
			<div>
				<a onclick="e_delete('${dto.num}')" style="width: 100px;">삭제</a>
				<a href="event_updateForm.Ado?num=${dto.num}" style="width: 100px;">수정</a>
				<a href="event_list.Ado" style="width: 100px;" >목록</a>
			</div>
		</div>
	</section>
	</body>
</html>