
public class Ex20200131_02 {

	public static void main(String[] args) {

	//������
		
		int i = 5;
		int j = 0;
		
		j = --i ;
		
		System.out.println("i�� �� : "+ i);
		System.out.println("j�� ��  : "+ j);
		
		
		int i2 = 5;
		int j2 = 0;
		
		j2  = i2--;
		
		System.out.println("i�� �� : "+ i2);
		System.out.println("j�� ��  : "+ j2);
		
		
		byte a = 10;
		byte b = 20;
		byte c = (byte) (a + b);  //���ϱ��ϸ� ������ int�� �ٲ��.
		System.out.println(c);
	
		
		int a1 = 1000000;
		int b1 = 2000000;
		long c1 = (long)a1 * b1; //�Ѱ��� ������ �ٲ��൵ �� ū ������ ����ȯ�� �Ͼ��.
		
		System.out.println(c1);
		
		
		int a2 = 10;
		int b2 = 3;
		double c2 = (double)a2/b2;
		
		System.out.println(c2);
		
		int d1 = 1000000 * 1000000 / 1000000;
		int e1 = 1000000 / 1000000 * 1000000; 
		
		System.out.println(d1+"  ,  "+e1);
		
		
		char d2 = 'a';
		char e2 = (char)(d2 + 1);
		
		System.out.println(e2);

		
		char d3 = ++d2;
		System.out.println(d3);
		
		
		int i1 = 'B' - 'A' ; //int - int �� ��ȯ�ȴ�. ������ ������ int�� ���Ѵ�.
		System.out.println(i1);
		
		int i3 = '2' - '0';
		System.out.println(i3);
		
		char f = '7';
		char g = '0';
		char h = '2';
		
		int i4 = f-g ;
		System.out.println(i4);
		System.out.println("���� 2 ���ϱ� ���� 0 = "+f+g+h);
		
		
		float pi = 3.174592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		
		System.out.println(shortPi);

		//______________________________________ ���ϴ¸�ŭ �Ҽ��� ���ϱ�
		
		int aa = 10;
		int bb = 3;
		double cc = (double)aa/bb;
		
		double pi2 = (int)(cc*100)/100.0;
		
		System.out.println(pi2);
		
		float pi3 = 3.141592f;
		float shortPi3 = Math.round(pi3*1000)/1000f;
		
		System.out.println(shortPi3);
		
		float pi4 = 7.239981f;
		float shortPi4 = Math.round(pi4*100)/100f;
		
		System.out.println(shortPi4);
	
	}
	
}
