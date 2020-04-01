/**
 * 
 */

$(document).ready(function() {
	$("li").mouseenter(function(){
		$(this).css("background", "black");
		$(this).css("color", "white");
		$("p").text($(this).text()+"을 선택하셨습니다.");
	});
	
	$("li").mouseleave(function(){
		$(this).css("background", "white");
		$(this).css("color", "#efefef");
		$("p").text("");
	});
	
});