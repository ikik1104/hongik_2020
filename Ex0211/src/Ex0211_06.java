import java.util.Scanner;

public class Ex0211_06 {

	public static void main(String[] args) {
		//5,5 -> 01�� ���� ->��ǥ�� 1�̸� ��÷ 0�̸� ��
		// 10������ �ϰڽ��ϴ� ��÷ : 3 �� : count
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int[][] score = new int[5][5];
		String[][] score_in = new String[5][5];
		int x = 0;
		int y = 0;
		int lose = 0;
		int win = 0;
		
		
		while(count<10) {
		System.out.println("--------------- [ ���� ] ----------------");
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
		
		System.out.println("x��ǥ�� �Է��ϼ��� 0 ~ 4");
			x = scan.nextInt();
			if(x<0 || x>4) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
		System.out.println("y��ǥ�� �Է��ϼ��� 0 ~ 4");
			y = scan.nextInt();
			if(x<0 || x>4) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
			
			if(!(score_in[x][y].equals("?"))) {
				System.out.println("�̹� �Է��Ͻ� ��ǥ�Դϴ�.");
				continue;
			}
			
			if(score[x][y] == 1) {
				score_in[x][y] = "��÷";
				win++;
			}else {
				score_in[x][y] = "��";
				lose++;
			}
			
			count++;
		}//while
		
		System.out.println("��÷��:"+win);
		System.out.println("�� : "+lose);
		
		
		
		
		
		
		}//main
		
}
