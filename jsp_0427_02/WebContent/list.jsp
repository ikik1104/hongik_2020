<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 리스트</title>
		<link type="text/css" rel="stylesheet" href="css/notice_list_style.css">
		<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500&display=swap" rel="stylesheet">
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
								<col width="15%">
								<col width="10%">
							</colgroup>
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>등록일</th>
									<th>조회수</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach var="list" items="${list}" >
								<tr>
									<td>${list.getBid()}</td>
									<td class="tit"><a href="detail.do?bid=${list.getBid()}" class="list_a">${list.getBtitle()}</a></td>
									<td><fmt:formatDate value="${list.getBdate()}" pattern="yyyy-MM-dd"/></td>
									<td>${list.getBhit()}</td>
								</tr>
							</c:forEach>	
							</tbody>
						</table>
						
					</div>
					<div>
						<span>
							<a href="insert_view.do">입력</a>
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
