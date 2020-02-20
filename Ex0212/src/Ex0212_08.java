import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {
		
		//성적처리 프로그램
		//이름String ,국어, 영어,수학, 합계int, 평균(double)
		String[] name = new String[10];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] subject = {"이름","국어","영어","수학","합계","평균"};
		
		Scanner scan = new Scanner(System.in);
		
		//입력 폼
		for (int i = 0; i < score.length; i++) {
			//이름입력
			System.out.println((i+1)+"번 학생의 이름을 입력 해주세요.");
			//점수입력
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(subject[j+1]+"점수를 입력해 주세요.");
				score[i][j] = scan.nextInt();
				//합계입력
				score[i][score[i].length-1] += score[i][j]; 
//				score[i][3] + score[i][3]+score[i][j] ;
			}
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); //합계/3 평균
//			avg[i]= score[i][3] /3 ;
		}
		
		//출력
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		//타이틀 모두출력후 엔터키
		System.out.println( );
		
		for (int i = 0; i < score.length; i++) { //int=>[3][4]
			//이름출력
			System.out.print(name[i]+"\t");
			//점수 출력
			for (int j = 0; j < score.length+1; j++) { //int[3]->[4]
				System.out.print(score[i][j]+"\t");
			}
			//평균출력
			System.out.print(avg[i]+"\n");
		}
		
	}
}
