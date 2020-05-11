<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn"%>
<jsp:useBean id="sysdate" class="java.util.Date"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

	function date_chk2(val){
		var date1 = new Date();
		var date2 = new Date(val);
		if(date2<date1.getTime()){
			alert("시작일 이후의 날짜를 선택해주세요.");
			inputform.end_day.value="";
		}
	}
	
	//썸네일 삭제------
	function del_img() {
		$("#file_img").css("display","none");
		$("#new_img").css("display","flex");
		$("input[name='del_chk']").val("y"); //삭제
		
	}
	//썸네일 되돌리기 ------	
	function back_img() {
		$("#new_img").css("display","none");
		$("#file_img").css("display","flex");
		$("input[name='del_chk']").val("n"); //삭제안함
	}
	
	//상세보기 이미지 삭제------
	function del_img() {
		$("#file_img2").css("display","none");
		$("#new_img2").css("display","flex");
		$("input[name='del_chk2']").val("y"); //삭제
		
	}
	//상세보기 되돌리기 ------	
	function back_img() {
		$("#new_img2").css("display","none");
		$("#file_img2").css("display","flex");
		$("input[name='del_chk2']").val("n"); //삭제안함
	}

	
</script>
<link href="css/admin_input.css" rel="stylesheet">
<link href="css/admin_event_updateForm.css" rel="stylesheet">
</head>
<body>
 <jsp:include page="admin_header.jsp"/>
  <section>
        <div class="container">
          <h1>이벤트 등록</h1>
            <form name="inputform" action="insert_event.Ado" method="Post" enctype="multipart/form-data">
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
                
<!-- 썸네일 이미지 수정 -->
                
                <c:if test="${not empty dto.file1}">
               	<div class="input_1" id="file_img">
                  <label class="input_label">현재 썸네일</label>
                      <img src="${pageContext.request.contextPath}/upload2/${dto.file1}" width="150px;" height="80px;">
                      <span>
                      <button type="button" onclick="del_img()">첨부 썸네일삭제</button>
                      </span>
                </div>
                </c:if>
                
                <c:if test="${empty dto.file1}">
                 <div class="input_1">
                  <label class="input_label">수정 썸네일</label>
                      <input type="file" name="file1_1"> <!-- 기존파일이 없고 수정이미지는 _1 -->
                </div>
                 </c:if>
                 
                
                <div class="input_1" id="new_img">
                  <label class="input_label">수정 썸네일</label>
                      <input type="file" name="file1" >
                       <button type="button" onclick="back_img()">기존첨부 이미지복구</button>
                </div>
                
                
<!-- 상세보기 이미지 수정  -->
                
                <c:if test="${not empty dto.file2}">
               	<div class="input_1" id="file_img2">
                  <label class="input_label">현재 내용이미지</label>
                      <img src="${pageContext.request.contextPath}/upload2/${dto.file2}" width="150px;" height="80px;">
                      <span>
                      <button type="button" onclick="del_img2()">첨부 썸네일삭제</button>
                      </span>
                </div>
                </c:if>
                
                <c:if test="${empty dto.file2}">
                 <div class="input_1">
                  <label class="input_label">수정 이미지</label>
                      <input type="file" name="file2_1"> <!-- 기존파일이 없고 수정이미지는 _1 -->
                </div>
                 </c:if>
                 
                
                <div class="input_1" id="new_img2">
                  <label class="input_label">수정 썸네일</label>
                      <input type="file" name="file2" >
                       <button type="button" onclick="back_img2()">기존첨부 이미지복구</button>
                </div>
                
                <div class="input_1">
                  <!-- 이미지 삭제 확인 -->
                  <input type="hidden" name="del_chk" value="n"> <!-- 초기 n : 삭제 안함 -->
                  <input type="hidden" name="del_chk2" value="n"> <!-- 초기 n : 삭제 안함 -->
				  
				  <!-- 기존 이미지 담아가기 -->
				  <input type="hidden" name="ori_file" value="${dto.file1}">
	              <input type="hidden" name="ori_file2" value="${dto.file2}">
	              
	              <input type="hidden" name="bid" value="${bdto.bid}">
                  <label class="input_label">이벤트 기간</label>
                  <div class="just_cont">
                     	시작일 <input type="date" name="start_day" value="${dto.start_day}"><br><br>
                     	종료일 <input type="date" name="end_day" onchange="date_chk2(this.value)" value="${dto.end_day}">
                  </div>
                </div>
              
            </div>
				<input type="hidden" name="num" value="${dto.num}">
				<input type="hidden" name="del_file1" > 
				<input type="hidden" name="del_file2" > 
              <div class="bttn_set">
                <button onclick="event_list.Ado">취소</button>
                <button type="submit">확인</button>
              </div>
              
            </form>
        </div>
      </section>
</body>
</html>