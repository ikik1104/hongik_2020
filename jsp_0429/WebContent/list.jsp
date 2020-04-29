<%@page import="com.sun.org.apache.xml.internal.utils.IntVector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<%
	int listcount = ((Integer)request.getAttribute("listcount")).intValue();
	// int listcount = Integer.parseInt(request.getAttribute("listcount").toString());
	// int listcount = Integer.parseInt((String)request.getAttribute("listcount")); // error
	// 처음에 인트라는 객체로 넣어줬기 때문에 스트링ㄹ으로 변환할 수 없다.
	int nowpage = ((Integer)request.getAttribute("page")).intValue();
	int maxpage = ((Integer)request.getAttribute("maxpage")).intValue();
	int startpage = ((Integer)request.getAttribute("startpage")).intValue();
	int endpage = ((Integer)request.getAttribute("endpage")).intValue();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>공지사항 리스트</title>
		<style type="text/css">
			#paging{width: 1000px; }
			ul {list-style: none; margin: 0 auto;}
			li {float: left; border: 1px solid black; padding: 10px; margin-right: 5px;}
		</style>
		<script type="text/javascript">
				/*
		window.onload = load();
		
		function load(){
			var text1 = "${text}";
				 if(text1!=null){
			 		alert(text1);	
				 }
		}
		*/
		</script>
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
								<col width="15%">
								<col width="*">
								<col width="18%">
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
							<!-- 리스트 출력 -->
							<c:forEach var="dto" items="${dto}">
								<tr>
									<td>${dto.bid}</td>
									<td class="tit">
									<c:forEach begin="1" end="${dto.bindent}">▶</c:forEach>
									<a href="https://www.cjcookit.com/pc/cs/noticeView?ntcSeq=1094" class="list_a">${dto.btitle}</a></td>
									<td><fmt:formatDate value="${dto.bdate}" pattern="yyyy-MM-dd"/></td>
									<td>${dto.bhit}</td>
								</tr>
							</c:forEach>	
							</tbody>
						</table>
						
					</div>
					<div>
						<span>
							<a href="input_notice.html">입력</a>
						</span>
					</div>
						
					<div id="paging">	
					<ul style="list-style: none">
						<!-- 첫 페이지 -->
						<a href="list.do?page=1"><li>◀◀</li></a>
						<!-- 이전 페이지  이동버튼-->
						<c:if test="${page<=1}">
							<li>◀</li>
						</c:if>
						<c:if test="${page>1}">
							<a href="list.do?page=${page-1}"><li>◀</li></a>
						</c:if>
						<!-- 순차적으로 페이지 출력 -->
						<c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
							<c:choose>
								<c:when test="${a==page}">
									<li style="background: fuchsia;"><div>${a}</div></li>
								</c:when>
								<c:when test="${a!=page}">
									<a href="list.do?page=${a}"><li><div>${a}</div></li></a>
								</c:when>
							</c:choose>
						</c:forEach>
						<!-- 다음페이지로 이동버튼 -->
						<c:if test="${page>=maxpage}">
							<li>▶</li>
						</c:if>
						<c:if test="${page<maxpage}">
							<a href="list.do?page=${page+1}"><li>▶</li></a>
						</c:if>
						<!-- 마지막 페이지 이동 -->
						<a href="list.do?page=${maxpage}"><li>▶▶</li></a>
					</ul>	
					</div>	
						
<!-- 					<div> -->
<!-- 						<a href="#"></a> -->
<!-- 						<a href="#"></a> -->
<!-- 						<span> -->
<!-- 							<strong>1</strong> -->
<!-- 							<a href="#">2</a> -->
<!-- 						</span> -->
<!-- 						<a href="#"></a> -->
<!-- 						<a href="#"></a> -->
<!-- 					</div> -->
				</div>
			</div>
		</section>
	</body>
