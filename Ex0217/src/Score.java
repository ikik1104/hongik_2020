import java.util.Scanner;

public class Score {
	Scanner scan = new Scanner(System.in);
	
	String[] sub= {"이름","국어","영어","수학","합계","평균"};
	String[] name = new String[5];
	int[][] score= new int[5][4];
	double[] avg= new double[5];
	
	void insert () {
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름입력");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"점수 입력");
				score[i][j] = scan.nextInt();
				
				score[i][score[i].length-1] += score[i][j];
			}
			avg[i] = score[i][score[i].length-1] /3;
		}
	}
	
	void list () {
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
	}
	
}
