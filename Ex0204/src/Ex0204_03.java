import java.util.Scanner;

public class Ex0204_03 {

	public static void main(String[] args) {
		//do while�� �ѹ��̶� ���� / while�� ������ �¾ƾ� ���ۉ�
		/*
		int sum = 0;
		
		for(int i=1;i<=100;i++) {
			sum += i;
		}
		System.out.println(sum);
		
		*/
		
		
		
		/*
		//1~100���� 2�� ����� �� ���Ѱ�
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		*/
		
		
		/*
		int i;
		int j;
		for (i = 2; i <=9; i++) {
			System.out.println("["+i+"�� ���  ]");
			for (j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		/*
		int i;
		int j;
		for (i = 1; i <=9; i++) {
			
			for (j = 2; j <=9; j++) {
				System.out.printf("%d*%2d= %2d    ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		/*
		int i;
		int j;
		for (i = 1; i <=9; i++) {
			
			for (j = 2; j <=5; j++) {
				System.out.printf("%d*%2d= %2d    ",j,i,i*j);
			}
			System.out.println();
			System.out.println("-----------------------------");
		}
		*/
		
		//****������ ���� �� 10 �� 10
		/*
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				System.out.printf("*");
			}
			System.out.println("*");
				
			}
		*/
		/*
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.printf("*");
			}
			System.out.println("*");
		}
		*/
		
		
		//�ݴ�� �����
		/*
		for (int i = 10; i > 1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.printf("*");
			}
			System.out.println("*");
		}
		*/
		
		/*
		for (int i = 0; i <=3 ; i++) {
			for (int j = 1; j <=3; j++) {
				for (int k = 1; k <=3; k++) {
					System.out.println(""+i+j+k);
				}
			}
		}
		*/
		
		/*
		int i = 10;
		while (i>=0) {
			System.out.println(i--);
		}
		*/
		
		
		/*
		for (int j = 10; j>=0; j--) {
			System.out.println(j);
		}
		*/
		
		/*
//		1~100 ������
		int input_num = 0; // �Է��� ����
		int input_num2 = 0;
		int check = (int)(Math.random()*10)+1;
		
		Scanner scan = new Scanner(System.in);
		
		int count = 1;
		
		while (count<=4) {
			System.out.println("1-100���� ���ڸ� �Է��ϼ���.");
			input_num = scan.nextInt();
			if(check == input_num) {
				System.out.printf("��÷�Դϴ�.  ��÷��ȣ :%d", check);
				
				
				
				break;
			}else {
				System.out.println("��÷���� �ʾҽ��ϴ�. �ٽ� �����ϼ���.");
			
			}
			System.out.println("�����Ͻðڽ��ϱ�? �����Ͻ÷��� x�� ��������.");
			String aa = scan.next();
//			char out = aa.charAt(0);
//			if(out == 'x' || out == 'X'){
			if(aa.equalsIgnoreCase("x")) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}else {
				count++;
			}
		}
		*/
		
//		1~100 ������ //���� ������ �Է��ߴ� ���ڵ� �̾Ƴ���
		int input_num = 0; // �Է��� ����
		int count = 1; // �� 4������ üũ���� ����
		String aa = " "; //�����Ҷ� Ȯ�� ���ڿ�
		String save ="";// �Է��� ���ڸ� �����ϴ� ���ڿ�
		int check = (int)(Math.random()*10)+1; //��������
		
		Scanner scan = new Scanner(System.in); //��ü����
		
		
		while (count<=4) { //4������ �ݺ���
			System.out.println("1-100���� ���ڸ� �Է��ϼ���.");
			input_num = scan.nextInt(); 
			save= save+input_num+" "; //�����ϴ� ���ڿ�
			
			if(check == input_num) {
				System.out.println("��÷�Դϴ�.");
				break;
			}else {
				System.out.println("��÷���� �ʾҽ��ϴ�. �ٽ� �����ϼ���.");
			}
			
			//���α׷� ���� Ȯ��
			System.out.println("�����Ͻðڽ��ϱ�? �����Ͻ÷��� x�� ��������.");
			aa = scan.next(); //���ڿ� �ޱ� ( ���Ḧ ����) 
			if(aa.equalsIgnoreCase("x")) { //��ҹ��� ���о��� ���� x�� ������
				System.out.println("����Ǿ����ϴ�."); 
				break; //�����Ѵ�.
			}
				count++; //Ƚ���� �����Ѵ�.
		}
		System.out.printf("������ȣ %d �Է¹�ȣ: %s  %n",check,save);
		
		
		
		/*
		if(check == input_num) {
			System.out.printf("��÷�Դϴ�.  ��÷��ȣ :%d", check);
		}else {

			System.out.println("1-100���� ���ڸ� �Է��ϼ���.");
			input_num2 = scan.nextInt();
			
			if(check == input_num2) {
				System.out.printf("��÷�Դϴ�.  ��÷��ȣ :%d, �Է¹�ȣ %d, %d %n", check,input_num, input_num2);
			}else {
				System.out.printf("��÷�����ʾҽ��ϴ�.  ��÷��ȣ :%d, �Է¹�ȣ %d,%d %n", check, input_num, input_num2);
			}
		}
		System.out.println("�ý����� ����Ǿ����ϴ�.");
		*/
		
		
		}
}
