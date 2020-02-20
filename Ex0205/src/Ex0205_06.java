import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		//숫자 5개를 연속으로 받는다.
		//랜덤수를 구해서 (5자리 같은자리 숫자 비교
		
		Scanner scan = new Scanner(System.in);
		/*
		
		int num = 0;
		String num2 = "";
		String ran = "";
		int count = 0;

		while(true) {
			System.out.println("숫자 맞추기 프로그램");
			System.out.println("1~9 숫자 5개를 연속으로 입력해주세요. (종료 : 0)");
			num = scan.nextInt();
			
			if(num == 0) {
				break;
			}
			num2 = num+"";
			for (int i = 1; i <=5; i++) {
				ran += (int)(Math.random()*9)+1; //1~9까지의 숫자를 뽑는다.
			}
			
			for (int i = 0; i <=4; i++) {
				if(num2.charAt(i)==ran.charAt(i)) {
					count++;
			}
			
			switch (count) {
			case 1:
				System.out.println("뽑은 수 :"+num2);
				System.out.println("랜덤 수 :"+ran);
				System.out.println(count+"개 일치 ***축하합니다 1만원 당첨 *****");
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.println("뽑은 수 :"+num2);
				System.out.println("랜덤 수 :"+ran);
				System.out.println(count+"개 일치 ***축하합니다 10만원 당첨 *****");
				System.out.println("------------------------------------");
				break;
			case 3:
				System.out.println("뽑은 수 :"+num2);
				System.out.println("랜덤 수 :"+ran);
				System.out.println(count+"개 일치 ***축하합니다 100만원 당첨 *****");
				System.out.println("------------------------------------");
				break;
			}
		}
		System.out.println("시스템을 종료합니다.");

	*/
		
		
		/*---------------------------------------------------------------------------------선생님 코드
		int count = 0; //맞는 개수를 체크
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		int num4 = (int)(Math.random()*10);
		int num5 = (int)(Math.random()*10);
		
		//입력값
		
		System.out.println("5자리 숫자를 입력하세요.");
		String input = scan.nextLine();
		
		//input.chatAt(0);
		if(num1==(input.charAt(0)-'0')) {
			count++;
		}
		if(num2==(input.charAt(1)-'0')) {
			count++;
		}
		if(num3==(input.charAt(2)-'0')) {
			count++;
		}
		if(num4==(input.charAt(3)-'0')) {
			count++;
		}
		if(num5==(input.charAt(4)-'0')) {
			count++;
		}
		
		System.out.println("랜덤수 :"+ num1+num2+num3+num4+num5);
		System.out.println("입력수 :"+ input);
		System.out.println("같은수 입력:"+count);
		
		switch (count) {
		case 0:
			System.out.println("상금 : 0 원");
			break;
		case 1:
			System.out.println("상금 : 1 만원");
			break;
		case 2:
			System.out.println("상금 : 10 만원");
			break;
		case 3:
			System.out.println("상금 : 100 만원");
			break;
		}
		
		*/
	}
}
