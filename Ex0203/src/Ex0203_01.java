import java.util.Scanner;

public class Ex0203_01 {

	public static void main(String[] args) {

		
		//콘솔 화면에서 값을 1개 받음
		Scanner scan = new Scanner(System.in); // ( )어디서 값을 받아 올 것 인지.
		
		// scan.nextInt(); -> 화면으로 하나의 숫자를 입력 받는 매소드. 받자마자 변수에 넣음
		System.out.println("국어 점수를 입력해주세요.");
		String kor = scan.nextLine();
		System.out.println("영어 점수를 입력해주세요.");
		String eng = scan.nextLine();
		
		int kor1 = Integer.parseInt(kor);
		int eng1 = Integer.parseInt(eng);
		
		System.out.println("국어, 영어 점수의 합 : " + ( kor1 + eng1));
//		System.out.println("국어점수 : " + kor + "점");
		
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b); //연산하면 무조선 int
//		System.out.println( "c값 출력 : " + c );
//		
//		char c1 = 'a'; // 97
//		char c2 = (char) (c1 + 1);
//		System.out.println( "c1값 출력 : "+ c1 );
//		System.out.println("c2 출력 : " + c2 );
		
	}

}
