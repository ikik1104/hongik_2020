import java.util.Scanner;

public class Ex0203_04 {
	public static void main(String[] args) {
		
		//대문자를 넣으면 소문자가 출력 되도록
		
		Scanner scan = new Scanner(System.in);
		
		/* 대문자 -> 소문자----------------------------------------------------------
		System.out.println("대문자를 하나 입력해주세요.");
		String str = scan.nextLine();

		//입력받은 String을 char로 형변환
		char ch = str.charAt(0); //()문자의 인덱스를 고른다  char는 1칸이기 때문에?
		char ch2 = (char)(ch+32);
		
		System.out.println("입력한 대문자 : "+ str );
		System.out.println("변경된 소문자 : "+ ch2 );
		*/
		
		
		/*소문자 -> 대문자----------------------------------------------------------
		System.out.println("소문자 하나를 입력하세요.");
		String str2 = scan.nextLine();
		
		char ch3 = str2.charAt(0);
		char ch4 = (char)(ch3-32);
		
		System.out.println("입력한 소문자 : "+ str2);
		System.out.println("변경된 대문자 : "+ ch4);
		*/
		
		
		
		/* char를 인트로----------------------------------------------------------
		System.out.println("숫자두개를 입력하세요.");
		String a1 = scan.nextLine();

		char ch = a1.charAt(0);
		char ch1 =a1.charAt(1);
		
		int aa = ch-'0'; // ******** char는 '0'을 빼주면 인트로 변환이 가능하다.
		int bb = ch1-'0';
		
		int total = aa+bb;
		
		System.out.println("두 수의 합 : "+ total);
		*/
		
		
		/*
		//숫자 7개를 한번에 받아서 각가의 숫자를 더해보세요. 숫자들 출력하고 더해서 합계
		System.out.println("숫자 7개를 입력해주세요.");
		String a = scan.nextLine();
		
		char a1 = a.charAt(0);
		char a2 = a.charAt(1);
		char a3 = a.charAt(2);
		char a4 = a.charAt(3);
		char a5 = a.charAt(4);
		char a6 = a.charAt(5);
		char a7 = a.charAt(6);
		
		int b1 = a1 - '0';
		int b2 = a2 - '0';
		int b3 = a3 - '0';
		int b4 = a4 - '0';
		int b5 = a5 - '0';
		int b6 = a6 - '0';
		int b7 = a7 - '0';
		
		int total = b1+b2+b3+b4+b5+b6+b7;
		int minus = b1-b2-b3-b4-b5-b6-b7;
		int g1 = b1*b2*b3*b4*b5*b6*b7;
		
		System.out.println("1번째 입력한 수 : "+ b1);
		System.out.println("2번째 입력한 수 : "+ b2);
		System.out.println("3번째 입력한 수 : "+ b3);
		System.out.println("4번째 입력한 수 : "+ b4);
		System.out.println("5번째 입력한 수 : "+ b5);
		System.out.println("6번째 입력한 수 : "+ b6);
		System.out.println("7번째 입력한 수 : "+ b7);
		System.out.println("숫자들의 합 : " + total);
		System.out.println("숫자들의 차 : " + minus);
		System.out.println("숫자들의 곱 : " + g1);
		
		*/
		
		
		//prinf
		//System.out.println(10.0/3);
		
		//(********* 	정수 : %d , 실수 : %f , 문자 : %c, 문자열 : %s 	*********)
		// %n 개행문자 (한칸 내려가서 출력이 된다.)
		
		
		/*
		int a = 5;
		int b = 10;
		
		System.out.printf("첫번째변수 : %d, 두번째 변수 : %d%n", a,b);
		*/
		
		//3번의 숫자를 입력받아서 printf를 사용하여 한줄로 덧셈식과 함께 출력-----------------------------------------
		/*
				System.out.println("첫번째 숫자를 입력하세요.");
				int a = scan.nextInt();
				System.out.println("두번째 숫자를 입력하세요.");
				int b = scan.nextInt();
				System.out.println("세번째 숫자를 입력하세요.");
				int c = scan.nextInt();
				int abc = a+b+c;
				int abc1 = a-b-c;
				int abc2 = a*b*c;
				float abc3 = a/b/c;
				
				System.out.printf("더하기 : %d + %d + %d = %d%n",a,b,c,abc);
				System.out.printf("빼기 : %d - %d - %d = %d%n",a,b,c,abc1);
				System.out.printf("곱하기 : %d * %d * %d = %d%n",a,b,c,abc2);
				System.out.printf("나누기 : %d / %d / %d = %.2f",a,b,c,abc3);
		 */
		
		
				
				
	}
}
