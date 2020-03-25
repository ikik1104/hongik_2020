/**
 * 
 */
function check(){
	
	var idcheck = /^[a-zA-Z0-9]{4,12}$/; //아이디 유효성
	var id_char = /^[a-zA-Z]$/; //소문자(a-z)와 대문자(A-Z) 문자를 비교
	
	
	var id=num 	= /^[0-9]/; //첫번째가 숫자인지만 비교함 뒤에는 비교안함
	var id_num2 = /[0-9]$/; //마지막만 숫자인지만 비교함 나머지는 비교안함
	var id_num3 = /^[0-9]{1,}$/; // 첫번째부터 모두가 숫자인지 비교

	
	var id_spc 	= /[!@#$%^&*()_+|<>?{}]$/;
	var id_kor  = /[가-힣]$/; //국문
	var id_all	= /[a-zA-z가-힣0-9]$/;
	// ex) adm1201 - > a,d,v,1,2,0,1 각각 비교 ( true, false ) 
	// ( ^ = 첫번째 )부터 ( $ = 마지막 문자 )까지	????.........
	// / 정규표현식의 처음을 뜻함.
	// ^ 문장의 처음을 뜻함.
	// [ ] 대괄호 사이의 문자셋을 비교 [a-z] ->소문자a~z까지 비교
	// $ 문장의 마지막을 뜻함.
	// {} 문자열 길이 {2,10} 2~10까지의 길이
	// 8자리 이상 {8,} 8자리 이상이면 true
	// *[@]{1} 모든 문자를 비교해서 @가 1개 이상 있어야 함
	
	// 소문자 대문자 3자리에서 12자리 까지 정규표현식을 작성
	// /[a-zA-Z]{3,12}$/
	
	//test() 함수는 정규식과 비교하여 포함되지 않으면 true 반환, 포함되면 false 반환
	
	
//	if(!(id_char.test(join.j_id.value))){ //한 단어씩 비교해서 숫자만 입력이 되었는지 확인
//		alert('문자만 입력이 가능합니다.');
//		join.j_id.value="";
//		join.j_id.focus();
//		return false;
//	}else{
//		alert("문자만 입력 되었습니다.");
//	}
	
	if(!(id_num3.test(join.j_name.value))){
		alert('숫자만 입력이 가능합니다.');
		join.j_name.value="";
		join.j_name.focus();
		return false;
	}else{
		alert("숫자만 입력되었습니다.")
	}
	
	if(join.gender.value==""){
		alert("성별을 체크해주세요.");
		join.gender_value="m";
		return false;
	}

	
	if(join.gender.value=="m"){
		alert("남자입니다.");
		location.href="http://www.naver.com";
	}else if(join.gender.value=="f"){
		alert("여자입니다.");
		location.href="http://www.daum.net";
	}
}
