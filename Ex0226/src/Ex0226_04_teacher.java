import java.util.Scanner;

public class Ex0226_04_teacher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck();
		Card[] c1 = new Card[7];
		Card[] c2 = new Card[7];
		int card_count = 0;
		int user_count = 0;
		d.shuffle();
		
		while(true) {
			
			System.out.println("1. ���ӽ���,  2.1���߰� ,  3.����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. >>");
			int num = scan.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("�����1");
				for (int i = 0; i < 3; i++) {
					c1[i] = d.pick(i);
					System.out.println(c1[i]);
					card_count++;
					user_count++;
				}
				System.out.println("---------------------");
				System.out.println("�����2");
				for (int i = 3; i < 6; i++) {
					c2[i-3] = d.pick(i);
					System.out.println(c2[i-3]);
					card_count++;
				}
				break;
			case 2:
				
				if(user_count>=7) {
					System.out.println("7�� ��� �����Ǿ����ϴ�.");
					break;
				}
				
				for (int i = 0; i < 2; i++) {
					c1[user_count] = d.pick(card_count);
					card_count++;
					c2[user_count] = d.pick(card_count);
					card_count++;
				}
				user_count++;
				
				break;
			default:
				break;
			}
			
		}
		
	}
}
