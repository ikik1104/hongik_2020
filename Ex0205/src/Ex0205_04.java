import java.util.Scanner;

public class Ex0205_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1) �ݿø� 
		//2	�ø�
		//3)����
		//4) �ݿø����ϴ� ������ �ݿø�
		//���ϴ� ��ȣ�� �Է��ϼ���.
		
		//���ѹݺ������ؼ� �Ҽ����� �ϳ� �޴´�.
		
		//1�� ���ý� 
		//�Ҽ��� ����� �Ǽ��� �Է��ϼ���.
		//3.1454 -> 3 , 4.523 -> 5 0 ���� 99����
		
		int select = 0;
		double num = 0.0;
		int num2 = 0;
		
		int abc=(int)e(4);
		System.out.println(abc);
		
		loop1 : while (true) {
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. (���� : 99)");
			System.out.println("1) �ݿø�");
			System.out.println("2) �ø�");
			System.out.println("3) ����");
			System.out.println("4) �ݿø� �ڸ��� ����");
			select =scan.nextInt(); //�޴� �Է¹���
			
			if(select ==99) {
				break;
			}
			if(!(select>=1 && select <=4)) {
				System.out.println("1~4�� ������ ��ȣ�� �Է��ϼ���");
				System.out.println("----------------------------");
			}
			
			switch (select) {
			case 1: //�ݿø�
				while(true) {
					System.out.println("�ݿø��� �Ǽ��� �Է��ϼ���.(�����̵�:0 , ����:99)");
					num = scan.nextDouble();
					if(num==0) {
						continue loop1;
					}else if(num == 99) {
						break loop1; 
					}
					num2 = (int)Math.round(num);
					System.out.println("�ݿø� : "+num2);
					System.out.println("----------------------------");
					
				}
				
			case 2: //�ø�
				while(true) {
				System.out.println("�ø��� �Ǽ��� �Է��ϼ���.(�����̵�:0 , ����:99)");
				num = scan.nextDouble();
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("�ý����� �����մϴ�.");
					break loop1;
				}
				num2 = (int)Math.ceil(num);
				System.out.println("�ø� : "+num2);
				System.out.println("----------------------------");
				}
			case 3: //����
				while(true) {
				System.out.println("������ �Ǽ��� �Է��ϼ���.(�����̵�:0 , ����:99)");
				num = scan.nextDouble();
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("�ý����� �����մϴ�.");
					break loop1;
				}
				num2 = (int)Math.floor(num);
				System.out.println("���� : "+num2);
				System.out.println("----------------------------");
				}
				
			case 4 : //�ݿø� �ڸ��� ����
				while(true) {
				int aa = 1;
				System.out.println("�ݿø��� �Ǽ��� �Է��ϼ��� (�����̵�:0 , ����:99)");
				num = scan.nextDouble();
				
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("�ý����� �����մϴ�.");
					break loop1;
				}
				
				System.out.println("�ݿø� �� �ڸ����� �Է��ϼ���.");
				num2 = scan.nextInt(); // 10*num2
				
				for (int i = 1; i < num2; i++) {
				
					aa = aa*10;
				}
				
				double aa1 = (Math.round(num*aa)/(double)aa);
				System.out.println(num2+"��° �ڸ����� �ݿø� :"+aa1);
				System.out.println("---------------------------");
				
				//---------------------------------------------------------------------------������ Ǯ��
				System.out.println("�ݿø��� �Ǽ��� �Է��ϼ��� (�����̵�:0 , ����:99)");
				num = scan.nextDouble();
				
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("�ý����� �����մϴ�.");
					break loop1;
				}
				
				System.out.println("�Ҽ� ��°�ڸ����� �ݿø� �Ұǰ���?");
				select = scan.nextInt(); 
				if(select<0 || select>3) {
					System.out.println("�Ҽ���3���� ����");
					continue;
				}
				
				switch (select) {
				case 1:
					System.out.println("�Ҽ�ù°�ڸ� �ݿø� �� : "+Math.round(num));
					break;
				case 2:
					System.out.println("�Ҽ���°�ڸ� �ݿø� �� : "+Math.round(num*10)/10.0);
					break;
				case 3:
					System.out.println("�Ҽ���°�ڸ� �ݿø� �� : "+Math.round(num*100)/100.0);
					break;

				default:
					break;
				}
				
				
				
				}
			}
			
			
		}
	
		
		
		
		
		System.out.println("�ý����� �����մϴ�.");
		
	}

	private static int e(int aa) {
		// TODO Auto-generated method stub
		return 0;
	}
}
