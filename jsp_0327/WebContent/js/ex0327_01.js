/**
 * 
 */
$(document).ready(function(){
	//btn을 클릭했을 때
	$("#btn01").click(function(){
		$("img").css("border", "2px dashed black");
		$("img").attr({"alt":"도시이미지","src":"images/img01.jpg"});
		$("p").text("도시이미지입니다.");
		//attr  : 이미지 속성값을 바꾼다.
	});
	
	$("#btn02").click(function(){
		$("img").css("border","2px solid red");
		$("img").attr({"alt":"벚꽃이미지","src":"images/img02.jpg"});
		$("p").text("벚꽃 이미지입니다.");
	});
	
	
});