/**
 * 
 */

function login_check(){
	//유효성 검사
	//id 대문자, 소문자만 가능.
	//pw대문자,소문자, 특수문자 사용가능
	
	var id_ck = /[a-zA-Z]+$/;
	var pw_ck = /[A-Za-z~!@#$%^&*()_+|{}<>?0-9]+$/;
	
	if(login.id.value==""){
		alert("아이디를 입력해주세요.");
		login.id.focus();
		return false;
	}
	if(login.pw.value==""){
		alert("패스워드를 입력해주세요.");
		login.pw.focus();
		return false;
	}
	
	if(!(id_ck.test(login.id.value))){
		alert("대소문자만 가능합니다.");
		login.id.value="";
		login.id.focus();
		return false;
	}
	if(!(pw_ck.test(login.pw.value))){
		alert("대소문자와 특수문자만 사용가능합니다.");
		login.pw.value="";
		login.pw.focus();
		return false;
	}
	
	login.submit();
	
}