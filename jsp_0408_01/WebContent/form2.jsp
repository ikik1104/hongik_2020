<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	function chk(){
		
		var name_chk = /^[가-힣]{1,}$/;
		
		var id_chk = (/^[a-z](?=.*[a-zA-z])(?=.*[0-9])[a-zA-Z].{2,}$/);
		var id_chk2 = (/(?=.*[~!@#$%^&*()_+|{}:<>?])(?=.*[0-9]).{1,}$/);
		var pw_chk = (/^(?=.*[~!@#$%^&*()_+|{}:<>?])(?=.*[0-9]).{1,}$/);
		
		//이름
		if(form.name.value==""){
			alert("이름을 입력하세요.");
			form.name.focus();
			return false;
		}
		
		//이름 유효성
		if(!(name_chk.test(form.name.value))){
			alert("한글만 입력 가능합니다.");
			form.name.value="";
			form.name.focus();
			return false;
		}
		
		//아이디
		if(form.id.value==""){
			alert("아이디를 입력해주세요.");
			form.id.focus();
			return false;
		}
		
		//아이디 유효성
		if(!(id_chk.test(form.id.value)) || id_chk2.test(form.id.value)){
			alert("소문자로 시작, 대소문자 1개 이상 , 숫자1 이상");
			form.id.value="";
			form.id.focus();
			return false;
		}
	
		
		if(form.pw.value==""){
			alert("비밀번호를 입력하세요.");
			form.pw.focus();
			return false;
		}
		
		if(!(pw_chk.test(form.pw.value))){
			alert("특수문자 1개이상, 숫자 1개 이상");
			form.pw.value="";
			form.pw.focus();
			return false;
		}
		
		if(form.pw2.value==""){
			alert("비밀번호 확인을 입력하세요.");
			form.pw2.focus();
			return false;
		}
		
		if(form.pw.value != form.pw2.value){
			alert("비밀번호 확인이 일치하지 않습니다.");
			form.pw2.value="";
			form.pw2.focus();
			return false;
		}
		
		if(form.gender.value==""){
			alert("성별을 선택하세요.");
			return false;
		}
		
		if(form.addr.value==""){
			alert("주소를 선택하세요.");
			return false;
		}
		
		
		form.submit();
		
	}


</script>
</head>
<body>
<!-- 이름, 아아디, 패스워드, 패스워드확인,성별,주소 -->
<form name="form" action="ex0408_03.jsp" method="post">
	이름 : <input type="text" name="name"><br>
	아이디 : <input type="text" name="id"><br> 
	패스워드 : <input type="password" name="pw"><br>
	패스워드 확인 : <input type="password" name="pw2"><br>
	성별 : <input type="radio" name="gender" value="male">남
		 <input type="radio" name="gender" value="female">여
	<br>
	주소 : <select name="addr">
			<option value="seoul">서울</option>
			<option value="kyeonggi">경기</option>
			<option value="busan">부산</option>
		</select>
		<br>
	<input type="button" onclick="chk()" value="전송">
</form>
</body>
</html>