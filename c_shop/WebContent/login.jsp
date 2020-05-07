<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>cj cookit 마크업</title>
    <script type="text/javascript">
		window.onload = load();
		function load(){
			var text1 = "${text}";
				 if(!(text1===null) && !(text1==="")){
			 		alert(text1);	
				 }
		}
		</script>
    <link href="css/style.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700&display=swap" rel="stylesheet">    
  </head>
  <body>
    <div class="wrap">
      <!-- 헤드영역 -->
      <!-- 헤더 -->
<jsp:include page="header.jsp"/>
      <!-- 본문영역 -->
      <section>
      <form action="login.Mdo" name="login" method="post"">
        <div class="l_container">
          <div class="p_name">로그인</div>
          <div class="login_box">
            <div class="tab_mn">
              <ul>
                <li id="mem_log">회원 로그인</li>
                <li>비회원 주문조회</li>
              </ul>
            </div>
            <div class="input_log">
              <input type="text" name="id" placeholder="CJ ONE 통합아이디 6~20자" class="inputbox">
              <input type="password" name="pw" placeholder="비밀번호 영문, 특수문자, 숫자혼합 8~12자" class="inputbox" id="ineedmargin">
              <div class="id_remember">
                <input type="checkbox" id="remember" name="id_remem" value="y">
                <span>
                  <div></div>
                  <label for="remember">아이디 저장</label>
                </span>
              </div>
              <div class="id_find">
                <span>아이디 찾기</span>
                <span>비밀번호 찾기</span>
              </div>
              <button class="login_button" type="submit">로그인</button>
            </div>
            
            <div class="sns_log">
              <ul class="sns_ico">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
              </ul>            
            </div>
            
            <div class="regi_area">
              <p>CJ ONE 통합회원이 아니신가요?</p>
              <p>CJ ONE 통합회원으로 가입하시면 CJ제일제당의 다양한 서비스(COOKIT, CJ THE MARKET, CJ제일제당 홈페이지)를 이용하실 수 있습니다.</p>
              <div>CJ ONE 통합회원 신규가입하기</div>
            </div>
          </div>
        </div>
        </form>
      </section>
      <!-- float btn -->
      <section>
        <div class="float_btn"></div>
      </section>
      
      <!-- 푸터 -->
	  <jsp:include page="footer.jsp"/>
    </div>
  </body>
</html>