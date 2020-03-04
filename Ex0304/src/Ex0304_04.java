import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		
		/*	1.주민번호를 받아서 남자인지 여자인지 확인하시오.
		 * 	13자리만 입력, 숫자만 입력되어야한다.
		 * 
		 * 	2. 학번을 입력받아 무슨 과인지를 확인하시오
		 * 	컴퓨터학과 	c0001
		 * 	영문학과 	e0002
		 * 	국문학과 	k0003
		 * 
		 * 	3. 한국 (kor),
		 * */
		Scanner scan = new Scanner(System.in);
		
		loop1:
		while(true) {
		System.out.println("1) 주민번호 확인   2)과 확인   3)항공사 확인  4)이메일 입력");
		
		switch (scan.nextInt()) {
		case 1:
			System.out.println("주민번호 숫자만 입력");
			String jumin = scan.next();
			if(jumin.length() > 13) {
				System.out.println("잘못된 입력입니다. (13자리 초과)");
				break;
			}
			
			for (int i = 0; i < jumin.length(); i++) {
				if(!(jumin.charAt(i) >= 48 && jumin.charAt(i) <= 57)) {
//					if(!(jumin.charAt(i) >= '0' && jumin.charAt(i) <= '9')) {
					System.out.println("숫자만 입력하세요.");
					continue loop1;
				}
			}
			
			if(jumin.charAt(6) == '1' || jumin.charAt(6) == '3') {
				System.out.println("남성입니다.");
			}else if(jumin.charAt(6) == '2' || jumin.charAt(6) == '4') {
				System.out.println("여성입니다.");
			}else {
				System.out.println("입력이 바르지 않습니다.");
			}
			break;
		case 2:
			System.out.println("학번을 입력하세요");
			String hak = scan.next();
			if(hak.contains("c")) {
				System.out.println("컴퓨터 학과입니다.");
			}else if(hak.contains("e")) {
				System.out.println("영문학과 입니다.");
			}else if(hak.contains("k")) {
				System.out.println("국문학과 입니다.");
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			break;
		case 3:
			System.out.println("영어를 입력하세요.");
			String air = scan.next();
			if(air.equalsIgnoreCase("KE")) {
				System.out.println("대한 항공입니다");
			}else if(air.equalsIgnoreCase("OZ")) {
				System.out.println("아시아나 항공입니다");
			}else if(air.equalsIgnoreCase("AF")) {
				System.out.println("에어프랑스 항공입니다");
			}else {
				System.out.println("일치하는 항공사가 없습니다.");
			}
			break;

		case 4:
			System.out.println("이메일을 입력하세요.");
			String email = scan.next();
			
			if(email.contains("@")) {
				if(email.contains(".")) {
					System.out.println("이메일이 입력되었습니다.");
				}else {
					System.out.println("이메일이 올바르지 않습니다.");
				}
			}else {
				System.out.println("이메일이 올바르지 않습니다.");
			}
			
		default:
			break;
		}
		
		}
	}
}
