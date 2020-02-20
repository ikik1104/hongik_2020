import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// 1. 최대값 구하기  (3개의 숫자를 넣어서, 1. 최대값,2 최소값)
		// 2. 절대값 구하기( 1개의 숫자를 넣어서 절대값을 구하는것
		//3.제곱값 구하기 (첫번째 숫자 5, 제곱수 2 를 넣으면 5*5 = 25)
		//1,2 원하는 번호
		Scanner scan = new Scanner(System.in);
		
		int min = 0;
		
		loop1:
		while(true) {
			
			print();
			
			switch (scan.nextInt()) {
			case 1:
				max(); //최대값 구하기 메소드
				break;
			case 2:
				min(); //최소값 구하기 메소드
				break;
			case 3:
				abs();
				while(true) {
					System.out.println("숫자를 입력하세요. (이전화면 : 99)");
					if(scan.nextInt() == 99) { //이전화면 이동
						break; //while 종료
					}
					System.out.println("절대값 구하기를 선택하셨습니다.");
					break;//while 종료
				}
				break;
			case 4:
				pow();
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}//main
	
	static void print () {
		System.out.println("------------------------------");
		System.out.println("       [수학 공식 프로그램 ]");
		System.out.println("------------------------------");
		System.out.println("1.최대값   2.최소값   3.절대값   4.제곱값  ");
		System.out.println("      원하는 번호를 입력하세요.");
	}
	
	static void max() {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		int max = 0;
		loop2:
			
		while(true) {//최대값 무한반복
			
			input = for_int(input);
			if(input[0]==99) {
				break;
			}else if (input[0] == 0) {
				break;
			}
			
			max = Math.max(Math.max(input[0], input[1]),input[2]);
			System.out.println("최대값 :"+ max);
		}
	}
	
	static void min() {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		int min = 0;
		loop2:
		while(true) {//최대값 무한반복
			input = for_int(input);
			min = Math.min(Math.min(input[0], input[1]),input[2]);
			System.out.println("최소값 :"+ min);
		}
	}
	
	static void abs() {
		Scanner scan = new Scanner(System.in);
	}
	
	static void pow() {
		Scanner scan = new Scanner(System.in);
	}
	
	static int[] for_int (int[] input) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("숫자를 입력하세요. (이전화면 : 99, 종료: 0)");
			input[i] = scan.nextInt();
			//최대값 구하기
		}//for
		return input;
	}
}//class

