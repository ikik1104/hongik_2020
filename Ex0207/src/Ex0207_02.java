import java.util.Scanner;

public class Ex0207_02 {

	public static void main(String[] args) {
		//가위바위보
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int num = 0;
		int ran = 0;
		int o = 0; //이긴횟수
		int e = 0; //비긴횟수
		int x = 0; //진 횟수
		String list = ""; //승패리스트
		String yn = "";
		
		loop1:
		while(true){
			System.out.println("--------[  가위   바위   보  게임    ]-----------");
			System.out.println("게임을 몇회 진행할까요?   게임종료 : 0");
			count = scan.nextInt();
			
			if(count < 0) {
				System.out.println("잘못된 입력입니다.");
				continue loop1;
			}else if (count == 0) {
				break loop1;
			}

			System.out.println("게임을"+count+"회 진행합니다.");
			
			for (int i = 1; i <= count; i++) {
					System.out.println(i+"번째 게임을 진행합니다.");
					System.out.println("1) 가위, 2) 바위, 3) 보  4) 초기화면으로  ");
					num = scan.nextInt();
					ran = (int)(Math.random()*3)+1;
					
					if(num<1 || num>4) {
						System.out.println("다시 입력해주세요");
						continue;
					}else if(num == 4) {
						System.out.println("초기화면으로 이동하시겠습니까? Y / N");
						yn = scan.next();
						if(yn.equalsIgnoreCase("y")) {
							System.out.println("초기 화면으로 이동합니다.");
							continue loop1;
						}else if(yn.equalsIgnoreCase("n")){
							System.out.println("게임을 계속 진행합니다.");
							i--;
							continue;
						}else {
							System.out.println("잘못된 입력입니다.");
						}
					}
					
					if(num==ran) {
						System.out.println("비겼습니다.");
						list += i+"라운드) 무승부 \n"; 
						e++;
					}else if((num==1 && ran == 2) || (num==2 && ran == 3) || (num==3 && ran == 1) ) {
						System.out.println("패배하였습니다.");
						list += i+"라운드) 패배 \n";
						x++;
					}else {
						System.out.println("이겼습니다.");
						list += i+"라운드) 승리 \n";
						o++;
					}
					System.out.println("-----------------------------------------");
					break;
			}
			System.out.printf("승리: %d번, 무승부: %d번, 패배: %d번 %n승률 :%.1f %n%s%n",o,e,x,(o*100.0/count),list);
			//아래 텍스트
			while (true) {
			System.out.println("재도전 하시겠습니까? Y/ 게임종료 N");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				continue loop1;
			}else if(yn.equalsIgnoreCase("n")){
				break loop1;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("----------------------------------------");
			}
		}//while

		System.out.println("시스템을 종료합니다.");
		
		
		
	}//main
}//class


//System.out.println("승리: "+o+"번, 무승부: "+e+"번, 패배"+x+"번");
//System.out.println(list);
//System.out.println("승률 : "+(o*100.0/count)+"%");
