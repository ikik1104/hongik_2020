import java.util.Scanner;

public class Ex0219_03 {

	public static void main(String[] args) {
		//���� ���ϱ� ���α׷�
		//1. ���簢��   2.���ﰢ��  3.��  4.������  5. ���簢��
		// while true -> switch 1 2 3 �޼ҵ� �и�
		Scanner scan = new Scanner(System.in);
		int select=0;
		int[] input = new int[2];
		int input1 = 0;
		
		
		while(true) {
			print();
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("���簢���� ����");
				case1(input);
				break;
				
				
			case 2:
				System.out.println("���ﰢ���� ����");
				case2(input);
				break;
				
				
			case 3:
				System.out.println("���� ����");
				case3(input1);
				break;
				
				
			case 4:
				System.out.println("�������� ����");
				case4(input);
				break;

			
			case 5:
				System.out.println("���簢���� ����");
				case5(input1);
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
		}//while
	}//main

	static void print() {
		System.out.println("-----------------------------------------");
		System.out.println("           [ ���� ���ϱ� ���α׷�  ] ");
		System.out.println("1.���簢��    2.���ﰢ��    3.��    4.������     5. ���簢��");
		System.out.println("-----------------------------------------");
	}
	
	static int num1(String a1) {
		Scanner scan= new Scanner(System.in);
		System.out.println(a1+"�� �Է��ϼ���. >>");
		
		return scan.nextInt();
	}
	
	static int[] num2(String a1, String a2,int[] input) {
		Scanner scan= new Scanner(System.in);
				
		System.out.println(a1+"�� �Է��ϼ���. >>");
		input[0] = scan.nextInt();
		System.out.println(a2+"�� �Է��ϼ���. >>");
		input[1] = scan.nextInt();
		
		return input;
	}
	
	static void case1 (int[] input) { //���簢��
		num2("����","����",input);
		System.out.println("���簢���� ���� :"+ (input[0]*input[1]));
	}
	
	static void case2 (int[] input) { //���ﰢ��
		input = num2("����","����",input);
		System.out.println("���ﰢ���� ���� :"+ (0.5*input[0]*input[1]));
		}
	
	static void case3 (int input1) { //��
		input1 = num1("������");
		System.out.println("���� ���� :"+ (3.14*input1*input1));
	}
	
	static void case4 (int[] input) { //������
		input = num2("�� �밢��","�ٸ� �밢��",input);
		System.out.println("�������� ���� :"+ (0.5*input[0]*input[1]));
	}
	
	static void case5 (int input1) { //���簢��
		input1 = num1("�� ���� ����");
		System.out.println("���簢���� ���� :"+ (input1*input1));
	}
	
}
