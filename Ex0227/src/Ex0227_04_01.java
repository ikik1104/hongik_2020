import java.util.Scanner;

public class Ex0227_04_01 {

	public static void main(String[] args) {
		/*���� ī ���α׷�
		 * 1) �ҹ������� -- Ŭ����
		 * 2) �ں��� ���� -- Ŭ����
		 * 3) Ʈ�� ���� -- Ŭ����
 		 * ---------------------------
		 * 4) �⺻���� ���� -- �޼ҵ�
		 * ---------------------------
		 * 5) ���� ������ ���� ���� -- �޼ҵ� instanceof
		 * 6) ����
		 * ���ϴ� ��ȣ�� �Է��Ͻÿ�.>>
		 * */
		Scanner scan = new Scanner(System.in);
		Car c = null;
		Car c2 = null;
		FireEngine f = new FireEngine();
		Ambulance am = new Ambulance();
		Truck t = new Truck();
		
		loop1:
		while(true) {
			
			System.out.println("1) �ҹ�������           2) �ں��� ����         3) Ʈ�� ����");
			System.out.println("4) �⺻���� ����");
			System.out.println("5) ���� ������ ���� ���� ");
			System.out.println("6) ����");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ��� . >>");
			
			
			switch (scan.nextInt()) {
			case 1:
				f.water();
				c = f;
				System.out.println("�ҹ����� �����Ǿ����ϴ�.");
				break;

			case 2:
				am.siren();
				c = am;
				System.out.println("�ں����� �����Ǿ����ϴ�.");
				break;
			case 3:
				t.stuff();
				c = t;
				System.out.println("Ʈ���� �����Ǿ����ϴ�.");
				break;
			case 4:
				//�⺻���� �����ϴ� �޼ҵ�
//				change2(c2,c);
				System.out.println(c2);
				c2 = change(c2,c);
				break;
			case 5:
				//���� ������ ���� �����ϴ� �޼ҵ�
				in_of(c2,f,am,t);
				break;
			case 6:
				System.out.println("�ý����� �����մϴ�.");
				break loop1;
				
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue loop1;
			}
			
		}
	}
	
	static Car change(Car c2, Car c) {
		c2 = c;
		System.out.println("�⺻���� �����Ͽ����ϴ�.");
		c2.drive();
		return c2;
	}
	static void change2(Car c2, Car c) {
		c2 = c;
		System.out.println("�⺻���� �����Ͽ����ϴ�.");
		c2.drive();
	}
	
	
	static void in_of(Car c2,FireEngine f, Ambulance am, Truck t) {
		if(c2 instanceof FireEngine) {
			f = (FireEngine) c2;
			System.out.println("�ҹ����� ����Ǿ����ϴ�.");
			f.water();
		}
		if(c2 instanceof Ambulance) {
			am = (Ambulance) c2;
			System.out.println("�ں����� ����Ǿ����ϴ�.");
			am.siren();
		}
		if(c2 instanceof Truck) {
			t = (Truck) c2;
			System.out.println("Ʈ������ ����Ǿ����ϴ�.");
			t.stuff();
		}
	}



}

