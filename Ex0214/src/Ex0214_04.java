import java.util.Scanner;

public class Ex0214_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[3];
		int[] rank = new int[3];
		String[] subject = { "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		int input = 0, rank_1 = 0, stu_num = 0, s_num = 0;// 1����Ź
		String yn = "";
		String name_in = "";
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			System.out.println("-----------");
			System.out.println("����ó�� ���α׷�");
			System.out.println("-----------");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.���ó��");/// �ο��� ���� ��� �̷��� ���ִ°��� ����.
			System.out.println("4.�л������˻�");
			System.out.println("0.����");
			System.out.println("��ȣ�� �Է��ϼ���");
			input = scan.nextInt();
			scan.nextLine();

			switch (input) {

			case 1:
				System.out.println("�����Է��� �����Ͽ����ϴ�. ");
				for (int i = stu_num; i < score.length; i++) {
					System.out.println((i + 1) + "��° �л��� �̸��� �Է����ּ���(�Է����� 99)");
					// �̸�
					name[i] = scan.next();
					if (name[i].equals("99")) {
						System.out.println("����ȭ������ ���ư��ϴ�");
						continue loop;
					}
					for (int j = 0; j < score[i].length - 1; j++) {
						// ����
						System.out.println(name[i] + "�� " + subject[j + 1] + "������ �Է����ּ���");
						score[i][j] = scan.nextInt();
						if (!(score[i][j] >= 0 && score[i][j] <= 100)) {
							System.out.println("������ �߸��Է��Ͽ����ϴ�. �ٽ��Է����ּ���\n");
							j--;
							continue;
						}
						// �հ�
						score[i][score[i].length - 1] += score[i][j];
					} // ��
					avg[i] = score[i][score[i].length - 1] / (double) (score[i].length - 1);
					stu_num++;
				}

				break;

			case 2:
				System.out.println("��������� �����Ͽ����ϴ�.");
				System.out.println("�� �л��� :" + stu_num);
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
				System.out.println("�ٽ� ����ϰڽ��ϳ�? y/n");
				yn = scan.nextLine();
				if (yn.equals("n") || yn.equals("N")) {
					System.out.println("����ȭ������ �̵��մϴ�.");
					continue loop;
				}
				break;
			case 3:
				System.out.println("���ó���� �����Ͽ����ϴ�.");
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
				System.out.println("�л������˻��� �����Ͽ����ϴ�.");
				// �л��� �Է�
				// �̸��� ��
				System.out.println("=================");
				System.out.println("���ϴ� �л��� �̸��� �Է��ϼ���>>");
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
					System.out.println("��ġ�ϴ� �л��� �����ϴ�.");
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
				System.out.println("�ý����� �����մϴ�");
				break loop;

			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				continue;

			}

		} // while
	}// main

}// class
