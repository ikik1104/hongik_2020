import java.util.Scanner;

public class Ex0212_01 {

	public static void main(String[] args) {
		//�ζǹ�ȣ ����
		Scanner scan = new Scanner(System.in);
		
		int[] r_num =new int [45];
		int[][] m_num =new int [10][6];
		int temp = 0;
		int num = 0;
		int win = 0;
		
		//�ζǹ迭�� ���� �ֱ�
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = i+1;
		}
		
		//���� ����
		
		for (int i = 0; i < r_num.length; i++) {
			num = (int)(Math.random()*45);
			
			temp = r_num[0];
			r_num[0] = r_num[num];
			r_num[num] = temp;
		}

		
		
		for (int i = 0; i < m_num.length; i++) {
			System.out.println("[ "+(i+1)+". ]");
			for (int j = 0; j < m_num[j].length; j++) {
				System.out.print((j+1)+"��° ���ڸ� �Է��ϼ��� 1~45 >>");
				m_num[i][j] = scan.nextInt();
				if(m_num[i][j] <1 || m_num[i][j] >45) {
					System.out.println();
					System.out.println("�ٽ� �Է��ϼ���");
					j--;
					continue;
				}
			}
		}

		
		
		
		
//		System.out.println("���� 6���� �Է��ϼ���.");
//		for (int i = 0; i < m_num.length; i++) {
//			System.out.print((i+1)+"��° ���ڸ� �Է��ϼ��� 1~45 >>");
//			m_num[i] = scan.nextInt();
//			if(m_num[i] <1 || m_num[i] >45) {
//				System.out.println();
//				System.out.println("�ٽ� �Է��ϼ���");
//				i--;
//				continue;
//			}
//		}
		
		
		//�ζ� 6�� ���
				System.out.println("�ζ� ��ȣ :");
				for (int i = 0; i < 6; i++) {
					System.out.print(r_num[i] +" ");
				}
				System.out.println();
				
				
				/*�� �ζ� 6�� ���
				System.out.println("���� ��ȣ :");
				for (int i = 0; i < m_num.length; i++) {
					for (int j = 0; j < m_num[i].length; j++) {
						System.out.print(m_num[i] +" ");
					}
					System.out.println();
				}*/
		
	
		for (int i = 0; i < m_num.length; i++) {
			for (int j = 0; j < m_num[i].length; j++) {
				for (int k = 0; k < 6; k++) {
					if(m_num[i][j] == r_num[k]) {
						win++;
					}
				}
		}
			System.out.println("----------"+(i+1)+"��° -------------");
			System.out.print(win+"�� ��ġ ");
			switch (win) {
			case 2:
				System.out.println("5��");
				System.out.println("��� : 5õ�� �Դϴ�.");
				win = 0;
				break;
			case 3:
				System.out.println("4��");
				System.out.println("��� : 10���� �Դϴ�.");
				win = 0;
				break;
			case 4:
				System.out.println("3�� �Դϴ�.");
				System.out.println("��� : 1�鸸�� �Դϴ�.");
				win = 0;
				break;
			case 5:
				System.out.println("2�� �Դϴ�.");
				System.out.println("��� : 1��� �Դϴ�.");
				win = 0;
				break;
			case 6:
				System.out.println("1�� �Դϴ�.");
				System.out.println("��� : 10��� �Դϴ�.");
				win = 0;
				break;

			default:
				System.out.println("��÷���� �ʾҽ��ϴ�.");
				win = 0;
				break;
			
				
		}
			
		}
		
		
		

		
		
		
		
	}
}
