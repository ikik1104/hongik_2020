import java.util.Scanner;

public class Ex0303_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int kor = 0;
		int eng = 0;
		
		System.out.println("�̸��� �Է��ϼ���. >>");
		scan.nextLine();
		System.out.println("���� ������ �Է��ϼ���. >>");
		scan.nextInt();
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace(); //��𿡼� ���������� �˷��ִ� �޼���
			System.out.println();
		}
		System.out.println("���� ���� �Է��ϼ���. >>");
		scan.nextInt();

		System.out.println(6);
		
	}
}
