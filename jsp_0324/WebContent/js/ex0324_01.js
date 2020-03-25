/**
 * 
 */

	function check(){
		
		//아이디 3자리 이상 15자리 이하
		var id_chk = /^[a-zA-Z][a-zA-Z0-9]{2,14}$/; //첫번째는 앞쪽에 지정해줬기 때문에 {2(앞자리+1=3자리),14} 으로 해야 한다.
		var name_chk = /^[가-힣]{1,}$/; // *모든 자리를 다 체크할게~~ 안넣어도 상관없음
		var age_chk = /^[0-9]{1,3}$/;
		//패스워드 소문자, 대문자, 숫자, 특수문자를 1개씩 이상 써야한다.
		var pw_chk = (/^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*()_+|{}<>?]).{3,10}$/);
		// ( . ) 한문자 한문자 ( * )모두 ( ? ) 한개라도 있으면
		
		
		//아이디 입력체크 검사-----------------------------
		if(join.j_id.value==""){
			alert("아이디를 입력해주세요.");
			join.j_id.focus();
			return false;
		}
		
		//아이디 유효성 검사
		if(!(id_chk.test(join.j_id.value))){
			alert("3자리 이상 문자와 숫자만 가능합니다.");
			join.j_id.focus();
			return false
		}
		
		//비밀번호 입력체크-------------------------------
		if(join.j_pw.value==""){
			alert("비밀번호를 입력해주세요.");
			join.j_pw.focus();
			return false;
		}
		
		if(!(pw_chk.test(join.j_pw.value))){
			alert("소문자, 대문자, 숫자, 특수문자 중 1개이상씩 3자리 이상 입력해주세요.");
			join.j_pw.value="";
			join.j_pw.focus();
			return false;
		}

		//비밀번호 확인 입력체크
		if(join.j_pw2.value==""){
			alert("비밀번호 확인을 입력해주세요.");
			join.j_pw2.focus();
			return false;
		}
		
		//비밀번호 일치 확인
		if(join.j_pw.value != join.j_pw2.value){
			alert("비밀번호가 일치하지 않습니다.");
			join.j_pw2.value="";
			join.j_pw2.focus();
			return false;
		}
		
		//이름 입력체크-----------------------------
		if(join.j_name.value==""){
			alert("이름을 입력해주세요.");
			join.j_name.focus();
			return false;
		}
		
		
		//이름 유효성 검사
		if(!(name_chk.test(join.j_name.value))){
			alert("국문 1자리 이상만 가능합니다.");
			join.j_name.value="";
			join.j_name.focus();
			return false
		}
		
		
		//나이 입력체크---------------------------
		if(join.age.value==""){
			alert("나이를 입력해주세요.");
			join.age.focus();
			return false;
		}
		
		//나이 유효성 검사
		if(!(age_chk.test(join.age.value))){
			alert("3자리 이하 숫자만 가능합니다.");
			join.age.value="";
			join.age.focus();
			return false
		}
		
//		return join.submit(); //form 의 action주소로 넘어간다.
	}