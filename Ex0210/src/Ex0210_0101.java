import java.util.Scanner;

public class Ex0210_0101 {

	
	public static void main(String[] args) {
		
		int select = 0; // ù��° ���ú���
		int count = 10;
		int user = 0; //����ڰ� �� ���������� ����
		int com = 0; //��ǻ�Ͱ��� ���������� ����
		int win = 0; //�¸�Ƚ������
		int draw = 0; //���º�
		int lose = 0; //�й�
	
		String[] confirm = new String[count]; //����Ȯ��
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("[  ���� ���� �� ���� / ����Ȯ�� ���α׷�   ]");
			System.out.println("----------------------------------");
			System.out.println(" 1)���������� ����   2) ����Ȯ�� ");
			System.out.println("��ȣ�� �������ּ���. (����:0)>>");
			
			select = scan.nextInt();
			if(select == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			
			
			switch (select) {
			
			case 1:
				System.out.println("[   ���������� START   ]");
				
				for (int i = 0; i < count; i++) {
					System.out.println("1)����, 2)����, 3)�� �߿� 1���� �����ϼ���.");
					user = scan.nextInt();
					com = (int)(Math.random()*3)+1;
					
					switch (user-com) {
					// 1
					// 1-3 = -2 (�¸�) / 1-1 = 0(���º�) /1-2 = -1 ( �й�)
					// 2
					// 2-1 = 1 (�¸�) / 2-2 = 0(���º�) / 2-3 = -1 (�й�)
					// 3
					// 3-2 = 1 (�¸�) / 3-3 = 0(���º�) / 3-1 = 2 (�й�)
					case -2: case 1: //�¸�
						System.out.println("�¸�");
						win++;
						confirm[i] = "�¸�";
						
						break;
						
					case 0: //���º�
						System.out.println("���º�");
						draw++;
						confirm[i] = "���º�";
						
						break;
						
					case -1: case 2: //�й�
						System.out.println("�й�");
						lose++;
						confirm[i] = "�й�";
						
						break;
					}//switch
				}//for
				
				System.out.println("�� ���� Ƚ�� : "+count);
				System.out.println("�� �¸� Ƚ�� : "+win);
				System.out.println("�� ���º� Ƚ�� : "+draw);
				System.out.println("�� �й� Ƚ�� : "+lose);
				System.out.printf("�·� : %.1f %n",((float)win/count)*100);
				
				break;

			case 2:
				System.out.println("[  ����Ȯ�� START  ]");
				for (int i = 0; i < confirm.length; i++) {
					System.out.println((i+1)+". "+confirm[i]);
					
				}
				System.out.println("�� ���� Ƚ�� : "+count);
				System.out.println("�� �¸� Ƚ�� : "+win);
				System.out.println("�� ���º� Ƚ�� : "+draw);
				System.out.println("�� �й� Ƚ�� : "+lose);
				System.out.printf("�·� : %.1f %n",((float)win/count)*100);
				
				break;
			

			}//switch
			
		}//while
		
		
		
		
		
	}
}
