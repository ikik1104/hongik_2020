import java.util.Scanner;

public class Ex0226_05 {
	public static void main(String[] args) {
		/*ī����� ���α׷�
		 *�� ���� 3�徿 ���������� 1���� �����Ѵ�. �迭�� ��´�. ���Ͳ� ����  
		 * ī��ޱ� ������ ���徿 �߰��Ǿ �� 7�� 
		 * 1) ���ӽ��� 3�徿 
		 * 2) 1�徿 �߰� ��ü ������
		 * 3) ����
		 * */
		Scanner scan = new Scanner(System.in);
		Deck d = new Deck(); //52���� ī�尡 ���´� (������)
		Card[] com = new Card[7];
		Card[] user = new Card[7];
		int cnt = 0;
		

		while(true) {
		
		System.out.println("1) �����ӽ���       2) ī��ޱ�    3) Ŭ�ι����� ");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
		
		switch (scan.nextInt()) {
		case 1:
			d.shuffle(); //���´�.
			cnt = 0;
			
			for (int i = 0; i < 3; i++) {
				com[i] = d.pick(i);
				cnt++;
			}
			for (int i = 0; i < 3; i++) {
				user[i] = d.pick(cnt);
				cnt++;
			}
			print(com,user,cnt);
			break;
		case 2:
			if(cnt >= 14) {
				System.out.println("ī��ޱ� �Ұ�");
				break;
			}
			
			com[cnt/2] = d.pick(cnt);
			user[cnt/2] = d.pick(cnt+1);
			cnt+=2;
			print(com,user,cnt);
			break;
		case 3:
			clo_chk(com,user,cnt);
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
		
	}
}
	//��� �޼ҵ�
	static void print(Card[] com,Card[] user,int cnt) {
		System.out.print("��ǻ���� ī��:\t");
		for (int i = 0; i < cnt/2; i++) {
//			System.out.print("\t  ( card )");
			System.out.print("\t("+(i+1)+") "+com[i]);
		}
		System.out.println();
		
		System.out.print("�� ī��:\t\t");
		for (int i = 0; i < cnt/2; i++) {
			System.out.print("\t("+(i+1)+") "+user[i]);
		}
		System.out.println();
//		System.out.println("���Ͻô� ī�带 �������ּ���.");
	}
	
	//Ŭ�ι��� ���� ���ϱ�
	static void clo_chk(Card[] com, Card[] user, int cnt) {
		int u_chk = 0;
		int c_chk = 0;
		for (int i = 0; i < cnt/2; i++) {
			if(user[i].kind==1) {
				u_chk++;
			}
			if(com[i].kind==1) {
				c_chk++;
			}
		}
		System.out.println("��ǻ���� Ŭ�ι� ���� :"+c_chk);
		System.out.println("������ Ŭ�ι� ���� :"+u_chk);
		
	}
	
}
