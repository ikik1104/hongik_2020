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
		<link rel="stylesheet" type="text/css" href="css/join.css">
		<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>
        <script type="text/javascript" src="js/prefixfree.dynamic-dom.min.js"></script>
        <script type="text/javascript" src="js/join.js"></script>
        <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<script type="text/javascript" src="js/postcode_v2.js"></script>
	</head>
	<body>
		<!-- 헤더 -->
<jsp:include page="header.jsp"/>
		<div id="sub_img"></div>
		<form name="join" action="join.Mdo" method="post">
		<section>
			<div>
				<div id="top">
					<ul>
						<li>HOME</li>
						<li>회원가입</li>
						<li>회원정보입력</li>
					</ul>
				</div>
				<div id="title">
					<h3>회원가입</h3>
				</div>
				<div id="step">
					<ul>
						<li>
						<div>
							<span>STEP.1</span>
							<p>약관동의</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.2</span>
							<p>본인확인</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.3</span>
							<p>회원정보입력</p>
						</div>
						</li>
						<li>
						<div>
							<span>STEP.4</span>
							<p>회원관리완료</p>
						</div>
						</li>
					</ul>
				</div>
				<h3>필수 정보 입력<span>( * 항목은 필수 항목입니다.)</span></h3>
				
				<table>
					<tr>
						<th><span></span>이름</th>
						<td>
							<input type="text" name="name">
						</td>
					</tr>
					<tr>
						<th><span></span>아이디</th>
						<td>
							<input type="text" name="id" id="j_id" readonly>
							<input type="button" onclick="id_ch()" value="중복확인">
							<p>
							4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.<br>
							첫 글자는 영문으로 입력해 주세요.
							</p>
						</td>
					</tr>
					<tr>
						<th><span></span>비밀번호</th>
						<td>
							<input type="password" name="pw" id="pw">
							<p>
							영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력<br>
							영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력
							</p>
						</td>
					</tr>
					<tr>
						<th><span></span>비밀번호 확인</th>
						<td>
							<input type="password" id="pw2">
							<span>비밀번호를 다시 한번 입력해주세요.</span>
						</td>
					</tr>
					<tr>
						<th><span></span>이메일</th>
						<td>
							<input type="text" id="email_id">@
							<select id="email_select" onchange="e_select(this.value)">
								<option value="">선택</option>
								<option value="naver.com">네이버</option>
								<option value="google.com">구글</option>
								<option value="daum.net">다음</option>
								<option value="yahoo.com">야후</option>
								<option value="self">직접입력</option>
							</select>
							<input type="text" id="email_1" readonly>
							<input type="hidden" name="email" id="email">
						</td>
					</tr>
					<tr>
						<th><span></span>주소</th>
						<td id="address">
							<input type="text" id="postcode" name="postcode" placeholder="우편번호" readonly>
							<button type="button"  onclick="execDaumPostcode()">우편번호</button><br>
							<input type="text" name="address" id="address1" readonly>
							<br>
							<input type="text" name="address2" id="detailAddress">
							<input type="text" name="address3" id="extraAddress" placeholder="참고사항" readonly>
						</td>
					</tr>
					<tr>
						<th><span></span>휴대전화</th>
						<td id="call">
							<input type="text" id="phone1" maxlength="3"> - <input type="text" id="phone2" maxlength="4"> - <input type="text" id="phone3" maxlength="4">
							<input type="hidden" name="phone">
						</td>
					</tr>
					<tr>
						<th><span></span>생년월일</th>
						<td>
							<select name="year" id="year">
								<option value="">선택</option>
								<option value="1996">1996</option>
								<option value="1997">1997</option>
								<option value="1998">1998</option>
								<option value="1999">1999</option>
								<option value="2000">2000</option>
								<option value="2015">2015</option>
								<option value="2020">2020</option>
							</select>년
							<select name="month" id="month">
								<option value="">선택</option>
								<option value="01">1</option>
								<option value="02">2</option>
								<option value="03">3</option>
								<option value="04">4</option>
								<option value="05">5</option>
								<option value="06">6</option>
								<option value="07">7</option>
							</select>월
							<select name="day" id="day">
								<option value="">선택</option>
								<option value="01">1</option>
								<option value="02">2</option>
								<option value="03">3</option>
								<option value="04">4</option>
								<option value="05">5</option>
								<option value="06">6</option>
								<option value="07">7</option>
							</select>일
							<input type="hidden" name="birth">
							<br>
							<div id="cal">
							<label><input type="radio" name="day2" value="양력" checked>양력</label>
							<label><input type="radio" name="day2" value="음력" >음력</label>
							</div>
						</td>
					</tr>
					<tr>
						<th><span></span>성별</th>
						<td>
							<label><input type="radio" name="gender" value="여성" >여성</label>
							<label><input type="radio" name="gender" value="남성">남성</label>
						</td>
					</tr>
					<tr  id="news_letter">
						<th><span></span>뉴스레터 수신여부</th>
						<td>
							<p>이메일을 통한 상품 및 이벤트 정보 수신에 동의합니다.</p>
							<label><input type="radio" name="news" value="yes" checked>예</label>
							<label><input type="radio" name="news" value="no">아니오</label>
						</td>
					</tr>
					<tr id="sms_letter">
						<th ><span></span>SMS 수신여부</th>
						<td>
							<p>문자를 통한 상품 및 이벤트 정보 수신에 동의합니다.</p>
							<label><input type="radio" name="sms" value="yes"checked>예</label>
							<label><input type="radio" name="sms" value="no">아니오</label>
						</td>
					</tr>
				</table>
				
				<h3>분양회원 정보 입력<span>(다구좌 회원일 경우 가지고 계신 카드번호 중 하나를 입력해 주시면 됩니다)</span></h3>
				
				<table>
					<tr>
						<th>회원번호</th>
						<td>
							<input type="text">
							<span>하이픈(-)이나 띄어쓰기 없이 입력해 주시기 바랍니다.</span>
						</td>
					</tr>
					<tr>
						<th>회원인증번호</th>
						<td>
							<input type="text">
							<span>숫자 4자리 입력</span>
						</td>
					</tr>
				</table>
				
				<h3>선택 입력 정보</h3>
				<table>
					<tr>
						<th>직업</th>
						<td>
							<select name="job" >
								<option>선택</option>
								<option>회사원</option>
								<option>자영업</option>
								<option>프리랜서</option>
								<option>전업주부</option>
								<option>학생</option>
								<option>기타</option>
							</select>
						</td>
					</tr>
					<tr>
						<th>결혼여부</th>
						<td>
							<label><input type="radio" name="me" value="yes">예</label>
							<label><input type="radio" name="me" value="no">아니오</label>
						</td>
					</tr>
					<tr>
						<th>관심사</th>
						<td id="fav">
							<ul>
							<li><label><input type="checkbox">컴퓨터/인터넷</label></li>
							<li><label><input type="checkbox">영화/비디오</label></li>
							<li><label><input type="checkbox">음악</label></li>
							<li><label><input type="checkbox">쇼핑</label></li>
							<li><label><input type="checkbox">게임</label></li>
							<li><label><input type="checkbox">문화/예술</label></li>
							<li><label><input type="checkbox">육아/아동</label></li>
							<li><label><input type="checkbox">요리</label></li>
							<li><label><input type="checkbox">인테리어</label></li>
							<li><label><input type="checkbox">레저/여가</label></li>
							<li><label><input type="checkbox">건강/다이어트</label></li>
							<li><label><input type="checkbox">패션/미용</label></li>
							</ul>
						</td>
					</tr>
				</table>
				<div id="join_btn">
				<button type="button" onclick="location.href='main.html'">취소</button>
<!-- 				<button type="submit" onclick="location.href='join_view.html'">가입하기</button> -->
				<button type="button" onclick="check()">가입하기</button>
				</div>
			</div>
		</section>
		</form>
		<!-- 푸터 -->
		<jsp:include page="footer.jsp"/>
	</body>
</html>