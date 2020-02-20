import java.util.Scanner;

public class Ex0213_05_01 {

	public static void main(String[] args) {
		//이름  1국어 2 영어 3 합계
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3]; 
		int[] rank = new int[3];
		int rank_cnt = 1; //등수카운트
		int select = 0;
		String temp = "";
		String[] sub = {"이름","국어","영어","수학","합계","평균","등수"};
		
		//학생성적처리 프로그램
		//1. 학생점수추가 2. 학생점수수정, 3 학생점수 삭제, 0종료
		//1 -> 국어점수 입력 ...
		while(true) {
		System.out.println("------------------[ 학생 성적처리 프로그램 ]-----------------");
		System.out.println("1.학생점수 추가\t2.학생점수 수정\t3.학생점수 삭제\t0.종료");
		select = scan.nextInt();

		switch (select) {
		case 1: //1. 학생점수추가
			
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
			
			break;
		case 2: //2. 학생점수수정
			System.out.println("점수를 수정할 학생의 이름을 입력하세요");
//			temp = scan
			break;
		case 3:
			break;
		case 0:
			break;
		default:
			break;
		}
		
		}
		
	}
}
