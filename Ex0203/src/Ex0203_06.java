import java.util.Scanner;


public class Ex0203_06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("����� ������ �Է��ϼ���.");
		int check = scan.nextInt();
		
//		String str = check>=60?"�հ�":"���հ�";
		
		if(check >60) {  //�ϳ��� if/else�� ��ȣ�� �Ƚ��൵ �ȴ�.
			System.out.println("�հ�");
		}else if(check == 60){ 
			System.out.println("�����");
		}else {
			System.out.println("���հ�");
		}
		*/
		
		
		
		
		/*
		 * System.out.println("�ڵ��� ��ȣ�� �Է��ϼ���.");
		int check = scan.nextInt();
		switch(check) {
		case 1 :
			System.out.println("sk�Դϴ�.");
			break;
		case 6 :
			System.out.println("KTF �Դϴ�.");
			break;
		case 9 :
			System.out.println("LG �Դϴ�.");
			break;
		default :
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		
		}
		*/
		
		
		
		
		
		/* if��
		if (check == 1) {
			System.out.println("sk�ڷ����Դϴ�.");
		} else if(check == 6) {
			System.out.println("KTF�Դϴ�.");
		} else if (check == 9 ) {
			System.out.println("LG�Դϴ�.");
		} else {
			System.out.println("�߸��� ��ȣ�Դϴ�.");
		}
		*/
		
		
		
		
		/*
		//������ �Է¹޾� ����� ����ϱ�
		System.out.println("������ �Է��ϼ���.");
		int num = scan.nextInt();
		
		
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80) {
			System.out.println("B");
		}else if(num>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		*/
		
		
		
		
		/*
		int num2 = num/10 ; //���ڸ��� ���ϱ����� 10���� �����ش�
		switch (num2) {
		case 9 : case 10:
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
		*/
		
		
		/*
		//���, 0 , ����
		System.out.println("���ڸ� �Է����ּ���.");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("���");
		}else if (num ==0) {
			System.out.println("0");
		}else  {
			System.out.println("����");
		}
		*/
		
		
		//�α��� 
		/*
		String id2 = "aaa";
		int password2 = 12345;
		
		System.out.println("���̵� �Է��ϼ���");
		String input2 = scan.nextLine();
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		int inputPw2 = scan.nextInt();
		
		if(id2.equals(input2)) {
			if(password2 == inputPw2) {
				System.out.println("�α��� �Ǿ����ϴ�.");
			} else {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
			}
		}else {
			System.out.println("�ش� ������ ȸ���� �����ϴ�.");
		}
		*/
		
		
		
		//���� -> �����Ͱ�, ��ü -> �������ּ�
		
		/*
		char id = 'c'; 
		int password = 12345;
		
		System.out.println("���̵� �Է��ϼ���");
		String input = scan.nextLine();
		
		char inputId = input.charAt(0);
		
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		int inputPw = scan.nextInt();
		
		
		if(id == inputId&&inputPw==password) 
			System.out.println("�α����� �Ǿ����ϴ�.");
		else 
			System.out.println("���̵� �Ǵ� ��й�ȣ�� �߸��Ǿ����ϴ�.");
		*/
		
		
		
		/*
		//�⵵ �Է� 20�� �̻� ����鸸 ã�Ƽ� �׷������ �α����� �Ǹ� �̺�Ʈ ��÷�� �Ǿ����ϴ�. �պ������ ��¼��
		
		System.out.println("�¾ �⵵�� �Է��ϼ���");
		int year = scan.nextInt();
		
		if (year<=2000) {
			System.out.println("�����մϴ�. �պ�����⿡ ��÷�Ǿ����ϴ�.");
		}else {
			System.out.println("�̺�Ʈ�� ��÷���� �ʾҽ��ϴ�.");
		}
		*/
		
		// equalsIgnorecase ��ҹ��� ���о��� ��
		
		/*
		System.out.println("�����Է�");
		int num = scan.nextInt();
		
		if(num<-1 || num>3 && num<5) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		*/
		
		/*
		
		//90�� �̻��̸� A ->95�� �̻��� A+  90-95���� A-, 85�̻� B+ 80�� �̻��̸� B-, ///C+ - D+ - F
		System.out.println("�����Է�");
		
		int num = scan.nextInt();
		char hak = 'A';
		char sh = '+';
		
		
		if(num>=90) {
			hak = 'A';
			if(num >=95) {
				sh = '+';
			}else {
				sh = '-';
			}
		}else if (num>=80) {
			hak = 'B';
			if(num>=85) {
				sh='+';
			}else {
				sh='-';
			}
		}else if (num>=70) {
			hak = 'C';
			if(num>=75) {
				sh='+';
			}else {
				sh='-';
			}
		}else if (num>=60) {
			hak = 'D';
			if(num>=65) {
				sh='+';
			}else {
				sh='-';
			}
		}else {
			hak = 'F';
			sh=' ';
		}
		
		System.out.printf("����� ������ %c%s", hak,sh);
		
		*/
		
		
		/*
		if(num >= 90) {
			if(num>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A-");
			}
		}else if (num>=80) {
			if(num>=80) {
				System.out.println("B+");
			}else {
				System.out.println("B-");
			}
		}else if (num>=70) {
			if(num>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C-");
			}
		}else {
			System.out.println("F");
		}
		
		*/
	
		//�� ���� �Է¹޾Ƽ� ����ȣ??
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a = scan.nextInt();
		System.out.println("���� ��ȣ�� �Է��ϼ���.");
		String str = scan.next(); //nextLine�� nextint���� ���� ln(���๮��)�� �����־ ����Ű�� ���� ����� �׷��� �ȵȴ�.
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = scan.nextInt();
		
//		char ch = str.charAt(0);
		
		switch (str) {
		case "+" :
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-" :
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*" :
			System.out.println(a+"x"+b+"="+(a*b));
			break;
		case "/" :
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		}
		
		
		
	}
}
