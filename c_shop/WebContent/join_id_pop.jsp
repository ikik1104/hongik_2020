<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-1.10.2.js"></script>
		<script type="text/javascript">
			function join_datainput(){
				var id_chk = /^[a-zA-Z][a-zA-Z0-9_]{3,16}$/;
			
				if(id_check.value==""){
					alert("아이디를 입력해주세요.");
					return false;
				}
				if(!(id_chk.test(id_check.value))){
					alert("4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.(첫 글자는 영문)");
					id_check.value="";
					id_check.focus();
					return false;
				}
				
				pop.submit();
				
			}
			
			function pop_close(){
				if(pop.chk.value=="y"){
				opener.document.getElementById("j_id").value = document.getElementById("id_check").value;
				window.close();
				}else{
					alert("중복체크를 해주세요.");
					return false;
				}
			}
			
			function id_change(){
				pop.chk.value="n";
				$("#ch_text").text("");
			}
			
			
		</script>
	</head>
	<body>
		<form action="idChk.Mdo" name="pop" method="get">
			<h1>아이디 중복 확인</h1>
			<p>
			4~16자리의 영문, 숫자, 특수기호(_)만 사용하실 수 있습니다.<br>
			첫 글자는 영문으로 입력해 주세요.
			</p>
			<label>아이디 </label>
			<input type="text" name="id_check" id="id_check" value="${id}" onchange="id_change()">
			<input type="hidden" name="chk" value="${chk}">
			<input type="button" value="중복확인" onclick="join_datainput()"><br>
			<p id="ch_text"> ${msg} </p>
			<br>
			<input type="button" onclick="pop_close()" value="확인">
		</form>
	</body>
</html>