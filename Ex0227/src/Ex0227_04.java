import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		
		/*�ں��� ��ü 1�� ����
		 *ī��ü�� �ְ�
		 *����̺� �޼ҵ� ����
		 *�ٽ� ����ȯ�� �ؼ�
		 *�ں��� 1�� ��ü�� �߰��ؼ� �־
		 *���̷��� ������ ������
		*/
		
		Ambulance am = new Ambulance();
//		Car c = null;
		Car c = am;
		c.drive();
		
		Ambulance am2 = (Ambulance)c;
//		Ambulance am2 = null;
		am2.siren();
		
		
		
	/* ===2
	 

		FireEngine fe = new FireEngine();
		if(fe instanceof FireEngine) {
			System.out.println("�� FireEngine��ü �½��ϴ�.");
		}
		
		if(fe instanceof Car) {
			System.out.println("�� Car��ü �½��ϴ�.");
		}
		
		if(fe instanceof Object) {
			System.out.println("�� Object���� �½��ϴ�.");
		}
	*/
	}

}

