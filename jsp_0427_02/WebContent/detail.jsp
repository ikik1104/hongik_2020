<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 view</title>
		<script type="text/javascript">
	function b_delete(id) {
		if(confirm("게시글을 삭제하시겠습니까?")){
			location.href = "delete.do?bid="+id;	
		}
	}
</script>
		<link type="text/css" rel="stylesheet" href="css/notice_view_style.css">
		<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500&display=swap" rel="stylesheet">
	</head>
	<body>
		<section>
			<div>
				<h1>공지사항</h1>
				<div>
					<div>
						<div>
								<span>글번호 : ${dto.getBid()}</span><br>
							<h2>
								${dto.getBtitle()}
							</h2>
								<span>조회수 : ${dto.getBhit()}</span><br>
								<span>작성자 : ${dto.getBname()}</span><br>
								<span>작성일 : <fmt:formatDate value="${dto.getBdate()}" pattern="yyyy-MM-dd"/></span>
						</div>
										
						<div>
							<div>
								<c:out value="${dto.getBcontent()}"/>
							</div>
						</div>
						
						<div></div>
					</div>
					<div>
						<a onclick="b_delete('${dto.getBid()}')" style="width: 100px;">삭제</a>
						<a href="update_view.do?bid=${dto.getBid()}" style="width: 100px;">수정</a>
						<a href="reply_view.do?bid=${dto.getBid()}" style="width: 100px;">답글달기</a>
						<a href="list.do" style="border: 1px solid black; width: 100px;">목록</a>
					</div>
				</div>
			</div>
		</section>
	</body>
</html>