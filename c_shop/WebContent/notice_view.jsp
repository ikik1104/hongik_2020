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
		window.onload = load();
		function load(){
			var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="notice_list.do?bid=${bid}";
				 }
		}
		
		
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
		     <!-- 헤더 -->
		<jsp:include page="header.jsp"/>
		<section>
			<div>
				<h1>공지사항</h1>
				<div>
					<div>
						<div>
								<span>글번호 : ${dto.bid}</span><br>
							<h2>
								${dto.btitle}
							</h2>
								<span>조회수 : ${dto.bhit}</span><br>
								<span>작성자 : ${dto.bname}</span><br>
								<span>작성일 : <fmt:formatDate value="${dto.bdate}" pattern="yyyy-MM-dd"/></span>
						</div>
										
						<div>
							<div style="text-align: center;">
								<img src="${pageContext.request.contextPath}/upload2/${dto.bfile}" style="width:60%; height:500px; margin:0 auto; margin-bottom: 50px;" >
								<p style="text-align: center; margin-bottom: 100px;">${dto.bcontent}</p>
							</div>
						</div>
						
						<div></div>
					</div>
					<div id="buttons">
<%-- 						<c:if test="${User=='admin'}"> --%>
						<a onclick="b_delete('${dto.bid}')" style="width: 100px;">삭제</a>
						<a href="update_form.do?bid=${dto.bid}" style="width: 100px;">수정</a>
<%-- 						</c:if> --%>
						<a href="reply_Form.do?bid=${dto.bid}" style="width: 100px;">답글달기</a>
						<a href="notice_list.do" style="width: 100px;" >목록</a>
					</div>
				</div>
			</div>
		</section>
		 <!-- 푸터 -->
	  <jsp:include page="footer.jsp"/>
	</body>
</html>