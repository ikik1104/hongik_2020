import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		//로그인
		//로그인 5이상 실패시 프로그램 종료
		//1에서 입력한 값까지 수자를 더하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		String id = "aaa";
		String pw = "1234";
		
		int num = 0;
		int sum = 0;
		int lo_count = 1;
		
		while(true) {
		if(lo_count>=5) {
			System.out.println("로그인횟수 초과 : 시스템을 종료합니다.");
			break;
		}
			
		System.out.println("아이디를 입력하세요");
		String id_ch = scan.next();
		
		if(!(id_ch.equals(id))) {
			System.out.println("[로그인 실패] 아이디가 일치하지 않습니다.");
			lo_count++;
			continue;
		}
		
		System.out.println("패스워드를 입력하세요.");
		String pw_ch = scan.next();
		
		if(!(pw_ch.equals(pw))) {
			System.out.println("[ 로그인 실패 ]다시 입력해주세요");
			lo_count++;
			continue;
		}
		System.out.println("로그인이 완료되었습니다.");
		
		System.out.println("원하는 숫자를 입력해주세요  0) 로그아웃");
		num = scan.nextInt();

		
		for (int i = 1; i <=num; i++) {
			sum += i;
		}
		
		System.out.println("총 합계 :"+sum+"입니다.");
		break;
		}//while 
		
	}//main
}//class
