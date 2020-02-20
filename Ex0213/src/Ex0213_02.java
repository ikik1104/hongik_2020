import java.util.Scanner;

public class Ex0213_02 {
	
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);

	//16진수 -> 2진수
	//입력받아서 
//		char[] hex = {'7','C','A','F','E'};
		char[] hex = new char[10];
		String str = "";
		
		String[] binary = {	//A=10 B=11 C=12 D=13 E=14 F=15
				"0000","0001","0010","0011", //0,1,2,3
				"0100","0101","0110","0111", //4,5,6,7
				"1000","1001","1010","1011", //8,9,10,11
				"1100","1101","1110","1111"  //12,13,14,15
		};
		
		String result = ""; //result = result + "0100";
		
		System.out.println("10개 이하로 숫자입력 (0~9) 대문자만 입력해야한다.");
		str = scan.next();
//		str.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			hex[i] = str.charAt(i);
		}
		
		
		
		/*
		if(str.charAt(0)>='0' && str.charAt(0)<='9') {
			System.out.println(binary[str.charAt(0)-'0']);
		}else {
			System.out.println(binary[(str.charAt(0)-'A')+10]);
			
		}
		*/
		
		
		
		
//		/*
		for (int i = 0; i < str.length(); i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result += binary[hex[i]-'0']+" ";
			}else {
				result += binary[(hex[i]-'A')+10]+" "; //67-65 =2	+10 = 12
			}
		}
		for (int j = 0; j < str.length(); j++) {
			System.out.print(hex[j]+" ");
		}
		System.out.println();
		System.out.println(result);
//	*/
	
	
	
	}

}
