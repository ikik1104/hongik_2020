<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		function chk(){
			
			if(form.hak_num.value==""){
				alert("학번을 입력해주세요.");
				form.hak_num.focus();
				return false;
			}
			
			if(form.name.value==""){
				alert("학번을 입력해주세요.");
				form.name.focus();
				return false;
			}
			if(form.kor.value==""){
				alert("국어점수를 입력해주세요.");
				form.kor.focus();
				return false;
			}
			if(form.eng.value==""){
				alert("영어 점수을 입력해주세요.");
				form.eng.focus();
				return false;
			}
			if(form.math.value==""){
				alert("수학점수을 입력해주세요.");
				form.math.focus();
				return false;
			}
			
			form.submit();
			
		}

</script>
</head>
<body>
	<h1>학생 정보 입력</h1>
	<form name="form" action="ex0403_05.jsp" method="get">
		<label>학번  : <input type="text" name="hak_num"></label><br>
		<label>이름  : <input type="text" name="name"></label><br>
		<label>국어  : <input type="text" name="kor"></label><br>
		<label>영어  : <input type="text" name="eng"></label><br>
		<label>수학  : <input type="text" name="math"></label><br>
		<input type="submit" value="저장">
<!-- 		<button type="submit">저장</button> -->
	</form>
</body>
</html>