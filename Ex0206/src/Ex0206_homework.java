import java.util.Scanner;

public class Ex0206_homework {

	public static void main(String[] args) {
		
		/*
		 * ����������
		 * 1,2,3
		 * 
		 * ���� �������� ��������������
		 * 
		 * 10�� �����ؼ�
		 * �� ��� �̰����
		 * 
		 * �̱�� �¸�, ����  ���º� , ���� �й� ���
		 * �� �¸�, ���º�, �й� Ƚ�� ���
		 * �·�
		 * 
		 * �ɼ�: ���Ƚ�� �Է¹ޱ�
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[    ���� ���� �� ����        ]");
		int num = 0; 
		int ran = 0;
		int count =0; //���� Ƚ��
		int o = 0; //�¸�
		int e = 0; //���º�
		int x = 0; //�й�
		
		loop1 :
		while(true) {
			
			System.out.println("���ϴ� ���� Ƚ���� �����ϼ���");
			count = scan.nextInt();
			
			System.out.println(count+"�� ������ �����մϴ�.");
			
			
			for (int i = 1; i <= count; i++) {
				loop2:
				while(true) {
				System.out.println(i+"��° ����");
				System.out.println("1) ����, 2) ����, 3)�� , 0)�ڷΰ��� ");
				num = scan.nextInt();
				if(num<0 || num>3) {
					System.out.println("�ٽ� �Է��ϼ���");
					continue loop2;
				}
				if(num==0) {
					continue loop1;
				}
				
				switch (num) {
				case 1:
					ran = (int)(Math.random()*3)+1;
					if(ran == 1) {
						System.out.println("�����ϴ�.");
						e++;
					}else if(ran == 2) {
						System.out.println("�й��Ͽ����ϴ�.");
						x++;
					}else {
						System.out.println("�̰���ϴ�.");
						o++;
					}
					break loop2;
				case 2:
					ran = (int)(Math.random()*3)+1;
					if(ran == 2) {
						System.out.println("�����ϴ�.");
						e++;
					}else if(ran == 3) {
						System.out.println("�й��Ͽ����ϴ�.");
						x++;
					}else {
						System.out.println("�̰���ϴ�.");
						o++;
					}
					break loop2;
				case 3:
					ran = (int)(Math.random()*3)+1;
					if(ran == 3) {
						System.out.println("�����ϴ�.");
						e++;
					}else if(ran == 1) {
						System.out.println("�й��Ͽ����ϴ�.");
						x++;
					}else {
						System.out.println("�̰���ϴ�.");
						o++;
					}
					break loop2;
				}	
			}//loop2 while
				
			}//for
			System.out.println("�̱�Ƚ�� :"+o+"��, ���º� :"+e+"��, �й�:"+x+"��");
			break loop1;
			
		}//loop1 while
		
	}//main
}//class
