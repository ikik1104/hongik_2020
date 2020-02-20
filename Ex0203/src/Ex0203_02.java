import java.util.Scanner;

public class Ex0203_02 {

	public static void main(String[] args) {

		//콘솔창으로 입력받는 객체선언
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("국어점수를 입력하세요.");
//		int kor = scan.nextInt();
//		System.out.println("영어점수를 입력하세요");
//		int eng = scan.nextInt();
//		double avg = (kor + eng)/2;
//		System.out.println("평균 : "+ avg );
		
		System.out.println("국어점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요");
		int mat = scan.nextInt();
		
		int sum = kor + eng + mat;
		
		System.out.println("***합계 : "+ sum + "점***");
	}

}
