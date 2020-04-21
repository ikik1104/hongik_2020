/**
 * 
 */

function join_check(){
	
	//아이디 3자리 이상 영문, 숫자 가능
	//패스워드 3자리 이상 영문 1개 이상, 숫자 1개 이상, 특문 1개이상
	//패스워드확인 비교
	//이름 1자이 이상 국문만 가능
	
	var id_ck = /[a-z0-9]+$/;
	var pw_ck = (/(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+|?><]).{3,}$/);
	var n_ck = /[가-힣]{1,}$/;
	
	if(join.id.value==""){
		alert("아이디를 입력해주세요.");
		join.id.focus();
		return false;
	}
	
	if(!(id_ck.test(join.id.value))){
		alert("3자리 이상 영문, 숫자 가능");
		join.id.value="";
		join.id.focus();
		return false;
	}

	
	if(join.pw.value==""){
		alert("비밀번호를 입력하세요.");
		join.pw.focus();
		return false;
	}
	
	if(!(pw_ck.test(join.pw.value))){
		alert("3자리 이상 영문 1개 이상, 숫자 1개 이상, 특문 1개이상");
		join.pw.value="";
		join.pw.focus();
		return false;
	}
	
	if(join.pw2.value==""){
		alert("비밀번호확인을 입력하세요.");
		join.pw2.focus();
		return false;
	}
	
	if(!(join.pw.value==join.pw2.value)){
		alert("비밀번호 확인이 일치하지 않습니다.");
		join.pw2.value="";
		join.pw2.focus();
		return false;
	}
	
	
	if(join.name.value==""){
		alert("이름을 입력하세요.");
		join.name.focus();
		return false;
	}
	
	if(!(n_ck.test(join.name.value))){
		alert("한글만 입력 가능합니다.");
		join.name.value="";
		join.name.focus();
		return false;
	}
	
	
	return join.submit();
}


 function update_chk(){
		var pw_ck = (/(?=.*[a-z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+|?><]).{3,}$/);
		var n_ck = /[가-힣]{1,}$/;
		
		if(update_join.name.value==""){
			alert("이름을 입력하세요.");
			update_join.name.focus();
			return false;
		}
		
		if(!(n_ck.test(update_join.name.value))){
			alert("한글만 입력 가능합니다.");
			update_join.name.value="";
			update_join.name.focus();
			return false;
		}
		
		if(update_join.email.value==""){
			alert("이메일을 입력하세요.");
			update_join.email.focus();
			return false;
		}
		
		if(update_join.address.value==""){
			alert("주소을 입력하세요.");
			update_join.address.focus();
			return false;
		}
		
		//주소~
		update_join.address.value = "("+postcode+")"+address+extraAddress+" "+detailAddress;
		return update_join.submit();
 }
 
 //회원 삭제할거냐 물어보기
 function u_delete(id){
	 
	 if (confirm('"'+id+'"회원을 삭제하시겠습니까?')) {
		 location.href="delete.jsp?id="+id;
    }
	 
 }
 