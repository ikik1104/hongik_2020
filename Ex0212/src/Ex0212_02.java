import java.util.Scanner;

public class Ex0212_02 {

	public static void main(String[] args) {
		//16������ 2���� ��ȯ
		
		// ���� �ҹ��� �޾Ƽ� �����빮�� ��ȯ�ϴ� ���α׷��� ��������.
		Scanner scan = new Scanner(System.in);
		
		String a;
		
		char ch = ' ';
		String b1;
		int len = 0;
		
		while(true) {
		System.out.println("���ĺ��� �Է��ϼ���.");
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
		
//		b= a.toUpperCase(); //�빮�� ��ȯ
//		b1= a.toLowerCase(); //�ҹ��� ��ȯ
		
//		System.out.println("���� �빮�� :"+b);
//		System.out.println("���� �ҹ��� :"+b1);
//		System.out.println("���ڿ� ���� :"+len);
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
		
		System.out.println("���ڸ� �Է��ϼ��� >> ");
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
				result += binary[hex[i]-'a'+10]+" "; //���� c ->99-97+10 = 12
			}
		}
		
		System.out.println("hex : " + new String(hex));
		System.out.println("result : "+ result);
		
		*/
	}
}
