/**
 * 
 */

var id = prompt('아이디를 입력해주세요.');

if(id=='admin'){
	var pw = prompt('비밀번호를 입력하세요.');
	if(pw=='12345'){
		alert('로그인이 완료되었습니다.');
		location.href="login_ok.html";
	}else{
		alert('패스워드가 틀렸습니다.');
		location.href="login_error.html";
	}
}else{
	alert('아이디가 일치하지 않습니다.');
	location.href="login_error.html";
}