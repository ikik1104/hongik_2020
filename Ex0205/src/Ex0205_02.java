import java.util.Scanner;

public class Ex0205_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int num1 = 0;
		int num2 = 0;
	
		// [두 수의 사칙연산 프로그램]
		//1) 더하기
		//2) 빼기
		//3) 곱하기
		//4) 나누기
		// 원하는 숫자를 입력하세요.( 종료 : 0 )
		//1을 선택하게 되면 - "더하고 싶은 두수를 입력하세요. (상위로 이동 : 0)"
		//1, 2 -> 두 수를 더한 값 (숫자만 들어올 수 있음)
	
		while (true) {
			
			System.out.println("[두수의 사칙연산 프로그램]");
			System.out.println("1) 더하기");
			System.out.println("2) 빼기");
			System.out.println("3) 곱하기");
			System.out.println("4) 나누기");
			System.out.println("5) 곱하기 출력");
			System.out.println("원하는 숫자를 입력하세요 (종료 : 0)");
			menu = scan.nextInt();
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(menu<0 || menu>5) {
				System.out.println("***잘못된 입력입니다. 다시 입력하세요***");
				continue;
			}
			while(true) {
				if(menu == 1) { //더하기
					System.out.println("더하기를 선택했습니다.");
					System.out.println("더하고 싶은 두 수를 입력하세요. (상위로 이동 : 0)");
					System.out.printf("첫번째 수 :");
					num1 = scan.nextInt();
					
					if(num1==0) { break; }

					System.out.printf("두번째 수 :");
					num2 = scan.nextInt();
					
					if(num2==0) { break; }

					System.out.println("두 수를 더한 값 :"+(num1+num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 2) { //빼기
					System.out.println("빼기를 선택했습니다.");
					System.out.println("빼고 싶은 두 수를 입력하세요. (상위로 이동 : 0)");
					System.out.printf("첫번째 수 :");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					System.out.printf("두번째 수 :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("두 수를 뺀 값 :"+(num1-num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 3) { //곱하기
					System.out.println("곱하기를 선택했습니다.");
					System.out.println("곱하고 싶은 두 수를 입력하세요. (상위로 이동 : 0)");
					System.out.printf("첫번째 수 :");
					num1 = scan.nextInt();
					
					if(num1==0) { break; }
					
					System.out.printf("두번째 수 :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("두 수를 곱한 값 :"+(num1*num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 4) {//나누기
					System.out.println("나누기를 선택했습니다.");
					System.out.println("나누고 싶은 두 수를 입력하세요. (상위로 이동 : 0)");
					System.out.printf("첫번째 수 :");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					System.out.printf("두번째 수 :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("두 수를 나눈 값 :"+(num1/num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 5 ) { //구구단 출력
					System.out.println("구구단 출력을 선택했습니다.");
					System.out.println("원하는 단을 입력하세요. (상위로 이동 : 0)");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					for (int i = num1; i <=num1; i++) {
						for (int j = 1; j <=9; j++) {
							System.out.println(num1+" * "+j+" = "+num1*j);
						}
					}
				}
			}
		}
	}
}
