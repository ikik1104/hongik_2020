import java.util.Scanner;

public class Ex0205_05 {

		public static void main(String[] args) {
			// [ 넓이 계산 ] 
			// 1) 사각형 넓이 가로*세로
			// 2) 삼각형 넓이  가*높/2
			// 3) 원넓이 (파이=3.14) 반지름*빈지름*파이
			Scanner scan = new Scanner(System.in);
			int select = 0;
			int num1 = 0;
			int num2 = 0;
			
			
			loop1: while(true) {
				
				System.out.println(" [ 넓이 계산 ] ");
				System.out.println("1) 사각형 넓이");
				System.out.println("2) 삼각형 넓이");
				System.out.println("3) 원 넓이");
				System.out.println("------종료 : 0------");
				select = scan.nextInt();
				
				
				if(select == 0) {
					break loop1;
				}
				
				if(select<0 || select>3) {
					System.out.println("--------잘못된 입력--------");
					continue loop1;
				}
				
				switch (select) {
				case 1:
					while(true) {
					System.out.println("사각형의 넓이 구하기 ( 이전으로 :0, 종료:99 )");
					System.out.printf("가로를 입력하세요 :");
					num1 = scan.nextInt();
					
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					
					System.out.printf("세로를 입력하세요 :");
					num2 = scan.nextInt();
					System.out.println("사각형의 넓이  = "+num1 * num2);
					System.out.println("---------------------");
					}
				case 2:
					while(true) {
						System.out.println("삼각형의 넓이 구하기 ( 이전으로 :0, 종료:99 )");
						System.out.printf("밑변의 길이를 입력하세요 :");
						num1 = scan.nextInt();
						
						if(num1 == 0) {
							continue loop1;
						}else if(num1 == 99) {
							break loop1;
						}
						
						System.out.printf("높이를 입력하세요 :");
						num2 = scan.nextInt();
						System.out.println("삼각형의 넓이  ="+(num1 * num2 *0.5));
						System.out.println("---------------------");
						}
					
				case 3:
					while(true) {
						System.out.println("원의 넓이 구하기 ( 이전으로 :0, 종료:99 )");
						System.out.printf("반지름을 입력하세요 :");
						num1 = scan.nextInt();

						if(num1 == 0) {
							continue loop1;
						}else if(num1 == 99) {
							break loop1;
						}
						
						System.out.println("원의 넓이 :"+(3.14*num1*num1));
						System.out.println("---------------------");
						}
				}
				
				
			
			}//while
			
			System.out.println("시스템을 종료합니다.");
			
			
			
			
		}
		
		
}
