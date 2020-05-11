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
<link href="css/style.css" rel="stylesheet">
    <link href="css/style_input.css" rel="stylesheet">
</head>
<body>
 <jsp:include page="admin_header.jsp"/>
  <section>
        <div class="container">
          <h1>공지사항 등록</h1>
          
            <form name="inputform" action="no_insert.Ado" method="Post" enctype="multipart/form-data">
            
            <div class="input_set">
                <div class="input_1">
                  <label class="input_label">제목</label>
                  <div class="just_cont">
					<input type="text" name="btitle" id="txt_wr" style="border: none;" placeholder="제목을 입력하세요." autofocus	>
                  </div>  
                </div>
                <div class="input_1">
                  <label class="input_label">작성자</label>
                  <div class="just_cont">
					<input type="text" name="bname" id="txt_wr" style="border: none;" placeholder="작성자를 입력하세요.">
                  </div>  
                </div>
               </div> 
             <div class="input_set">
                <div class="input_1">
                  <label class="input_label">공지사항 내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="bcontent" cols="127" rows="10" maxlength="1000" placeholder="문의 내용을 입력해주세요"></textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
                
                <div class="input_1">
                  <label class="input_label">상세내용 이미지</label>
                      <input type="file" name="file">
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
</body>
</html>