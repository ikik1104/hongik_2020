
public class Ex20200131_01 {

	public static void main(String[] args) {

	
		
//		char ch1='a';
//		char ch2='A';
//		char ch3=65; //번호를 넣어도 그 번호에 해당되는 문자가 나옴 (아스키문자)
//		char ch4=65+1;
//		char ch5=97;
//		char ch6=97-32;
//		
//		System.out.println("ch1 문자 출력 : "+ch1);
//		System.out.println("ch2 문자 출력 : "+ch2);
//		System.out.println("ch3 문자 출력 : "+ch3);
//		System.out.println("ch4 문자 출력 : "+ch4);
//		System.out.println("ch5 문자 출력 : "+ch5);
//		System.out.println(ch6);
//		
		
//		-----------------------------------------------------------------
		
//		//대문자 C를 소문자로 출력해보세요.
//		//소문자 k를 대문자로 출력해보세요.
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
		
		
//		//국어 100점, 영어 99점
//		int kor=100;
//		int eng=99;
//		
//		String str = "abcdef";
//		String str1 = new String("abc"); //String도 class 중 하나
//		
//		Ex20200131_02 str3 = new Ex20200131_02("abcd"); //참조형 변수는 수도 없이 많을 수 있는 이유가 클래스명을 가져와서 사용 가능하기 때문에
//		
//			
//		System.out.println("두 숫자 합 : "+score+num); // 조건이 출력되는 명령어, System도 class 중 하나 
//		System.out.println("상수의 값 :"+NUM2);
//		
//		System.out.println("두 수의 합 : "+(kor+eng));
//		System.out.println("두 수의 차 : "+(kor-eng));
//		System.out.println("두 수의 곱 : "+(kor*eng));
//		System.out.println("두 수의 나눔 : "+(kor/eng));
//		
//		System.out.println(str1);

		
//		-----------------------------------------------------------------
		
		char ch='A';
//		char ch1='AB'; 에러 (문자 하나만 사용 가능)
		String s1="AB";
//		char ch2=''; 에러 (문자 하나가 만드시 필요함)
		String s2="";
		String s3="A"+"B";
		String s4=""+7;
		String s5=""+7+7; //빈 문자열이 먼저 나오기 때문에 그 이후에 오는 7은 문자열 7
		String s6=7+7+""; //숫자가 먼저 나오기 때문에 두 수를 합친  값이 나옴
		
		
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
		int i=(int)f; //형변환 -> float이 더 수가 크기 때문에 (int)를 추가해서 형변환을 해줘야 함. int는 정수이므로 1만 입력된다
		
		System.out.println(i);
		
		int j=5 ;
		float k=j; //동일한 4byte라고 float가 실수로 더 크기 때문에 형변환 없이 float에 넣을 수 있음. float은 실수 이므로 5.0으로 출력됨
		
		System.out.println(k);
		
		int ch_1=65;
		char cha_1= (char)ch_1; //int(4byte)가 더 크지만, 문자로 변환하기 위해서는 char 넣어서 형변환 필요
		
		System.out.println(cha_1);
		
		
		char dd = 'a';
		int ch_2=dd; //소문자 a 해당하는 아스키 코드 97이 출력이 됨
		
		System.out.println(ch_2);
		
		int i2=300;
		byte b_2=(byte)i2; //300을 넣지만, 최대수가 127이라서 300-(128*2) = 44 가 출력됨
		
		System.out.println(b_2);
		
//		-----------------------------------------------------------------		
				
		
		
	}
}
