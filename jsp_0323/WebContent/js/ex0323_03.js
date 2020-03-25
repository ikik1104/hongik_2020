/**
 * 
 */

function check(){
	
	//아이디 체크
	var id_chk = /^[a-zA-z]{4,12}$/;
	//비밀번호 체크
	var pw_chk = /^[a-z0-9~!@#$%^&*()_+|{}<>?]+$/;
	//이름체크
	var name_chk = /^[가-힣]{1,}$/;
	//나이체크
	var age_chk = /^[0-9]{1,3}$/;
	//전화번호 체크
	var tel_chk = /^[0-9]{8,}$/;
	
	var pw_chk  = (/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+|{}<>?]).{1,}$/);
	// . 하나하나 비교해서 a-z가 하나라도 있는지
	
	
	//아이디
	if(join.u_id.value==""){
		alert("아이디를 입력해주세요.");
		join.u_id.focus();
		return false;
	}
	
	//유효성검사
	if(!(id_chk.test(join.u_id.value))){
		alert("소문자, 대문자까지 입력가능 4~12");
		join.u_id.value="";
		join.u_id.focus();
		return false;
	}
	
	//패스워드
	if(join.u_pw.value=="" || join.u_pw2.value==""){
		alert("비밀번호를 입력해주세요.");
		join.u_pw.focus();
		return false;
	}
	
	if(!(pw_chk.test(join.u_pw.value))){
		alert("소문자,숫자,특수문자만 가능");
		join.u_pw.value="";
		join.u_pw2.value="";
		join.u_pw.focus();
		return false;
	}
	
	
	if(join.u_pw.value!=join.u_pw2.value){
		alert("패스워드와 패스워드확인이 일치하지 않습니다.");
		join.u_pw.value="";
		join.u_pw2.value="";
		join.u_pw.focus();
		return false;
	}
	
	//이름
	if(join.u_name.value==""){
		alert("이름을 입력해주세요.");
		join.u_name.focus();
		return false;
	}
	
	if(!(name_chk.test(join.u_name.value))){
		alert("한글만 가능 1글자 이상");
		join.u_name.value="";
		join.u_name.focus();
		return false;
	}
	
	//나이
	if(join.u_age.value==""){
		alert("나이를 입력해주세요.");
		join.u_age.focus();
		return false;
	}
	
	if(!(age_chk.test(join.u_age.value))){
		alert("1~3자리 숫자만 입력가능");
		join.u_age.value="";
		join.u_age.focus();
		return false;
	}
	
	//성별
	if(join.gender.value==""){
		alert("성별을 선택해주세요.");
		return false;
	}
	
	//취미
	
//	if(!(join.hobby.value=="a"||join.hobby.value=="b"||join.hobby.value=="c" ||
//		join.hobby.value=="d"||join.hobby.value=="e")){
//		alert("취미를 선택해주세요.");
//		return false;
//	}
	var hobby = document.getElementsByName("hobby");
//				join.hobby
	var count = 0; 
	for (var i = 0; i < hobby.length; i++) {
		if(hobby[i].checked==true){
			alert(hobby[i].value);
			count++;
		}
	}
	if(count==0){
		alert("취미를 선택해주세요.");
		return false;
	}
		
		

	
	
	//전화번호
	if(join.u_tel.value==""){
		alert("전화번호를 입력해주세요.");
		join.u_tel.focus();
		return false;
	}
	
	if(!(tel_chk.test(join.u_tel.value))){
		alert("숫자만 가능 8자리 이상만 가능합니다.");
		join.u_tel.value="";
		join.u_tel.focus();
		return false;
	}
	
}



