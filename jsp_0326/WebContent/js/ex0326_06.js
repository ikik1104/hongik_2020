

$(document).ready(function(){
	$(".data").hide();
	
	
	
	$("input[name=chk]").click(function(){
		var val = $(this).val();
		if($(this).is(":checked")){
			$("#"+val).attr("display","block");
		}else{
			$("#"+val).attr("display","none");
		}
	});
	
	
	
	
});

