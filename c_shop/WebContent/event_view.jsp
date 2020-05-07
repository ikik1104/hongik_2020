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
							function deleteEvent(num){
								if(confirm("해당 이벤트를 삭제하시겠습니까?")){
									location.href='event_delete.Edo?num='+num;
								}								
							}
						
						</script>
						<link href="css/sub_event_view_style1.css" rel="stylesheet" type="text/css">
						<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR&display=swap" rel="stylesheet">
			</head>
			
			<body>
						<!-- 헤더 -->
					<jsp:include page="header.jsp"/>
						<section>
										
										<div id="description">
												<h1><a href="sub_event_list.html">이벤트</a></h1>
												
												<div><!--#description>div:nth-child(2)  -->
														<h1>${dto.title}</h1>
														
														<div>
																<div><!-- 공유 이미지 -->&nbsp;</div>
																<p>공유</p>
														</div>
														<p>${dto.start_day}~${dto.end_day}<p>
												</div>
												
												<div><!-- 이벤트 이미지 -->
														<img src="upload/${dto.file2}" style="width:100%; height:1000px; margin-bottom: 50px;">
														<p style="text-align: center; margin-bottom: 100px; font-size: 15px;">${dto.content}</p>
												</div>
										</div>
										<div id="button">
<%-- 											<c:if test="${User=='admin'}"> --%>
												<a href="event_updateForm.Edo?num=${dto.num}">수정</a>
												<a href="javascript:deleteEvent('${dto.num}')">삭제</a>
<%-- 											</c:if>											 --%>
												<a href="event_list.Edo">목록</a></div>	
										</div>
						</section>
						<!-- 푸터 -->
	 					<jsp:include page="footer.jsp"/>
			</body>
</html>


