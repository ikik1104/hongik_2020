import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		//로또당첨번호  //당첨번호 6개, 보너스번호 10랜덤
		//내가 입력한 번호 class //회차 , 번호6개,일치개수,등수,금액
		
		//입력 >회차 입력 > 번호6자리입력
		//회차 검색해서 -> 몇개 일치하는지? 등수 몇등인지?  금액 얼마인지?
		//1등 10억 6 ,2등 1억 5+1, 3등 1천만원 5, 4등 1십만원 4, 5등 1만원 3
		//금액 - 1판하는데 1천원 			기존 1만원 적립

		Scanner scan = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int[] ran = new int[45];
		int temp;
		int num;
		
		
		//로또 생성
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i+1;
		}
		
		for (int i = 0; i < 100; i++) {
			num = (int)(Math.random()*45);
			
			temp = ran[0];
			ran[0] = ran[num];
			ran[num] = temp;
		}
	
		while(true) {
		
			if(Lotto.money<=0) {
				System.out.println("게임 횟수 초과 (잔액부족)");
				break;
			}
		System.out.println(lotto.game_cnt+"번째 게임을 시작합니다.");
		lotto.game();
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요.1~45");
			lotto.m_num[i] = scan.nextInt();
		}
		
		for (int i = 0; i < lotto.m_num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(lotto.m_num[i] == ran[j]) {
					lotto.same();
				}
			}
		}
	
		switch (Lotto.cnt) {
		case 3:
			System.out.println("5등 당첨입니다.");
			System.out.println("상금: 1만원");
			break;
		case 4:
			System.out.println("4등 당첨입니다.");
			System.out.println("상금: 1십만원");
			break;
		case 5:
			for (int i = 0; i < lotto.m_num.length; i++) {
				if(lotto.m_num[i] == ran[6]) {
					System.out.println("안녕!!!!");
					System.out.println("2등당첨입니다.");
					System.out.println("상금 : 1억원");
					list(ran,lotto);
					break;
				}
			}
			
			System.out.println("3등 당첨입니다.");
			System.out.println("상금: 1천만원");
			break;
		case 6:
			System.out.println("1등 당첨입니다.");
			System.out.println("상금: 10억원");
			break;

		default:
			System.out.println("당첨되지 않았습니다.");
			break;
		}
		
		list(ran,lotto);
		lotto.game_cnt();
		
		}
	}
	
	static void list (int[] ran,Lotto lotto) {

		System.out.print("당첨번호   :");
		for (int i = 0; i < 6; i++) {
			System.out.print("\t"+ran[i]);
		}
		System.out.println("+ 보너스 숫자:"+ran[7]);
		
		System.out.print("나의 숫자:");
		for (int i = 0; i < lotto.m_num.length; i++) {
			System.out.print("\t"+lotto.m_num[i]);
		}
		System.out.println();
		System.out.println("일치하는 개수:"+Lotto.cnt);
		System.out.println("남은 잔액: "+Lotto.money+"원");
	}
	
	
}
