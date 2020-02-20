import java.util.Scanner;

public class Ex0219_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		Area a1 = new Area();
		System.out.println("사각형 넓이 구하는 프로그램");
		System.out.println("1.정사각형  2.직사각형  3.마름모  ");
		System.out.println("원하는 번호를 입력하세요.");
		
		switch (scan.nextInt()) {
		case 1:
			System.out.println("가로 길이를 입력하세요");
			a1.horiz = scan.nextInt();
			result = a1.square();
			System.out.println("정사각형 넓이 : "+result);
			break;
		case 2:
			System.out.println("가로 길이를 입력하세요");
			a1.horiz = scan.nextInt();
			System.out.println("세로 길이를 입력하세요");
			a1.vert = scan.nextInt();
			result = a1.rectangle();
			System.out.println("정사각형 넓이 : "+result);
		default:
			break;
		}
		
	}
}
