import java.util.Scanner;

public class Ex0213_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = {1,2,3,4,5};
		int[] num2 = new int[10];
		
		System.arraycopy(num, 0, num2, 5, num.length);
		//num 배열 출력
				for (int i = 0; i < num.length; i++) {
					System.out.print(num[i]+" ");
				}

				System.out.println();
				//num2 배열 출력
				for (int i = 0; i < num2.length; i++) {
					System.out.print(num2[i]+" ");
				}
				System.out.println();
				
		
		/*
		//배열복사
		for (int i = 0; i < num.length; i++) {
			num2[i] = num[i];
		}
		//num 배열 출력
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}

		System.out.println();
		//num2 배열 출력
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		System.out.println();
		
		/*
		while(true) {
			for (int i = 0; i < 4; i++) {
				System.out.println("값을 입력하세요");
				num[i] = scan.nextInt();
				
				System.out.println("입력값 : "+num[i]);
			}
		}
		*/
		
		
	}
}
