import java.util.Scanner;

public class Ex0226_04 {
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
		System.out.println("----------------------------------------------------------------------");
		System.out.println("1) 새게임시작       2) 카드받기    3) 클로버개수 ");
		System.out.println("원하는 번호를 입력하세요.>>");
		System.out.println("----------------------------------------------------------------------");
		
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
			System.out.print("\t("+(i+1)+") "+com[i]);
		}
		System.out.println();
		
		System.out.print("내 카드:\t\t");
		for (int i = 0; i < cnt/2; i++) {
			System.out.print("\t("+(i+1)+") "+user[i]);
		}
		System.out.println();
	}
	
	//클로버의 개수 구하기
	static void clo_chk(Card[] com, Card[] user, int cnt) {
		int u_clo = 0;
		int u_heart = 0;
		int u_dia = 0;
		int u_spade = 0;
		
		int c_clo = 0;
		int c_heart = 0;
		int c_dia = 0;
		int c_spade = 0;
		for (int i = 0; i < cnt/2; i++) {
			
			if(com[i].kind==1) {
				c_clo++;
			}else if(com[i].kind==2) {
				c_heart++;
			}else if(com[i].kind==3) {
				c_dia++;
			}else {
				c_spade++;
			}
			
			if(user[i].kind==1) {
				u_clo++;
			}else if(user[i].kind==2) {
				u_heart++;
			}else if(user[i].kind==3) {
				u_dia++;
			}else {
				u_spade++;
			}
			
		}
		System.out.println("\t클로버 \t하트 \t다이아몬드 \t스페이스");
		System.out.println("컴퓨터  :\t "+c_clo+" \t "+c_heart+" \t "+c_dia+" \t "+c_spade);
		System.out.println("User :\t "+u_clo+" \t "+u_heart+" \t "+u_dia+" \t "+u_spade);
		
	}
}
