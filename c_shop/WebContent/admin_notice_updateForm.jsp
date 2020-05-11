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
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

 		function del_img() {
			$("#file_img").css("display","none");
			$("#new_img").css("display","flex");
			$("input[name='del_chk']").val("y"); //삭제
			
		}
 		
		function back_img() {
			$("#new_img").css("display","none");
			$("#file_img").css("display","flex");
			$("input[name='del_chk']").val("n"); //삭제안함
		}

</script>
<link href="css/style.css" rel="stylesheet">
    <link href="css/style_input.css" rel="stylesheet">
    <link href="css/admin_notice_updateForm.css" rel="stylesheet">
</head>
<body>
 <jsp:include page="admin_header.jsp"/>
  <section>
        <div class="container">
          <h1>공지사항 수정</h1>
          
            <form name="inputform" action="notice_update.Ado" method="Post" enctype="multipart/form-data">
            
            <div class="input_set">
                <div class="input_1">
                  <label class="input_label">제목</label>
                  <div class="just_cont">
					<input type="text" name="btitle" id="txt_wr" style="border: none;" value="${bdto.btitle}" autofocus	>
                  </div>  
                </div>
                <div class="input_1">
                  <label class="input_label">작성자</label>
                  <div class="just_cont">
					<input type="text" name="bname" id="txt_wr" style="border: none;" value="${bdto.bname}">
                  </div>  
                </div>
               </div> 
             <div class="input_set">
                <div class="input_1">
                  <label class="input_label">공지사항 내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="bcontent" cols="127" rows="10" maxlength="1000">${bdto.bcontent}</textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
                
               	<c:if test="${not empty bdto.bfile}">
               	<div class="input_1" id="file_img">
                  <label class="input_label">현재 첨부된 이미지</label>
                      <img src="${pageContext.request.contextPath}/upload2/${bdto.bfile}" width="150px;" height="80px;">
                      <span>
                      aaa.png
                      <button type="button" onclick="del_img()">첨부 이미지삭제</button>
                      </span>
                </div>
                </c:if>
                
                 <c:if test="${empty bdto.bfile}">
                 <div class="input_1">
                  <label class="input_label">수정 이미지</label>
                      <input type="file" name="file1">
                </div>
                 </c:if>
                 
		<!--    첨부된 이미지 삭제시 나오는 div -->
                <div class="input_1" id="new_img">
                  <label class="input_label">수정 이미지</label>
                      <input type="file" name="file2">
                       <button type="button" onclick="back_img()">기존첨부 이미지복구</button>
                </div>
              
            </div>
              <input type="hidden" name="del_chk" value="n"> <!-- 초기 n : 삭제 안함 -->
			  <input type="hidden" name="ori_file" value="${bdto.bfile}">
              <input type="hidden" name="bid" value="${bdto.bid}">
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