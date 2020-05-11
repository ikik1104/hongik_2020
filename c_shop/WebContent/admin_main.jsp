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
		<link rel="stylesheet" type="text/css" href="css/admin_header.css">
		<link rel="stylesheet" type="text/css" href="css/admin_main.css">
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/prefixfree.dynamic-dom.min.js"></script>
        <script type="text/javascript" src="js/admin_header.js"></script> 
	</head>
	<body>
	<jsp:include page="admin_header.jsp"/>
	<section>
		<h1>관리자 메인</h1>
		<div id="main_list">
			<div id="main_user_list">
				<h2>회원 목록 </h2>
				<div>
					<table border="1">
						<colgroup>
							<col width="7%">
							<col width="5%">
							<col width="15%">
							<col width="%">
							<col width="10%">
							<col width="10%">
							<col width="5%">
							<col width="6%">
							<col width="6%">
							<col width="7%">
						</colgroup>
						<tr>
							<th>회원 아이디</th>
							<th>이름</th>
							<th>이메일</th>
							<th>주소</th>
							<th>휴대전화</th>
							<th>생년월일</th>
							<th>성별</th>
							<th>뉴스 수신</th>
							<th>SMS수신</th>
							<th>가입일</th>
						</tr>
						<c:forEach var="mdto" items="${mdto}" begin="0" end="4">
						<tr>
							<td class="table_left">${mdto.id}</td>
							<td class="table_left">${mdto.name}</td>
							<td class="table_left">${mdto.email}</td>
							<td>(${mdto.postcode})${mdto.address} ${mdto.address2}${mdto.address3}</td>
							<td>${mdto.phone}</td>
							<td>${mdto.birth}</td>
							<td>${mdto.gender}</td>
							<td>${mdto.news}</td>
							<td>${mdto.sms}</td>
							<td><fmt:formatDate value="${mdto.joindate}" pattern="yyyy-MM-dd"/></td>
						</tr>
						</c:forEach>
						<c:if test="${empty mdto}">
							<td colspan="5">가입된 회원이 없습니다.</td>
						</c:if>
					</table>
					<div class="detail_btn">
						<a href="#">회원 전체보기</a>
					</div>
				</div>
			</div>
			<div id="main_notice_list">
				<h2>최근공지사항</h2>
				<div>
					<table border="1">
						<tr>
							<th>글번호</th>
							<th>게시판</th>
							<th>제목</th>
							<th>이름</th>
							<th>일시</th>
						</tr>
						<c:if test="${not empty bdto}">
						<c:forEach var="bdto" items="${bdto}" begin="0" end="4">
							<tr>
								<td>${bdto.bid}</td>
								<td class="tit">
								<c:forEach begin="1" end="${bdto.bindent}">&nbsp;&nbsp;</c:forEach>
								<c:forEach begin="1" end="${bdto.bindent}">▶</c:forEach>
								<a href="notice_view.do?bid=${bdto.bid}" class="list_a">${bdto.btitle}</a></td>
								<td>${bdto.bname}</td>
								<td><fmt:formatDate value="${bdto.bdate}" pattern="yyyy-MM-dd"/></td>
								<td>${bdto.bhit}</td>
							</tr>
						</c:forEach>
						</c:if>
						<c:if test="${empty bdto}">
							<td colspan="5">작성된 공지사항이 없습니다.</td>
						</c:if>
					</table>
					<div class="detail_btn">
						<a href="notice_list.Ado">공지사항 전체보기</a>
					</div>
				</div>
			</div>
			<div id="main_event_list">
				<h2>최근 이벤트</h2>
				<div>
					<table border="1">
						<colgroup>
							<col width="10%">
							<col width="20%">
							<col width="">
							<col width="10%">
							<col width="20%">
						</colgroup>
						<tr>
							<th>글번호</th>
							<th>썸네일</th>
							<th>제목</th>
							<th>조회수</th>
							<th>이벤트기간</th>
						</tr>
					<c:if test="${not empty edto}">
					<c:forEach var="edto" items="${edto}" begin="0" end="4">
						<tr>
							<td>${edto.num}</td>
							<td><img src="${pageContext.request.contextPath}/upload2/${edto.file1}" style="width: 200px; height: 100px;"></td>
							<td style="height: 100px;">${edto.title}</td>
							<td>${edto.hit}</td>
							<td>${edto.start_day}~${edto.end_day}</td>
						</tr>
					</c:forEach>
					</c:if>
					<c:if test="${empty edto}">
						<td colspan="5">작성된 이벤트가 없습니다.</td>
					</c:if>
					</table>
					
					
					
					
					<div class="detail_btn">
						<a href="event_list.Ado">이벤트 전체보기</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	</body>
</html>