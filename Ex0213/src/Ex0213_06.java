import java.util.Scanner;

public class Ex0213_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] sub = {"이름","국어","영어","합계","평균","등수"};
		String[] name = new String[3];
		int[][] score = new int[3][3];
		double[] avg =  new double[3];
		int[] rank = new int[3];
		

		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력해주세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				if(score[i][j]<0 || score[i][j]>100) {
					System.out.println("다시 입력하세요");
					j--;
					continue;
				}
				score[i][score[i].length-1] += score[i][j]; //합계
			}
			avg[i] = score[i][score[i].length-1]/2.0;
		}
		

		for (int i = 0; i < score.length; i++) {
			rank[i] = 1;
			for (int j = 0; j < score.length; j++) {
				if(score[i][score[i].length-1] < score[j][score[i].length-1] ) {
					rank[i] += 1;
				}
			}
		}
		
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(avg[i]+"\t");
			System.out.println(rank[i]);
		}
	}
}
