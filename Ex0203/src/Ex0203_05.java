import java.util.Scanner;

public class Ex0203_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("실수를 입력하세요.");
		double num1 = scan.nextDouble();
		
		System.out.println("round 반올림 : "+Math.round(num1)); //round 반올림
		System.out.println("ceil은 무엇일까요? : "+Math.ceil(num1));// ceil 올림
		System.out.println("floor은 무엇일까요?"+Math.floor(num1)); //floor 버림
		*/
		
		
		/*
		//실수  소수 5째 자리 숫자를 입력받아서 4째자리에서 반올림
		//한 값을 출력하시오.
		System.out.println("실수를 소수 5째자리까지 입력하세요.");
		double a1 = scan.nextDouble();
		System.out.println((Math.round(a1*1000))/1000.0); //실수로 바꿔줘여해서 실수로
		System.out.println();
		*/
		
		/*
		System.out.println("숫자를 입력해주세요.>>");
		int a1 = scan.nextInt();
		
		System.out.println("a1의 절대값은?"+(a1>=0?a1:-a1));
		*/
		
		
		/* 점수를 입력하고 합격/불합격을 판별하기
		System.out.println("숫자를 입력해주세요.>>");
		int a1 = scan.nextInt();
		System.out.println("a1는? : "+(a1>=0?(a1==0?"0":"양수"):"음수"));
		*/
		
		//60점 이상이면 합격, 60점 미만이면 불합격
		
		/*
		System.out.println("점수를 입력하세요.");
		int a = scan.nextInt();
		System.out.println(a>=60?"합격":"불합격");
		*/
		
		/* 회원등급을 알아보기
		System.out.println("회원번호를 입력하세요.");
		String num = scan.nextLine();
		
		char ch1 = num.charAt(0);
		int aa = ch1 - '0';
		String str = aa==1?"vip":(aa==2?"gold":(aa==3?"silver":"브론즈"));
		System.out.println("회원등급 : "+(aa==1?"vip":(aa==2?"gold":(aa==3?"silver":"브론즈"))));
		System.out.printf("당신의 등급은 %s 입니다. %n", str);
		*/
		
		
		/*  2의 배수인지 확인해보기
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		int num1 = num % 2 ; //나머지를 구하는 퍼센트
		
		System.out.println("2의 배수"+(num1==0?"입니다.":"가 아닙니다."));
		*/
	}
}
