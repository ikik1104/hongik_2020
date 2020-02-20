import java.util.Scanner;

public class Ex0210_0404 {

	public static void main(String[] args) {
		//선생님 코드
		
		/*카드 열장
		 * 
		 * */
		int[] user_card = new int[10]; //유저 카드 10장
		int user_select_card = 0;//유저가 선택한 카드 번호
		int[] com_card = new int[10]; //컴퓨터 카드 10장
		int com_index = 0; //컴카드 배열 순번 변수
		int temp = 0; //배열 섞을때 쓰는 변수
		int win = 0; //승률을 위한
		int draw = 0;//무승부
		int lose = 0 ; //패배
		
		
		
		for (int i = 0; i < 10; i++) {
			user_card[i] = i+1; //1~10까지 숫자 입력
			com_card[i] = i+1; //1~10까지 숫자 입력
		}
		
		//컴퓨터 카드를 섞기
		for (int i = 0; i <100; i++) {
			com_index = (int)(Math.random()*10); //com_card배열 번호
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		Scanner scan = new Scanner(System.in);
		
		//user_card / com_Card 비교
		for (int i = 0; i < 10; i++) {
			System.out.println("1)1, 2)2, 3)3, 4)4, 5)5, 6)6, 7)7, 8)8, 9)9, 10)10 ");
			System.out.println("카드를 1-10 중 카드 1개를 뽑아주세요.");
			user_select_card = scan.nextInt();

			// user_card[8]
			if(user_card[user_select_card-1]-com_card[i]>0) {
				System.out.println((i+1)+"번째 : 승리");
				System.out.println("user-card:"+user_card[user_select_card-1]+" |  com_card :"+com_card[i]);
				win++;
				user_card[user_select_card-1] = 0;
			}else if (user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"번째 : 무승부");
				draw++;
				user_card[user_select_card-1] = 0;
			}else {
				System.out.println((i+1)+"번째 : 패배");
				lose++;
				user_card[user_select_card-1] = 0;
			}//if
		}//for
		
		System.out.printf("승률 : %.1f", (float)win/10*100);
		
	}
	
}
