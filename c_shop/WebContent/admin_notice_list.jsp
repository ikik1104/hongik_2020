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
		<script src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
		<script type="text/javascript">
		
		$(document).ready(function() { 
			var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="notice_list.Ado";
				 }
		});
		
		</script>
		<link rel="stylesheet" type="text/css" href="css/ad_notice_list.css">
	</head>
	<body>
	<jsp:include page="admin_header.jsp"/>
	<section>
		<div id="sc1">
			<div id="sc_top">
				<form>
					<ul>
						<li>공지사항</li>
						<li><input type="button"></li>														
						<li><a href="#" onclick="bookmark()"></a></li>														
					</ul>
				</form>
			</div>
												
			<div id="list">
				<div id="sc_sh">
					<form name="filter" action="notice_list.Ado" method="get">																
						<ul>
							<li>
								<select name="filter_select">
									<option value="all">전체</option>
									<option value="tit">제목</option>
									<option value="con">내용</option>															
								</select>
							</li>
							<li><input type="text" name="search" id="sh_text"></li>																							
							<li><input type="image" src="images/ad_notice_list_3.png" id="sh_button">	</li>																				
						</ul>
					</form>						
				</div>
																
			<table>
				<colgroup>
					<col width="60px">
					<col width="730px">																			
					<col width="80px">																			
					<col width="80px">
					<col>																																						
				</colgroup>
				<thead>
					<tr>
						<th>No.</th>
						<th>제목</th>																						
						<th>작성자</th>
						<th>날짜</th>																								
						<th>조회수</th>																																													
					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty bdto}">
						<c:forEach var="bdto" items="${bdto}">
						<tr>
							<td>${bdto.bid}</td>
							<td>
							<c:forEach begin="1" end="${bdto.bindent}">&nbsp;&nbsp;</c:forEach>
							<c:forEach begin="1" end="${bdto.bindent}">▶</c:forEach>
							<a href="notice_view.Ado?bid=${bdto.bid}" class="list_a">${bdto.btitle}</a></td>																								
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
					<div>
						<a href="no_insertForm.Ado"><button>작성</button></a>
					</div>
				</div>
			</div>
	</section>
	</body>
</html>