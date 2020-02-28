import java.util.Scanner;

import org.omg.CORBA.TCKind;

public class Ex0227_05 {
	public static void main(String[] args) {
//		SamsungTv[] sam = new SamsungTv[10];
//		Ref[] ref = new Ref[10];
		User user = new User();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("-----------------------------------------");
		System.out.println("1) �Ｚ TV ����");
		System.out.println("2) ����� ����");
		System.out.println("3) ������ ����");
		System.out.println("4) ���� �ܾ� Ȯ��");
		System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. >>");
		System.out.println("-----------------------------------------");
		switch (scan.nextInt()) {
		case 1:
			user.buy(new SamsungTv());
			break;
		case 2:
			user.buy(new Ref());
			break;
		case 3:
			user.buy(new Condi());
			break;
		case 4:
			user.money_now();
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			continue;
		}
		}//while
	}
}
class User{
	int money = 10000;
	String name = "ȫ�浿";
	//tv���, ref��� ... -
	int tv_cnt = 0;
	int ref_cnt = 0;
	int con_cnt = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
		}else {
			System.out.println(p.name+" 1�븦 �����߽��ϴ�.");
			money -= p.price;
			
			if(p instanceof SamsungTv) {
				tv_cnt++;
				System.out.println(p.name+"���Ŵ�� : "+tv_cnt);
			}
			if(p instanceof Ref) {
				ref_cnt++;
				System.out.println(p.name+"���Ŵ�� : "+ref_cnt);
			}
			if(p instanceof Condi) {
				con_cnt++;
				System.out.println(p.name+"���Ŵ�� : "+con_cnt);
			}
		}
	}
	void money_now() {
		System.out.println("���� ������ �ܾ� :"+money);
	}
	
}