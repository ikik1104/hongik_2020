
public class Ex20200131_02 {
public static void main(String[] args) {
	
//	int i=5;
//	int j=0;
//	
//	j= ++i;
//	
//	System.out.println("i�� �� : "+i);
//	System.out.println("j�� �� : "+j);
//	
//	int i2=5;
//	int j2=0;
//	
//	j2=i2++;
//	
//	System.out.println("i2�� �� : "+i2);
//	System.out.println("j2�� �� : "+j2);
//
	int i3=5;
	int j3=0;
	
	j3=i3--;
	
	System.out.println("i3�� �� : "+i3);
	System.out.println("j3�� �� : "+j3);

	int i4=5;
	int j4=0;
	
	j4=--i4;
	
	System.out.println("i4�� �� : "+i4);
	System.out.println("j4�� �� : "+j4);

	byte a=10;
	byte b=20;
	byte c=(byte)(a+b); // byte + byte -> int + int -> int ���� int c=a+b; �� ������
		
	System.out.println(c);
	
	int a1=1000000;
	int b1=2000000;
	long c1=(long)a1*b1; // int*int -> int �̹Ƿ� long���� ������ �Ϸ��� �Ѱ��� ����ȯ�ص� ���� long * int -> long
	
	System.out.println(c1);
	
	int a2=10;
	int b2=3;
	double c2=a2/b2; // int/int -> 3.0 �� ���� 
	double c3=(double)a2/b2; //3.33333...�� �������� �Ѱ��� double�� ����ȯ
	
	System.out.println(c2);
	System.out.println(c3);
	
	int c_1=1000000*1000000/1000000; //������ �����ϸ� �����÷ο찡 �߻��ؼ� 100���� �ƴ� -727�� ����
	int d_1=1000000/1000000*1000000; //�����⸦ �����ϸ� �����÷ο찡 �߻����� �ʾƼ� 100���� ��µ� 
	long c_2=1000000*1000000L/1000000;
	
	System.out.println(c_1); 
	System.out.println(d_1);
	System.out.println(c_2);
	
	char k1='a';
//	char k2=k1+1; ����
	char k3=(char)(k1+1);

	System.out.println(k3);
	
	char k2 = ++k1;
	
	System.out.println(k2);
	
	int i= 'B' -'A'; //66-65 = 1 (char - char -> int - int -> int) �� ������ ���� ���� 
	
	System.out.println(i);
	
	int i2= '2' - '0'; //���� 2���� ���� 0�� ���� �� (50-48=2)
	
	System.out.println(i2);
	
	char m='7';
	char n='0';
	char p='2';
	
	int p_1=m-n;  
	int p_2=m+n;
	System.out.println("���� 2 ���ϱ� ���� 0 ����� ���� 7: " +m+n+p); //������ ���ڸ� ���ϸ� �׳� ���ڳ����� ����
	System.out.println(p_1); //������ ���ڸ� ������ ���ڷ� �ٲٷ��� ����'0'�� ���ָ� �ȴ� 
	System.out.println(p_2); 
	
	float pi=3.141592f;
	float shortPi=(int)(pi*1000)/1000f;
	float shortPi_1=(int)(pi*10000)/10000f;
	System.out.println(shortPi);
	System.out.println(shortPi_1);
	
	//10 ������ 3 = 3.33333... �ε� 3.33������ ���
	
	int m1=10;
	int m2=3;
	float m3=(float)m1/m2;
	float m4=(int)(m3*100)/100f;
	
	System.out.println(m3);
	System.out.println(m4);
	
	float pi_1=3.141592f;
	float shortPi_2=Math.round(pi * 1000)/1000f; //Math.round �� �Ҽ��� ù°�ڸ����� �ݿø��� ���� ��ȯ
	
	System.out.println(shortPi_2);
	
	float c_3=7.2399981f;
	float shortc_3=Math.round(c_3*100)/100f;
	
	System.out.println(shortc_3);
	
	
	
	
}
}
