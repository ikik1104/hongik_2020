import java.util.Scanner;

public class Ex0304_05 {

	public static void main(String[] args) {
		/* Ư�����ڰ� �ϳ��� �־�� �Ѵ�.
		 * �빮�ڰ� �ϳ��� �־���Ѵ�
		 * ���̴� 8�ڸ� �̻�
		 * 
		 * �ֹι�ȣ �Է¹޴´�. 888888-8888888
		 * ��ȭ��ȣ �Է¹޴´�. 010-1111-1111
		 * �и��ؼ� ���
		 * 
		 * 
		 * "��й�ȣ �Է� �յ� ������� �Է��Ͻø� �ȵ˴ϴ�."
		 * ��й�ȣ �Է¹޾Ƽ� ��������� ����� �Է°� ���
		 * */
		
		//
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1)��й�ȣ �Է�    2)split  3)trim");
		switch (scan.nextInt()) {
		case 1:
			
//			System.out.println("��й�ȣ�� �Է��ϼ���.");
//			String pw = scan.next();
//			
//			if(pw.length() >= 8) {
//				for (int i = 0; i < pw.length(); i++) {
//					if((pw.charAt(i)>='0'&&pw.charAt(i)<='9')||(pw.charAt(i)>='a'&&pw.charAt(i)<='z') ||
//							(pw.charAt(i)>='A'&&pw.charAt(i)<='9'))
//				}
//			}
			
//			int chk1 = 0;
//			int chk2 = 0;
//
//				if(pw.length() >= 8) {
//					for (int i = 0; i < pw.length(); i++) {
//						char ch = pw.charAt(i);
//						if(ch >= 'A' && ch <= 'Z') {   chk1++;	}
//						if((ch >=33 && ch <=47) || (ch >=58 && ch<=64)||(ch >=91 && ch <=96)) {  chk2++; }
//					}
//				} else {
//					System.out.println("(8�ڸ� ����) ��и�ȣ�� �ٽ� �Է��ϼ���.");
//					break;
//				}
//				
//				if(chk1==0 || chk2==0) {
//					System.out.println("�ٽ��Է�");
//				}else {
//					System.out.println("�Է¿Ϸ�");
//				}
			break;
		case 2:
			System.out.println("�ֹι�ȣ �Է�");
			String jumin = scan.next();
			String[] j = jumin.split("-");
			
			for (int i = 0; i < j.length; i++) {
				System.out.println(j[i]);
			}
			System.out.println("-----------------------------");
			
			System.out.println("��ȭ��ȣ �Է�");
			String tel = scan.next();
			String[] t = tel.split("-");
			
			for (int i = 0; i < t.length; i++) {
				System.out.println(t[i]);
			}
			
			break;
		case 3:
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String pass = scan.next();
			System.out.println(pass.trim().replaceAll(" ", ""));
		default:
			break;
		}
		
		
	}
}
