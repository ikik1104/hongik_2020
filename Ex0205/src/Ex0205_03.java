import java.util.Scanner;

public class Ex0205_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int select1 = 0;
		int num1 = 0;
		int num2 = 0;
		
		loop1 : while (true) {//전체 시스템
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("----------------");
			System.out.println("1) 구구단 출력");
			System.out.println("2) 빼기");
			System.out.println("3) 곱하기");
			System.out.println("4) 나누기");
			System.out.println(" 원하는 번호를 입력하세요. ( 종료 : 99 )");
			
			select1 = scan.nextInt();
			
			if(select1 == 99) { //0일때 종료
				break;
			}
		
			if(!(select1>=1 && select1<=4)) { //1~9R까지 숫자만 입력가능ㄴ
				System.out.println("1~4까지의 숫자를 입력하세요.");
				continue;
			}
			
			switch (select1) { //사칙연산 선택
			case 1:
				loop2:
				while(true) {
					System.out.println("1)원하는 구구단 출력.");
					System.out.println("2)원하는 단부터 출력.");
					System.out.println("원하는 번호를 입력하세요. (상위 이동 :0, 시스템종료 : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						System.out.println("상위로 이동합니다.");
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					
					switch (num1) {
					case 1:
						while (true) {
							System.out.println("원하는 단 숫자 입력하세요.(상위이동 :0 , 종료 :99)");
							num2 = scan.nextInt();
							
							if(num2==0) {
								continue loop2;
							}else if(num2 == 99) {
								break loop1;
							}
							for (int i = num2; i <=num2; i++) {
								for (int j = 1; j <=9; j++) {
									System.out.println(i+"*"+j+"="+i*j);
								}
							}
							System.out.println("----------------------------");
						}
						
					case 2: 
						for (int i = 1; i <=9; i++) {
							for (int j = 1; j <=9; j++) {
								System.out.println(i+"*"+j+"="+i*j);
							}
						}
						break;
				

					}
				}//case
				
			case 2:
				while(true) {
					System.out.println("빼고 싶은 두수를 입력하세요.(상위 이동 :0, 시스템종료 : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1개 더 입력하세요");
					num2 = scan.nextInt();
					System.out.println("두수의 빼기 : "+(num1-num2));
				}
				
			case 3:
				while(true) {
					System.out.println("곱하고 싶은 두수를 입력하세요.(상위 이동 :0, 시스템종료 : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1개 더 입력하세요");
					num2 = scan.nextInt();
					System.out.println("두수의 곱하기 : "+(num1*num2));
				}
				
			case 4:
				while(true) {
					System.out.println("나누고 싶은 두수를 입력하세요.(상위 이동 :0, 시스템종료 : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1개 더 입력하세요");
					num2 = scan.nextInt();
					System.out.println("두수의 나누기 : "+(num1/num2));
				}
				
			default:
				break;
			}
		}//while
		System.out.println("시스템을 종료하겠습니다.");
		
	}//main
}//class
