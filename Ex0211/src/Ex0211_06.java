import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		//5,5 -> 01로 셋팅 ->좌표값 1이면 당첨 0이면 꽝
		// 10까지만 하겠습니다 당첨 : 3 꽝 : count
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int[][] score = new int[5][5];
		String[][] score_in = new String[5][5];
		int x = 0;
		int y = 0;
		int lose = 0;
		int win = 0;
		
		
		while(count<10) {
		System.out.println("--------------- [ 게임 ] ----------------");
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int)(Math.random()*2);
			}
		}
		
		for (int i = 0; i < score_in.length; i++) {
			for (int j = 0; j < score_in[i].length; j++) {
					System.out.print(score_in[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		System.out.println("x좌표를 입력하세요 0 ~ 4");
			x = scan.nextInt();
			if(x<0 || x>4) {
				System.out.println("다시입력하세요");
				continue;
			}
		System.out.println("y좌표를 입력하세요 0 ~ 4");
			y = scan.nextInt();
			if(x<0 || x>4) {
				System.out.println("다시입력하세요");
				continue;
			}
			
			if(!(score_in[x][y].equals("?"))) {
				System.out.println("이미 입력하신 좌표입니다.");
				continue;
			}
			
			if(score[x][y] == 1) {
				score_in[x][y] = "당첨";
				win++;
			}else {
				score_in[x][y] = "꽝";
				lose++;
			}
			
			count++;
		}//while
		
		System.out.println("당첨수:"+win);
		System.out.println("꽝 : "+lose);
		
		
		
		
		
		
		}//main
		
}
