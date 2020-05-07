<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet">
<link href="css/style_input.css" rel="stylesheet">
</head>
<body>
 <section>
        <div class="container">
          <h1>공지사항 수정</h1>
          
            <form name="inputform" action="update.do" method="post">
            <div class="input_set">
                <div class="input_1">
                  <label class="input_label">작성자</label>
                  <div class="just_cont">
                    <input type="text" name="bname"  value="${dto.bname}" style="border: 1px solid #dddddd;height: 50px;width: 200px;">
                  </div>  
                </div>
             </div>  
               <div class="input_set">
                <div class="input_1">
                  <label class="input_label">제목</label>
                  <div class="just_cont">
                    <div class="just_cont">
                    	<input type="text" name="btitle" value="${dto.btitle}"  style="border: 1px solid #dddddd;height: 50px;width: 700px;">
                  	</div>
                  </div>  
                </div>
               </div> 
             <div class="input_set">
                <div class="input_1">
                  <label class="input_label">내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="bcontent" cols="127" rows="10" maxlength="1000" placeholder="내용을 입력해주세요">
                    ${dto.bcontent}
                    </textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
                
                <div class="input_1">
                  <label class="input_label">첨부파일</label>
                  <div class="just_cont">
                    <div class="file_frame">
                      <span class="temp"></span>
                      <input type="file" name="attch_file" id="attch_file">
                    </div>
                    <ul class="file_noti">
                      <li>최대 5장 등록 (PNG, JPEG, JPG, GIF 포맷)</li>
                    </ul>
                    <span class="temp2">
                      <span><strong>0</strong></span>/30MB
                    </span>
                  </div>
                </div>
            </div>

              <div class="bttn_set">
                <button type="button" onclick="location.href='list.do'">취소</button>
                <button type="submit">확인</button>
              </div>
              
            </form>
        </div>
      </section>
</body>
</html>