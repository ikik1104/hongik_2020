import java.util.Scanner;

public class Ex0205_06 {

	public static void main(String[] args) {
		//���� 5���� �������� �޴´�.
		//�������� ���ؼ� (5�ڸ� �����ڸ� ���� ��
		
		Scanner scan = new Scanner(System.in);
		/*
		
		int num = 0;
		String num2 = "";
		String ran = "";
		int count = 0;

		while(true) {
			System.out.println("���� ���߱� ���α׷�");
			System.out.println("1~9 ���� 5���� �������� �Է����ּ���. (���� : 0)");
			num = scan.nextInt();
			
			if(num == 0) {
				break;
			}
			num2 = num+"";
			for (int i = 1; i <=5; i++) {
				ran += (int)(Math.random()*9)+1; //1~9������ ���ڸ� �̴´�.
			}
			
			for (int i = 0; i <=4; i++) {
				if(num2.charAt(i)==ran.charAt(i)) {
					count++;
			}
			
			switch (count) {
			case 1:
				System.out.println("���� �� :"+num2);
				System.out.println("���� �� :"+ran);
				System.out.println(count+"�� ��ġ ***�����մϴ� 1���� ��÷ *****");
				System.out.println("------------------------------------");
				break;
			case 2:
				System.out.println("���� �� :"+num2);
				System.out.println("���� �� :"+ran);
				System.out.println(count+"�� ��ġ ***�����մϴ� 10���� ��÷ *****");
				System.out.println("------------------------------------");
				break;
			case 3:
				System.out.println("���� �� :"+num2);
				System.out.println("���� �� :"+ran);
				System.out.println(count+"�� ��ġ ***�����մϴ� 100���� ��÷ *****");
				System.out.println("------------------------------------");
				break;
			}
		}
		System.out.println("�ý����� �����մϴ�.");

	*/
		
		
		/*---------------------------------------------------------------------------------������ �ڵ�
		int count = 0; //�´� ������ üũ
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		int num3 = (int)(Math.random()*10);
		int num4 = (int)(Math.random()*10);
		int num5 = (int)(Math.random()*10);
		
		//�Է°�
		
		System.out.println("5�ڸ� ���ڸ� �Է��ϼ���.");
		String input = scan.nextLine();
		
		//input.chatAt(0);
		if(num1==(input.charAt(0)-'0')) {
			count++;
		}
		if(num2==(input.charAt(1)-'0')) {
			count++;
		}
		if(num3==(input.charAt(2)-'0')) {
			count++;
		}
		if(num4==(input.charAt(3)-'0')) {
			count++;
		}
		if(num5==(input.charAt(4)-'0')) {
			count++;
		}
		
		System.out.println("������ :"+ num1+num2+num3+num4+num5);
		System.out.println("�Է¼� :"+ input);
		System.out.println("������ �Է�:"+count);
		
		switch (count) {
		case 0:
			System.out.println("��� : 0 ��");
			break;
		case 1:
			System.out.println("��� : 1 ����");
			break;
		case 2:
			System.out.println("��� : 10 ����");
			break;
		case 3:
			System.out.println("��� : 100 ����");
			break;
		}
		
		*/
	}
}
