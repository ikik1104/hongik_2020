import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		/* 특수문자가 하나라도 있어야 한다.
		 * 대문자가 하나라도 있어야한다
		 * 길이는 8자리 이상
		 * 
		 * 주민번호 입력받는다. 888888-8888888
		 * 전화번호 입력받는다. 010-1111-1111
		 * 분리해서 출력
		 * 
		 * 
		 * "비밀번호 입력 앞뒤 빈공백을 입력하시면 안됩니다."
		 * 비밀번호 입력받아서 공백받으면 지우고 입력값 출력
		 * */
		
		//
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1)비밀번호 입력    2)split  3)trim");
		switch (scan.nextInt()) {
		case 1:
			
//			System.out.println("비밀번호를 입력하세요.");
//			String pw = scan.next();
//			
//			if(pw.length() >= 8) {
//				for (int i = 0; i < pw.length(); i++) {
//					if((pw.charAt(i)>='0'&&pw.charAt(i)<='9')||(pw.charAt(i)>='a'&&pw.charAt(i)<='z') ||
//							(pw.charAt(i)>='A'&&pw.charAt(i)<='9'))
//				}
//			}
			
//			int chk1 = 0;
//			int chk2 = 0;
//
//				if(pw.length() >= 8) {
//					for (int i = 0; i < pw.length(); i++) {
//						char ch = pw.charAt(i);
//						if(ch >= 'A' && ch <= 'Z') {   chk1++;	}
//						if((ch >=33 && ch <=47) || (ch >=58 && ch<=64)||(ch >=91 && ch <=96)) {  chk2++; }
//					}
//				} else {
//					System.out.println("(8자리 이하) 비밀먼호를 다시 입력하세요.");
//					break;
//				}
//				
//				if(chk1==0 || chk2==0) {
//					System.out.println("다시입력");
//				}else {
//					System.out.println("입력완료");
//				}
			break;
		case 2:
			System.out.println("주민번호 입력");
			String jumin = scan.next();
			String[] j = jumin.split("-");
			
			for (int i = 0; i < j.length; i++) {
				System.out.println(j[i]);
			}
			System.out.println("-----------------------------");
			
			System.out.println("전화번호 입력");
			String tel = scan.next();
			String[] t = tel.split("-");
			
			for (int i = 0; i < t.length; i++) {
				System.out.println(t[i]);
			}
			
			break;
		case 3:
			System.out.println("비밀번호를 입력하세요");
			String pass = scan.next();
			System.out.println(pass.trim().replaceAll(" ", ""));
		default:
			break;
		}
		
		
	}
}
