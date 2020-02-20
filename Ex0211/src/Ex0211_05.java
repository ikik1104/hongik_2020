import java.util.Scanner;

public class Ex0211_05 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int[][] score = new int[3][3]; //0아니면 1
		String[][] score_in = new String[3][3]; //내가 입력해서 저장하는 배열
		int num = 0;
		int num2 = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				score[i][j] = (int)(Math.random()*2);
			}
		}

		while(true) {
		System.out.println("----------------------------");
		System.out.println("       [ 좌표맞추기 게임 ] ");
		System.out.println("----------------------------");
		System.out.print("\t0\t1\t2\n");
		for (int i = 0; i < score_in.length; i++) {
				System.out.print(i+"\t");
			for (int j = 0; j < score_in.length; j++) {
				System.out.print(score_in[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		System.out.print("x 좌표를 입력하세요 >> (종료:99)");
		num = scan.nextInt();
		if(num == 99) {
			System.out.println("시스템 종료");
			break;
		}
		System.out.print("y 좌표를 입력하세요 >>");
		num2 = scan.nextInt();
		
		if(score_in[num][num2].equals(null)) {
			System.out.println("이미 입력한 번호입니다.");
			continue;
		}
		if(score[num][num2] == 1) {
			score_in[num][num2] = "당첨";
		}else {
			score_in[num][num2] = "꽝";
		}
		
		
		}
		//좌표 x 1
		//좌표 y 2 [1,2] -> 1이면 당첨
		//만약 0이 들어있으면 score_in위치에 "꽝"
		
	
		
		/* 5,8
		 * 2,4,6,8,10,12,14,16
		 * 18....
		 * 
		Scanner scan = new Scanner(System.in);
		
		
		int[][] number = new int[5][8];
		int num = 0;
		
		num = scan.nextInt();
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
					number[i][j] = ((i*8)+j+1)*2;
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		/*시간표
		 * 월	화	수	목	금
		 * 국어	수학	국어	영어	국사
		 * 과학1	영어	수학	과학	세계사
		 * 수학	과학1	국사	윤리	체육
		 * 음악	미술	체육	국어	영어
		 * 
		 *
		
		
		
Scanner scan = new Scanner(System.in);
		
		String[][] time =  new String[4][5];
		String[] day = {"월","화","수","목","금"};
		
		
		//조건식 수정하기
		for (int i = 0; i < 5; i++) {
			System.out.println(day[i]+"요일의 시간표를 입력하세요");
			for (int j = 0; j < 4; j++) {
				System.out.print((j+1)+"교시 >>");
				time[j][i] = scan.next();
				System.out.println(j+" "+i);
			}
		}
		
		System.out.println("[ 시간표 ]");
		for (int i = 0; i < 5; i++) {
			System.out.print(day[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time[i].length; j++) {
				System.out.print(time[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		
		String[][] time =  new String[4][5];
		String[] day = {"월","화","수","목","금"};
		
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time[i].length; j++) {
				System.out.println((i*5)+j+1+"번째 과목을 입력하세요");
				time[i][j] = scan.next();
			}
		}
		
		System.out.println("[ 시간표 ]");
		for (int i = 0; i < 5; i++) {
			System.out.print(day[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < time.length; i++) {
			for (int j = 0; j < time[i].length; j++) {
				System.out.print(time[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		/*
		//3,3
		//국어 영어 수학 
		//100 78 99
		//87 85 100
		//75 100 89
		
		Scanner scan = new Scanner(System.in);
		
		int[][] score = new int[3][3];
		
		//입력
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"번째 학생의 점수를 입력하세요. ");
			for (int j = 0; j < score[i].length; j++) {
				if(j==0) {
					System.out.print("국어 점수를 입력하세요. >>");
					score[i][j] = scan.nextInt();
				}
				
				if(j==1) {
					System.out.print("영어 점수를 입력하세요. >>");
					score[i][j] = scan.nextInt();
				}
				
				if(j==2) {
					System.out.print("수학 점수를 입력하세요. >>");
					score[i][j] = scan.nextInt();
				}
			}
		}
		//출력
		System.out.println("-----------------------------------------");
		System.out.println("\t\t국어\t영어\t수학 ");
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"번째 학생의 점수 :\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"점\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		/*
		 * 7,9
		
		
		
		int[][] score = new int[7][9];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (i*9)+j+1;
			}
		}
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		/*
		//[3][3] -> 1~25까지 순차적으로 넣어보기 1 2 3 /  4 5 6
		
		int[][] score1 = new int[3][3];
		
		System.out.println("첫번째 방법");
		//1번째 방법
		score1[0][0] = 1;
		score1[0][1] = 2;
		score1[0][2] = 3;
		score1[1][0] = 4;
		score1[1][1] = 5;
		score1[1][2] = 6;
		score1[2][0] = 7;
		score1[2][1] = 8;
		score1[2][2] = 9;
		
		for (int i = 0; i < score1.length; i++) {
			for (int j = 0; j < score1[i].length; j++) {
				System.out.print(score1[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//2번째 방법
		System.out.println("두번째 방법");
		
		int[][] score2 = {
				{1,2,3},{4,5,6},{7,8,9}
		};
		
		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {
				System.out.print(score2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		//3번째 방법
		int[][] score3 = new int[3][3];
		
		System.out.println("세번째 방법");
		for (int i = 0; i < score3.length; i++) {
			for (int j = 0; j < score3[i].length; j++) {
				score3[i][j] = (i*3)+j+1;
			}
		}
		
		for (int i = 0; i < score3.length; i++) {
			for (int j = 0; j < score3[i].length; j++) {
				System.out.print(score3[i][j]+"\t");
			}
			System.out.println();
		}
		
		
/*		int[][] score = new int[5][3];
		int[] total = new int[5];
		total[0] = 100;
		total[1] = 90;
		total[2] = 80;
		total[3] = 70;
		total[4] = 60;
		
		int[] total1 = {100,90,80,70,60};
		
		System.out.println(" [ 1차원 배열 ] ");
		for (int i = 0; i < total1.length; i++) {
			System.out.print(total1[i]+" ");
		}
		System.out.println();
		int[][] score = new int[5][3];
		
		score[0][0] = 100;
		score[0][1] = 100;
		score[0][2] = 100;
		score[1][0] = 90;
		score[1][1] = 90;
		score[1][2] = 90;
		score[2][0] = 80;
		score[2][1] = 80;
		score[2][2] = 80;
		score[3][0] = 70;
		score[3][1] = 70;
		score[3][2] = 70;
		score[4][0] = 60;
		score[4][1] = 60;
		score[4][2] = 60;
		
		int[][] score1 = {
				{100,100,100},{90,90,90},{80,80,80},
				{70,70,70},{60,60,60}
		};
		
		System.out.println(" [ 2차원 배열 ] ");
		for (int i = 0; i < score1.length; i++) {
			
			for (int j = 0; j < score1[i].length; j++) {
				System.out.print(score1[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
	}
}
