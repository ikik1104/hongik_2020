import java.util.Scanner;

public class Ex0211_07 {

	public static void main(String[] args) {
		
		
		
		
		/*�Ҽ��� �ڸ����� �Է��Ͽ� ��Ģ���� ���ϱ�
		 * ��Ģ����
		 * 
		 * �Ҽ����� 2°�ڸ����� ��Ÿ���� �ֵ��� �غ�����.
		 * 
		 * ����2���� �Է¹޴µ� �Ҽ����ڸ����� �޴´�
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double num1 = 0.0;
		double num2 = 0.0;
		
		System.out.println("�Ҽ� 2���� �Է��ϼ���");
		System.out.print("ù��° �Ҽ� >> ");
		num1 = scan.nextDouble();
		System.out.print("�ι�° �Ҽ� >> ");
		num2 = scan.nextDouble();
		
		System.out.printf("�� ���� ���ϱ� : %.2f%n",num1+num2);
		System.out.printf("�� ���� ���� : %.2f%n",num1-num2);
		System.out.printf("�� ���� ���ϱ� : %.2f%n",num1*num2);
		System.out.printf("�� ���� ������ : %.2f%n",num1/num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
