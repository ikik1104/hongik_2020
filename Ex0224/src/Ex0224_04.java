import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		/* 3���� �л��� �Է¹޾Ƽ�
		 * �й�, �̸�, ����, ����, ����, �հ�, ���, ���
		 * �й��� 1���� 1������ - �ڵ��Էµǵ���
		 * �Էºκ��� �޼ҵ�� �и�
		 * ��ºκ� �޼ҵ�� �и�
		 * ��� ��� �޼ҵ�� �и�
		 * 1. �л������Է�
		 * 2. �л��������
		 * 3. �л���������
		 * 4. �л�����Է�
		 * 5. ����
		 * while������ �ݺ�
		 * */
		Scanner scan = new Scanner(System.in);
		Student2[] stu = new Student2[5];
		String[] sub = {"�й�","�̸�","����","����","����","�հ�","���","���"};
		
		loop1:
		while(true) {
			System.out.println("1. �л������Է�        2. �л��������");
			System.out.println("3. �л���������        4. �л�����Է�");
			System.out.println("5. ���� ");
			int select = scan.nextInt();
			
			switch (select) {
			case 1:
				input_stu(stu,sub);
				System.out.println("�л����� �Է¿Ϸ�");
				System.out.println("-------------------------------");
				break;
			case 2:
				print_stu(stu,sub);
				System.out.println("-------------------------------");
				break;
			case 3:
				update_stu(stu);
				System.out.println("�л� ���������Ϸ�");
				System.out.println("-------------------------------");
				break;
			case 4:
				rank_stu(stu);
				System.out.println("***** ���ó���� �Ϸ�Ǿ����ϴ�. *****");
				System.out.println("-------------------------------");
				break;
			case 5:
				System.out.println("�ý����� �����մϴ�.");
				break loop1;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}//main
	//�л� �Է��ϱ�
	static void input_stu(Student2[] stu,String[] sub){
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		String name = "";
		loop2:
		while(true) {
			if(Student2.num == stu.length) {
				System.out.println("�Է°����� �л� �� "+Student2.num+"���� �ʰ��Ͽ����ϴ�.");
				break;
			}
		for (int i = Student2.num; i < stu.length; i++) {
			System.out.println("���� �Է��л� �� :"+Student2.num);
			System.out.println("�̸��� �Է��ϼ���  (�ڷΰ���: 99)");
			name = scan.next();
			if(name.equals("99")) {
				break loop2;
			}
			for (int j = 0; j < score.length; j++) {
				System.out.println(sub[j+2]+"������ �Է��ϼ���");
				score[j] = scan.nextInt();
			}
			stu[i] = new Student2(name,score[0],score[1],score[2]);
		}
		}//while
	}
	//�л� ����ϱ�
	static void print_stu(Student2[] stu,String[] sub){
		//sub ���
		if(Student2.num == 0) {
			System.out.println("�Էµ� �л��� �����ϴ�.");
		}else {
			for (int i = 0; i < sub.length; i++) {
				System.out.print(sub[i]+"\t");
			}
			System.out.println();
			
			for (int i = 0; i < Student2.num; i++) {
				System.out.println(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+
						stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
			}
		}
	}
	//��������
	static void update_stu(Student2[] stu){
		System.out.println("�л���������");
		Scanner scan = new Scanner(System.in);
		if(Student2.num == 0) {
			System.out.println("�Էµ� �л��� �����ϴ�.");
		}else {
			System.out.println("�����Ͻ� �л��� �̸��� �Է��ϼ���.");
			String name = scan.next();
			int cnt = 0;
			
			for (int i = 0; i < Student2.num; i++) {
				
				if(stu[i].name.equals(name)) {
					System.out.println("1) �̸�����           2) ���� ��������");
					System.out.println("3) ���� ��������    4) ���� ��������");
					int select = scan.nextInt();
					cnt++;
					switch (select) {
					case 1:
						System.out.println("�����Ͻ� �̸��� �Է��ϼ���. (���� �̸� :"+stu[i].name+")");
						stu[i].name = scan.next();
						break;
					case 2:
						System.out.println("�����Ͻ� ���� ������ �Է��ϼ���.(���� �������� :"+stu[i].kor+")");
						stu[i].kor = scan.nextInt();
						stu[i].modify();
						break;
					case 3:
						System.out.println("�����Ͻ� ���� ������ �Է��ϼ���.(���� �������� :"+stu[i].eng+")");
						stu[i].eng = scan.nextInt();
						stu[i].modify();
						break;
						
					case 4:
						System.out.println("�����Ͻ� ���� ������ �Է��ϼ���.(���� �������� :"+stu[i].math+")");
						stu[i].math = scan.nextInt();
						stu[i].modify();
						break;
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
						break;
					}//switch
					
				}//if
				rank_stu(stu);
			}
			if(cnt == 0) {
				System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
			}
			
		}

		
	}
	
	//����Է�
	static void rank_stu(Student2[] stu){
		for (int i = 0; i < Student2.num; i++) {
			int rank = 1;
			for (int j = 0; j < Student2.num; j++) {
				if(stu[i].total < stu[j].total ) {
					rank++;
				}
			}
			stu[i].rank = rank;
		}
	}
}
