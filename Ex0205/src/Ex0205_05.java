import java.util.Scanner;

public class Ex0205_05 {

		public static void main(String[] args) {
			// [ ���� ��� ] 
			// 1) �簢�� ���� ����*����
			// 2) �ﰢ�� ����  ��*��/2
			// 3) ������ (����=3.14) ������*������*����
			Scanner scan = new Scanner(System.in);
			int select = 0;
			int num1 = 0;
			int num2 = 0;
			
			
			loop1: while(true) {
				
				System.out.println(" [ ���� ��� ] ");
				System.out.println("1) �簢�� ����");
				System.out.println("2) �ﰢ�� ����");
				System.out.println("3) �� ����");
				System.out.println("------���� : 0------");
				select = scan.nextInt();
				
				
				if(select == 0) {
					break loop1;
				}
				
				if(select<0 || select>3) {
					System.out.println("--------�߸��� �Է�--------");
					continue loop1;
				}
				
				switch (select) {
				case 1:
					while(true) {
					System.out.println("�簢���� ���� ���ϱ� ( �������� :0, ����:99 )");
					System.out.printf("���θ� �Է��ϼ��� :");
					num1 = scan.nextInt();
					
					if(num1 == 0) {
						continue loop1;
					}else if(num1 == 99) {
						break loop1;
					}
					
					System.out.printf("���θ� �Է��ϼ��� :");
					num2 = scan.nextInt();
					System.out.println("�簢���� ����  = "+num1 * num2);
					System.out.println("---------------------");
					}
				case 2:
					while(true) {
						System.out.println("�ﰢ���� ���� ���ϱ� ( �������� :0, ����:99 )");
						System.out.printf("�غ��� ���̸� �Է��ϼ��� :");
						num1 = scan.nextInt();
						
						if(num1 == 0) {
							continue loop1;
						}else if(num1 == 99) {
							break loop1;
						}
						
						System.out.printf("���̸� �Է��ϼ��� :");
						num2 = scan.nextInt();
						System.out.println("�ﰢ���� ����  ="+(num1 * num2 *0.5));
						System.out.println("---------------------");
						}
					
				case 3:
					while(true) {
						System.out.println("���� ���� ���ϱ� ( �������� :0, ����:99 )");
						System.out.printf("�������� �Է��ϼ��� :");
						num1 = scan.nextInt();

						if(num1 == 0) {
							continue loop1;
						}else if(num1 == 99) {
							break loop1;
						}
						
						System.out.println("���� ���� :"+(3.14*num1*num1));
						System.out.println("---------------------");
						}
				}
				
				
			
			}//while
			
			System.out.println("�ý����� �����մϴ�.");
			
			
			
			
		}
		
		
}
