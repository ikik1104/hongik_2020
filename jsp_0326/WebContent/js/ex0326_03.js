/**
 * 
 */
$(document).ready(function(){ //document가 HTML을 다 읽고나서 실행해라 ready
								// 이렇게 안하면 위에서 선언하면 아래칭구들을 못데려온다.			
	
		//리스트를 클릭하면 색상이 변경되도록
		$("li").click(function(){
			$(this).css("color", "red"); //현재 클릭된 li색상을 바뀐ㄷ
		});
		// 이렇게 사용할 수도 있다. {"color":"red"}
		
	
		//-----------------------------------------------
	
		//코로나 글 삭제
		$("#btn01").click(function(){
			$("p").hide();
		});

		//코로나 글 생성
		$("#btn02").click(function(){
			$("p").show();
		});

		//이미지 삭제
		$("#btn03").click(function(){
			$("img").hide();
		});
		
		//이미지 생성
		$("#btn04").click(function() {
			$("img").show();
		});
	
	
	
});

