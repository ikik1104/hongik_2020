import java.util.Scanner;

public class Ex0205_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int num1 = 0;
		int num2 = 0;
	
		// [�� ���� ��Ģ���� ���α׷�]
		//1) ���ϱ�
		//2) ����
		//3) ���ϱ�
		//4) ������
		// ���ϴ� ���ڸ� �Է��ϼ���.( ���� : 0 )
		//1�� �����ϰ� �Ǹ� - "���ϰ� ���� �μ��� �Է��ϼ���. (������ �̵� : 0)"
		//1, 2 -> �� ���� ���� �� (���ڸ� ���� �� ����)
	
		while (true) {
			
			System.out.println("[�μ��� ��Ģ���� ���α׷�]");
			System.out.println("1) ���ϱ�");
			System.out.println("2) ����");
			System.out.println("3) ���ϱ�");
			System.out.println("4) ������");
			System.out.println("5) ���ϱ� ���");
			System.out.println("���ϴ� ���ڸ� �Է��ϼ��� (���� : 0)");
			menu = scan.nextInt();
			
			if(menu==0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(menu<0 || menu>5) {
				System.out.println("***�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���***");
				continue;
			}
			while(true) {
				if(menu == 1) { //���ϱ�
					System.out.println("���ϱ⸦ �����߽��ϴ�.");
					System.out.println("���ϰ� ���� �� ���� �Է��ϼ���. (������ �̵� : 0)");
					System.out.printf("ù��° �� :");
					num1 = scan.nextInt();
					
					if(num1==0) { break; }

					System.out.printf("�ι�° �� :");
					num2 = scan.nextInt();
					
					if(num2==0) { break; }

					System.out.println("�� ���� ���� �� :"+(num1+num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 2) { //����
					System.out.println("���⸦ �����߽��ϴ�.");
					System.out.println("���� ���� �� ���� �Է��ϼ���. (������ �̵� : 0)");
					System.out.printf("ù��° �� :");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					System.out.printf("�ι�° �� :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("�� ���� �� �� :"+(num1-num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 3) { //���ϱ�
					System.out.println("���ϱ⸦ �����߽��ϴ�.");
					System.out.println("���ϰ� ���� �� ���� �Է��ϼ���. (������ �̵� : 0)");
					System.out.printf("ù��° �� :");
					num1 = scan.nextInt();
					
					if(num1==0) { break; }
					
					System.out.printf("�ι�° �� :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("�� ���� ���� �� :"+(num1*num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 4) {//������
					System.out.println("�����⸦ �����߽��ϴ�.");
					System.out.println("������ ���� �� ���� �Է��ϼ���. (������ �̵� : 0)");
					System.out.printf("ù��° �� :");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					System.out.printf("�ι�° �� :");
					num2 = scan.nextInt();

					if(num2==0) { break; }
					
					System.out.println("�� ���� ���� �� :"+(num1/num2));
					System.out.println("--------------------------");
					break;
				}
				if(menu == 5 ) { //������ ���
					System.out.println("������ ����� �����߽��ϴ�.");
					System.out.println("���ϴ� ���� �Է��ϼ���. (������ �̵� : 0)");
					num1 = scan.nextInt();

					if(num1==0) { break; }
					
					for (int i = num1; i <=num1; i++) {
						for (int j = 1; j <=9; j++) {
							System.out.println(num1+" * "+j+" = "+num1*j);
						}
					}
				}
			}
		}
	}
}
