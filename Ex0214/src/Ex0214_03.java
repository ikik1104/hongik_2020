import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �Է��ؼ� ����, �ѱ� 5���� �Է¹޾Ƽ� ����Ǯ��.
		// ���ܾ� ���߱� ����
		// ����- �ѱۼ���
		// 1.�����Է�
		// 2.����Ǯ��
		// 0.����ȭ��

		// words[5][2]
		int input = 0;
		String[][] words = new String[10][2];
		String in_str = "";// ����Ǯ�̿� ��ǲ..
		int count = 0;// ������ȸ��
		int words_num=0;//������ȣ
		String eng="";//�����Էº���
		int count1=0;
		int ex_num=0;//����Ǯ�� ����
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			System.out.println("--------");
			System.out.println("���� ���α׷�");
			System.out.println("--------");
			System.out.println("��ȣ�� �Է��ϼ���");
			System.out.println("1.�����Է�");
			System.out.println("2.����Ǯ��");
			System.out.println("0.����");
			input = scan.nextInt();

			s_loop:
				switch (input) {
			case 0:
				System.out.println("���α׷��� �����մϴ�");
				break loop;
			case 1:
				System.out.println("�����Է��� ���۾дϴ�");
				for (int i = 0; i < words.length; i++) {
					System.out.println("----------------");
					System.out.println("���ܾ �Է����ּ���");
					eng = scan.next();
					if(eng.equals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�");
						break s_loop;
					}
					words[i][0]=eng;
					System.out.println("���� �Է����ּ���");
					words[i][1] = scan.next();
					words_num++;
					if(words_num==10) {
						System.out.println("10���� ��� �ԷµǾ����ϴ�. ���̻� �Է��Ҽ� �����ϴ�.");
					}
				}
//				System.out.println("�����Է��� ���۾дϴ�");
//				for (int i = 0; i < words.length; i++) {
//					System.out.println("���ܾ �Է����ּ���");
//					words[i][0] = scan.next();
//					System.out.println("���� �Է����ּ���");
//					words[i][1] = scan.next();
//				}
				System.out.println("�����Է��� �Ϸ��߽��ϴ�. ����â���� ���ư��ϴ�.");
				continue loop;
			case 2:
				System.out.println("����Ǯ�̸� �����մϴ�");
					
				for (int i = ex_num; i < words.length; i++) {
					System.out.println(words[i][0] + "�� �����ϱ��?");
					in_str = scan.next();
					if(in_str.equals("99")) {
						System.out.println("����ȭ������ �̵��մϴ�");
						break;
					}
					if (words[i][1].equals(in_str)) {
						System.out.println("�����Դϴ�. ��������!");
					} else {
						if (count < 2) {
							System.out.println((count + 1) + "���õ� �����Դϴ�. �ٽ�Ǯ�����");
							i--;
							count++;
							continue;
						}
						System.out.println((count + 1) + "���õ� �����Դϴ�. ���������� �Ѿ�ϴ�");
						ex_num++;
						count = 0;
					}
				}
				System.out.println("����Ǯ�̸� ��� �Ͽ����ϴ�.");
				System.out.println("1)���� 2)����â");
				input=scan.nextInt();
				switch(input) {
				case 1:
					System.out.println("���α׷��� �����մϴ�.");
					break loop;
				case 2:
					continue loop;
				default:
					System.out.println("�߸� �Է��Ͽ����ϴ�");
					continue;
				}
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�");
				continue;

			}// switch
		}
//			
//			
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i][0] + "���� �����ϱ��?");
//			in_str = scan.nextLine();
//			if (words[i][1].equals(in_str)) {
//				System.out.println("�����Դϴ�. �������� ����!");
//			} else {
//				if (count < 2) {
//					// Ƚ���� 0,1,2�ؼ� �� 3���̵ȴٿ�..
//					System.out.println((count + 1) + "��° �����Դϴ�.");
//					i--;
//					count++;
//					continue;
//				} else {
//					System.out.println("�����Դϴ�. ������?" + words[i][1]);
//					count = 0;// �ʱ�ȭ
//				}
//			}
//		}

//		// ���ܾ� ���߱� ����
//		// ����- �ѱۼ���
//		// 1.����,�ѱ� ������ �Է�- �̸� �Է¸���.
//		// 2.���� ����� �ѱ� �Է¹���
//		// 3.�ѱ��� �´���? Ȯ��
//		// 4.������
//		// 5.�ٽ� �������
//
//		// words[3][2]
//		String[][] words = { { "chair", "����" }, { "computer", "��ǻ��" }, { "array", "�迭" } };
//		String in_str = "";
//		Scanner scan = new Scanner(System.in);
//		int count = 0;
//
//		for (int i = 0; i < words.length; i++) {
//			count=0;//�ʱ�ȭ
//			System.out.println(words[i][0] + "���� �����ϱ��?");
//			in_str = scan.nextLine();
//			if (words[i][1].equals(in_str)) {
//				System.out.println("�����Դϴ�. �������� ����!");
//			} else {
//				if (count < 2) {
//					// Ƚ���� 0,1,2�ؼ� �� 3���̵ȴٿ�..
//					System.out.println((count+1)+"��° �����Դϴ�.");
//					i--;
//					count++;
//					continue;
//				} else {
//					System.out.println("�����Դϴ�. ������?" + words[i][1]);
//				}
//			}
//		}
	}// main

}// class
