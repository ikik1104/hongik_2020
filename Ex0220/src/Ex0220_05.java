import java.util.Scanner;

public class Ex0220_05 {

	public static void main(String[] args) {
		/* 로또 1~45 까지 값을 6개의 값을
		 * lotto2배열에 넣어보세요.
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] lotto2 = new int[6];
		int temp = 0, num = 0,select =0;
		//번호넣기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//로또 숫자 섞기 및 담기
		shuff(lotto,lotto2);
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1. 배열 출력하기");
			System.out.println("2. 배열 섞기");
			System.out.println("3. 배열의 합");
			System.out.println("4. 배열정렬");
			System.out.println("원하는 번호를 입력하세요. >>");
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("6개의 배열을 출력합니다.");
				printArr(lotto2);
				break;
			case 2:
				System.out.println("-------------------------");
				System.out.println("6개의 배열을 다시 섞기 완료.");
				shuff(lotto,lotto2);
				break;
			case 3:
				System.out.println("-------------------------");
				System.out.print("6개 배열 합  :");
				int sum = 0;
				sum = sumArr(lotto2);
				System.out.println(sum);
				break;
			case 4:
				sortArr(lotto2);
				break;
			default:
				break;
			}//switch
			
		}//while
	}//main
	
	//6개의 배열 출력 /select = 1
	static void printArr(int[] lo) {
		System.out.println("-------------------------");
		for (int i = 0; i < lo.length; i++) {
			System.out.print(lo[i]+" ");
		}
		System.out.println();
	}
	
	//배열을 다시섞기 & 담기 /select = 2
	static void shuff(int[] lotto, int[] lotto2) {
		int num =0,temp=0;
		for (int i = 0; i < 100; i++) {
			num = (int)(Math.random()*45);
			
			temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			lotto2[i] = lotto[i];
		}
	}
	
	//배열의 합계  /select = 3
	static int sumArr(int[] lo) {
		int result = 0;
		for (int i = 0; i < lo.length; i++) {
			result += lo[i];
		}
		return result;
	}
	
	static void sortArr(int[] lo) {
		//강사님 코드 (공식*** 그냥 외우자!!)
		for (int i = 0; i < lo.length-1; i++) {
			boolean change = false;
			for (int j = 0; j < lo.length-1-i; j++) {
				if(lo[j]>lo[j+1]) {
					int temp = lo[j+1];
					lo[j+1] = lo[j];
					lo[j] = temp;
					change=true;
				}
				if(change == false) {
					break;
				}
			}
		}
		
		
		//내가 만든 코드
		/*
		 int[] lotto2 = new int[6];
		for (int i = 0; i < lo.length; i++) {
			int cnt = 5;
			for (int j = 0; j < lo.length; j++) {
				if(lo[i] < lo[j]) {
					cnt--;
				}
			}
			lotto2[cnt] = lo[i];
		}
		
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(lotto2[i]+" ");
		}
		System.out.println();
		
		*/
		
	}
	
}//class
