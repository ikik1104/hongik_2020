import java.util.Scanner;

public class Ex0219_07 {


	public static void main(String[] args) {
		//1.�л� ���� �Է�
		//2. �л�����
		//3. �л�����
		//4. �л� �˻�
		//5. ���ó��
		//6.����
		Scanner scan = new Scanner(System.in);
		
		Student[] stu = new Student[3];
		String name = "";
		String[] sub = {"�̸�","����","����","����","�հ�","���","���"};
		int kor=0,eng=0,math=0,total=0, select = 0;
		double avg;
		
		loop1:
		while(true) {
		
		print(); //�޴� ����Ʈ
		select = scan.nextInt();
		switch (select) {
		case 1: //�����Է�
			System.out.println("�л����� �߰��� �����ϼ̽��ϴ�.");
			insert(stu,name,kor,eng,math);
			break;
		case 2://�л� ����
			if(Student.s_cnt == 0) {
				System.out.println("��ϵ� �л��� �����ϴ�.");
				break;
			}
			
			System.out.println("������ ������ �л��� �̸��� �Է����ּ���. (�ڷΰ��� 99)");
			name = scan.next();
			loop3:
			for (int i = 0; i < stu.length; i++) {
				if(stu[i].name.equals(name)) {
//					for (int j = 0; j < sub.length; j++) {
//						System.out.print(sub[i]+"\t");
//					}
//					System.out.println();
//					System.out.println(stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+
//				stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
					
					System.out.println(stu[i].name+"�� �˻��Ǿ����ϴ�. �����Ͻ� �κ��� �Է����ּ���.");
					System.out.println("1.����  2.����   3.����");
					
					switch (scan.nextInt()) {
					case 1:
						System.out.println("���������� �Է��ϼ���. >>");
						stu[i].kor = scan.nextInt();
						scan.nextLine();
						System.out.println("�������� "+stu[i].kor+"����Ǿ����ϴ�.");
						continue loop1;
					case 2:
						System.out.println("���������� �Է��ϼ���. >>");
						stu[i].eng = scan.nextInt();
						scan.nextLine();
						System.out.println("�������� "+stu[i].eng+"����Ǿ����ϴ�.");
						continue loop1;
					case 3:
						System.out.println("���������� �Է��ϼ���. >>");
						stu[i].math = scan.nextInt();
						scan.nextLine();
						System.out.println("�������� "+stu[i].math+"����Ǿ����ϴ�.");
						continue loop1;
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
						continue loop1;
					}
				}
			}
			System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
			break;
		case 3://�л� ����
			
			break;
		case 4://�л� �˻�
			System.out.println("�˻��Ͻ� �л��� �̸��� �Է����ּ���.");
			name = scan.next();
			for (int i = 0; i < stu.length; i++) {
				if(stu[i].name.equals(name)) {
					stu_1(sub, stu,i);
				}
			}
			break;
		case 5://���ó��
			
			break;
		case 6://�л����
			if(Student.s_cnt == 0) {
				System.out.println("�Էµ� �л��� �����ϴ�.");
				continue loop1;
			}
			for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+
					stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
		}
			continue loop1;

		default:
			System.out.println("�߸��Է��Ͽ����ϴ�.");
			break;
		}
	}
		
		
	}//main
	
	
	static void print() {
		System.out.println("---------------------------");
		System.out.println("      [  �л��������α׷�  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. �����߰�           2.��������");
		System.out.println("   3. ��������           4.�����˻�");
		System.out.println("   5. ���ó��           6.�л� ���");
	}
	
	//�л��Է�
	static void insert(Student[] stu,String name,int kor,int eng,int math) {
		Scanner scan = new Scanner(System.in);
		
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
			Student.s_cnt += 1;
//			System.out.println(stu[i].name+" "+stu[i].total+"  "+stu[i].avg);
		}
	}
	
	//�л� �Ѹ��� ����
	static void stu_1(String[] sub, Student[] stu, int num) {
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		System.out.println(stu[num].name+"\t"+stu[num].kor+"\t"+stu[num].eng+"\t"+
				stu[num].math+"\t"+stu[num].total+"\t"+stu[num].avg+"\t"+stu[num].rank);
		
	}
	
	
}
