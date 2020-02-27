import java.util.Scanner;

public class Ex0226_04 {
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
		System.out.println("----------------------------------------------------------------------");
		System.out.println("1) �����ӽ���       2) ī��ޱ�    3) Ŭ�ι����� ");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.>>");
		System.out.println("----------------------------------------------------------------------");
		
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
			System.out.print("\t("+(i+1)+") "+com[i]);
		}
		System.out.println();
		
		System.out.print("�� ī��:\t\t");
		for (int i = 0; i < cnt/2; i++) {
			System.out.print("\t("+(i+1)+") "+user[i]);
		}
		System.out.println();
	}
	
	//Ŭ�ι��� ���� ���ϱ�
	static void clo_chk(Card[] com, Card[] user, int cnt) {
		int u_clo = 0;
		int u_heart = 0;
		int u_dia = 0;
		int u_spade = 0;
		
		int c_clo = 0;
		int c_heart = 0;
		int c_dia = 0;
		int c_spade = 0;
		for (int i = 0; i < cnt/2; i++) {
			
			if(com[i].kind==1) {
				c_clo++;
			}else if(com[i].kind==2) {
				c_heart++;
			}else if(com[i].kind==3) {
				c_dia++;
			}else {
				c_spade++;
			}
			
			if(user[i].kind==1) {
				u_clo++;
			}else if(user[i].kind==2) {
				u_heart++;
			}else if(user[i].kind==3) {
				u_dia++;
			}else {
				u_spade++;
			}
			
		}
		System.out.println("\tŬ�ι� \t��Ʈ \t���̾Ƹ�� \t�����̽�");
		System.out.println("��ǻ��  :\t "+c_clo+" \t "+c_heart+" \t "+c_dia+" \t "+c_spade);
		System.out.println("User :\t "+u_clo+" \t "+u_heart+" \t "+u_dia+" \t "+u_spade);
		
	}
}
