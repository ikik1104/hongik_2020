import java.util.Scanner;

public class Ex0206_01 {

	public static void main(String[] args) {
		
		//�ڽ��� ���¸� �����.
		//���θ����� 1���� ��ǰ�� ����
		//�ڽ��� ���¿��� ��ǰ������ ���ִ� ���α׷�
		String list1 = ""; //���Ÿ��
		
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int my_bank = 5000000;
		int p_num = 0; //���� ��ǰ ��ȣ
		int com1 = 1300000; //��ǻ�� �ݾ�
		int tv1 = 1000000; //Ƽ��ݾ�
		int p1 = 880000; //�� �ݾ�
		
		loop1 :while (true) {
		System.out.println("_______________________[    ���̸�Ʈ ����      ]____________________");
		System.out.printf(" 1.��ǻ��(%d��)  2.TV(%d��)  3.����Ʈ��(%d��) 4.�ݾ�����  %n ",com1,tv1,p1);
		System.out.println("-------------------------------------------------------------");
		System.out.printf("�����ϰ���� ��ǰ�� �����ϼ��� .  ���� : 0 >>");
	
		p_num = scan.nextInt();
		
		if(p_num==0) {
			break loop1;
		}else if(p_num <0 || p_num > 4) {
			System.out.println("�ءءءءء� �߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.�ءءءءء�");
			continue loop1 ;
		}
		
		
		switch (p_num) {
		case 1:
			if(my_bank >= com1) {
				my_bank -= com1; // my_bank = my_bank - 1250000
				point += (com1*0.1);
				System.out.println("��ǻ�� 1�븦 �����߽��ϴ�.");
				System.out.println("��ǻ�� �ݾ� : "+com1+"��");
				list1 += " ��ǻ�� 1��";
			}else {
				System.out.println(" --------------�¢¢¢��ܰ� �����մϴ�.�¢¢¢�------------- ");
				break;
			}
			break;
			
			
		case 2:
			if(my_bank >= com1) {
				my_bank -= tv1; // my_bank = my_bank - 1250000
				point += (tv1*0.1);
				System.out.println("TV 1�븦 �����߽��ϴ�.");
				System.out.println("TV �ݾ� : "+tv1+"��");
				list1 += " TV1��";
			}else {
				System.out.println("--------------�¢¢¢��ܰ� �����մϴ�.�¢¢¢�--------------");
				break ;
			}
			break;
			
			
			
			
		case 3:
			if(my_bank >= com1) {
				my_bank -= p1; // my_bank = my_bank - 1250000
				point += (p1*0.1);
				System.out.println("����Ʈ�� 1�븦 �����߽��ϴ�.");
				System.out.println("����Ʈ�� �ݾ� : "+p1+"��");
				list1 += " ����Ʈ�� 1��";
			}else {
				System.out.println("--------------�¢¢¢��ܰ� �����մϴ�.�¢¢¢�--------------");
				break;
			}
			break;
			
			
			
			
		case 4:
			System.out.println("������ �ݾ��� �Է��ϼ���.");
			int charge = scan.nextInt(); //my_bank = my_bank + scan
			my_bank += charge ;
			System.out.printf("%d ���� �����Ǿ����ϴ�. %n", charge);
			break;
		}
		
		System.out.println("���� �����ݾ� : "+ my_bank+" ��");
		System.out.println("���� ����Ʈ :"+point +"��");
		System.out.println("-----------------------------------");
		System.out.println("���Ÿ�� :"+list1);
		
		}//while
		System.out.println("�ý����� �����մϴ�.");
		
	}//main
}
