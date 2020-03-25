/**
 * 
 */

	function check(){
		var name_chk= /^[가-힣]{1,}$/;
		var id_chk = /^[a-zA-Z][a-zA-Z0-9_]{3,16}$/;
		
		var pw_chk1 = /^(?=.*[a-zA-Z]).+$/; //영문이 하나라도 있는지~
		var pw_chk2 = /^(?=.*[0-9]).+$/; //숫자가 하나라도 있는지~
		var pw_chk3 = /^(?=.*[~!@#$%^&*()_+|{}<>?]).+$/; //특문이 하나라도 있는지~
 		var cnt = 0; //몇개나 사용했는지
		
		//이름
		if(join.name.value==""){
			alert("이름을 입력해주세요.");
			return false;
		}
		if(!(name_chk.test(join.name.value))){
			alert("국문, 1자리 이상 입력하세요.");
			join.name.focus();
			return false;
		}
		
		//아이디
		if(join.id.value==""){
			alert("아이디를 입력해주세요.");
			return false;
		}
		if(!(id_chk.test(join.id.value))){
			alert("4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.(첫 글자는 영문)");
			join.id.focus();
			return false;
		}
		
		//비밀번호
		if(join.pw.value==""){
			alert("비밀번호를 입력하세요.");
		}
		
		if(pw_chk1.test(join.pw.value)){
			cnt++;
		}
		if(pw_chk2.test(join.pw.value)){
			cnt++;
		}
		if(pw_chk3.test(join.pw.value)){
			cnt++;
		}
		
		if(cnt==0||cnt==1){
			alert("영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력 " +
					"영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력");
			join.pw.value="";
			return false;
		}else if((cnt==2)&&(join.pw.value.length<10)){
				alert("영문, 숫자, 특수문자 중 2종류 조합 시 10자리 이상 입력하세요");
				join.pw.value="";
				return false;
		}else if((cnt==3)&&(join.pw.value.length<8)){
				alert("영문, 숫자, 특수문자 모두 조합 시 8자리 이상 입력");
				join.pw.value="";
				return false;
		}
		
		if(join.pw2.value==""){
			alert("비밀번호를 한번 더 입력해주세요.");
			join.pw2.focus();
			return false;
		}
		
		if(!(join.pw.value==join.pw2.value)){
			alert("비밀번호가 일치하지 않습니다.");
			join.pw.value="";
			join.pw2.value="";
			join.pw.focus();
			return false;
		}
		
		
		
		//휴대전화
		if(join.phone1.value==""||join.phone2.value==""||join.phone3.value==""){
			
		}
		
		
		
		
		
		
	}
