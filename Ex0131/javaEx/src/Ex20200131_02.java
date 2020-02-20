
public class Ex20200131_02 {
public static void main(String[] args) {
	
//	int i=5;
//	int j=0;
//	
//	j= ++i;
//	
//	System.out.println("i의 값 : "+i);
//	System.out.println("j의 값 : "+j);
//	
//	int i2=5;
//	int j2=0;
//	
//	j2=i2++;
//	
//	System.out.println("i2의 값 : "+i2);
//	System.out.println("j2의 값 : "+j2);
//
	int i3=5;
	int j3=0;
	
	j3=i3--;
	
	System.out.println("i3의 값 : "+i3);
	System.out.println("j3의 값 : "+j3);

	int i4=5;
	int j4=0;
	
	j4=--i4;
	
	System.out.println("i4의 값 : "+i4);
	System.out.println("j4의 값 : "+j4);

	byte a=10;
	byte b=20;
	byte c=(byte)(a+b); // byte + byte -> int + int -> int 따라서 int c=a+b; 로 쓰던가
		
	System.out.println(c);
	
	int a1=1000000;
	int b1=2000000;
	long c1=(long)a1*b1; // int*int -> int 이므로 long으로 나오게 하려면 한개를 형변환해도 가능 long * int -> long
	
	System.out.println(c1);
	
	int a2=10;
	int b2=3;
	double c2=a2/b2; // int/int -> 3.0 이 나옴 
	double c3=(double)a2/b2; //3.33333...이 나오려면 한개를 double로 형변환
	
	System.out.println(c2);
	System.out.println(c3);
	
	int c_1=1000000*1000000/1000000; //곱셈을 먼저하면 오버플로우가 발생해서 100만이 아닌 -727이 나옴
	int d_1=1000000/1000000*1000000; //나누기를 먼저하면 오버플로우가 발생하지 않아서 100만이 출력됨 
	long c_2=1000000*1000000L/1000000;
	
	System.out.println(c_1); 
	System.out.println(d_1);
	System.out.println(c_2);
	
	char k1='a';
//	char k2=k1+1; 에러
	char k3=(char)(k1+1);

	System.out.println(k3);
	
	char k2 = ++k1;
	
	System.out.println(k2);
	
	int i= 'B' -'A'; //66-65 = 1 (char - char -> int - int -> int) 로 에러가 나지 않음 
	
	System.out.println(i);
	
	int i2= '2' - '0'; //문자 2에서 문자 0을 빼는 것 (50-48=2)
	
	System.out.println(i2);
	
	char m='7';
	char n='0';
	char p='2';
	
	int p_1=m-n;  
	int p_2=m+n;
	System.out.println("문자 2 더하기 문자 0 더라기 문자 7: " +m+n+p); //문자형 숫자를 더하면 그냥 숫자나열로 나옴
	System.out.println(p_1); //문자형 숫자를 숫자형 숫자로 바꾸려면 문자'0'을 빼주면 된다 
	System.out.println(p_2); 
	
	float pi=3.141592f;
	float shortPi=(int)(pi*1000)/1000f;
	float shortPi_1=(int)(pi*10000)/10000f;
	System.out.println(shortPi);
	System.out.println(shortPi_1);
	
	//10 나누기 3 = 3.33333... 인데 3.33까지만 출력
	
	int m1=10;
	int m2=3;
	float m3=(float)m1/m2;
	float m4=(int)(m3*100)/100f;
	
	System.out.println(m3);
	System.out.println(m4);
	
	float pi_1=3.141592f;
	float shortPi_2=Math.round(pi * 1000)/1000f; //Math.round 는 소수점 첫째자리에서 반올림한 값을 반환
	
	System.out.println(shortPi_2);
	
	float c_3=7.2399981f;
	float shortc_3=Math.round(c_3*100)/100f;
	
	System.out.println(shortc_3);
	
	
	
	
}
}
