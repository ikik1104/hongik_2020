/**
 * 
 */
function check(){
	
	//정규식
	var id_check = /^[a-zA-Z]{3,20}$/; //소문자,대문자 4자리 이상
	var id_age = /^[0-9]{1,3}$/;
	var id_spc = /^[a-z~!@#$%^&*()_+|<>{}?]$/;
	// /^[a-zA-Z]+$ +---->처음부터 끝까지 
	
	//아이디가 입력되었는지 확인
	if(join.j_id.value==""){ //비어있으면
		alert("아이디를 입력해주세요.");
		join.j_id.focus(); //아이디에 focus
		return false;
	}
	
	if(!(id_spc.test(join.j_id.value))){ //true가 아니면
		alert('소문자와 특수문자만 가능합니다.');
		join.j_id.value="";
		join.j_id.focus();
		return false;
	}
	
//	if(!(id_age.test(join.j_age.value))){
//		alert("3자리 이하 숫자만 입력 가능합니다.");
//		join.j_age.focus();
//		return false;
//	}
	
	
//	if(join.j_name.value==""){
//		alert("이름을 입력해주세요.");
//		join.j_name.value="";
//		join.j_name.focus();
//		return false;
//	}
	
}