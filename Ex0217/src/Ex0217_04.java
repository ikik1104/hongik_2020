import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		
		/*
		//��,��,int 24,60 �� float-59.5�Ҽ��� ù°�ڸ����� ���� 10���� time�� �޽��ϴ�.
		//�迭�� �����ؼ� ��������.
		//�˶� �ð� ���� ���α׷�
		Scanner scan = new Scanner(System.in);
		Time[] t = new Time[3];
		String[] sub = {"��","��","��"};
		
		for (int i = 0; i < t.length; i++) {
			t[i] = new Time();
			System.out.println("�ø� �Է��ϼ���. >>");
			t[i].hour = scan.nextInt();
			System.out.println("���� �Է��ϼ���. >>");
			t[i].minute = scan.nextInt();
			System.out.println("�ʸ� �Է��ϼ���. >>");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		*/
		
		
		/*
		Scanner scan = new Scanner(System.in);
		int[] h = new int[10];
		int[] m = new int[10];
		float[] s = new float[10];
		
		System.out.println(" [ �˶��ð� ���� ���α׷� ] ");
		for (int i = 0; i < s.length; i++) {
			System.out.println("�ð��� �Է��ϼ���. >>");
			h[i] = scan.nextInt();
			System.out.println("���� �Է��ϼ���. >>");
			m[i] = scan.nextInt();
			System.out.println("�ʸ� �Է��ϼ���. >>");
			s[i] = scan.nextFloat();
			System.out.printf("�˶����� : %d��     %d��     %.1f��   �˶��� �����Ǿ����ϴ�. %n",h[i],m[i],s[i]);
		}
		
		*/
		
		
		
		
		/*
		for (int i = 0; i < h.length; i++) {
			System.out.println("�ø� �Է��ϼ��� 0~24");
			h[i] = scan.nextInt();
			if(h[i]<0 || h[i]>24) {
				System.out.println("���Է�");
				i--;
				continue;
			}
			System.out.println("���� �Է��ϼ��� 0~60");
			m[i] = scan.nextInt();
			if(m[i]<0 || m[i]>60) {
				System.out.println("���Է�");
				i--;
				continue;
			}
			System.out.println("�ʸ� �Է��ϼ��� ");
			s[i] = scan.nextFloat();
			if(s[i]<0.0 || s[i]>60.0) {
				System.out.println("���Է�");
				i--;
				continue;
			}
		}
		
		for (int i = 0; i < h.length; i++) {
			System.out.printf(" %d��     %d��     %.1f��   �˶��� �����Ǿ����ϴ�. %n",h[i],m[i],s[i]);
		}
		
		
		*/
	}
}
