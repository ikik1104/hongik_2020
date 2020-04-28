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
<link type="text/css" rel="stylesheet" href="css/notice_list_style.css">
</head>
<body>
<section>
			<div>
				<h1>공지사항</h1>
				<div>
					<div>
						<table>
							<colgroup>
								<col width="10%">
								<col width="*">
								<col width="10%">
								<col width="10%">
								<col width="10%">
							</colgroup>
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>등록일</th>
									<th>작성자</th>
									<th>조회수</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="dto" items="${dto}">
								<tr>
									<td>${dto.bid}</td>
									<td class="tit">
									<c:forEach begin="1" end="${dto.bindent}">▶</c:forEach>
									<a href="board_view.do?bid=${dto.bid}" class="list_a">${dto.btitle}</a>
									</td>
									<td><fmt:formatDate value="${dto.bdate}" pattern="yyyy-MM-dd"/></td>
									<td>${dto.bname}</td>
									<td>${dto.bhit}</td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
						
					</div>
					<div>
						<span>
							<a href="insertForm.do">입력</a>
						</span>
					</div>
						
					<div>
						<span>
							<strong>1</strong>
							<a href="#">2</a>
						</span>
						<a href="#"></a>
						<a href="#"></a>
					</div>
				</div>
			</div>
		</section>
</body>
</html>