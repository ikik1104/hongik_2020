import java.util.Scanner;

public class Ex0203_05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("�Ǽ��� �Է��ϼ���.");
		double num1 = scan.nextDouble();
		
		System.out.println("round �ݿø� : "+Math.round(num1)); //round �ݿø�
		System.out.println("ceil�� �����ϱ��? : "+Math.ceil(num1));// ceil �ø�
		System.out.println("floor�� �����ϱ��?"+Math.floor(num1)); //floor ����
		*/
		
		
		/*
		//�Ǽ�  �Ҽ� 5° �ڸ� ���ڸ� �Է¹޾Ƽ� 4°�ڸ����� �ݿø�
		//�� ���� ����Ͻÿ�.
		System.out.println("�Ǽ��� �Ҽ� 5°�ڸ����� �Է��ϼ���.");
		double a1 = scan.nextDouble();
		System.out.println((Math.round(a1*1000))/1000.0); //�Ǽ��� �ٲ��࿩�ؼ� �Ǽ���
		System.out.println();
		*/
		
		/*
		System.out.println("���ڸ� �Է����ּ���.>>");
		int a1 = scan.nextInt();
		
		System.out.println("a1�� ���밪��?"+(a1>=0?a1:-a1));
		*/
		
		
		/* ������ �Է��ϰ� �հ�/���հ��� �Ǻ��ϱ�
		System.out.println("���ڸ� �Է����ּ���.>>");
		int a1 = scan.nextInt();
		System.out.println("a1��? : "+(a1>=0?(a1==0?"0":"���"):"����"));
		*/
		
		//60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ�
		
		/*
		System.out.println("������ �Է��ϼ���.");
		int a = scan.nextInt();
		System.out.println(a>=60?"�հ�":"���հ�");
		*/
		
		/* ȸ������� �˾ƺ���
		System.out.println("ȸ����ȣ�� �Է��ϼ���.");
		String num = scan.nextLine();
		
		char ch1 = num.charAt(0);
		int aa = ch1 - '0';
		String str = aa==1?"vip":(aa==2?"gold":(aa==3?"silver":"�����"));
		System.out.println("ȸ����� : "+(aa==1?"vip":(aa==2?"gold":(aa==3?"silver":"�����"))));
		System.out.printf("����� ����� %s �Դϴ�. %n", str);
		*/
		
		
		/*  2�� ������� Ȯ���غ���
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		int num1 = num % 2 ; //�������� ���ϴ� �ۼ�Ʈ
		
		System.out.println("2�� ���"+(num1==0?"�Դϴ�.":"�� �ƴմϴ�."));
		*/
	}
}
