import java.util.Scanner;

public class Ex0206_test {

	public static void main(String[] args) {
		/* [����ö ��� ���α׷�]
		 * 1ȣ����
		 * ����1 ����2.....ȸ�⿪����
		 * �⺻��� : 1,250��
		 * 1-5������ ����/  6-10 +100���� /11-15 +200�� /16-20 +300��
		 *
		 * */
		
		//���방��: Math.abs(1-2) +1
		Scanner scan = new Scanner(System.in);
		/*
		int num1 = 1; //����
		int num2 = 2;  //����
		int num3 = 3;  //�ŵ���
		int num4 = 4;  //������
		int num5 = 5; //�ű�
		int num6 = 6; //���
		int num7 = 7; //�뷮��
		int num8 = 8; //���
		int num9 = 9; //����
		int num10 = 10; //���￪
		int num11 = 11; //��û
		int num12= 12; //����
		int num13 = 13; //����3��
		int num14 = 14; //����5��
		int num15 = 15; //���빮
		int num16 = 16; //������
		int num17 = 17; //�ż���
		int num18 = 18; //���⵿
		int num19 = 19; //û����
		int num20 = 20; //ȸ��
		*/
		
		int sub1 = 0; //��߿�
		int sub2 = 0; //������
		
		
		 loop1 :while(true) {
			int num = 1250;
			System.out.println("1.��������д�����    2.����             3.�ŵ���         4.������          5.�ű�");
			System.out.println("6.���                      7.�뷮��          8.���            9.����            10.���￪");
			System.out.println("11.��û                   12.����           13.����3��    14.����5��      15.���빮");
			System.out.println("16.������                17.�ż���        18.���⵿       19.û����        20.ȸ��");
			System.out.println("--------------------------------------------------------");
			
			System.out.println("����Ͻ� ���� �Է��ϼ���.");
			sub1 = scan.nextInt();
			if(sub1<1 || sub1>20) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue loop1;
			}
			
			System.out.println("�����Ͻ� ���� �Է��ϼ���. �ڷΰ��� : 0");
			sub2 = scan.nextInt();
			
			if(sub2==0) {
				continue loop1;
			}
			
			if(sub1<0 || sub1>20) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue loop1;
			}
			
			int a = Math.abs(sub1-sub2)+1;
//			System.out.println(a); //�̵��Ÿ�
			
				for (int i = 1; i <a+1; i++) {
					if(i>=6 && i<=10) {
						num += 100; 
						i++;
					}else if(i>=11 && i<=15) {
						num += 200; 
						i++;
					}else if(i>=16 && i<=20) {
						num += 200; 
						i++;
					}
				}
				
				
				System.out.println(a+"������ �̵� ---����� "+num+"�� �Դϴ�.");
				
			}
			
		
		
		}
}
