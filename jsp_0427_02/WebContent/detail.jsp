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
						<a href="update.do?bid=${dto.getBid()}">수정</a>
						<a href="list.do">목록</a>
					</div>
				</div>
			</div>
		</section>
	</body>
</html>