import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		//넓이 구하기 프로그램
		//1. 직사각형   2.직삼각형  3.원  4.마름모  5. 정사각형
		// while true -> switch 1 2 3 메소드 분리
		Scanner scan = new Scanner(System.in);
		int select=0;
		int[] input = new int[2];
		int input1 = 0;
		
		
		while(true) {
			print();
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("직사각형의 넓이");
				case1(input);
				break;
				
				
			case 2:
				System.out.println("직삼각형의 넓이");
				case2(input);
				break;
				
				
			case 3:
				System.out.println("원의 넓이");
				case3(input1);
				break;
				
				
			case 4:
				System.out.println("마름모의 넓이");
				case4(input);
				break;

			
			case 5:
				System.out.println("정사각형의 넓이");
				case5(input1);
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}//while
	}//main

	static void print() {
		System.out.println("-----------------------------------------");
		System.out.println("           [ 넓이 구하기 프로그램  ] ");
		System.out.println("1.직사각형    2.직삼각형    3.원    4.마름모     5. 정사각형");
		System.out.println("-----------------------------------------");
	}
	
	static int num1(String a1) {
		Scanner scan= new Scanner(System.in);
		System.out.println(a1+"을 입력하세요. >>");
		
		return scan.nextInt();
	}
	
	static int[] num2(String a1, String a2,int[] input) {
		Scanner scan= new Scanner(System.in);
				
		System.out.println(a1+"를 입력하세요. >>");
		input[0] = scan.nextInt();
		System.out.println(a2+"를 입력하세요. >>");
		input[1] = scan.nextInt();
		
		return input;
	}
	
	static void case1 (int[] input) { //직사각형
		num2("가로","세로",input);
		System.out.println("직사각형의 넓이 :"+ (input[0]*input[1]));
	}
	
	static void case2 (int[] input) { //직삼각형
		input = num2("가로","세로",input);
		System.out.println("직삼각형의 넓이 :"+ (0.5*input[0]*input[1]));
		}
	
	static void case3 (int input1) { //원
		input1 = num1("반지름");
		System.out.println("원의 넓이 :"+ (3.14*input1*input1));
	}
	
	static void case4 (int[] input) { //마름모
		input = num2("한 대각선","다른 대각선",input);
		System.out.println("마름모의 넓이 :"+ (0.5*input[0]*input[1]));
	}
	
	static void case5 (int input1) { //정사각형
		input1 = num1("한 변의 길이");
		System.out.println("정사각형의 넓이 :"+ (input1*input1));
	}
	
}
