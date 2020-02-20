import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		//사칙연산 프로그램
		
		Scanner scan  = new Scanner(System.in);
		int[] input = new int[2];
		
		int result =0;
		while(true) {
		
			System.out.println("        [ 사칙연산 프로그램 ]");
			System.out.println("-------------------------------");
			System.out.println("   1.더하기    2.빼기   3.곱하기   4.나누기");
			System.out.println("해당하는 프로그램을 선택하세요. >>");
			
			switch (scan.nextInt()) {
			case 1:
				System.out.println("더하기 프로그램");
				input = print(input);
				result = add(input[0], input[1]);
				System.out.println("결과값"+result);
				break;
			case 2:
				System.out.println("빼기 프로그램");
				input = print(input);
				result = subtract(input[0], input[1]);
				System.out.println("결과값"+result);
				break;
			case 3:
				System.out.println("곱하기 프로그램");
				input = print(input);
				test1(input[0], input[1]);
				break;
			case 4:
				System.out.println("나누기 프로그램");
				input = print(input);
				test2(input[0], input[1]);
				break;
			default:
				System.out.println("다시입력하세요");
				continue;
			}
		}
		
	}//main
	
	//프린트 메서드
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자를 입력하세요. >>");
		input[0] = scan.nextInt();
		System.out.println("2번째 숫자를 입력하세요. >>");
		input[1] = scan.nextInt();
		
		
		return input;
	}
	
	//더하기 메소드
	static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	//빼기 메소드
	static int subtract (int a, int b) {
		int result = 0;
		result = a - b;
		return result;
	}
	
	//곱하기 메소드
	static void test1 (int a , int b) {
		System.out.println("결과 값 :"+ a*b);
	}
	
	//나누기 메소드
	static void test2 (int a , int b) {
		System.out.println("결과 값 :"+ a/b);
	}
	

}//class
