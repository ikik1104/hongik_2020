import java.util.Scanner;

public class Ex0304_04 {

	public static void main(String[] args) {
		
		/*	1.�ֹι�ȣ�� �޾Ƽ� �������� �������� Ȯ���Ͻÿ�.
		 * 	13�ڸ��� �Է�, ���ڸ� �ԷµǾ���Ѵ�.
		 * 
		 * 	2. �й��� �Է¹޾� ���� �������� Ȯ���Ͻÿ�
		 * 	��ǻ���а� 	c0001
		 * 	�����а� 	e0002
		 * 	�����а� 	k0003
		 * 
		 * 	3. �ѱ� (kor),
		 * */
		Scanner scan = new Scanner(System.in);
		
		loop1:
		while(true) {
		System.out.println("1) �ֹι�ȣ Ȯ��   2)�� Ȯ��   3)�װ��� Ȯ��  4)�̸��� �Է�");
		
		switch (scan.nextInt()) {
		case 1:
			System.out.println("�ֹι�ȣ ���ڸ� �Է�");
			String jumin = scan.next();
			if(jumin.length() > 13) {
				System.out.println("�߸��� �Է��Դϴ�. (13�ڸ� �ʰ�)");
				break;
			}
			
			for (int i = 0; i < jumin.length(); i++) {
				if(!(jumin.charAt(i) >= 48 && jumin.charAt(i) <= 57)) {
//					if(!(jumin.charAt(i) >= '0' && jumin.charAt(i) <= '9')) {
					System.out.println("���ڸ� �Է��ϼ���.");
					continue loop1;
				}
			}
			
			if(jumin.charAt(6) == '1' || jumin.charAt(6) == '3') {
				System.out.println("�����Դϴ�.");
			}else if(jumin.charAt(6) == '2' || jumin.charAt(6) == '4') {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("�Է��� �ٸ��� �ʽ��ϴ�.");
			}
			break;
		case 2:
			System.out.println("�й��� �Է��ϼ���");
			String hak = scan.next();
			if(hak.contains("c")) {
				System.out.println("��ǻ�� �а��Դϴ�.");
			}else if(hak.contains("e")) {
				System.out.println("�����а� �Դϴ�.");
			}else if(hak.contains("k")) {
				System.out.println("�����а� �Դϴ�.");
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			break;
		case 3:
			System.out.println("��� �Է��ϼ���.");
			String air = scan.next();
			if(air.equalsIgnoreCase("KE")) {
				System.out.println("���� �װ��Դϴ�");
			}else if(air.equalsIgnoreCase("OZ")) {
				System.out.println("�ƽþƳ� �װ��Դϴ�");
			}else if(air.equalsIgnoreCase("AF")) {
				System.out.println("���������� �װ��Դϴ�");
			}else {
				System.out.println("��ġ�ϴ� �װ��簡 �����ϴ�.");
			}
			break;

		case 4:
			System.out.println("�̸����� �Է��ϼ���.");
			String email = scan.next();
			
			if(email.contains("@")) {
				if(email.contains(".")) {
					System.out.println("�̸����� �ԷµǾ����ϴ�.");
				}else {
					System.out.println("�̸����� �ùٸ��� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�̸����� �ùٸ��� �ʽ��ϴ�.");
			}
			
		default:
			break;
		}
		
		}
	}
}
