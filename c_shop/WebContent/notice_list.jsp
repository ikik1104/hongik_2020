<%@page import="com.sun.org.apache.xml.internal.utils.IntVector"%>
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
		<style type="text/css">
			#search{width: 100%;}
			form { text-align:center; margin: 0 auto; margin-top: 40px;}
		</style>
		<script src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
		<script type="text/javascript">
		$(document).ready(function() { 
		var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="notice_list.do";
				 }
		});
		</script>
		<link type="text/css" rel="stylesheet" href="css/notice_list_style.css">
		<link rel="stylesheet" href="team4/style.css">
 		<link rel="stylesheet" href="team4/event_list.css">
		<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:500&display=swap" rel="stylesheet">
	</head>
	<body>
	<!-- 헤더 -->
	<jsp:include page="header.jsp"/>
		<section>
			<div>
				<h1>공지사항</h1>
					<div id="search">
						<form action="notice_list.do" name="form" method="get">
							<select name="opt" >
								<option value="all">전체</option>
								<option value="tit">제목</option>
								<option value="con">내용</option>
							</select>
							<input type="text" name="search">
							<button type="submit">전송</button>
						</form>
					</div>
				<div>
					<div>
						<table>
							<colgroup>
								<col width="10%">
								<col width="*">
								<col width="10%">
								<col width="18%">
								<col width="10%">
							</colgroup>
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>등록일</th>
									<th>조회수</th>
								</tr>
							</thead>
							<tbody>
							<!-- 리스트 출력 -->
							<c:if test="${not empty bdto}">
								<c:forEach var="bdto" items="${bdto}">
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
							</tbody>
						</table>
						
					</div>
					<div>
					<c:if test="${User=='admin'}">
						<span>
							<a href="no_insertForm.Ado">입력</a>
						</span>
					</c:if>
					</div>
					
					<c:if test="${not empty bdto}">
					<div id="paging">	
					<ul class="page-num">
				      <c:choose>
				      <c:when test="${searchFlag != null}">
					      <a href="notice_list.do?searchFlag=${searchFlag}&opt=${opt}&search=${search}&page=1"><li class="first"></li></a>
				      	<c:if test="${page<=1}"><a href="#"><li class="prev"></li></a></c:if>
				      	<c:if test="${page>1}"> <a href="notice_list.do?searchFlag=${searchFlag}&opt=${opt}&search=${search}&page=${page-1}"><li class="prev"></li></a></c:if>
				      	<c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
								<c:choose>
									<c:when test="${a==page}">
										<a><li class="num" style="background-color: #ccc"><div>${a}</div></li></a>
									</c:when>
									<c:when test="${a!=page}">
										<a href="notice_list.do?searchFlag=${searchFlag}&opt=${opt}&search=${search}&page=${a}"><li  class="num"><div>${a}</div></li></a>
									</c:when>
								</c:choose>
						</c:forEach>
						<c:if test="${page>=maxpage}"> <li class="next"></li> </c:if>
						<c:if test="${page<maxpage}"> <a href="notice_list.do?searchFlag=${searchFlag}&opt=${opt}&search=${search}&page=${page+1}"><li class="next"></li></a> </c:if>
				     	<a href="notice_list.do?searchFlag=${searchFlag}&opt=${opt}&search=${search}&page=${maxpage}"><li class="last"></li></a>
				      </c:when>
				      <c:otherwise>
					      <a href="notice_list.do?page=1"><li class="first"></li></a>
				      	<c:if test="${page<=1}"><a href="#"><li class="prev"></li></a></c:if>
				      	<c:if test="${page>1}"> <a href="notice_list.do?page=${page-1}"><li class="prev"></li></a></c:if>
				      	<c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
								<c:choose>
									<c:when test="${a==page}">
										<a><li class="num" style="background-color: #ccc"><div>${a}</div></li></a>
									</c:when>
									<c:when test="${a!=page}">
										<a href="notice_list.do?page=${a}"><li  class="num"><div>${a}</div></li></a>
									</c:when>
								</c:choose>
						</c:forEach>
						<c:if test="${page>=maxpage}"> <li class="next"></li> </c:if>
						<c:if test="${page<maxpage}"> <a href="notice_list.do?page=${page+1}"><li class="next"></li></a> </c:if>
				     	<a href="notice_list.do?page=${maxpage}"><li class="last"></li></a>
				      </c:otherwise>
				      </c:choose>
				    </ul>
					</div>	
					
					</c:if>
				</div>
			</div>
		</section>
		<!-- 푸터 -->
		<jsp:include page="footer.jsp"/>
	</body>
