import java.util.Scanner;

public class Ex0218_05 {

	public static void main(String[] args) {
		//�ζǴ�÷��ȣ  //��÷��ȣ 6��, ���ʽ���ȣ 10����
		//���� �Է��� ��ȣ class //ȸ�� , ��ȣ6��,��ġ����,���,�ݾ�
		
		//�Է� >ȸ�� �Է� > ��ȣ6�ڸ��Է�
		//ȸ�� �˻��ؼ� -> � ��ġ�ϴ���? ��� �������?  �ݾ� ������?
		//1�� 10�� 6 ,2�� 1�� 5+1, 3�� 1õ���� 5, 4�� 1�ʸ��� 4, 5�� 1���� 3
		//�ݾ� - 1���ϴµ� 1õ�� 			���� 1���� ����

		Scanner scan = new Scanner(System.in);
		Lotto lotto = new Lotto();
		int[] ran = new int[45];
		int temp;
		int num;
		
		
		//�ζ� ����
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i+1;
		}
		
		for (int i = 0; i < 100; i++) {
			num = (int)(Math.random()*45);
			
			temp = ran[0];
			ran[0] = ran[num];
			ran[num] = temp;
		}
	
		while(true) {
		
			if(Lotto.money<=0) {
				System.out.println("���� Ƚ�� �ʰ� (�ܾ׺���)");
				break;
			}
		System.out.println(lotto.game_cnt+"��° ������ �����մϴ�.");
		lotto.game();
		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.1~45");
			lotto.m_num[i] = scan.nextInt();
		}
		
		for (int i = 0; i < lotto.m_num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(lotto.m_num[i] == ran[j]) {
					lotto.same();
				}
			}
		}
	
		switch (Lotto.cnt) {
		case 3:
			System.out.println("5�� ��÷�Դϴ�.");
			System.out.println("���: 1����");
			break;
		case 4:
			System.out.println("4�� ��÷�Դϴ�.");
			System.out.println("���: 1�ʸ���");
			break;
		case 5:
			for (int i = 0; i < lotto.m_num.length; i++) {
				if(lotto.m_num[i] == ran[6]) {
					System.out.println("�ȳ�!!!!");
					System.out.println("2���÷�Դϴ�.");
					System.out.println("��� : 1���");
					list(ran,lotto);
					break;
				}
			}
			
			System.out.println("3�� ��÷�Դϴ�.");
			System.out.println("���: 1õ����");
			break;
		case 6:
			System.out.println("1�� ��÷�Դϴ�.");
			System.out.println("���: 10���");
			break;

		default:
			System.out.println("��÷���� �ʾҽ��ϴ�.");
			break;
		}
		
		list(ran,lotto);
		lotto.game_cnt();
		
		}
	}
	
	static void list (int[] ran,Lotto lotto) {

		System.out.print("��÷��ȣ   :");
		for (int i = 0; i < 6; i++) {
			System.out.print("\t"+ran[i]);
		}
		System.out.println("+ ���ʽ� ����:"+ran[7]);
		
		System.out.print("���� ����:");
		for (int i = 0; i < lotto.m_num.length; i++) {
			System.out.print("\t"+lotto.m_num[i]);
		}
		System.out.println();
		System.out.println("��ġ�ϴ� ����:"+Lotto.cnt);
		System.out.println("���� �ܾ�: "+Lotto.money+"��");
	}
	
	
}
