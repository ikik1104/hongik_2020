<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>다음 주소록</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    new daum.Postcode({
        oncomplete: function(data) {
            jQuery("#postcode").val(data.post1);
            jQuery("#address").val(data.post1);
            jQuery("#address2").focus()
        }
    }).open();
</script>
</head>
<body>
	<form action="koin_ok.jsp" method="post" name="join">
		<input type="text" id="postcode" placeholder="우편번호">
		<input type="button" value="우편번호 찾기"><br>
		<input type="text" id="address" placeholder="주소"><br>
		<input type="text" id="address2" placeholder="상세주소">
	</form>
</body>
</html>