import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		//이름  1국어 2 영어 3 합계
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("몇명을 입력할까요?");
		num = scan.nextInt();
		
		String[] name = new String[num];
		int[][] score = new int[num][4];
		double[] avg = new double[num]; 
		int[] rank = new int[num];
		int rank_cnt = 1; //등수카운트
		int select = 0;
		String temp = "";
		String[] sub = {"이름","국어","영어","수학","합계","평균","등수"};
		
			
			for (int i = 0; i < score.length; i++) {
				System.out.println((i+1)+"번째 학생 이름을 입력하세요");
				name[i] = scan.next(); //이름받기
				name[i].trim(); //공백을 없애줌
				for (int j = 0; j < score[i].length-1; j++) {
					System.out.println(name[i]+" 학생의 "+sub[j+1]+"점수를 입력하세요.");
					score[i][j] = scan.nextInt();
					
					if(score[i][j]<0 ||score[i][j]>100) {
						System.out.println("다시 입력하세요.");
						j--;
						continue;
					}//if
					
					score[i][score[i].length-1] += score[i][j]; //합계 넣기
				}//for j
				avg[i] = score[i][score[i].length-1]/2.0; //평균계산
			}//for i
			
			//등수
			for (int i = 0; i < score.length; i++) {
				rank_cnt = 1;
				for (int j = 0; j < score.length; j++) {//40 10 60
					//score[0][2] < score[0][2]  1
					//score[0][2] < score[1][2]  1
					//score[0][2] < score[2][2]  3
					if(score[i][score[i].length-1] < score[j][score[i].length-1] ) {
						rank_cnt++;
					}
				}
				rank[i] = rank_cnt; //등수입력
			}
			
			/*
			 	//등수
			for (int i = 0; i < score.length; i++) {
				rank[i] = 1;
				for (int j = 0; j < score.length; j++) {//40 10 60
					//score[0][2] < score[0][2]  
					//score[0][2] < score[1][2]  +1
					//score[0][2] < score[2][2]  +1
					if(score[i][score[i].length-1] < score[j][score[i].length-1] ) {
						rank[i] += 1;
					}
				}
			}
			 
			 */
			
			
			//subject 출력
				for (int i = 0; i < sub.length; i++) {
					System.out.print(sub[i]+"\t");
					}	
				System.out.println();
				
			
			//데이터 출력
			for (int i = 0; i < score.length; i++) {
				System.out.print(name[i]+"\t"); //이름출력
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t"); //데이터출력
				}
				System.out.print(avg[i]+"\t");
				System.out.println(rank[i]+"\t");
			}
			
		
	}
}
