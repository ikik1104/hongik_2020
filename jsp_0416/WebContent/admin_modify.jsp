<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("authUser")==null){
		PrintWriter pw = response.getWriter();
		pw.println("<script>alert('로그인 하세요'); history.back();</script>");
	}
%>
<%!
	Connection con;
	PreparedStatement psmt;
	ResultSet rs;
	
	String id,pw,name,address,email,phone,gender,news,sms;
	Timestamp birth;

%>
<%
		id = request.getParameter("id");
		request.setCharacterEncoding("utf-8");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","ora_user","1234");
			psmt = con.prepareStatement("select * from lms_member where id = ?");
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			while(rs.next()){
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				address = rs.getString("address");
				email = rs.getString("email");
				gender = rs.getString("gender");
				news = rs.getString("news");
				sms = rs.getString("sms");
				birth = rs.getTimestamp("birth");
				phone = rs.getString("phone");
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(psmt!=null)psmt.close();
				if(con!= null)con.close();
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}


%>
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
	</head>
	<body>
		<header>
			<div id="nav_up">
				<ul>
					<li>회원가입</li>
					<li>로그인</li>
					<li>고객행복센터</li>
					<li>배송지역검색</li>
					<li>기프트카드 등록</li>
				</ul>
			</div>
			
			<nav>
				<h1></h1>
				<ul>
					<li>COOKIT소개</li>
					<li>COOKIT메뉴</li>
					<li>리뷰</li>
					<li>이벤트</li>
					<li>MY쿡킷</li>
				</ul>
				<ul>
					<li><a href="#"><span>장바구니</span></a></li>
					<li><a href="#"><span>메뉴찾기</span></a></li>
				</ul>
			</nav>
		</header>
		<div id="sub_img"></div>
		<form name="join" action="Admin_modify" method="post">
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
							<input type="text" name="name" value=<%=name%>>
						</td>
					</tr>
					<tr>
						<th><span></span>아이디</th>
						<td>
							<input type="text" name="id" id="j_id" value=<%=id%> readonly>
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
							<input type="password" name="pw" id="pw" value=<%=pw%>>
							<p>
							영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력<br>
							영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력
							</p>
						</td>
					</tr>
					<tr>
						<th><span></span>이메일</th>
						<td>
							<input type="email" name="email" value=<%=email%>>
						</td>
					</tr>
					<tr>
						<th><span></span>주소</th>
						<td id="address">
							<input type="text" name="z_code1" readonly>
							&nbsp;-&nbsp;
							<input type="text" name="z_code2" readonly>
							<button>우편번호</button><br>
							<input type="text" name="address1" readonly placeholder="우편번호를 선택하면 자동입력">
							<br>
							<input type="text" name="address" value=<%=address%> >
						</td>
					</tr>
					<tr>
						<th><span></span>휴대전화</th>
						<td id="call">
							<input type="text" name="phone" value=<%=phone%>>
						</td>
					</tr>
					<tr>
						<th><span></span>생년월일</th>
						<td>
							<input type="date" name="birth"  value=<%=birth%>>
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
							<label><input type="radio" name="news" value="예">예</label>
							<label><input type="radio" name="news" value="아니오">아니오</label>
						</td>
					</tr>
					<tr id="sms_letter">
						<th ><span></span>SMS 수신여부</th>
						<td>
							<p>문자를 통한 상품 및 이벤트 정보 수신에 동의합니다.</p>
							<label><input type="radio" name="sms" value="예">예</label>
							<label><input type="radio" name="sms" value="아니오">아니오</label>
						</td>
					</tr>
				</table>
			<script type="text/javascript">
			var gender = document.getElementsByName("gender");
			var news = document.getElementsByName("news");
			var sms = document.getElementsByName("sms");
			//성별
			for (var i = 0; i < gender.length; i++) {
				if(gender[i].value=='<%=gender%>'){
					gender[i].checked=true;
				}
			}
			
			//뉴스레터
			for (var i = 0; i < news.length; i++) {
				if(news[i].value=='<%=news%>'){
					news[i].checked=true;
				}
			}
			
			//sms
			for (var i = 0; i < sms.length; i++) {
				if(sms[i].value=='<%=sms%>'){
					sms[i].checked=true;
				}
			}
		</script>
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
<!-- 				<button type="button" onclick="check()">가입하기</button> -->
					<button type="submit">가입하기</button>
				</div>
			</div>
		</section>
		</form>
		<footer>
			<div>
				<div id="left">
					<div>
						<a href="#"></a>
					</div>
					<p>© COOKIT ALL RIGHTS RESERVED</p>
				</div>
				<div id="center">
					<ul>
						<li><a href="#">이용약관</a></li>
						<li><a href="#">개인정보처리 방침</a></li>
						<li><a href="#">법적고지</a></li>
						<li><a href="#">사업자 정보 확인</a></li>
					</ul>
				<div id="center_1">
					<p>씨제이제일제당(주)</p>
					<p>대표이사 : 손경식,강신호,신현재</p>
					<p>사업자등록번호 : 104-86-09535</p>
					<p>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</p>
					<p>통신판매업신고 중구 제 07767호</p>
					<p>개인정보보호책임자 : 조영민</p>
					<p>이메일 : cjon@cj.net</p>
					<p>호스팅제공자 : CJ올리브네트웍스㈜</p>
					<P>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 
					전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a href="#">가입 사실 확인</a></P>
				</div>
				</div>
				<div id="right">
					<div>
						<span>CJ그룹계열사 바로가기 </span>
						<p>고객행복센터  1668-1920</p>
						<a href="#">1:1문의</a>
					</div>
				</div>
			</div>
		</footer>
	</body>
</html>