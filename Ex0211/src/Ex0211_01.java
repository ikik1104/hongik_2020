import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// �ζ� ���α׷�
		int[] r_num = new int[45]; // 45���� �迭
		int[] m_num = new int[6]; // �������� 6���� ��
		int num1 = 0; // �ӽ� ����
		int num2 = 0; // �ӽ� ����
		int success = 0; // ���� ��

		Scanner scan = new Scanner(System.in);

		// �Է¹ޱ�
		for (int i = 0; i < m_num.length; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���.");
			m_num[i] = scan.nextInt();

			if (m_num[i] < 1 || m_num[i] > 45) {
				System.out.println("1~45 ������ ���ڸ� �Է��ϼ���");
				i--;
				continue;
			}
		}

		// �迭�� ���ڸ� 1~45���� �ִ´�.
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = i + 1;
		}

		// �����ֱ�
		for (int i = 0; i < 100; i++) {
			num1 = (int) (Math.random() * 45); // 0~44������ ������

			num2 = r_num[0];
			r_num[0] = r_num[num1];
			r_num[num1] = num2;
		}

		// 6���� �ζ� �̱�
		System.out.print("�ζǹ�ȣ :");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < m_num.length; j++) {
				if (r_num[i] == m_num[j]) {
					success++;
				}
			}

			System.out.print(r_num[i] + " ");
		}
		
		System.out.println();
		System.out.print("���� ���� :");
		for (int i = 0; i < m_num.length; i++) {
			System.out.print(m_num[i]+" ");
			
		}

		System.out.println();
		System.out.println("��ġ�ϴ� ����: " + success + " ��");
		switch (success) {
		case 2:
			System.out.println("******* 5 �� ��÷ *******");
			System.out.println("**** ��÷�ݾ�: 5 õ��  ****");
			System.out.println("****** ���ϵ帳�ϴ� ******");
			break;
		case 3:
			System.out.println("******* 4 �� ��÷ *******");
			System.out.println("**** ��÷�ݾ�: 10���� ****");
			System.out.println("****** ���ϵ帳�ϴ� ******");
			break;
		case 4:
			System.out.println("******* 3 �� ��÷ *******");
			System.out.println("**** ��÷�ݾ�:100���� ****");
			System.out.println("****** ���ϵ帳�ϴ� ******");
			break;
		case 5:
			System.out.println("******* 2 �� ��÷ *******");
			System.out.println("**** ��÷�ݾ�:10 ����  ****");
			System.out.println("****** ���ϵ帳�ϴ� ******");
			break;
		case 6:
			System.out.println("******* 1 �� ��÷ *******");
			System.out.println("**** ��÷�ݾ�: 10 ��� ****");
			System.out.println("****** ���ϵ帳�ϴ� ******");
			break;

		default:
			System.out.println("��÷���� �ʾҽ��ϴ�.");
			break;
		}

	}
}
