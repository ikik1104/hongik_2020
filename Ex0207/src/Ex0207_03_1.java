import java.util.Scanner;

public class Ex0207_03_1 {

	public static void main(String[] args) {
		
		String id ="aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int login_check = 1;
		int count = 0;
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("ID�� �Է����ּ���.");
			id_check = scan.next();
			if(login_check>=5) {
				System.out.println("id, pass�� 5�� �̻� �ԷµǾ����ϴ�.");
				break;
			}
			if(!(id.equals(id_check))) {
				System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���"+login_check+"ȸ ����");
				login_check++;
				continue;
			}
			
			System.out.println("PASS�� �Է����ּ���.");
			pass_check = scan.next();
			
			if(!(pass.equals(pass_check))) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���"+login_check+"ȸ ����");
				login_check++;
				continue;
			}
			
			System.out.println("1���� ���ϰ���� ���ڸ� �Է��ϼ���.");
			count = scan.nextInt();
		
			
			//1~count���� ���ϱ� �ݺ���
			for (int i = 1; i <=count; i++) {
				sum += i; //sum = sum+i
			}
			System.out.printf("1���� %d ���� ����: %d%n", count, sum);
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}//while
	}//main
}//class
