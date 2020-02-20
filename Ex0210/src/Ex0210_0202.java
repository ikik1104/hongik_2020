import java.util.Scanner;

public class Ex0210_0202 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[6]; //로또 입력번호
		int temp = 0;
		int ball_index = 0;
		int[] win_num = new int[6]; //당첨번호
		int success = 0;// 똑같은 숫자가 있는지 확인하는 변수
		
		while(true) {
		
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"번째 숫자를 하나만 입력하세요 1~45");
			num[i] = scan.nextInt();
			if(!(num[i]>=1 && num[i] <=45)) {
				System.out.println("번호가 잘못 입력되었습니다. 다시입력");
				i--;
				continue;
				}
			}
		break;
		}
		

		int[] ball = new int[45]; //45개의 배열생성
		
		for (int i = 0; i < ball.length; i++) { // 1~45까지의 숫자가 들어감
			ball[i] = i+1;
		}
		
		//자리교환
		for (int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45); //0~44까지의 배열 index번호 생성
			
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
		}
		

		
			for (int j = 0; j < num.length; j++) {
				for (int i = 0; i <6; i++) {
					 if(num[j]==ball[i]) {
						 success++;
						 win_num[j] = num[j];
				}
			}
		}
		
		
		System.out.println("로또번호 ?");
		for (int i = 0; i <6; i++) {
			System.out.print(ball[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("*** "+success+"개 일치 ***");
		
		System.out.print("맞춘 번호: ");
			for (int i = 0; i < win_num.length; i++) {
				if(win_num[i] != 0) {
					System.out.print(win_num[i]+" ");	
				}
			}
		System.out.println();
			
			
			switch (success) {
			case 3:
				System.out.println("4등 당첨되었습니다 (5천원)");
				break;
				
			case 4:
				System.out.println("3등 당첨되었습니다 (5만원)");
				break;
				
			case 5:
				System.out.println("2등 당첨되었습니다 (150만원)");
				break;
				
			case 6:
				System.out.println("1등 당첨되었습니다 (16억)");
				break;
		default:
			System.out.println("당첨되지 않았습니다.");
			break;

			}
		
	}
}
