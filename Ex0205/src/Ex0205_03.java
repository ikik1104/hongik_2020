import java.util.Scanner;

public class Ex0205_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int select1 = 0;
		int num1 = 0;
		int num2 = 0;
		
		loop1 : while (true) {//��ü �ý���
			System.out.println("[ ��Ģ���� ���α׷� ]");
			System.out.println("----------------");
			System.out.println("1) ������ ���");
			System.out.println("2) ����");
			System.out.println("3) ���ϱ�");
			System.out.println("4) ������");
			System.out.println(" ���ϴ� ��ȣ�� �Է��ϼ���. ( ���� : 99 )");
			
			select1 = scan.nextInt();
			
			if(select1 == 99) { //0�϶� ����
				break;
			}
		
			if(!(select1>=1 && select1<=4)) { //1~9R���� ���ڸ� �Է°��ɤ�
				System.out.println("1~4������ ���ڸ� �Է��ϼ���.");
				continue;
			}
			
			switch (select1) { //��Ģ���� ����
			case 1:
				loop2:
				while(true) {
					System.out.println("1)���ϴ� ������ ���.");
					System.out.println("2)���ϴ� �ܺ��� ���.");
					System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. (���� �̵� :0, �ý������� : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						System.out.println("������ �̵��մϴ�.");
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					
					switch (num1) {
					case 1:
						while (true) {
							System.out.println("���ϴ� �� ���� �Է��ϼ���.(�����̵� :0 , ���� :99)");
							num2 = scan.nextInt();
							
							if(num2==0) {
								continue loop2;
							}else if(num2 == 99) {
								break loop1;
							}
							for (int i = num2; i <=num2; i++) {
								for (int j = 1; j <=9; j++) {
									System.out.println(i+"*"+j+"="+i*j);
								}
							}
							System.out.println("----------------------------");
						}
						
					case 2: 
						for (int i = 1; i <=9; i++) {
							for (int j = 1; j <=9; j++) {
								System.out.println(i+"*"+j+"="+i*j);
							}
						}
						break;
				

					}
				}//case
				
			case 2:
				while(true) {
					System.out.println("���� ���� �μ��� �Է��ϼ���.(���� �̵� :0, �ý������� : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1�� �� �Է��ϼ���");
					num2 = scan.nextInt();
					System.out.println("�μ��� ���� : "+(num1-num2));
				}
				
			case 3:
				while(true) {
					System.out.println("���ϰ� ���� �μ��� �Է��ϼ���.(���� �̵� :0, �ý������� : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1�� �� �Է��ϼ���");
					num2 = scan.nextInt();
					System.out.println("�μ��� ���ϱ� : "+(num1*num2));
				}
				
			case 4:
				while(true) {
					System.out.println("������ ���� �μ��� �Է��ϼ���.(���� �̵� :0, �ý������� : 99)");
					num1 = scan.nextInt();
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					System.out.println("1�� �� �Է��ϼ���");
					num2 = scan.nextInt();
					System.out.println("�μ��� ������ : "+(num1/num2));
				}
				
			default:
				break;
			}
		}//while
		System.out.println("�ý����� �����ϰڽ��ϴ�.");
		
	}//main
}//class
