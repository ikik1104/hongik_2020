import java.util.Scanner;

public class Ex0217_01_test {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] sub = {"이름","국어","영어","수학","합계","평균","등수"};
		int[][] score = new int[10][4];
		String[] name = new String[10];
		double[] avg = new double[10];
		int[] rank = new int[10];
		int select = 0;
		int stu = 0; //학생수?	
		String aa = " ";
		
		loop1:
		while(true) {
		System.out.println();
		System.out.println("---------------------  학생 성적 프로그램  ----------------------");
		System.out.println();
		System.out.println("1) 학생추가       2) 학생출력      3)학생검색    4) 학생삭제   5) 등수처리     0) 종료");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		select = scan.nextInt();
		
		
		switch (select) {
		case 1:
			for (int i = 0; i < score.length; i++) {
				if(stu == 10) {
					System.out.println("입력 가능한 학생의 수를 초과하였습니다.");
					continue loop1;
				}
				System.out.println("이름을 입력하세요. (뒤로가기 :99 )");
				name[i] = scan.next();
				if(name[i].equals("99")) {
					continue loop1;
				}
				
				for (int j = 0; j < score[i].length-1; j++) {
					System.out.println(name[i]+"학생의 "+sub[j+1]+"점수를 입력하세요");
					score[i][j] = scan.nextInt();
					if(score[i][j] <0 || score[i][j] >100) {
						System.out.println("다시 입력하세요");
						j--;
						continue;
					}
					score[i][score[i].length-1] += score[i][j];
				}
				avg[i] = score[i][score[i].length-1]/3.0;
				stu++;
			}
			
			break;
		case 2:
			if(stu == 0) {
				System.out.println("입력된 학생이 없습니다.");
				break;
			}
			for (int i = 0; i < sub.length; i++) {
				System.out.print(sub[i]+"\t");
			}
			System.out.println();
			
			for (int i = 0; i < stu; i++) {
				System.out.print(name[i]+"\t");
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%.1f \t",avg[i]);
				System.out.println(rank[i]);
			}
			break;
			
		case 3://학생검색
			while(true) {
				if(stu == 0) {
					System.out.println("입력된 학생이 없습니다.");
					continue loop1;
				}
			System.out.println("검색할 학생의 이름을 입력하세요.	뒤로가기 (99)");
			aa = scan.next();
			if(aa.equals("99")) {
				continue loop1;
			}
			for (int i = 0; i < stu; i++) {
				if(name[i].equals(aa)) {
					for (int j = 0; j < sub.length; j++) {
						System.out.print(sub[j]+"\t");
					}
					System.out.println();
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.1f \t",avg[i]);
					System.out.println(rank[i]);
					continue loop1;
				}
			}
			System.out.println("입력한 학생이 존재하지 않습니다.");
			continue;
			
			}
		case 4://학생삭제
			System.out.println("준비중인 서비스 입니다ㅎㅎ");
			continue loop1;
			
		case 5:
			//등수
			if(stu == 0) {
				System.out.println("입력된 학생이 없습니다.");
				break;
			}
			for (int i = 0; i < score.length; i++) {
				int rank_ch = 1;
				for (int j = 0; j < score.length; j++) {
					if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
						rank_ch++;
					}
				}
				rank[i] = rank_ch;
			}
			System.out.println("등수처리가 완료되었습니다.");
			break;
			
		case 0:
			System.out.println("시스템을 종료합니다.");
			break loop1;

		default:
			System.out.println("잘못된 입력입니다.");
			continue loop1;
		}
		
		
		
		
		}//while
  }
}
