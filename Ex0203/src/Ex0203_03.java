import java.util.Scanner;

public class Ex0203_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int input1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int input2 = scan.nextInt();

		int hap = input1+input2;
		int minus = input1 - input2;
		double g1 = input1 * input2;
		double di = input1 / input2;
		
		System.out.println("�� ���� �� : "+ (hap));
		System.out.println("�� ���� �� : "+ (minus));
		System.out.println("�� ���� �� : "+ (g1));
		System.out.println("�� ���� ������ : "+ (di));
		
		
	}
}
