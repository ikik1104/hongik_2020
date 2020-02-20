
public class OverflowEx {
	public static void main(String[] args) {
		short sMin = -32768;
		short sMax = 32767;
		char cMin = 0;
		char cMax = 65535;
		
		int iMin = -2147483648;
		int iMax = 2147483647;
		
		
		System.out.println("sMin   = "+	sMin);
		System.out.println("sMin-1 = "+	(short)(sMin-1));
		System.out.println("sMax   = "+	sMax);
		System.out.println("sMax+1 = "+	(short)sMax+1);
		System.out.println("cMin   = "+	(int)sMin);
		System.out.println("cMin-1 = "+	(int)--cMin);
		System.out.println("cMax   = "+	(int)cMax);
		System.out.println("Max+1 = "+	(int)++cMax);
		System.out.println("iMin   = "+	(int)iMin);
		System.out.println("iMin-1 = "+	(int)--iMin);
		System.out.println("iMax   = "+	(int)iMax);
		System.out.println("iMax+1 = "+	(int)++iMax);
		
		
		
	}
}
