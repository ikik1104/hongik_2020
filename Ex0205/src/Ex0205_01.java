import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* ------------------------------------------------------------------countinue�� ����Ͽ� �����ǳʶٱ�
			Loop1 : for (int i = 2; i <=9 ; i++) {
				for (int j = 1; j <= 9 ; j++) {
					if(j==5) {
						continue Loop1; //���� ������ �ǳʶٱ�
					}
					System.out.println(i+"*"+j+"="+i*j);
			}
				System.out.println("------");
		}
		*/
		
		
		/*-------------------------------------------------------------�ܼ��� �Է��ؼ� �Է��� ���� �ܸ� 4���̸� 4�� ���
		
		System.out.println("�ܼ� �ϳ��� �Է��ϼ���.");
		int num = scan.nextInt();
		
		for (int i = 1;  i <=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		*/
		
		/*-------------------------------------------------------------�Է¼� ���� ������ �����ܱ��� ���(1~9���� �Է� �� �ܴ̿� �ٽ� �Է��ϼ���)
		
		//---------------------------------------------------------------���� Ǭ��
		while (true) { 
			System.out.println("�ܼ� �ϳ��� �Է��ϼ���");
			int num2 = scan.nextInt();//�Է¹޴µ�
			if(1>num2 || num2>9) { //1���� num�� �۰ų� , 9���� num�� ũ��;
				System.out.println("�ٽ� �Է��ϼ���"); //�ٽ��Է¹ޱ�
			}else {
				for (int i = num2; i <=9; i++) {
					for (int j =1; j <=9; j++) {
						System.out.println(i+"*"+j+"="+i*j);
					}
					System.out.println("----------------");
				}
				break;
			}
		}
		*/
		//---------------------------------------------------------------�������� Ǯ��
		int dan = 0;
		int select = 0;

		
		loop1: while(true) { //�ܸ����, �ܺ������ �����ϼ���
			System.out.println("������ ������� ����");
			System.out.println("1) ���� �����ܸ� ���");
			System.out.println("2) ���� �����ܺ������");
			System.out.println("���ϴ� �޴��� �����ϼ���.(����  : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			
			if(!(select >=1 && select <=2)) {
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();
			}
			
			 while (true) { //1�� ���� - �ܸ� ���
				
			System.out.println("�ܸ� ����ϴ� ���� �����߽��ϴ�.");
			System.out.println("���ϴ� ���� �Է��ϼ���.( �����̵� : 0 )");
			dan = scan.nextInt();
			
			if(dan==0) {
				System.out.println("������������ �̵��մϴ�.");
				System.out.println("-----------------");
				break ;
			}
			if(!(dan>=1 && dan <=9)) {
				System.out.println("1-9���� ���ڸ� �Է�");
				continue;
			}
			for (int i = dan; i <=dan; i++) {
				for (int j = 1; j <=9; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println("--------------------");
			}//for
			}//����while
		}//ūwhile
		
		/*-------------------------------------------------------���� 2���� �Է�, �Է��� ���ڸ� ���� 
		System.out.println("������ ù��° ���ڸ� �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("������ �ι��� ���ڸ� �Է��ϼ���");
		int num2 = scan.nextInt();
		
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if(j==num1 || j==num2) {
					continue;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-----------------");
		}
		*/
	}
}
