/**
 * 
 */
function move(obj,time){
	$(obj).animate({
		"left":"-350px",
		"top" :"0"
		
	},time);
}

function back(css){
	$(css).stop().animate({
		"left":"0",
		"top":"0"
	});
}

$(document).ready(function(){
	
});

