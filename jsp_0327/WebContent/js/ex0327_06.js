/**
 * 
 */
$(document).ready(function(){
	
//	$("img").mouseenter(function(){
//		$("img").stop().animate({
//			"width": "100px"
//		});
//	});
//	
//	
//	$("img").mouseleave(function(){
//		$("img").stop().animate({
//			"width": "600px"
//		});
//	});
//	
	
	$("#d01").mouseenter(function(){
		$("#d01").stop().animate({
				"border-radius": "150px",
					"background-color":"#efefef"
				}).css({
					"border": "1px solid green",
					});
	});
	$("#btn02").click(function(){
		$("img").stop().fadeTo("fast",0.2);
	});
	$("#btn03").click(function(){
		$("img").stop().animate({
			"top" : "300px",
			"width" : "200px"
			});
	});
	
});