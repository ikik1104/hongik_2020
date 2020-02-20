import java.util.Scanner;

public class Ex0206_homework {

	public static void main(String[] args) {
		
		/*
		 * 가위바위보
		 * 1,2,3
		 * 
		 * 컴터 랜덤으로 가위바위보진행
		 * 
		 * 10번 게입해서
		 * 총 몇번 이겼는지
		 * 
		 * 이기면 승리, 비기면  무승부 , 지면 패배 출력
		 * 총 승리, 무승부, 패배 횟수 출력
		 * 승률
		 * 
		 * 옵션: 경기횟수 입력받기
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[    가위 바위 보 게임        ]");
		int num = 0; 
		int ran = 0;
		int count =0; //게임 횟수
		int o = 0; //승리
		int e = 0; //무승부
		int x = 0; //패배
		
		loop1 :
		while(true) {
			
			System.out.println("원하는 게임 횟수를 지정하세요");
			count = scan.nextInt();
			
			System.out.println(count+"번 게임을 진행합니다.");
			
			
			for (int i = 1; i <= count; i++) {
				loop2:
				while(true) {
				System.out.println(i+"번째 게임");
				System.out.println("1) 가위, 2) 바위, 3)보 , 0)뒤로가기 ");
				num = scan.nextInt();
				if(num<0 || num>3) {
					System.out.println("다시 입력하세요");
					continue loop2;
				}
				if(num==0) {
					continue loop1;
				}
				
				switch (num) {
				case 1:
					ran = (int)(Math.random()*3)+1;
					if(ran == 1) {
						System.out.println("비겼습니다.");
						e++;
					}else if(ran == 2) {
						System.out.println("패배하였습니다.");
						x++;
					}else {
						System.out.println("이겼습니다.");
						o++;
					}
					break loop2;
				case 2:
					ran = (int)(Math.random()*3)+1;
					if(ran == 2) {
						System.out.println("비겼습니다.");
						e++;
					}else if(ran == 3) {
						System.out.println("패배하였습니다.");
						x++;
					}else {
						System.out.println("이겼습니다.");
						o++;
					}
					break loop2;
				case 3:
					ran = (int)(Math.random()*3)+1;
					if(ran == 3) {
						System.out.println("비겼습니다.");
						e++;
					}else if(ran == 1) {
						System.out.println("패배하였습니다.");
						x++;
					}else {
						System.out.println("이겼습니다.");
						o++;
					}
					break loop2;
				}	
			}//loop2 while
				
			}//for
			System.out.println("이긴횟수 :"+o+"번, 무승부 :"+e+"번, 패배:"+x+"번");
			break loop1;
			
		}//loop1 while
		
	}//main
}//class
