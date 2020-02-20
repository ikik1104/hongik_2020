import java.util.Scanner;

public class Ex0207_01 {
	//나이계산 + 성별측정 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//태어난 월을 확인해서
		//12월, 1월, 2월 -> 겨울에 태어났군요.
		//3,4,5 - 봄에 태어났군요
		//6,7,8 - 여름에 태어났군요
		// 9,10,11 -> 가을에 태어났군요
		//스위치문
	
		String jumin = "";
		int jumin2 = 0; 
		
		while(true) {
		System.out.println("주민번호를 입력하세여");
		jumin = scan.next();
		jumin2 = Integer.parseInt(jumin.substring(2,4));
		
		if(!(jumin.length()==14)||!(jumin.charAt(6)=='-')) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		
		/*
		System.out.println(jumin2+"월에 태어났군요");
		switch (Integer.parseInt(jumin.substring(2,4))) {
		case 12: case 1: case 2:
			System.out.println("겨울에 태어났군요.");
			break;
		case 3: case 4: case 5:
			System.out.println("봄에 태어났군요.");
			break;
		
		case 6: case 7: case 8:
			System.out.println("여름에 태어났군요.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을에 태어났군요.");
			break;
		}
		
		*/
		
		
		if(jumin2 == 12 ||jumin2 == 1 || jumin2 == 2 ) {
			System.out.println("겨울에 태어났군요.");
		}else if(jumin2 == 3 ||jumin2 == 4 || jumin2 == 5) {
			System.out.println("봄에 태어났군요.");
		}else if(jumin2 == 6 ||jumin2 == 7 || jumin2 == 8){
			System.out.println("여름에 태어났군요.");
		}else if(jumin2 == 9 ||jumin2 == 10 || jumin2 == 11){
			System.out.println("가을에 태어났군요.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("-----------------------------------");
		
		}//while
		
		
		/*
		//string 메소드 : subString , charAt, Integer.parseInt
		//1개를 입력해서 0인지 아닌지 판단하는 프로그램을 만들어 봅시다.
		 //주민번호가 880101-1101111 남자인지 아닌지를 판단
		//나이계산을 해보세요.
		 * 
		String jumin = "";
		int age = 0;
		
		while(true) {
		System.out.print("주민번호를 입력하세요. ( - 포함 ) >>  ");
		jumin = scan.next();
		age = Integer.parseInt(jumin.substring(0,2)); 

		//나이측정
		if(jumin.charAt(7)=='3' || jumin.charAt(7)=='4') {
			System.out.println("나이는 : "+(20-age+1)+"살 입니다."); //2000년대 이후 나이계산식
		}
		if(jumin.charAt(7)=='1' || jumin.charAt(7)=='2') {
			System.out.println("나이는 : "+(100-age+20+1)+"살 입니다."); //1900년대 나이 계산식
		}
		
		//성별측정
		if(!(jumin.length()==14)) {
			System.out.println("잘못된 입력입니다.");
			continue;
		}else if(jumin.charAt(7)== '1' || jumin.charAt(7)== '3') {
			System.out.println("남성입니다.");
		}else if(jumin.charAt(7)== '2' || jumin.charAt(7)== '4'){
			System.out.println("여성입니다.");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("--------------------------------------");
		
	  } //while

		 */
		

} //main
 } //class
