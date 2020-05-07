<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>cj cookit 마크업</title>
    <link href="css/style.css" rel="stylesheet">
    <link href="css/style_input.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700&display=swap" rel="stylesheet">    
  </head>
  <body>
    <div class="wrap">
      <!-- 헤드영역 -->
      <!-- 헤더 -->
<jsp:include page="header.jsp"/>
      <!-- 본문영역 -->
      <section>
        <div class="container">
          <h1>이벤트 등록</h1>
          
            <form name="inputform" action="update_event.Edo" method="Post" enctype="multipart/form-data">
            
            <div class="input_set">
                <div class="input_1">
                  <label class="input_label">제목</label>
                  <div class="just_cont">
					<input type="text" name="title" id="txt_wr" style="border: 1px solid #ccc;" value="${dto.title}">
                  </div>  
                </div>
               </div> 
             <div class="input_set">
                <div class="input_1">
                  <label class="input_label">이벤트내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="content" cols="127" rows="10" maxlength="1000">${dto.content}</textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
                <div class="input_1">
                  <label class="input_label">썸네일</label>
                  <label>기존 썸네일</label>
                  <img src="upload/${dto.file1}" style="width:100px; height:50px; float: right;">
                     <input type="file" name="file1" value="${dto.file1}">
                </div>
                <div class="input_1">
                  <label class="input_label">기존 상세내용 이미지</label>
                  	<img src="upload/${dto.file2}" style="width:100px; height:50px;">
                </div>
                <div class="input_1">
                  <label class="input_label">상세내용 이미지</label>
                      <input type="file" name="file2" value="${dto.file2}">
                </div>
                
                <div class="input_1">
                  <label class="input_label">이벤트 기간</label>
                  <div class="just_cont">
                     	시작일 <input type="date" name="start_day" value="${dto.start_day}"><br><br>
                     	종료일 <input type="date" name="end_day" value="${dto.end_day}">
                  </div>
                </div>
              
            </div>

              <div class="bttn_set">
                <button onclick="index.Edo">취소</button>
                <button type="submit">확인</button>
              </div>
              
            </form>
        </div>
      </section>
      <!-- float btn -->
      <section>
        <div class="float_btn"></div>
      </section>
      
      <!-- 푸터 -->
      <jsp:include page="footer.jsp"/>
    </div>
  </body>
</html>