<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
	function chk(){
		
		var start = document.getElementById("start");
		var end = document.getElementById("end");
		
		var num_chk = /^[0-9]{1,}$/;
		
		if(start.value=="" ||  end.value==""){
			alert("데이터를 입력해주세요.");
			return false;
		}
		
		if(!(num_chk.test(start.value)) || !(num_chk.test(end.value))){
			alert("숫자만 입력하세요.");
			start.value="";
			end.value="";
			start.focus();
			return false;
		}
		
		//문자를 숫자로 변경
		var start1 = parseInt(start.value);
		var end1 = parseInt(end.value);
		
		if(start1>end1){
			alert("시작 값이 끝 값보다 커야 합니다.");
			start.value="";
			end.value="";
			start.focus();
			return false;
		}
		
		form.submit();
		
	}

</script>
</head>
<body>
	<form name="form" action="ex0403_04_form.jsp" method="get">
		<h4>범위</h4>
		<label>시작<input type="text" name="start" id="start"></label><br>
		<label>끝<input type="text" name="end" id="end"></label><br>
		<input type="button" onclick="chk()" value="계산">
	</form>
</body>
</html>


