import java.util.Scanner;

public class Ex0206_test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int cal = 0;
		int price = 0; //����ö��� �ݾ�
		String yn = "";
		int time1 = 0;
		int time2 = 0; 
		
		
		loop1 :
		while(true) {//while1
			System.out.println("1.��������д�����    2.����             3.�ŵ���         4.������          5.�ű�");
			System.out.println("6.���                      7.�뷮��          8.���            9.����            10.���￪");
			System.out.println("11.��û                   12.����           13.����3��    14.����5��      15.���빮");
			System.out.println("16.������                17.�ż���        18.���⵿       19.û����        20.ȸ��");
			System.out.println("--------------------------------------------------------");
			System.out.println("����ϴ� ����ȣ�� �����ϼ���.");
			start = scan.nextInt();
			System.out.println("�����ϴ� ����ȣ�� �����ϼ���.");
			end = scan.nextInt();
			
			cal = Math.abs(start-end)+1;
			time1 =  ((cal-1)*150)/60;
			time2 =  ((cal-1)*150)%60;
			System.out.println(time1+"  "+time2);
			
			//�⺻��� + 0 *100 = �⺻���
			//�⺻��� + 1 *100 = �⺻��� +100
			price = 1250 + (int)(Math.ceil(cal/5))*100 ;
			
			System.out.println("��߿�: "+start);
			System.out.println("������: "+end);
			System.out.println("����: "+cal );
			System.out.println("����ö ��� :"+ price);
			System.out.println("�ҿ�ð�:"+time1+"��  "+time2+"��");
			
			loop2:while(true) { //while2
			System.out.println("�ٽ� ����ö��ݰ���� �Ͻðڽ��ϱ�? Y/N");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				continue loop1;
			}else if(yn.equalsIgnoreCase("n")) {
				System.out.println("�ý����� �����մϴ�.");
				break loop1;
			}else{
				System.out.println("�ٽ� �Է��ϼ���");
				continue loop2;
			}
		}//while2
			
		}//while1
		
		
		
		
	}
}
