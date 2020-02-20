import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		//이름, 국어, 영어, 수학, 과학,합계
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][5];
		String[] sub = {"국어","영어","수학","과학","합계"};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
						System.out.println(sub[j]+"점수를 입력하세요.");
						score[i][j] = scan.nextInt();
					
					//합계
					score[i][score[i].length-1] += score[i][j];
			}
		}//for
		
		System.out.println("-----------------------------------------");
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]+"\t");
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
