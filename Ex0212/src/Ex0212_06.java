import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		//양궁 경기 /1차경기 /2차경기 /합 /평균 소수점1째자리
		//200만점
		//3명 200점 이상이면 다시입력
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][4];
		String[] name = new String [3]; 
		String[] sub = {"이름","1번째경기","2번째경기","합계","높은수","평균"};
		double[] score2 = new double[3];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 선수의 이름을 입력하세요.");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-2; j++) {
				System.out.print((j+1)+"번째 경기>>");
				score[i][j] =scan.nextInt();
				if(score[i][j] >= 200) {
					System.out.println("다시 입력하세요");
					j--;
					continue;
				}
				score[i][score[i].length-2] += score[i][j];
			}
			
			if(score[i][0] > score[i][1]) {
				score[i][score[i].length-1] = score[i][0];
			}else {
				score[i][score[i].length-1] = score[i][1];
			}
			score2[i] = score[i][score[i].length-1]/2.0;
		}
		
		System.out.println("-----------------------------------");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.1f \t",score2[i]);
			System.out.println();
		}
	}
}
