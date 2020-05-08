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
			 			location.href="event_list.Edo";
				 	}
				}
			</script>
			<link href="css/sub_event_list_style.css" rel="stylesheet" type="text/css">
			<link rel="stylesheet" href="team4/style.css">
 			<link rel="stylesheet" href="team4/event_list.css">
			<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap" rel="stylesheet">
	</head>
	<body>
	<!-- 헤더 -->
	<jsp:include page="header.jsp"/>

		<section>
			<c:if test="${User=='admin'}">
			<div id="insert"><a href="event_insertForm.Edo">글 등록</a></div>
			</c:if>
			<div id="list">
				<h1><a>이벤트</a></h1>
				<ul id="list_ul_1">
					<li><a href="sub_event_list.html"><span>진행중</span></a></li>
					<li><a href="#"><span>당첨자 발표</span></a></li>
				</ul>
				<ul id="list_ul_2">
					<c:if test="${not empty edto}">
					<c:forEach var="edto" items="${edto}">
						<li>
							<a href="event_view.Edo?num=${edto.num}"><img src="${pageContext.request.contextPath}/upload2/${edto.file1}"></a>
							<p><a href="sub_event_view1.html">EVENT</a></p>
							<p><a href="sub_event_view1.html">${edto.start_day}~${edto.end_day}</a></p>
							<p><a href="sub_event_view1.html">${edto.title}</a></p>
							
						</li>
					</c:forEach>
					</c:if>
					<c:if test="${empty edto}">
						<p>현재 진행중인 이벤트가 없습니다.</p>
					</c:if>
				</ul>
			</div>
			<div id="paging">	
			<c:if test="${not empty edto}">
				<ul class="page-num">
					    <a href="event_list.Edo?page=1"><li class="first"></li></a>
				      	<c:if test="${page<=1}"><a href="#"><li class="prev"></li></a></c:if>
				      	<c:if test="${page>1}"> <a href="event_list.Edo?page=${page-1}"><li class="prev"></li></a></c:if>
				      	<c:forEach var="a" begin="${startpage}" end="${endpage}" step="1">
								<c:choose>
									<c:when test="${a==page}">
										<a><li class="num" style="background-color: #ccc"><div>${a}</div></li></a>
									</c:when>
									<c:when test="${a!=page}">
										<a href="event_list.Edo?page=${a}"><li  class="num"><div>${a}</div></li></a>
									</c:when>
								</c:choose>
						</c:forEach>
						<c:if test="${page>=maxpage}"> <li class="next"></li> </c:if>
						<c:if test="${page<maxpage}"> <a href="event_list.Edo?page=${page+1}"><li class="next"></li></a> </c:if>
				     	<a href="event_list.Edo?page=${maxpage}"><li class="last"></li></a>
				    </ul>
				</c:if>	
					</div>
				<div class="clear">
					
				</div>
				</section>
			<!-- 헤더 -->
			<jsp:include page="footer.jsp"/>
	</body>
</html>

