import java.util.Scanner;

public class Ex0204_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ran = (int)(Math.random()*45)+1; // 	���� ���� �̱� *(int)(Math.random()*�ִ��)+1;
		
		//  10/3.0 =3.33333 int/double -> double
		//  10/3 = 3 -> int/int ->int
		
		/*
		// ***** O X �� ��  (2������ ������ ����� �װ� ���ߴ� ���� )
		int ox = (int) (Math.random()*2)+1;  //1~2 ������ ������ ��
		
		System.out.println("�����ϴ� ��ȣ�� �Է��ϼ���. 1 or 2");
		int ox_true = scan.nextInt();
		
		if ( ox == ox_true ) {
			System.out.printf("�����Դϴ�. �������� %d", ox);
		}else {
			System.out.printf("�����Դϴ�. �������� %d", ox);
		}
		*/
		
		
		//3���Է� �´��� Ʋ����
		/*
		System.out.println("1 ~ 45 ù��° ���ڸ� �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("1 ~ 45 �ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan.nextInt();
		System.out.println("1 ~ 45 ����° ���ڸ� �Է��ϼ���.");
		int num3 = scan.nextInt();
		
		int num = (int)(Math.random()*45)+1; //������ ����
		
		
		if(num == num1 || num == num2 || num ==num3) {
			System.out.printf("��÷�Ǿ����ϴ�. �Է��� ���� : %d,%d,%d ��÷ ���� : %d", num1,num2,num3,num);
		}else {
			System.out.printf("��÷���� �ʾҽ��ϴ�. �Է��� ���� : %d,%d,%d ��÷ ���� : %d", num1,num2,num3,num);
		}
		*/
		
		//4~10 2���� ���� �Է�
		
		System.out.println("4~10������ ù��° ���ڸ� ������");
		int num1 = scan.nextInt();
		System.out.println("4~10������ �ι�° ���ڸ� ������");
		int num2 = scan.nextInt();
		int random  = (int)(Math.random()*7)+4; // 4 <= x < 11 
		
		if(num1 == random || num2==random) {
			System.out.printf("��÷�Ǿ����ϴ�. �������� %d,%d  ������ : %d", num1,num2,random);
		}else {
			System.out.printf("��÷�� �ƴմϴ�. �������� %d,%d  ������ : %d", num1,num2,random);
		}
		
	}
}
