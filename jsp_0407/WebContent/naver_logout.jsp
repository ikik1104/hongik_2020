<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//현재 저장된 쿠키 정보 삭제 후 페이지 이동
	Cookie[] coo =  request.getCookies();
	for(int i=0;i<coo.length;i++){
		String chk = coo[i].getName();
		if(chk.equals("naver_user")){
			coo[i].setMaxAge(0);
			response.addCookie(coo[i]);
		}
		if(chk.equals("nick_name")){
			coo[i].setMaxAge(0);
			response.addCookie(coo[i]);
		}
	}
	response.sendRedirect("naver_index1.jsp");
%>
</body>
</html>