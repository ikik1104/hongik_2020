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
		<script type="text/javascript">
		window.onload = load();
		
		function load(){
			var text1 = "${text}";
			if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
			 		location.href="event_list.Ado";
				 }
		}
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
						<li>이벤트</li>
						<li><input type="button"></li>														
						<li><a href="#" onclick="bookmark()"></a></li>														
					</ul>
				</form>
			</div>
												
			<div id="list">
			<table>
				<colgroup>
					<col width="100px">
					<col width="270px">																			
					<col width="300px">																			
					<col width="220px">
					<col width="100px">
					<col>																																						
				</colgroup>
				<thead>
					<tr>
						<th>No.</th>
						<th>썸네일</th>																						
						<th>제목</th>
						<th>기간</th>																								
						<th>조회수</th>																																													
					</tr>
				</thead>
				<tbody>
					<c:if test="${not empty edto}">
					<c:forEach var="edto" items="${edto}" begin="0" end="4">
						<tr>
							<td>${edto.num}</td>
							<td><img src="${pageContext.request.contextPath}/upload2/${edto.file1}" style="width: 200px; height: 100px;"></td>
							<td style="height: 100px; cursor: pointer;" onclick="location.href='event_view.Ado?num=${edto.num}'">${edto.title}</td>
							<td>${edto.start_day}~${edto.end_day}</td>
							<td>${edto.hit}</td>
						</tr>
					</c:forEach>
					</c:if>
				</table>
					<c:if test="${empty edto}">
						<p style="width:1000px; text-align: center;">현재 진행중인 이벤트가 없습니다.</p>
					</c:if>
					<div>
						<a href="event_insertForm.Ado"><button id="bnt">작성</button></a>
					</div>
				</div>
			</div>
	</section>
	</body>
</html>