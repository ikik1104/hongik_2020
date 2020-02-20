import java.util.Scanner;

public class Ex0217_02_test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		String a ;
		
		while(true) {
			System.out.println("알파벳을 입력하세요.");
			a = scan.next();
			
			String b = "";
			
			for (int i = 0; i < a.length(); i++) {
				ch = a.charAt(i);
				if(ch <= 'z' && ch>= 'a') {
					b += (char)(ch-32);
				}else {
					b += (char)(ch+32);
				}
			}
			
			System.out.println(b);
			
		}
	}
}
