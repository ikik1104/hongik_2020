<%@page import="com.javalec.ex.Student2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="stu" class="com.javalec.ex.Student2" scope="page" /> 
<jsp:useBean id="stu2" class="com.javalec.ex.Student2" scope="page"/>
<jsp:useBean id="stu3" class="com.javalec.ex.Student2" scope="page"></jsp:useBean>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:setProperty  name="stu" property="s_num" value="1"/>
<jsp:setProperty  name="stu" property="s_name" value="홍길동"/>
<jsp:setProperty  name="stu" property="s_age" value="20"/>
<jsp:setProperty  name="stu" property="s_grade" value="1"/>

<h2>학생 입력 정보</h2>
학번 : <jsp:getProperty property="s_num" name="stu"/><br>
이름 : <jsp:getProperty property="s_name" name="stu"/><br>
나이 : <jsp:getProperty property="s_age" name="stu"/><br>
학년 : <jsp:getProperty property="s_grade" name="stu"/><br>
---------------------------------------------------------<br>
<!-- 2 김유신 21 2 / 3 강감찬 22 3 -->
<jsp:setProperty property="s_num" value="2" name="stu2"/>
<jsp:setProperty property="s_name" value="김유신" name="stu2"/>
<jsp:setProperty property="s_age" value="21" name="stu2"/>
<jsp:setProperty property="s_grade" value="2" name="stu2"/>

학번 : <jsp:getProperty property="s_num" name="stu2"/><br>
이름 : <jsp:getProperty property="s_name" name="stu2"/><br>
나이 : <jsp:getProperty property="s_age" name="stu2"/><br>
학년 : <jsp:getProperty property="s_grade" name="stu2"/><br>
----------------------------------------------------------<br>
<jsp:setProperty property="s_num" value="3" name="stu3"/>
<jsp:setProperty property="s_name" value="강감찬" name="stu3"/>
<jsp:setProperty property="s_age" value="22" name="stu3"/>
<jsp:setProperty property="s_grade" value="3" name="stu3"/>

학번 : <jsp:getProperty property="s_num" name="stu3"/><br>
이름 : <jsp:getProperty property="s_name" name="stu3"/><br>
나이 : <jsp:getProperty property="s_age" name="stu3"/><br>
학년 : <jsp:getProperty property="s_grade" name="stu3"/><br>




</body>
</html>