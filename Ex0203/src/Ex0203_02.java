import java.util.Scanner;

public class Ex0203_02 {

	public static void main(String[] args) {

		//�ܼ�â���� �Է¹޴� ��ü����
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("���������� �Է��ϼ���.");
//		int kor = scan.nextInt();
//		System.out.println("���������� �Է��ϼ���");
//		int eng = scan.nextInt();
//		double avg = (kor + eng)/2;
//		System.out.println("��� : "+ avg );
		
		System.out.println("���������� �Է��ϼ���");
		int kor = scan.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int eng = scan.nextInt();
		System.out.println("���������� �Է��ϼ���");
		int mat = scan.nextInt();
		
		int sum = kor + eng + mat;
		
		System.out.println("***�հ� : "+ sum + "��***");
	}

}
