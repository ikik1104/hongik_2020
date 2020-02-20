import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		
		//1~10까지 카드 만들기 (랜덤)
		//자신의 배열 1~10까지 숫자카드를 만든다.
		//컴퓨터의 배열 1~10까지의 숫자카드를 만든다.
		//랜덤으로 섞는다.
		//자신이 원하는 배열의 숫자 카드를 제시해서
		//자신이 높으면 승리, 같으면 무승부, 작으면 패배
		//승률을 구해보세요.
		//중복으로 카드를 내면 중복입니다. 다시 선택하세요 에러 메세지 
		
		//자신이 냈던 카드를 순차적으로 프린트
		
		int[] m_card = new int[10];
		int[] mm_card = new int[10];
		int[] c_card = new int[10];
		int num1 = 0;
		int num2 = 0;
		int select = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//내카드에 숫자넣기
		for (int i = 0; i < m_card.length; i++) {
			m_card[i] = i+1;
		}
		
		//컴터 카드에 숫자넣기
		for (int i = 0; i < c_card.length; i++) {
			c_card[i] = i+1;
		}
		
		//컴터 카드 섞기
		for (int i = 0; i < 100; i++) {
			num1 = (int)(Math.random()*10);
			
			num2 = c_card[0];
			c_card[0] = c_card[num1];
			c_card[num1] = num2;
		}
		
		for (int i = 0; i < 10; i++) {
			//지금까지 낸 카드 출력
			System.out.print("지금까지 사용한 카드 : ");
			for (int j = 0; j < mm_card.length; j++) {
				if(mm_card[j]!=0) {
					System.out.print(mm_card[j]+" ");
				}
				
			}
			
			
			System.out.println();
			System.out.println((i+1)+"번째 게임 : 몇번째 카드를 낼까요? 1~10");
			select = scan.nextInt();
			
			if(select <1 || select>10) {
				System.out.println("1~10까지의 숫자만 고르세요");
				i--;
				continue;
			}

			if(m_card[select-1] == 0) {
				System.out.println("이미 사용한 카드입니다.");
				i--;
			}
			
			
			
			mm_card[i] = select;
			

			
			
			System.out.println("내가 낸 카드 :"+select);
			System.out.println("컴퓨터의 카드:"+c_card[select-1]);
			
			if(c_card[select-1] == m_card[select-1]) {
				System.out.println("무승부 입니다.");
				draw++;
			}else if(c_card[select-1] > m_card[select-1]) {
				System.out.println("패배하였습니다.");
				lose++;
			}else if(c_card[select-1] < m_card[select-1]) {
				System.out.println("승리하였습니다.");
				win++;
			}
			
			
			m_card[select-1] = 0; //먼저 바꾸면 안됌~~!!
		}
		
	System.out.printf("승리: %d, 무승부: %d, 패배: %d %n", win, draw, lose);
	System.out.printf("승률: %.1f ",((float)win/10*100));
		
		
		
		
		
	}
}
