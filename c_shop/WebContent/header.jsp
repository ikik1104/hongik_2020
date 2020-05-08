<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
	<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:300,400,500,700,900&display=swap" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/header.css">
    <script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="js/prefixfree.dynamic-dom.min.js"></script>
    <script type="text/javascript" src="js/navi_hover.js"></script> 
	<header>
	 		<div id="nav_up">
	 			<ul>
	 				<c:if test="${not empty User}">
		 				<li><a href="#">${User} 님 </a></li>
		 				<li><a href="loginOut.Mdo">로그아웃</a></li>
	 				</c:if>
	 				<c:if test="${empty User}">
		 				<li><a href="joinForm.Mdo">회원가입</a></li>
		 				<li><a href="loginForm.Mdo">로그인</a></li>
	 				</c:if>
	 				<li><a href="#">고객행복센터</a></li>
	 				<li><a href="#">배송정보검색</a></li>
	 				<c:if test="${User=='admin'}">
	 				<li><a href="admin_main.Ado">관리자페이지</a></li>
	 				</c:if>
	 			</ul>
	 		</div>
	 		<nav>
	 			<h1 onclick="location.href='main.html'"></h1>
	 			<ul>
	 				<li class="navis"><a href="#">쿡킷소개</a></li>
	 				<li class="navis"><a href="#">쿡킷메뉴</a></li>
	 				<li class="navis"><a href="notice_list.do">공지사항</a></li>
	 				<li class="navis"><a href="event_list.Edo">이벤트</a></li>
	 				<li class="navis"><a href="#">MY쿡킷</a></li>
	 			</ul>
	 			<ul>
	 				<li><a href="#"><span>장바구니</span></a></li>
	 				<li><a href="#"><span>메뉴찾기</span></a></li>
	 			</ul>
	 		</nav>
	 	</header>
