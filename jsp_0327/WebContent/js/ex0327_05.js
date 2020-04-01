/**
 * 
 */
$(document).ready(function(){
	
	$(window).scroll(function(){
		var sc = $(this).scrollTop();
		$("p").eq(0).text("스크롤 높이 : "+sc);
	});
	
	$(window).mousemove(function(e){ //e를 넘겨주면 마우스 위치의 값을 function에 넣는다
		var x = e.pageX;
		var y = e.pageY;
		$("p").eq(1).text("x좌표"+x);
		$("p").eq(2).text("y좌표"+y);
	});
	
	var xWidth = 0;
	var xHeight = 0;
	$("#btn01").click(function(){
		xWidth = $("div").eq(1).width()-10;
		$("div").eq(1).width(xWidth);
		$("#div02 p").eq(1).width("넓이 : "+xWidth);
		
		xHeight = $("div").eq(1).height()-10;
		$("div").eq(1).height(xHeight);
		
	});
	
	
	
	
});