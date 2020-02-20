import java.util.Scanner;


public class Ex0203_06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("당신의 점수를 입력하세요.");
		int check = scan.nextInt();
		
//		String str = check>=60?"합격":"불합격";
		
		if(check >60) {  //하나의 if/else는 괄호를 안써줘도 된다.
			System.out.println("합격");
		}else if(check == 60){ 
			System.out.println("재시험");
		}else {
			System.out.println("불합격");
		}
		*/
		
		
		
		
		/*
		 * System.out.println("핸드폰 번호를 입력하세요.");
		int check = scan.nextInt();
		switch(check) {
		case 1 :
			System.out.println("sk입니다.");
			break;
		case 6 :
			System.out.println("KTF 입니다.");
			break;
		case 9 :
			System.out.println("LG 입니다.");
			break;
		default :
			System.out.println("잘못된 번호입니다.");
		
		}
		*/
		
		
		
		
		
		/* if문
		if (check == 1) {
			System.out.println("sk텔레콤입니다.");
		} else if(check == 6) {
			System.out.println("KTF입니다.");
		} else if (check == 9 ) {
			System.out.println("LG입니다.");
		} else {
			System.out.println("잘못된 번호입니다.");
		}
		*/
		
		
		
		
		/*
		//점수를 입력받아 등급을 출력하기
		System.out.println("점수를 입력하세요.");
		int num = scan.nextInt();
		
		
		if(num>=90) {
			System.out.println("A");
		}else if(num>=80) {
			System.out.println("B");
		}else if(num>=70) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		*/
		
		
		
		
		/*
		int num2 = num/10 ; //앞자리만 비교하기위해 10으로 나눠준다
		switch (num2) {
		case 9 : case 10:
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
		*/
		
		
		/*
		//양수, 0 , 음수
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}else if (num ==0) {
			System.out.println("0");
		}else  {
			System.out.println("음수");
		}
		*/
		
		
		//로그인 
		/*
		String id2 = "aaa";
		int password2 = 12345;
		
		System.out.println("아이디를 입력하세요");
		String input2 = scan.nextLine();
		
		System.out.println("비밀번호를 입력하세요.");
		int inputPw2 = scan.nextInt();
		
		if(id2.equals(input2)) {
			if(password2 == inputPw2) {
				System.out.println("로그인 되었습니다.");
			} else {
				System.out.println("패스워드가 일치하지 않습니다.");
			}
		}else {
			System.out.println("해당 정보의 회원이 없습니더.");
		}
		*/
		
		
		
		//변수 -> 데이터값, 객체 -> 데이터주소
		
		/*
		char id = 'c'; 
		int password = 12345;
		
		System.out.println("아이디를 입력하세요");
		String input = scan.nextLine();
		
		char inputId = input.charAt(0);
		
		System.out.println("비밀번호를 입력하세요.");
		int inputPw = scan.nextInt();
		
		
		if(id == inputId&&inputPw==password) 
			System.out.println("로그인이 되었습니다.");
		else 
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		*/
		
		
		
		/*
		//년도 입력 20세 이상 사람들만 찾아서 그런사람이 로그인이 되면 이벤트 당첨이 되었습니다. 왕복비행기 어쩌구
		
		System.out.println("태어난 년도를 입력하세요");
		int year = scan.nextInt();
		
		if (year<=2000) {
			System.out.println("축하합니다. 왕복비행기에 당첨되었습니다.");
		}else {
			System.out.println("이벤트에 당첨되지 않았습니다.");
		}
		*/
		
		// equalsIgnorecase 대소문자 구분없이 비교
		
		/*
		System.out.println("숫자입력");
		int num = scan.nextInt();
		
		if(num<-1 || num>3 && num<5) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		*/
		
		/*
		
		//90점 이상이면 A ->95점 이상은 A+  90-95이하 A-, 85이상 B+ 80점 이상이면 B-, ///C+ - D+ - F
		System.out.println("점수입력");
		
		int num = scan.nextInt();
		char hak = 'A';
		char sh = '+';
		
		
		if(num>=90) {
			hak = 'A';
			if(num >=95) {
				sh = '+';
			}else {
				sh = '-';
			}
		}else if (num>=80) {
			hak = 'B';
			if(num>=85) {
				sh='+';
			}else {
				sh='-';
			}
		}else if (num>=70) {
			hak = 'C';
			if(num>=75) {
				sh='+';
			}else {
				sh='-';
			}
		}else if (num>=60) {
			hak = 'D';
			if(num>=65) {
				sh='+';
			}else {
				sh='-';
			}
		}else {
			hak = 'F';
			sh=' ';
		}
		
		System.out.printf("당신의 학점은 %c%s", hak,sh);
		
		*/
		
		
		/*
		if(num >= 90) {
			if(num>=95) {
				System.out.println("A+");
			}else {
				System.out.println("A-");
			}
		}else if (num>=80) {
			if(num>=80) {
				System.out.println("B+");
			}else {
				System.out.println("B-");
			}
		}else if (num>=70) {
			if(num>=75) {
				System.out.println("C+");
			}else {
				System.out.println("C-");
			}
		}else {
			System.out.println("F");
		}
		
		*/
	
		//두 수를 입력받아서 계산부호??
		
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("연산 부호를 입력하세요.");
		String str = scan.next(); //nextLine은 nextint에서 남은 ln(개행문자)가 남아있어서 엔터키가 같이 따라옴 그래서 안된다.
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scan.nextInt();
		
//		char ch = str.charAt(0);
		
		switch (str) {
		case "+" :
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-" :
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*" :
			System.out.println(a+"x"+b+"="+(a*b));
			break;
		case "/" :
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		}
		
		
		
	}
}
