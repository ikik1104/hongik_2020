import java.util.Scanner;

public class Ex0205_07 {

	public static void main(String[] args) {
		//for���� ����ؼ� �հ� 
		// 5�� ����� �����ؼ� continue 5  ������ ���� ���ϴ� ���α׷�
		//�Է��� 2����  2 40 -> 5�� ����� �����ϰ� �հ踦 ���Ͻÿ�
		//�� ��� ���ϱ⸦ ������ �Բ� ���
		Scanner scan = new Scanner(System.in);
		
		int check = 0;
		String jumin = "";//�ֹι�ȣ
		String mf = ""; //��������
		int age = 0; //����
		int i = 0; //���ϴ� Ƚ��
		int sum = 0; //���ϴ� �հ� ��
		int num1 = 0;
		int num2 = 0;
		
		loop1:
		while(true) {
			System.out.println(" [ ���ռ��� ���α׷� ] ");
			System.out.println(" 1) �μ��� ���ϴ� ���α׷� ");
			System.out.println(" 2) �ֹι�ȣ ���̰�� ���α׷�");
			System.out.println(" 3) �ֹι�ȣ ����Ȯ�� ���α׷� ");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���.(���� : 99)");
			check = scan.nextInt();

			if(check == 99) {
				System.out.println("�ý����� �����ϰڽ��ϴ�.");
				break;
			}else if(!(check>=1 && check<=3)) {
				System.out.println("��ȣ�� �߸� �Է��Ͽ����ϴ�.1~3���� �Է��ϼ���.");
				continue;
			}
			
			switch (check) {
			case 1:// �� ���� ���ϴ� ���α׷�
				while(true) {
					System.out.println("���Ϸ��� �ϴ� ������ ���� 2���Է��Ͻÿ�.(����:0, ���� : 99) ");
					num1 = scan.nextInt();
					if(num1==99) {
						System.out.println("�ý����� �����ϰڽ��ϴ�.");
						break loop1;
					}else if(num1 == 0) {
						continue loop1;
					}
					//num1�� num2���� Ŭ�� �ٽ� �Է��� �޴� �ݺ���
						System.out.println("���Ϸ��� �ϴ� ������ ���� 1�� �� �Է��Ͻÿ�");
						num2 = scan.nextInt();
						
						if(num1>num2) {
							System.out.println(num1+"���� �� ū ���� �ٽ� �Է��Ͻÿ�");
							int num3 = num2;
							num2 = num1;
							num1 = num3;
						}
					for (i = num1; i <=num2 ; i++) {
						sum += i;
					}
					System.out.println(num1+"����"+num2+"���� �� :"+sum);
					sum = 0;
				}//while

			case 2:
				//�ֹι�ȣ ���� ��� ���α׷� 880101-1011198
				while(true) {
					System.out.println("�ֹι�ȣ�� �Է��ϼ���.(�����̵�:0, ����:99)");
					jumin = scan.next();
						if(jumin.equals("99")) {
							break loop1;
						}else if(jumin.equals("0")) {
							continue loop1;
						}
						//jumin��ȣ ���
						//charAt(0)
						if(jumin.charAt(7)=='1' || jumin.charAt(7)=='2') {
							String ju_check = 19+jumin.substring(0,2);
							age = 2019 - Integer.parseInt(ju_check) + 1;
						}else if(jumin.charAt(7)=='3' || jumin.charAt(7)=='4') {
							String ju_check = 20+jumin.substring(0,2);
							age = 2019 - Integer.parseInt(ju_check) + 1;
						}else {
							System.out.println("�ֹι�ȣ�� �߸� �ԷµǾ����ϴ�.");
							continue;
					}
						System.out.println("����� ���̴� ? "+ age);
				}//while
			case 3:
				/*�ֹι�ȣ ���� Ȯ�� ���α׷� 880101-'1'10111*/
				while (true) {
					System.out.println("�ֹι�ȣ�� �Է��ϼ���.( �������� :0, ����:99 )");
					jumin = scan.next(); //�ֹι�ȣ�� �Է¹���
					
					if(jumin.equals("0")) {
						continue loop1;
					}else if(jumin.equals("99")) {
						break loop1;
					}
					
					if(jumin.charAt(7)== '1' ||jumin.charAt(7)== '3') {
//						System.out.println("�����Դϴ�.");
						mf="����";
					}else if(jumin.charAt(7)== '2' ||jumin.charAt(7)== '4') {
//						System.out.println("�����Դϴ�.");
						mf="����";
					}else {
						System.out.println("�ٽ� �Է��ϼ���.");
						continue;
					}
				}
			}
			System.out.println("����� ������ "+ mf + "�Դϴ�.");
		}//while
		System.out.println("�ý����� �����ϰڽ��ϴ�.");
	
	
	}//main
}//class
