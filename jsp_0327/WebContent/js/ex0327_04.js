/**
 * 
 */
$(document).ready(function(){
	
	
	$("#btn01").click(function(){
		$("ul li").toggleClass("on");
		$("p").text("밑줄이 들어갔습니다.");
		$("#img01").fadeToggle();
	});
	
	
	
	$("ul li").mouseenter(function(){
		$(this).addClass("on");
		$("p").text("밑줄이 들어갔습니다.");
	});
	
	$("ul li").mouseleave(function(){
		$("ul li").removeClass("on");
		$("p").text("밑줄이 사라졌습니다.");
	});
	
});