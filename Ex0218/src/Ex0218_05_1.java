import java.util.Scanner;

public class Ex0218_05_1 {

	public static void main(String[] args) {
		//로또번호 배열 생성
		//로또번호 1~45번 까지 입력
		//로또번호 랜덤으로 섞기
		//입력하는 번호 객체 10개 생성
		//입력 10개 받음
		//일치 개수
		
		
		int same = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[45];
		My_lotto[] me = new My_lotto[10];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//랜덤 섞기
		shuffle(lotto);
		
		for (int i = 0; i < me.length; i++) {
				me[i] = new My_lotto();
				for (int j = 0; j < 6; j++) {
					System.out.println((i+1)+"번째"+(j+1)+"번 로또번호를 입력하세요");
					me[i].lotto_num[j] = scan.nextInt();
					//로또번호와 입력번호를 일치비교
					if(lotto[i]==me[i].lotto_num[j]) {
						same++;
					}
				}
				me[i].same_num = same;
				
				//일치개수비교
				switch (same) {
				case 0:
					me[i].rank = 7;
					me[i].reward = 0;
					break;
				case 1:
					me[i].rank = 6;
					me[i].reward = 0;
					break;
				case 2:
					me[i].rank = 5;
					me[i].reward = 0;
					break;
				case 3:
					me[i].rank = 4;
					me[i].reward = 10000;
					break;
				case 4:
					me[i].rank = 3;
					me[i].reward = 10000000;
					break;
				case 5:
					me[i].rank = 2;
					me[i].reward = 100000000;
					break;
				case 6:
					me[i].rank = 1;
					me[i].reward = 1000000000;
					break;

				default:
					break;
				}
			}//for
		
		System.out.print("로또번호: ");
		for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i]+"  ");
		}
		System.out.println("입력번호 10번");
		for (int i = 0; i < me.length; i++) {
			for (int j = 0; j < me[i].lotto_num.length; j++) {
				System.out.print("입력번호: "+me[i].lotto_num[j]);
			}
			System.out.print(""+me[i].same_num);
			System.out.print(""+me[i].rank);
			System.out.print(""+me[i].reward);
			System.out.println();
			
		}
		
	}//main
	
	//섞기
	static void shuffle(int[] lotto) {
		int temp=0;
		int num =0;
		
		for (int i = 0; i < 100; i++) {
			num = (int)(Math.random()*45);
			
			temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
	}
	
	
}//class
