import java.util.Scanner;

public class Ex0226_05 {
	public static void main(String[] args) {
		/*카드게임 프로그램
		 *두 명이 3장씩 나눠가져서 1장을 오픈한다. 배열에 담는다. 컴터꺼 내꺼  
		 * 카드받기 누르면 한장씩 추가되어서 총 7장 
		 * 1) 게임시작 3장씩 
		 * 2) 1장씩 추가 전체 찍히기
		 * 3) 종료
		 * */
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52장의 카드가 들어온다 (생성자)
		Card[] com = new Card[7];
		Card[] user = new Card[7];
		int cnt = 0;
		

		while(true) {
		
		System.out.println("1) 새게임시작       2) 카드받기    3) 클로버개수 ");
		System.out.println("원하는 번호를 입력하세요.>>");
		
		switch (scan.nextInt()) {
		case 1:
			d.shuffle(); //섞는다.
			cnt = 0;
			
			for (int i = 0; i < 3; i++) {
				com[i] = d.pick(i);
				cnt++;
			}
			for (int i = 0; i < 3; i++) {
				user[i] = d.pick(cnt);
				cnt++;
			}
			print(com,user,cnt);
			break;
		case 2:
			if(cnt >= 14) {
				System.out.println("카드받기 불가");
				break;
			}
			
			com[cnt/2] = d.pick(cnt);
			user[cnt/2] = d.pick(cnt+1);
			cnt+=2;
			print(com,user,cnt);
			break;
		case 3:
			clo_chk(com,user,cnt);
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
	}
}
	//출력 메소드
	static void print(Card[] com,Card[] user,int cnt) {
		System.out.print("컴퓨터의 카드:\t");
		for (int i = 0; i < cnt/2; i++) {
//			System.out.print("\t  ( card )");
			System.out.print("\t("+(i+1)+") "+com[i]);
		}
		System.out.println();
		
		System.out.print("내 카드:\t\t");
		for (int i = 0; i < cnt/2; i++) {
			System.out.print("\t("+(i+1)+") "+user[i]);
		}
		System.out.println();
//		System.out.println("원하시는 카드를 선택해주세요.");
	}
	
	//클로버의 개수 구하기
	static void clo_chk(Card[] com, Card[] user, int cnt) {
		int u_chk = 0;
		int c_chk = 0;
		for (int i = 0; i < cnt/2; i++) {
			if(user[i].kind==1) {
				u_chk++;
			}
			if(com[i].kind==1) {
				c_chk++;
			}
		}
		System.out.println("컴퓨터의 클로버 개수 :"+c_chk);
		System.out.println("유저의 클로버 개수 :"+u_chk);
		
	}
	
}
