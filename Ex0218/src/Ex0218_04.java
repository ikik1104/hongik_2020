import java.util.Scanner;

public class Ex0218_04 {

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
		String[] sub = {"�й�","�̸�","����","����","����","�հ�","���","���"};
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
//		Student Student = new Student();
		int select = 0;
		
		loop1:
		while (true) {
			System.out.println("�Է� �л� ��:" + Student.stu_cnt);
			rank(stu);// ���ó��
			System.out.println("            [�л����� ���α׷�]");
			System.out.println("1) �����߰�   2)��ü�л�����   3) ��������   4)��������    5)�����˻�  0) ����");
			System.out.println("------------------------------------------------------------------");
			
			
			
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("���� �߰��� �Է��ϼ̽��ϴ�.");
				for (int i = Student.stu_cnt; i < stu.length; i++) {
					stu[i] = new Student();
					System.out.println("�̸��� �Է��ϼ���   (�ڷΰ��� 99)");
					stu[i].name = scan.next();
					if(stu[i].name.equals("99")) {
						continue loop1;
					}
					System.out.println("���� ������ �Է��ϼ���");
					stu[i].kor = scan.nextInt();
					System.out.println("������ �Է��ϼ���");
					stu[i].eng = scan.nextInt();
					System.out.println("������ �Է��ϼ���");
					stu[i].math = scan.nextInt();
					stu[i].total = stu[i].kor+stu[i].eng+stu[i].math;
					stu[i].avg = stu[i].total/3;
					stu[i].s_num = stu_cnt();
					Student.stu_cnt++;

				}
				break;
			case 2:
				if(Student.stu_cnt == 0) {
					System.out.println("������ �Էµ� �л��� �����ϴ�.");
					continue loop1;
				}
				
				sub(sub); //����޴� ���
//				rank(stu,Student);//���ó��
				
				for (int i = 0; i < Student.stu_cnt; i++) {
					list(stu,i); //���
					
				}
				break;
			case 3:
				loop2:
				while(true) {
					System.out.println("������ �л��� �й��� �Է��ϼ���. (�ڷΰ��� : 0)");
					select = scan.nextInt();
					if(select == 0) {
						continue loop1;
					}
					if(select<1000 || select > Student.num ) {
						System.out.println("�������� �ʴ� �й��Դϴ�.");
						continue;
					}
					
					
					sub(sub); //���� �޴� ���
					
					for (int i = 0; i < Student.stu_cnt; i++) {
						if(stu[i].s_num == select) {
							list(stu,i); //���
							while(true) {
								System.out.println("�����Ͻ� �κ��� ������ �ּ���");
								System.out.println("1) �̸�    2)����   3)����   4)����  0)�ڷΰ���");
								select = scan.nextInt();
								switch (select) {
								case 1:
									System.out.println("�����Ͻ� �̸��� �Է����ּ���");
									stu[i].name = scan.next();
									System.out.println("������ �Ϸ�Ǿ����ϴ�.");
									continue loop1;
								case 2:
									System.out.println("�����Ͻ� ���� ������ �Է��ϼ���");
									stu[i].kor = scan.nextInt();
									System.out.println("������ �Ϸ�Ǿ����ϴ�.");
									continue loop1;
								case 3:
									System.out.println("�����Ͻ� ���� ������ �Է��ϼ���");
									stu[i].eng = scan.nextInt();
									System.out.println("������ �Ϸ�Ǿ����ϴ�.");
									continue loop1;
								case 4:
									System.out.println("�����Ͻ� ���� ������ �Է��ϼ���");
									stu[i].math = scan.nextInt();
									System.out.println("������ �Ϸ�Ǿ����ϴ�.");
									continue loop1;
								case 0:
									continue loop2;
								default:
									System.out.println("�߸��� �Է��Դϴ�.");
									continue;
								}
								//�հ�
								//���
								//���
							}
						}
					}
				}
			case 4:
				System.out.println("�����Ͻ� �й��� �Է��ϼ���");
				break loop1;
			case 5:
				System.out.println("�˻��Ͻ� �л��� �й��� �Է��ϼ��� (�ڷΰ��� :0)");
				select = scan.nextInt();
				if(select == 0) {
					continue loop1;
				}
				if(select<1000 || select > Student.num ) {
					System.out.println("�������� �ʴ� �й��Դϴ�.");
					continue;
				}
				
				for (int i = 0; i < Student.stu_cnt; i++) {
					if(select == stu[i].s_num) {
						sub(sub);
						list(stu, i);
					}
				}
				break loop1;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue loop1;
			}
			
		}
		
	}
	
	static void insert_stu () {
		
	}
	
	static int stu_cnt () { //�й�
		Student.num += 1 ;
		System.out.println("���� �й� :"+Student.num);
		return Student.num;
	}
	
	static void list (Student[] stu,int i) {//���
		System.out.print(stu[i].s_num+"\t");
		System.out.print(stu[i].name+"\t");
		System.out.print(stu[i].kor+"\t");
		System.out.print(stu[i].eng+"\t");
		System.out.print(stu[i].math+"\t");
		System.out.print(stu[i].total+"\t");
		System.out.print(stu[i].avg+"\t");
		System.out.println(stu[i].rank);
		System.out.println("----------------------------------------------------------");
	}
	
	static void sub (String[] sub) {
		System.out.println("********************** [  �л� ����   ]  ***********************");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
	}
	
	static void rank (Student[] stu) {
		for (int i = 0; i < Student.stu_cnt; i++) {
			int rank = 1;
			for (int j = 0; j < Student.stu_cnt; j++) {
				if(stu[i].total < stu[j].total) {
					rank++;
				}
			}
			stu[i].rank = rank;
		}
	}
	
}
