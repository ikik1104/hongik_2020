import java.util.Scanner;

public class Ex0203_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int input1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int input2 = scan.nextInt();

		int hap = input1+input2;
		int minus = input1 - input2;
		double g1 = input1 * input2;
		double di = input1 / input2;
		
		System.out.println("두 수의 합 : "+ (hap));
		System.out.println("두 수의 차 : "+ (minus));
		System.out.println("두 수의 곱 : "+ (g1));
		System.out.println("두 수의 나누기 : "+ (di));
		
		
	}
}
