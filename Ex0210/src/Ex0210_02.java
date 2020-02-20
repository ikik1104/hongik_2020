import java.util.Scanner;

public class Ex0210_02 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int temp = 0;
		int ball_index = 0;
		int success = 0;// 똑같은 숫자가 있는지 확인하는 변수
		
		while(true) {
		System.out.println("숫자를 하나만 입력하세요 1~45");
		num = scan.nextInt();
		if(!(num>=1 || num <=45)) {
			System.out.println("번호가 잘못 입력되었습니다. 다시입력");
			continue;
			}
			break;
		}
		
		int[] ball = new int[45]; //45개의 배열생성
		for (int i = 0; i < ball.length; i++) { // 1~45까지의 숫자가 들어감
			ball[i] = i+1;
		}
		for (int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45); //0~44까지의 배열 index번호 생성
			
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
		}
		

		System.out.println("로또번호 ? ;");
		for (int i = 0; i <6; i++) {
			if(num == ball[i]) {
				success++;
			}
			System.out.print(ball[i]+" ");
		}
		
		System.out.println();
		if(success != 0) {
			System.out.println("당첨되었습니다. 당첨번호 :"+num);
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		/*
		System.out.println("숫자를 하나만 입력하세요 1~45");
		num = scan.nextInt();
		for (int i = 0; i <6; i++) {
			if(num == ball[i]) {
				System.out.println("축당첨");
			}else {
				System.out.println(i+1+"번째 숫자와 일치x");
			}
//			System.out.println(ball[i]+" ");
		}
		*/
		
		
	}
}
