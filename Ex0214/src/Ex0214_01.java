import java.util.Scanner;

public class Ex0214_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// �������α׷�
		//
		String[] team = new String[8];
		int[][] score = new int[8][5];
		String[] title = { "��", "��", "��", "��", "����", "����" };
		int rank = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			System.out.println((i + 1) + "��° ������ �Է����ּ���");
			team[i] = scan.next();
			for (int j = 0; j < 3; j++) {
				System.out.println(team[i] + "�� " + title[j + 1] + "Ƚ���� �Է��ϼ���");
				score[i][j] = scan.nextInt();
				if (j == 0) {
					score[i][3] += score[i][j] * 3;
				} else if (j == 1) {
					score[i][3] += score[i][j];
				} else {
					score[i][3] += score[i][j] * 0;
				}

			}
		} // for��

		for (int i = 0; i < 8; i++) {
			rank = 1;
			for (int j = 0; j < 8; j++) {
				if (score[i][3] < score[j][3]) {
					rank++;
				}
			}
			score[i][4] = rank;
		}

		// ���
		for (int i = 0; i < 6; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < 8; i++) {
			System.out.print(team[i] + "\t");
			for (int j = 0; j < 5; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();

		}

	}

}
