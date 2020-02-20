import java.util.Scanner;

public class PrintfEx1 {
	public static void main(String[] args) {
		
		
		
		byte b = 1;
		short s =2;
		char c = 'A';
		
		int finger = 10;
		long big = 100_000_000_000L; // long big = 100000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL; 
		
		int octNum = 010; //8진수10, 10진수 8
		int hexNum = 0x10; //16진수 10, 10진수로드는 16
		int binNum = 0b10; //2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%s%n",s);
		System.out.printf("c=%c, %d %n",c,(int)c);
		System.out.printf("finger=[%5d]%n", finger);
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finger=[%05d]%n", finger);
		System.out.printf("big=%d%n",big);
		System.out.printf("hex=%#x%n",hex); //'#'은 접두사 (16진수 0x, 8진수 0)
		System.out.printf("ociNum=%#o, %d%n", octNum,octNum);
		System.out.printf("hexNum=%#x, %d%n", hexNum,hexNum);
		System.out.printf("20을 2진수로 변환: %s %n",Integer.toBinaryString(20));
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum),binNum);
		
	}
}
