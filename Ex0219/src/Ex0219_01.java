import java.util.Scanner;

public class Ex0219_01 {

	public static void main(String[] args) {
		//��Ģ���� ���α׷�
		
		Scanner scan  = new Scanner(System.in);
		int[] input = new int[2];
		
		int result =0;
		while(true) {
		
			System.out.println("        [ ��Ģ���� ���α׷� ]");
			System.out.println("-------------------------------");
			System.out.println("   1.���ϱ�    2.����   3.���ϱ�   4.������");
			System.out.println("�ش��ϴ� ���α׷��� �����ϼ���. >>");
			
			switch (scan.nextInt()) {
			case 1:
				System.out.println("���ϱ� ���α׷�");
				input = print(input);
				result = add(input[0], input[1]);
				System.out.println("�����"+result);
				break;
			case 2:
				System.out.println("���� ���α׷�");
				input = print(input);
				result = subtract(input[0], input[1]);
				System.out.println("�����"+result);
				break;
			case 3:
				System.out.println("���ϱ� ���α׷�");
				input = print(input);
				test1(input[0], input[1]);
				break;
			case 4:
				System.out.println("������ ���α׷�");
				input = print(input);
				test2(input[0], input[1]);
				break;
			default:
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
		}
		
	}//main
	
	//����Ʈ �޼���
	static int[] print(int[] input) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1��° ���ڸ� �Է��ϼ���. >>");
		input[0] = scan.nextInt();
		System.out.println("2��° ���ڸ� �Է��ϼ���. >>");
		input[1] = scan.nextInt();
		
		
		return input;
	}
	
	//���ϱ� �޼ҵ�
	static int add (int a, int b) {
		int result = 0;
		result = a + b;
		return result;
	}

	//���� �޼ҵ�
	static int subtract (int a, int b) {
		int result = 0;
		result = a - b;
		return result;
	}
	
	//���ϱ� �޼ҵ�
	static void test1 (int a , int b) {
		System.out.println("��� �� :"+ a*b);
	}
	
	//������ �޼ҵ�
	static void test2 (int a , int b) {
		System.out.println("��� �� :"+ a/b);
	}
	

}//class
