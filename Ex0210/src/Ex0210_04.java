import java.util.Scanner;

public class Ex0210_04 {

	public static void main(String[] args) {
		
		//1~10���� ī�� ����� (����)
		//�ڽ��� �迭 1~10���� ����ī�带 �����.
		//��ǻ���� �迭 1~10������ ����ī�带 �����.
		//�������� ���´�.
		//�ڽ��� ���ϴ� �迭�� ���� ī�带 �����ؼ�
		//�ڽ��� ������ �¸�, ������ ���º�, ������ �й�
		//�·��� ���غ�����.
		//�ߺ����� ī�带 ���� �ߺ��Դϴ�. �ٽ� �����ϼ��� ���� �޼��� 
		
		//�ڽ��� �´� ī�带 ���������� ����Ʈ
		
		int[] m_card = new int[10];
		int[] mm_card = new int[10];
		int[] c_card = new int[10];
		int num1 = 0;
		int num2 = 0;
		int select = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		Scanner scan = new Scanner(System.in);
		
		//��ī�忡 ���ڳֱ�
		for (int i = 0; i < m_card.length; i++) {
			m_card[i] = i+1;
		}
		
		//���� ī�忡 ���ڳֱ�
		for (int i = 0; i < c_card.length; i++) {
			c_card[i] = i+1;
		}
		
		//���� ī�� ����
		for (int i = 0; i < 100; i++) {
			num1 = (int)(Math.random()*10);
			
			num2 = c_card[0];
			c_card[0] = c_card[num1];
			c_card[num1] = num2;
		}
		
		for (int i = 0; i < 10; i++) {
			//���ݱ��� �� ī�� ���
			System.out.print("���ݱ��� ����� ī�� : ");
			for (int j = 0; j < mm_card.length; j++) {
				if(mm_card[j]!=0) {
					System.out.print(mm_card[j]+" ");
				}
				
			}
			
			
			System.out.println();
			System.out.println((i+1)+"��° ���� : ���° ī�带 �����? 1~10");
			select = scan.nextInt();
			
			if(select <1 || select>10) {
				System.out.println("1~10������ ���ڸ� ������");
				i--;
				continue;
			}

			if(m_card[select-1] == 0) {
				System.out.println("�̹� ����� ī���Դϴ�.");
				i--;
			}
			
			
			
			mm_card[i] = select;
			

			
			
			System.out.println("���� �� ī�� :"+select);
			System.out.println("��ǻ���� ī��:"+c_card[select-1]);
			
			if(c_card[select-1] == m_card[select-1]) {
				System.out.println("���º� �Դϴ�.");
				draw++;
			}else if(c_card[select-1] > m_card[select-1]) {
				System.out.println("�й��Ͽ����ϴ�.");
				lose++;
			}else if(c_card[select-1] < m_card[select-1]) {
				System.out.println("�¸��Ͽ����ϴ�.");
				win++;
			}
			
			
			m_card[select-1] = 0; //���� �ٲٸ� �ȉ�~~!!
		}
		
	System.out.printf("�¸�: %d, ���º�: %d, �й�: %d %n", win, draw, lose);
	System.out.printf("�·�: %.1f ",((float)win/10*100));
		
		
		
		
		
	}
}
