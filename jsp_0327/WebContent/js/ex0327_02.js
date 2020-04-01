/**
 * 
 */
$(document).ready(function(){
	
	$("img").hide();
	
	//btn을 클릭했을 때
	$("div").click(function(){
		$("p").text("div를 클릭했습니다.");
	});
	$("div").mouseenter(function(){
		$("p").text("div에 마우스가 올라갔습니다.");
//		$(this).css({"background":"#efefef"});
		$(this).css({"border-bottom":"5px solid red"});
//		$("img").stop().fadeIn(2000);
	});
	
	$("div").mouseleave(function(){
		$("p").text("div에 마우스가 빠져나갔습니다.");
//		$(this).css({"background":"gray"});
		$(this).css({"border-bottom":"1px solid black"});
//		$("img").stop().fadeOut(2000);
	});
	
	$(window).scroll(function(){
		var scrollNum = $(this).scrollTop();
		
		if(scrollNum<300){
			$("div").css({"background": "url('images/img01.jpg') no-repeat"});
		}else if(scrollNum>300 && scrollNum<600){
			$("div").css({"background": "url('images/img02.jpg') no-repeat"});
		}else if(scrollNum>600 && scrollNum<900){
			$("div").css({"background": "url('images/img03.jpg') no-repeat"});
		}else if(900<scrollNum){
			$("div").css({"background": "url('images/img04.jpg') no-repeat"});
		}
		$("p").text("화면이 "+scrollNum+"만큼 스크롤 되었습니다.");
		$("div").css({"position":"fixed"});
	});
	
	$(window).resize(function(){
		$("p").text("화면이 리사이즈 되었습니다.");
		$("div").css({"position":"fixed"});
	});
	
});