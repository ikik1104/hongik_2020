import java.util.Scanner;

public class Ex0204_05 {
	public static void main(String[] args) {
		
		//1~100������ �Է°��̶� �������̶� �񱳸��ؼ� �Է°��� ũ�� "�������ڴ� �Է°����� �۽��ϴ� ũ�� Ů�ϴ��ϰ� �ٽ� �Է��Ҽ� �ְ� �ݺ�
		
		Scanner scan = new Scanner(System.in);
		String save ="";
		int ran = (int)(Math.random()*100)+1;
//		/*
		System.out.println("1~100������ ������ �ϳ��� ������. (0�� �Է��ϸ� ���α׷��� ����˴ϴ�.)");
		while(true) {
			
			int input_num = scan.nextInt();
			save = save + input_num + " ";
			if(input_num == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else {
				if(input_num < ran) {
					System.out.println("�������ڴ� �Է°����� Ů�ϴ�.(���Է��ϼ���)");
				}else if(input_num > ran ) {
					System.out.println("�������ڴ� �Է°����� �۽��ϴ�.(���Է��ϼ���)");
				}else if(input_num == ran ){
					System.out.println("�������� �Է°��� �����ϴ�. ��÷");
					System.out.println("�Է��� ��ȣ : "+save);
					break;
				}
			}
			System.out.println("�Է��� ��ȣ : "+save);
		}
//				*/
		
		/*
		System.out.println("1~100������ ������ �ϳ��� ������. (0�� �Է��ϸ� ���α׷��� ����˴ϴ�.)");
		while(true) {
			
			int input_num = scan.nextInt();
			if(input_num == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}else if(input_num < ran) {
					System.out.println("�������ڴ� �Է°����� Ů�ϴ�.(���Է��ϼ���)");
				}else if(input_num > ran ) {
					System.out.println("�������ڴ� �Է°����� �۽��ϴ�.(���Է��ϼ���)");
				}else if(input_num == ran ){
					System.out.println("�������� �Է°��� �����ϴ�. �絵�� Y, N ");
					String out = scan.next();
					if(out.equalsIgnoreCase("y")) {
						System.out.println("����");
					}else {
					}
				
				}
			}
			*/
	}
}
