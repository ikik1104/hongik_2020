/**
 * 
 */

var n=0;
$(document).ready(function(){
	
	$("div.out").click(function(){
		$("p:first").text("마우스가 클릭됨");
		$("p:last").text(++n);
		if(n>=10){
			n=0;
		}
	});
	
	$("div.out").mouseleave(function(){
		$("p:first").text("마우스 빠져나감");
		$("p:last").text("최종 회수 :"+n);
	});

	$("div.out").mousedown(function(){
		$("p:first").hide();
		$("p:last").text("이벤트 글자가 사라짐");
	});
	
	$("div.out").mouseup(function(){
		$("p:first").show();
		$("p:last").text("이벤트 글자가 나타남");
	});
	
	
	$("img").mouseenter(function() {
		$("#img_p").text("이미지 위로 마우스가 올라갔습니다.");
	});
	
	$("img").mouseleave(function() {
		$("#img_p").text("마우스가 이미지 위에서 벗어났습니다.");
	});
});



/*
$(document).ready(function(){
	$(".ans").hide();
	
	$("#q1").mousedown(function() {
		$("#a1").show();
	});
	$("#q1").mouseup(function() {
		$("#a1").hide();
	});
	
	$("#q2").mouseenter(function(){
		$("#a2").show();
	});

	$("#q2").mouseleave(function(){
		$("#a2").hide();
	});
});

*/