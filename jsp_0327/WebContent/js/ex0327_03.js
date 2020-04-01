/**
 * 
 */
$(document).ready(function(){
	$("div").click(function(){
		$("div").width(200);//클릭하는 순간 width를 200px으로
		$("div").height(200);
		$("p").text("div넓이가 변경되었습니다.");
	});
	
	$("#d02").click(function(){
		var w1 = $("#d02").width();
		$("#d01").height(w1);
	});
	
	
});