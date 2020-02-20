import java.util.Scanner;

public class Ex0207_02_2 {

	public static void main(String[] args) {
		String id = "aaa";
		String pass = "1234";
		int count = 0;//자신이 선택한 가위바위보
		int user = 0; //컴퓨터가 선택한 가위바위보
		int com = 0;
		int win = 0;//이긴횟수
		int draw = 0;
		int lose = 0;
		int login_ch = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요 .>> ");
		count = scan.nextInt();
		
		loop1:
		while(true) {
		System.out.println("게임하기 전에 login해주세요. >>");
		System.out.println("먼저 id를 입력해주세여");
		String id_ch = scan.next();
		
		if(login_ch>3) {
			System.out.println("로그인 오류 3회 초과 / 시스템이 종료됩니다.");
			break loop1;
		}
		
		if(!(id.equals(id_ch))) {
			System.out.println("id가 일치하지 않습니다. 다시 입력하세요.");
			login_ch++;
			continue loop1;
		}
		
		System.out.println("Pw 를 입력해주세여");
		String pass_ch = scan.next();
		
		if(!(pass.equals(pass_ch))) {
			System.out.println("id가 일치하지 않습니다. 다시 입력하세요.");
			login_ch++;
			continue loop1;
		}
		
	}//while
		
		
		
		for (int i = 1; i <=count; i++) {
			
			System.out.println("가위(1), 바위(2), 보(3) 중에 하나를 선택하세요");
			user = scan.nextInt();
			
			if(user<1 || user>3) {
				System.out.println("당신 숫자를 잘못넣었습니다. 정신차려요.(1-3까지만)");
				i--; //그냥 하면 i가 +가 된다.
				continue; 
			}
			
			com = (int) (Math.random()*3)+1;
			System.out.println(i+"번째 판 승자는?");
			//1-3 =-2(승리) 1-1 = 0 (무승부) 1-2 =-1(패배)
			//2-1 = 1(승리) 2-2 = 0(무승부)  2-3 = -1(패배)
			//3-2 = 1(승리) 3- 3= 0 (무승부) 3-1 = 2(패배)
			
			switch (user-com) {
			case -2: case 1:
				System.out.println("사용자 승리");
				win++;
				break ;
			case 0:
				System.out.println("무승부");
				draw++;
				break ;
			case 2: case -1:
				System.out.println("컴퓨터 승리");
				lose++;
				break ;
			}//swi
		}
	
		System.out.println("게임횟수 :"+count);
		System.out.println("승리 횟수 : "+win);
		System.out.println("무승부 횟수: "+draw);
		System.out.println("무승부 횟수: "+lose);
		System.out.printf("승률 : %.1f%n ", win/count*100);
	
   }
}
