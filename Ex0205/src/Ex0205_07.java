import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		//for문을 사용해서 합계 
		// 5의 배수만 제외해서 continue 5  숫자의 합을 구하는 프로그램
		//입력은 2개를  2 40 -> 5의 배수는 제외하고 합계를 구하시오
		//총 몇번 더하기를 헀는지 함께 출력
		Scanner scan = new Scanner(System.in);
		
		int check = 0;
		String jumin = "";//주민번호
		String mf = ""; //성별구분
		int age = 0; //나이
		int i = 0; //더하는 횟수
		int sum = 0; //더하는 합계 수
		int num1 = 0;
		int num2 = 0;
		
		loop1:
		while(true) {
			System.out.println(" [ 종합선물 프로그램 ] ");
			System.out.println(" 1) 두수를 더하는 프로그램 ");
			System.out.println(" 2) 주민번호 나이계산 프로그램");
			System.out.println(" 3) 주민번호 남여확인 프로그램 ");
			System.out.println("원하는 번호를 입력하세요.(종료 : 99)");
			check = scan.nextInt();

			if(check == 99) {
				System.out.println("시스템을 종료하겠습니다.");
				break;
			}else if(!(check>=1 && check<=3)) {
				System.out.println("번호를 잘못 입력하였습니다.1~3까지 입력하세요.");
				continue;
			}
			
			switch (check) {
			case 1:// 두 수를 더하는 프로그램
				while(true) {
					System.out.println("더하려고 하는 구간의 수를 2개입력하시오.(상위:0, 종료 : 99) ");
					num1 = scan.nextInt();
					if(num1==99) {
						System.out.println("시스템을 종료하겠습니다.");
						break loop1;
					}else if(num1 == 0) {
						continue loop1;
					}
					//num1이 num2보다 클때 다시 입력을 받는 반복문
						System.out.println("더하려고 하는 구간의 수를 1개 더 입력하시오");
						num2 = scan.nextInt();
						
						if(num1>num2) {
							System.out.println(num1+"보다 더 큰 수를 다시 입력하시오");
							int num3 = num2;
							num2 = num1;
							num1 = num3;
						}
					for (i = num1; i <=num2 ; i++) {
						sum += i;
					}
					System.out.println(num1+"부터"+num2+"까지 합 :"+sum);
					sum = 0;
				}//while

			case 2:
				//주민번호 나이 계산 프로그램 880101-1011198
				while(true) {
					System.out.println("주민번호를 입력하세요.(상위이동:0, 종료:99)");
					jumin = scan.next();
						if(jumin.equals("99")) {
							break loop1;
						}else if(jumin.equals("0")) {
							continue loop1;
						}
						//jumin번호 계산
						//charAt(0)
						if(jumin.charAt(7)=='1' || jumin.charAt(7)=='2') {
							String ju_check = 19+jumin.substring(0,2);
							age = 2019 - Integer.parseInt(ju_check) + 1;
						}else if(jumin.charAt(7)=='3' || jumin.charAt(7)=='4') {
							String ju_check = 20+jumin.substring(0,2);
							age = 2019 - Integer.parseInt(ju_check) + 1;
						}else {
							System.out.println("주민번호가 잘못 입력되었습니다.");
							continue;
					}
						System.out.println("당신의 나이는 ? "+ age);
				}//while
			case 3:
				/*주민번호 남녀 확인 프로그램 880101-'1'10111*/
				while (true) {
					System.out.println("주민번호를 입력하세요.( 이전으로 :0, 종료:99 )");
					jumin = scan.next(); //주민번호를 입력받음
					
					if(jumin.equals("0")) {
						continue loop1;
					}else if(jumin.equals("99")) {
						break loop1;
					}
					
					if(jumin.charAt(7)== '1' ||jumin.charAt(7)== '3') {
//						System.out.println("남성입니다.");
						mf="남자";
					}else if(jumin.charAt(7)== '2' ||jumin.charAt(7)== '4') {
//						System.out.println("여성입니다.");
						mf="여자";
					}else {
						System.out.println("다시 입력하세요.");
						continue;
					}
				}
			}
			System.out.println("당신의 성별은 "+ mf + "입니다.");
		}//while
		System.out.println("시스템을 종료하겠습니다.");
	
	
	}//main
}//class
