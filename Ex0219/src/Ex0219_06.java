import java.util.Scanner;

public class Ex0219_06 {

	public static void main(String[] args) {
		//1.�л� ���� �Է�
		//2. �л�����
		//3. �л�����
		//4. �л� �˻�
		//5. ���ó��
		//6.����
		Scanner scan = new Scanner(System.in);
		
		Student[] stu = new Student[2];
		
		
		double avg;
		
		while(true) {

		
		System.out.println("---------------------------");
		System.out.println("      [  �л��������α׷�  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. �����߰�           2.��������");
		System.out.println("   3. ��������           4.�����˻�");
		System.out.println("   5. ���ó��           6.����");
		
		int select = scan.nextInt();
		switch (select) {
		case 1:
			inputArr(stu);
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;

		default:
			break;
		}
		
		
		
	}
		

//		Lotto[] l = new Lotto[45];
//		for (int i = 0; i < l.length; i++) {
//			l[i] = new Lotto(i+1);
//			System.out.println(l[i].number);
//		}
//		
		/* ī�常���
		
		//Card 52���� ��ü �迭�� ����
		//1~13 ����, Ŭ�ι�, ���̾Ƹ��,��Ʈ,�����̽�
		//��������.
		
		Card[] c = new Card[52];
		String[] kind = {"Ŭ�ι�","���̾Ƹ��","��Ʈ","�����̽�"};

		
		
		//���1
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].number = j+1;
				c[(i*13)+j].kind = kind[i];
			}
		}
		
		//���2
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card(j+1,kind[i]);
			}
		}
		
		//���
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].number+" "+c[i].kind);
		}
		
		
		*/
		
//		Card cc1 = new Card();
		
//		Card c1 = new Card();
//		c1.number = 10;
//		c1.kind = "Ŭ�ι�";
//		System.out.println(c1.number);
		
		
	}
	
	static void inputArr(Student[] stu) {
		Scanner scan = new Scanner(System.in);
		int kor=0,eng=0,math=0,total=0;
		String name = "";
		
		System.out.println("�л����� �߰��� �����ϼ̽��ϴ�.");
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name = scan.next();
			System.out.println("���������� �Է�");
			kor = scan.nextInt();
			System.out.println("���������� �Է�");
			eng = scan.nextInt();
			System.out.println("���������� �Է�");
			math = scan.nextInt();
			stu[i] = new Student(name,kor,eng,math);
			System.out.println(stu[i].name+" "+stu[i].total+"  "+stu[i].avg);
		}
	}
}
