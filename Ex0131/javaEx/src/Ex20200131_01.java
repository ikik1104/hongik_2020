
public class Ex20200131_01 {

	public static void main(String[] args) {

	
		
//		char ch1='a';
//		char ch2='A';
//		char ch3=65; //��ȣ�� �־ �� ��ȣ�� �ش�Ǵ� ���ڰ� ���� (�ƽ�Ű����)
//		char ch4=65+1;
//		char ch5=97;
//		char ch6=97-32;
//		
//		System.out.println("ch1 ���� ��� : "+ch1);
//		System.out.println("ch2 ���� ��� : "+ch2);
//		System.out.println("ch3 ���� ��� : "+ch3);
//		System.out.println("ch4 ���� ��� : "+ch4);
//		System.out.println("ch5 ���� ��� : "+ch5);
//		System.out.println(ch6);
//		
		
//		-----------------------------------------------------------------
		
//		//�빮�� C�� �ҹ��ڷ� ����غ�����.
//		//�ҹ��� k�� �빮�ڷ� ����غ�����.
//		
//		char ch10 = 67+32;
//		char ch11 = 107-32;
//		
//		System.out.println(ch10);
//		System.out.println(ch11);

//		boolean power = true;
//		char ch = 'A';
//		char ch1 = '\u0041';
//		char tab = '\t';
//		byte b = 127;
//		short s = 32767;
//		int i = 100;
//		int oct = 0100;
//		int hex = 0x100;
//			
//		float f = 3.14f;
//		double d = 3.14d;
//		float f1= 100f;
//		
//		
//		System.out.println(power);
//		System.out.println(ch);
//		System.out.println(ch1);
//		System.out.println(tab);
//		System.out.println(b);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(i);
//		System.out.println(oct);
//		System.out.println(hex);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//		System.out.println(f1);
		
//		-----------------------------------------------------------------	
		
//		int score=10;
//		int num=5;
//		final int NUM2=12;
//		num=3;
		
		
//		//���� 100��, ���� 99��
//		int kor=100;
//		int eng=99;
//		
//		String str = "abcdef";
//		String str1 = new String("abc"); //String�� class �� �ϳ�
//		
//		Ex20200131_02 str3 = new Ex20200131_02("abcd"); //������ ������ ���� ���� ���� �� �ִ� ������ Ŭ�������� �����ͼ� ��� �����ϱ� ������
//		
//			
//		System.out.println("�� ���� �� : "+score+num); // ������ ��µǴ� ��ɾ�, System�� class �� �ϳ� 
//		System.out.println("����� �� :"+NUM2);
//		
//		System.out.println("�� ���� �� : "+(kor+eng));
//		System.out.println("�� ���� �� : "+(kor-eng));
//		System.out.println("�� ���� �� : "+(kor*eng));
//		System.out.println("�� ���� ���� : "+(kor/eng));
//		
//		System.out.println(str1);

		
//		-----------------------------------------------------------------
		
		char ch='A';
//		char ch1='AB'; ���� (���� �ϳ��� ��� ����)
		String s1="AB";
//		char ch2=''; ���� (���� �ϳ��� ����� �ʿ���)
		String s2="";
		String s3="A"+"B";
		String s4=""+7;
		String s5=""+7+7; //�� ���ڿ��� ���� ������ ������ �� ���Ŀ� ���� 7�� ���ڿ� 7
		String s6=7+7+""; //���ڰ� ���� ������ ������ �� ���� ��ģ  ���� ����
		
		
		System.out.println(ch);
//		System.out.println(ch1);
		System.out.println(s1);
//		System.out.println(ch2);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
		
//		-----------------------------------------------------------------
		
		byte b=127;
		b=(byte)(b+1);
		
		System.out.println(b);
		
		int a_1=100000000;
		int b_1=200000000;
		int c=a_1*b_1;
		long c_1=a_1*b_1;
		
		System.out.println(c);
		System.out.println(c_1);
		
		
//		-----------------------------------------------------------------		
		
		float f=1.6f;
		int i=(int)f; //����ȯ -> float�� �� ���� ũ�� ������ (int)�� �߰��ؼ� ����ȯ�� ����� ��. int�� �����̹Ƿ� 1�� �Էµȴ�
		
		System.out.println(i);
		
		int j=5 ;
		float k=j; //������ 4byte��� float�� �Ǽ��� �� ũ�� ������ ����ȯ ���� float�� ���� �� ����. float�� �Ǽ� �̹Ƿ� 5.0���� ��µ�
		
		System.out.println(k);
		
		int ch_1=65;
		char cha_1= (char)ch_1; //int(4byte)�� �� ũ����, ���ڷ� ��ȯ�ϱ� ���ؼ��� char �־ ����ȯ �ʿ�
		
		System.out.println(cha_1);
		
		
		char dd = 'a';
		int ch_2=dd; //�ҹ��� a �ش��ϴ� �ƽ�Ű �ڵ� 97�� ����� ��
		
		System.out.println(ch_2);
		
		int i2=300;
		byte b_2=(byte)i2; //300�� ������, �ִ���� 127�̶� 300-(128*2) = 44 �� ��µ�
		
		System.out.println(b_2);
		
//		-----------------------------------------------------------------		
				
		
		
	}
}
