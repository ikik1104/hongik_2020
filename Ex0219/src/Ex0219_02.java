import java.util.Scanner;

public class Ex0219_02 {

	public static void main(String[] args) {
		// 1. �ִ밪 ���ϱ�  (3���� ���ڸ� �־, 1. �ִ밪,2 �ּҰ�)
		// 2. ���밪 ���ϱ�( 1���� ���ڸ� �־ ���밪�� ���ϴ°�
		//3.������ ���ϱ� (ù��° ���� 5, ������ 2 �� ������ 5*5 = 25)
		//1,2 ���ϴ� ��ȣ
		Scanner scan = new Scanner(System.in);
		
		int min = 0;
		
		loop1:
		while(true) {
			
			print();
			
			switch (scan.nextInt()) {
			case 1:
				max(); //�ִ밪 ���ϱ� �޼ҵ�
				break;
			case 2:
				min(); //�ּҰ� ���ϱ� �޼ҵ�
				break;
			case 3:
				abs();
				while(true) {
					System.out.println("���ڸ� �Է��ϼ���. (����ȭ�� : 99)");
					if(scan.nextInt() == 99) { //����ȭ�� �̵�
						break; //while ����
					}
					System.out.println("���밪 ���ϱ⸦ �����ϼ̽��ϴ�.");
					break;//while ����
				}
				break;
			case 4:
				pow();
				break;
				
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
		}
	}//main
	
	static void print () {
		System.out.println("------------------------------");
		System.out.println("       [���� ���� ���α׷� ]");
		System.out.println("------------------------------");
		System.out.println("1.�ִ밪   2.�ּҰ�   3.���밪   4.������  ");
		System.out.println("      ���ϴ� ��ȣ�� �Է��ϼ���.");
	}
	
	static void max() {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		int max = 0;
		loop2:
			
		while(true) {//�ִ밪 ���ѹݺ�
			
			input = for_int(input);
			if(input[0]==99) {
				break;
			}else if (input[0] == 0) {
				break;
			}
			
			max = Math.max(Math.max(input[0], input[1]),input[2]);
			System.out.println("�ִ밪 :"+ max);
		}
	}
	
	static void min() {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[3];
		int min = 0;
		loop2:
		while(true) {//�ִ밪 ���ѹݺ�
			input = for_int(input);
			min = Math.min(Math.min(input[0], input[1]),input[2]);
			System.out.println("�ּҰ� :"+ min);
		}
	}
	
	static void abs() {
		Scanner scan = new Scanner(System.in);
	}
	
	static void pow() {
		Scanner scan = new Scanner(System.in);
	}
	
	static int[] for_int (int[] input) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < input.length; i++) {
			System.out.println("���ڸ� �Է��ϼ���. (����ȭ�� : 99, ����: 0)");
			input[i] = scan.nextInt();
			//�ִ밪 ���ϱ�
		}//for
		return input;
	}
}//class

