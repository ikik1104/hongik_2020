import java.util.Scanner;

public class Ex0303_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		
		System.out.println("이름을 입력하세요. >>");
		scan.nextLine();
		System.out.println("국어 점수를 입력하세요. >>");
		scan.nextInt();
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace(); //어디에서 에러났는지 알려주는 메서드
			System.out.println();
		}
		System.out.println("영어 점수 입력하세요. >>");
		scan.nextInt();

		System.out.println(6);
		
	}
}
