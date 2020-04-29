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
      <!-- 본문영역 -->
      <section>
        <div class="container">
          <h1>게시글 등록</h1>
          
            <form name="form" action="insert.do" method="post">
            
             <div class="input_set">
             	<div class="input_1">
                  <label class="input_label">제목</label>
                  <div class="just_cont">
                    <input type="text" name="btitle" style="width: 100%; height: 40px;" maxlength="20" required placeholder="제목을 입력해주세요." autofocus>
                  </div>  
                </div>
                
                <div class="input_set">
             	<div class="input_1">
                  <label class="input_label">작성자</label>
                  <div class="just_cont">
                    <input type="text" name="bname" style="width: 100%; height: 40px;" maxlength="10" required placeholder="작성자를 입력헤주세요.">
                  </div>  
                </div>
                
             
                <div class="input_1">
                  <label class="input_label">내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="bcontent" cols="127" rows="10" required maxlength="1000" placeholder="문의 내용을 입력해주세요"></textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
            </div>
            </div>

              <div class="bttn_set">
                <button type="button" onclick="location.href='list.do'" >취소</button>
                <button type="submit">확인</button>
              </div>
              
            </form>
        </div>
      </section>
    </div>
  </body>
</html>