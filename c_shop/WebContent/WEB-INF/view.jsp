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
<link type="text/css" rel="stylesheet" href="css/notice_view_style.css">
</head>
<body>
<section>
			<div>
				<h1>게시물</h1>
				<div>
					<div>
						<div>
							<h2>
								${dto.btitle}
								<span>작성일  <fmt:formatDate value="${dto.bdate}" pattern="yyyy-MM-dd"/></span>
								<span>작성자  ${dto.bname}</span>
								<span>조회수  ${dto.bhit}</span>
							</h2>
						</div>
										
						<div>
							<div>
								${dto.bcontent}
							</div>
						</div>
						
						<div></div>
					</div>
					<div>
						<a href="reply_form.do?bid=${dto.bid}">답글달기</a>
						<a href="update_form.do?bid=${dto.bid}">수정</a>
						<a href="list.do">목록</a>
					</div>
				</div>
			</div>
		</section>
</body>
</html>