import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		//16진수를 2진수 변환
		
		// 영문 소문자 받아서 영문대문자 변환하는 프로그램을 만들어보세요.
		Scanner scan = new Scanner(System.in);
		
		String a;
		
		char ch = ' ';
		String b1;
		int len = 0;
		
		while(true) {
		System.out.println("알파벳를 입력하세요.");
		a = scan.next();
		String b ="";
		
		for (int i = 0; i < a.length(); i++) {
			
			ch = a.charAt(i);
			if(ch>='a' && ch <='z') {
				b += (char)(ch-32)+"";
			}else {
				b += (char)(ch+32)+"";
			}
		}
		System.out.println(b);
		
//		len = a.length();
		
//		b= a.toUpperCase(); //대문자 변환
//		b1= a.toLowerCase(); //소문자 변환
		
//		System.out.println("전부 대문자 :"+b);
//		System.out.println("전부 소문자 :"+b1);
//		System.out.println("문자열 길이 :"+len);
		}
		
		/*
		if(!(b>='a' && b <='z')){
			b= (char)(b+32);
		}else {
			b= (char)(b-32);
		}
		System.out.println(b);
		}
		*/
		
		/*
		String in_str = "";
		char ch = ' ';
		
		System.out.println("문자를 입력하세요 >> ");
		in_str = scan.next();
		ch = in_str.charAt(0);
		
		if(ch>='a' && ch <='z') {
			ch = (char)(ch-32);
		}else{
			ch = (char)(ch+32);
		}
		
		*/
		
		
		/*
		char[] hex = {'7','C','A','F','E'}; //a=10,b=11,c=12
		String result = "";
		String[] binary = {
			"0000","0001","0010","0011","0100","0101","0110","0111",
			"1000","1001","1010","1011","1100","1101","1110","1111"			
		};

		for (int i = 0; i < hex.length; i++) {
			if(hex[i]>='0' && hex[i] <='9') {
				result += binary[hex[i]-'0']+" ";
			}else {
				if(hex[i]>='A' && hex[i] <='z') {
					
					hex[i] = (char)(hex[i] + 32);
				}
				result += binary[hex[i]-'a'+10]+" "; //만약 c ->99-97+10 = 12
			}
		}
		
		System.out.println("hex : " + new String(hex));
		System.out.println("result : "+ result);
		
		*/
	}
}
