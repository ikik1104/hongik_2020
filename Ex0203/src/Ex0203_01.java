import java.util.Scanner;

public class Ex0203_01 {

	public static void main(String[] args) {

		
		//�ܼ� ȭ�鿡�� ���� 1�� ����
		Scanner scan = new Scanner(System.in); // ( )��� ���� �޾� �� �� ����.
		
		// scan.nextInt(); -> ȭ������ �ϳ��� ���ڸ� �Է� �޴� �żҵ�. ���ڸ��� ������ ����
		System.out.println("���� ������ �Է����ּ���.");
		String kor = scan.nextLine();
		System.out.println("���� ������ �Է����ּ���.");
		String eng = scan.nextLine();
		
		int kor1 = Integer.parseInt(kor);
		int eng1 = Integer.parseInt(eng);
		
		System.out.println("����, ���� ������ �� : " + ( kor1 + eng1));
//		System.out.println("�������� : " + kor + "��");
		
//		byte a = 10;
//		byte b = 20;
//		byte c = (byte)(a + b); //�����ϸ� ������ int
//		System.out.println( "c�� ��� : " + c );
//		
//		char c1 = 'a'; // 97
//		char c2 = (char) (c1 + 1);
//		System.out.println( "c1�� ��� : "+ c1 );
//		System.out.println("c2 ��� : " + c2 );
		
	}

}
