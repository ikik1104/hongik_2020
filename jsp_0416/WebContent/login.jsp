<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
	<head>
		<meta charset="UTF-8">
		<link type="stylesheet" >
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="css/admin_login.css">
	</head>
	<body>
		<form action="Login_Ok" method="post" name="form">
		<section>
			<h1>admin Login</h1>
			<div>
				<h1><span>LMS Start Up</span> System</h1>
				<div id="login_div">
					<ul>
						<li id="img_div"></li>
						<li id="input_div">
							<label><input type="text" name="id" maxlength="20"></label><br>
							<label><input type="password" name="pw" maxlength="20"></label><br>
							<select name="">
								<option>권한선택[Select]</option>
								<option>직원[Employe]</option>
								<option>강사[Teacher]</option>
							</select>
						</li>
						<li id="btn_div">
							<button type="submit">Login</button>
						</li>
					
					</ul>
				</div>
				<p>상기 LMS의 모든 저작권은 아이티맵에게 있습니다.<br>
				프로그앰 밒 디자인 <span>무단사용 및 도용, 불법 COPY는 법적처벌</span>을 받을 수 있습니다.
				문의(070-7699-9591)
				</p>
			</div>
		</section>
		</form>
	</body>
</html>