import java.util.Scanner;

public class Ex0210_0404 {

	public static void main(String[] args) {
		//������ �ڵ�
		
		/*ī�� ����
		 * 
		 * */
		int[] user_card = new int[10]; //���� ī�� 10��
		int user_select_card = 0;//������ ������ ī�� ��ȣ
		int[] com_card = new int[10]; //��ǻ�� ī�� 10��
		int com_index = 0; //��ī�� �迭 ���� ����
		int temp = 0; //�迭 ������ ���� ����
		int win = 0; //�·��� ����
		int draw = 0;//���º�
		int lose = 0 ; //�й�
		
		
		
		for (int i = 0; i < 10; i++) {
			user_card[i] = i+1; //1~10���� ���� �Է�
			com_card[i] = i+1; //1~10���� ���� �Է�
		}
		
		//��ǻ�� ī�带 ����
		for (int i = 0; i <100; i++) {
			com_index = (int)(Math.random()*10); //com_card�迭 ��ȣ
			temp = com_card[0];
			com_card[0] = com_card[com_index];
			com_card[com_index] = temp;
		}
		Scanner scan = new Scanner(System.in);
		
		//user_card / com_Card ��
		for (int i = 0; i < 10; i++) {
			System.out.println("1)1, 2)2, 3)3, 4)4, 5)5, 6)6, 7)7, 8)8, 9)9, 10)10 ");
			System.out.println("ī�带 1-10 �� ī�� 1���� �̾��ּ���.");
			user_select_card = scan.nextInt();

			// user_card[8]
			if(user_card[user_select_card-1]-com_card[i]>0) {
				System.out.println((i+1)+"��° : �¸�");
				System.out.println("user-card:"+user_card[user_select_card-1]+" |  com_card :"+com_card[i]);
				win++;
				user_card[user_select_card-1] = 0;
			}else if (user_card[user_select_card-1]==com_card[i]) {
				System.out.println((i+1)+"��° : ���º�");
				draw++;
				user_card[user_select_card-1] = 0;
			}else {
				System.out.println((i+1)+"��° : �й�");
				lose++;
				user_card[user_select_card-1] = 0;
			}//if
		}//for
		
		System.out.printf("�·� : %.1f", (float)win/10*100);
		
	}
	
}
