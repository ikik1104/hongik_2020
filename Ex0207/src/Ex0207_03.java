import java.util.Scanner;

public class Ex0207_03 {

	public static void main(String[] args) {
		//�α���
		//�α��� 5�̻� ���н� ���α׷� ����
		//1���� �Է��� ������ ���ڸ� ���ϴ� ���α׷�
		
		Scanner scan = new Scanner(System.in);
		String id = "aaa";
		String pw = "1234";
		
		int num = 0;
		int sum = 0;
		int lo_count = 1;
		
		while(true) {
		if(lo_count>=5) {
			System.out.println("�α���Ƚ�� �ʰ� : �ý����� �����մϴ�.");
			break;
		}
			
		System.out.println("���̵� �Է��ϼ���");
		String id_ch = scan.next();
		
		if(!(id_ch.equals(id))) {
			System.out.println("[�α��� ����] ���̵� ��ġ���� �ʽ��ϴ�.");
			lo_count++;
			continue;
		}
		
		System.out.println("�н����带 �Է��ϼ���.");
		String pw_ch = scan.next();
		
		if(!(pw_ch.equals(pw))) {
			System.out.println("[ �α��� ���� ]�ٽ� �Է����ּ���");
			lo_count++;
			continue;
		}
		System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
		
		System.out.println("���ϴ� ���ڸ� �Է����ּ���  0) �α׾ƿ�");
		num = scan.nextInt();

		
		for (int i = 1; i <=num; i++) {
			sum += i;
		}
		
		System.out.println("�� �հ� :"+sum+"�Դϴ�.");
		break;
		}//while 
		
	}//main
}//class
