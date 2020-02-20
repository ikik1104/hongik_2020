import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {
		
		//학생들의 점수를 입력하는 배열
		//이름을 입력하는 배열 3
		//점수를 입력하는 배열[3][3]
		Scanner scan = new Scanner(System.in);
//		/*
		String[] name = new String[3];
		int[][] score = new int[3][4];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("이름을 입력하세요.");
			name[i] = scan.next();
			//점수입력
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println("점수입력 >>");
				score[i][j] = scan.nextInt();
			}
			
			//합계
			for (int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j]; 
			}
		}
		
		
		
		
		System.out.println("\t"+"국어\t"+"영어\t"+"수학\t"+"합계\t\n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" :\t");
			for (int j = 0; j < score.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
//		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름을 입력하세요.");
			for (int j = 0; j < score.length; j++) {
				name[i] = scan.next();
				for (int k = 0; k < score[j].length; k++) {
					System.out.println("점수입력");
					score[j][k] = scan.nextInt();
					/*
					if(k==0) {
						System.out.println("국어 점수를 입력하세요.");
						score[j][k] = scan.nextInt();
					}else if(k==1) {
						System.out.println("영어 점수를 입력하세요.");
						score[j][k] = scan.nextInt();
					}else {
						System.out.println("수학점수를 입력하세요.");
						score[j][k] = scan.nextInt();
					}
			
					
				}
			}
		}
		
			
			System.out.println("안녕");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0;  j< score.length; j++) {
				for (int k = 0; k < score.length; k++) {
					System.out.print(score[j][k]+"\t");
				}
			}
			System.out.println();
		}
	
				*/
		
		
		
	}
}
