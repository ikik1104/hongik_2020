import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[3];
		int[] rank = new int[3];
		String[] subject = { "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		int input = 0, rank_1 = 0, stu_num = 0, s_num = 0;// 1차선탁
		String yn = "";
		String name_in = "";
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			System.out.println("-----------");
			System.out.println("성적처리 프로그램");
			System.out.println("-----------");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.등수처리");/// 인원이 많을 경우 이렇게 빼주는것이 좋다.
			System.out.println("4.학생성적검색");
			System.out.println("0.종료");
			System.out.println("번호를 입력하세요");
			input = scan.nextInt();
			scan.nextLine();

			switch (input) {

			case 1:
				System.out.println("성적입력을 선택하였습니다. ");
				for (int i = stu_num; i < score.length; i++) {
					System.out.println((i + 1) + "번째 학생의 이름을 입력해주세요(입력종료 99)");
					// 이름
					name[i] = scan.next();
					if (name[i].equals("99")) {
						System.out.println("이전화면으로 돌아갑니다");
						continue loop;
					}
					for (int j = 0; j < score[i].length - 1; j++) {
						// 성적
						System.out.println(name[i] + "의 " + subject[j + 1] + "성적을 입력해주세요");
						score[i][j] = scan.nextInt();
						if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
							System.out.println("점수를 잘못입력하였습니다. 다시입력해주세요\n");
							j--;
							continue;
						}
						// 합계
						score[i][score[i].length - 1] += score[i][j];
					} // 평
					avg[i] = score[i][score[i].length - 1] / (double) (score[i].length - 1);
					stu_num++;
				}

				break;

			case 2:
				System.out.println("성적출력을 선택하였습니다.");
				System.out.println("총 학생수 :" + stu_num);
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < stu_num; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.print(avg[i] + "\t");
					System.out.print(rank[i] + "\t\n");
				}
				System.out.println("다시 출력하겠습니끼? y/n");
				yn = scan.nextLine();
				if (yn.equals("n") || yn.equals("N")) {
					System.out.println("이전화면으로 이동합니다.");
					continue loop;
				}
				break;
			case 3:
				System.out.println("등수처리를 선택하였습니다.");
				System.out.println("=================");
				for (int i = 0; i < stu_num; i++) {
					rank_1 = 1;
					for (int j = 0; j < score.length; j++) {
						if (score[i][score[i].length - 1] < score[j][score[i].length - 1]) {
							rank_1++;

						}
					}
					rank[i] = rank_1;
				}
				break;

			case 4:
				System.out.println("학생성적검색을 선택하였습니다.");
				// 학생을 입력
				// 이름을 비교
				System.out.println("=================");
				System.out.println("원하는 학생의 이름을 입력하세요>>");
				name_in = scan.next();
				for (int i = 0; i < stu_num; i++) {
					if (name_in.equals(name[i])) {
						s_num = i;
						break;
					}else {
						s_num =-1;
					}
				}
				if (!(s_num == -1)) {
					System.out.println("일치하는 학생이 없습니다.");
					continue loop;
				}
				for (int j = 0; j < subject.length; j++) {
					System.out.print(subject[j] + "\t");

				}
				System.out.println();
				System.out.print(name[s_num] + "\t");
				
				for (int j = 0; j < score[s_num].length; j++) {
					System.out.print(score[s_num][j] + "\t");
				}
				System.out.print(avg[s_num] + "\t");
				System.out.print(rank[s_num] + "\t\n");
				break;

			case 0:
				System.out.println("시스템을 종료합니다");
				break loop;

			default:
				System.out.println("잘못 입력하였습니다.");
				continue;

			}

		} // while
	}// main

}// class
