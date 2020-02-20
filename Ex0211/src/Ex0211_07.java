import java.util.Scanner;

public class Ex0211_07 {

	public static void main(String[] args) {
		
		
		
		
		/*소수점 자리까지 입력하여 사칙연산 구하기
		 * 사칙연산
		 * 
		 * 소수점은 2째자리까지 나타날수 있도록 해보세요.
		 * 
		 * 숫자2개를 입력받는데 소수점자리까지 받는다
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		System.out.println("소수 2개를 입력하세요");
		System.out.print("첫번째 소수 >> ");
		num1 = scan.nextDouble();
		System.out.print("두번째 소수 >> ");
		num2 = scan.nextDouble();
		
		System.out.printf("두 수의 더하기 : %.2f%n",num1+num2);
		System.out.printf("두 수의 빼기 : %.2f%n",num1-num2);
		System.out.printf("두 수의 곱하기 : %.2f%n",num1*num2);
		System.out.printf("두 수의 나누기 : %.2f%n",num1/num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
