import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		//성적처리 프로그램
		//이름 ,국어, 영어, 수학, 합계, 평균
		Scanner scan = new Scanner(System.in);
		String[] sub = {"이름","국어","영어","수학","합계","평균"};
		double[] avg = new double[3];
		int[][] score = new int[3][4];
		String[] name = new String[3];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
				score[i][score[i].length-1] += score[i][j];
			}
//			score[i][score[i].length] = score[i][score[i].length-1];   ----????
			//평균
			avg[i] = score[i][score[i].length-1]/2.0;
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
			System.out.printf("%.1f",avg[i]);
			System.out.println();
		}
		
	}
}
