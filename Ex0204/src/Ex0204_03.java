import java.util.Scanner;

public class Ex0204_03 {

	public static void main(String[] args) {
		//do while은 한번이라도 실행 / while은 조건이 맞아야 시작됌
		/*
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		*/
		
		
		
		/*
		//1~100까지 2의 배수만 총 더한갑
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		
		/*
		int i;
		int j;
		for (i = 2; i <=9; i++) {
			System.out.println("["+i+"단 출력  ]");
			for (j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		/*
		int i;
		int j;
		for (i = 1; i <=9; i++) {
			
			for (j = 2; j <=9; j++) {
				System.out.printf("%d*%2d= %2d    ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		/*
		int i;
		int j;
		for (i = 1; i <=9; i++) {
			
			for (j = 2; j <=5; j++) {
				System.out.printf("%d*%2d= %2d    ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		//****열개만 찍어보기 가 10 세 10
		/*
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.printf("*");
			}
			System.out.println("*");
				
			}
		*/
		/*
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.printf("*");
			}
			System.out.println("*");
		}
		*/
		
		
		//반대로 별찍기
		/*
		for (int i = 10; i > 1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.printf("*");
			}
			System.out.println("*");
		}
		*/
		
		/*
		for (int i = 0; i <=3 ; i++) {
			for (int j = 1; j <=3; j++) {
				for (int k = 1; k <=3; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
		*/
		
		/*
		int i = 10;
		while (i>=0) {
			System.out.println(i--);
		}
		*/
		
		
		/*
		for (int j = 10; j>=0; j--) {
			System.out.println(j);
		}
		*/
		
		/*
//		1~100 난수를
		int input_num = 0; // 입력한 숫자
		int input_num2 = 0;
		int check = (int)(Math.random()*10)+1;
		
		Scanner scan = new Scanner(System.in);
		
		int count = 1;
		
		while (count<=4) {
			System.out.println("1-100까지 숫자를 입력하세요.");
			input_num = scan.nextInt();
			if(check == input_num) {
				System.out.printf("당첨입니다.  당첨번호 :%d", check);
				
				
				
				break;
			}else {
				System.out.println("당첨되지 않았습니다. 다시 도전하세요.");
			
			}
			System.out.println("종료하시겠습니까? 종료하시려면 x를 누르세요.");
			String aa = scan.next();
//			char out = aa.charAt(0);
//			if(out == 'x' || out == 'X'){
			if(aa.equalsIgnoreCase("x")) {
				System.out.println("종료되었습니다.");
				break;
			}else {
				count++;
			}
		}
		*/
		
//		1~100 난수를 //위에 내용을 입력했던 숫자들 뽑아내기
		int input_num = 0; // 입력한 숫자
		int count = 1; // 총 4번동안 체크히는 변수
		String aa = " "; //종료할때 확인 문자열
		String save ="";// 입력한 숫자를 저장하는 문자열
		int check = (int)(Math.random()*10)+1; //랜덤숫자
		
		Scanner scan = new Scanner(System.in); //객체선언
		
		
		while (count<=4) { //4번까지 반복문
			System.out.println("1-100까지 숫자를 입력하세요.");
			input_num = scan.nextInt(); 
			save= save+input_num+" "; //저장하는 문자열
			
			if(check == input_num) {
				System.out.println("당첨입니다.");
				break;
			}else {
				System.out.println("당첨되지 않았습니다. 다시 도전하세요.");
			}
			
			//프로그램 종료 확인
			System.out.println("종료하시겠습니까? 종료하시려면 x를 누르세요.");
			aa = scan.next(); //문자열 받기 ( 종료를 위한) 
			if(aa.equalsIgnoreCase("x")) { //대소문자 구분없이 문자 x가 들어오면
				System.out.println("종료되었습니다."); 
				break; //종료한다.
			}
				count++; //횟수를 증가한다.
		}
		System.out.printf("랜덤번호 %d 입력번호: %s  %n",check,save);
		
		
		
		/*
		if(check == input_num) {
			System.out.printf("당첨입니다.  당첨번호 :%d", check);
		}else {

			System.out.println("1-100까지 숫자를 입력하세요.");
			input_num2 = scan.nextInt();
			
			if(check == input_num2) {
				System.out.printf("당첨입니다.  당첨번호 :%d, 입력번호 %d, %d %n", check,input_num, input_num2);
			}else {
				System.out.printf("당첨되지않았습니다.  당첨번호 :%d, 입력번호 %d,%d %n", check, input_num, input_num2);
			}
		}
		System.out.println("시스템이 종료되었습니다.");
		*/
		
		
		}
}
