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
<script type="text/javascript">

	function date_chk2(val){
		var date1 = new Date();
		var date2 = new Date(val);
		if(date2.getTime()<date1.getTime()){
			alert("종료일은 오늘 날짜 이후 or 시작일 이후의 날짜를 선택해주세요.");
			inputform.end_day.value="";
		}
		
		
	}
</script>
<link href="css/admin_input.css" rel="stylesheet">
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
					<input type="text" name="title" id="txt_wr" style="border: 1px solid #ccc;" placeholder="제목을 입력하세요.">
                  </div>  
                </div>
               </div> 
             <div class="input_set">
                <div class="input_1">
                  <label class="input_label">이벤트내용</label>
                  <div class="just_cont">
                    <textarea id="txt_wr" name="content" cols="127" rows="10" maxlength="1000" placeholder="문의 내용을 입력해주세요"></textarea>
                    <div class="txt_wr_cnt">
                      <span>0</span>
                      <span>/1000자</span>
                    </div>
                  </div>  
                </div>
                
                <div class="input_1">
                  <label class="input_label">썸네일</label>
                      <input type="file" name="file1" >
                </div>
                
                <div class="input_1">
                  <label class="input_label">상세내용 이미지</label>
                      <input type="file" name="file2">
                </div>
                
                <div class="input_1">
                  <label class="input_label">이벤트 기간</label>
                  <div class="just_cont">
                  		<fmt:formatDate var="sys" value="${sysdate}" pattern="yyyy-MM-dd"/>
                     	시작일 <input type="date" name="start_day" value="${sys}"><br><br>
                     	종료일 <input type="date" name="end_day" onchange="date_chk2(this.value)">
                  </div>
                </div>
              
            </div>

              <div class="bttn_set">
                <button onclick="event_list.Ado">취소</button>
                <button type="submit">확인</button>
              </div>
              
            </form>
        </div>
      </section>
</body>
</html>