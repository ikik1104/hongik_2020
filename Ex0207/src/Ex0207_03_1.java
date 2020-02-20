import java.util.Scanner;

public class Ex0207_03_1 {

	public static void main(String[] args) {
		
		String id ="aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int login_check = 1;
		int count = 0;
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("ID를 입력해주세요.");
			id_check = scan.next();
			if(login_check>=5) {
				System.out.println("id, pass가 5번 이상 입력되었습니다.");
				break;
			}
			if(!(id.equals(id_check))) {
				System.out.println("아이디가 일치하지 않습니다. 다시 입력하세요"+login_check+"회 오류");
				login_check++;
				continue;
			}
			
			System.out.println("PASS를 입력해주세요.");
			pass_check = scan.next();
			
			if(!(pass.equals(pass_check))) {
				System.out.println("패스워드가 일치하지 않습니다. 다시 입력하세요"+login_check+"회 오류");
				login_check++;
				continue;
			}
			
			System.out.println("1부터 더하고싶은 숫자를 입력하세요.");
			count = scan.nextInt();
		
			
			//1~count까지 더하기 반복문
			for (int i = 1; i <=count; i++) {
				sum += i; //sum = sum+i
			}
			System.out.printf("1에서 %d 까지 총합: %d%n", count, sum);
			System.out.println("프로그램을 종료합니다.");
			break;
		}//while
	}//main
}//class
