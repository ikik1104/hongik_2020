import java.util.Scanner;

public class Ex0203_04 {
	public static void main(String[] args) {
		
		//�빮�ڸ� ������ �ҹ��ڰ� ��� �ǵ���
		
		Scanner scan = new Scanner(System.in);
		
		/* �빮�� -> �ҹ���----------------------------------------------------------
		System.out.println("�빮�ڸ� �ϳ� �Է����ּ���.");
		String str = scan.nextLine();

		//�Է¹��� String�� char�� ����ȯ
		char ch = str.charAt(0); //()������ �ε����� ����  char�� 1ĭ�̱� ������?
		char ch2 = (char)(ch+32);
		
		System.out.println("�Է��� �빮�� : "+ str );
		System.out.println("����� �ҹ��� : "+ ch2 );
		*/
		
		
		/*�ҹ��� -> �빮��----------------------------------------------------------
		System.out.println("�ҹ��� �ϳ��� �Է��ϼ���.");
		String str2 = scan.nextLine();
		
		char ch3 = str2.charAt(0);
		char ch4 = (char)(ch3-32);
		
		System.out.println("�Է��� �ҹ��� : "+ str2);
		System.out.println("����� �빮�� : "+ ch4);
		*/
		
		
		
		/* char�� ��Ʈ��----------------------------------------------------------
		System.out.println("���ڵΰ��� �Է��ϼ���.");
		String a1 = scan.nextLine();

		char ch = a1.charAt(0);
		char ch1 =a1.charAt(1);
		
		int aa = ch-'0'; // ******** char�� '0'�� ���ָ� ��Ʈ�� ��ȯ�� �����ϴ�.
		int bb = ch1-'0';
		
		int total = aa+bb;
		
		System.out.println("�� ���� �� : "+ total);
		*/
		
		
		/*
		//���� 7���� �ѹ��� �޾Ƽ� ������ ���ڸ� ���غ�����. ���ڵ� ����ϰ� ���ؼ� �հ�
		System.out.println("���� 7���� �Է����ּ���.");
		String a = scan.nextLine();
		
		char a1 = a.charAt(0);
		char a2 = a.charAt(1);
		char a3 = a.charAt(2);
		char a4 = a.charAt(3);
		char a5 = a.charAt(4);
		char a6 = a.charAt(5);
		char a7 = a.charAt(6);
		
		int b1 = a1 - '0';
		int b2 = a2 - '0';
		int b3 = a3 - '0';
		int b4 = a4 - '0';
		int b5 = a5 - '0';
		int b6 = a6 - '0';
		int b7 = a7 - '0';
		
		int total = b1+b2+b3+b4+b5+b6+b7;
		int minus = b1-b2-b3-b4-b5-b6-b7;
		int g1 = b1*b2*b3*b4*b5*b6*b7;
		
		System.out.println("1��° �Է��� �� : "+ b1);
		System.out.println("2��° �Է��� �� : "+ b2);
		System.out.println("3��° �Է��� �� : "+ b3);
		System.out.println("4��° �Է��� �� : "+ b4);
		System.out.println("5��° �Է��� �� : "+ b5);
		System.out.println("6��° �Է��� �� : "+ b6);
		System.out.println("7��° �Է��� �� : "+ b7);
		System.out.println("���ڵ��� �� : " + total);
		System.out.println("���ڵ��� �� : " + minus);
		System.out.println("���ڵ��� �� : " + g1);
		
		*/
		
		
		//prinf
		//System.out.println(10.0/3);
		
		//(********* 	���� : %d , �Ǽ� : %f , ���� : %c, ���ڿ� : %s 	*********)
		// %n ���๮�� (��ĭ �������� ����� �ȴ�.)
		
		
		/*
		int a = 5;
		int b = 10;
		
		System.out.printf("ù��°���� : %d, �ι�° ���� : %d%n", a,b);
		*/
		
		//3���� ���ڸ� �Է¹޾Ƽ� printf�� ����Ͽ� ���ٷ� �����İ� �Բ� ���-----------------------------------------
		/*
				System.out.println("ù��° ���ڸ� �Է��ϼ���.");
				int a = scan.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
				int b = scan.nextInt();
				System.out.println("����° ���ڸ� �Է��ϼ���.");
				int c = scan.nextInt();
				int abc = a+b+c;
				int abc1 = a-b-c;
				int abc2 = a*b*c;
				float abc3 = a/b/c;
				
				System.out.printf("���ϱ� : %d + %d + %d = %d%n",a,b,c,abc);
				System.out.printf("���� : %d - %d - %d = %d%n",a,b,c,abc1);
				System.out.printf("���ϱ� : %d * %d * %d = %d%n",a,b,c,abc2);
				System.out.printf("������ : %d / %d / %d = %.2f",a,b,c,abc3);
		 */
		
		
				
				
	}
}
