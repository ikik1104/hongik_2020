import java.util.Scanner;

public class Ex0218_04_1 {
	
	static int stu_count = 0;
	
	public static void main(String[] args) {
		/* �л� ����ó�� ���α׷� 10��
		 * �л� - student class : �й�/�̸�/����/����/����/�հ�/���/���
		 * [�л� ����ó�� ���α׷�]
		 * 1.�����߰�
		 *  - �����߰��� �Է��ϼ̽��ϴ�. -> �й��Է��ϼ��� >�̸�,������
		 * 2.��������
		 * 	- ������ �л��� �й��� �Է��ϼ���.>
		 * 	- 1.�̸� 2.�� 3.�� 4.�� (����)
		 * 	- 1. �̸��� �Է��ϼ��� > ȫ�浿 ���� > ȫ�浿 �̸��� �����Ǿ����ϴ�.
		 //////////////////////////////////////////////////////
		 * 3.��������
		 * 4.�����˻�
		 * 0.����
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
		
		
		
		//ù��° ���� �ݺ�
		while(true) {
			main_print(); //������� �޼ҵ� �и�
			
			switch (scan.nextInt()) {
			case 1: //�޼ҵ� �и�
				System.out.println("���� �߰��� �����ϼ̽��ϴ�.");
				insert(stu);//�л� �����߰� �޼ҵ� �и�
				break;
			case 2:
				System.out.println("���� ������ �����ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("���� ������ �����ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("���� �˻��� �����ϼ̽��ϴ�.");
				break;
			case 5:
				System.out.println("���ó���� �����ϼ̽��ϴ�.");
				break;
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break;
				
			default:
				break;
			}
		}
	}//main

	static void main_print () {
		System.out.println("---------------------------");
		System.out.println("      [  �л��������α׷�  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. �����߰�           2.��������");
		System.out.println("   3. ��������           4.�����˻�");
		System.out.println("   5. ���ó��           0.����");
	}
	
	static void insert(Student[] stu) {
		String insert_name;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println("�̸��� �Է��ϼ��� (����ȭ�� : 99)");
			insert_name= scan.next();
			if(insert_name.equals("99")) {
				System.out.println("����ȭ������ �̵��մϴ�.");
				break;
			}
			stu[i] = new Student();
			stu[i].num = (Student.first_num += 1);
			stu[i].name = insert_name;
			System.out.println("���������� �Է��ϼ���.");
			stu[i].kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			stu[i].eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			stu[i].math = scan.nextInt();
			System.out.println();
			System.out.println();
			stu[i].total();
			stu[i].avg();
			Ex0218_04_1.stu_count++;
			System.out.println(stu_count+"��° �л�:"+stu[i].num);
		}
	}


} //class

