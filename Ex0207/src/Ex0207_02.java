import java.util.Scanner;

public class Ex0207_02 {

	public static void main(String[] args) {
		//����������
		
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int num = 0;
		int ran = 0;
		int o = 0; //�̱�Ƚ��
		int e = 0; //���Ƚ��
		int x = 0; //�� Ƚ��
		String list = ""; //���и���Ʈ
		String yn = "";
		
		loop1:
		while(true){
			System.out.println("--------[  ����   ����   ��  ����    ]-----------");
			System.out.println("������ ��ȸ �����ұ��?   �������� : 0");
			count = scan.nextInt();
			
			if(count < 0) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue loop1;
			}else if (count == 0) {
				break loop1;
			}

			System.out.println("������"+count+"ȸ �����մϴ�.");
			
			for (int i = 1; i <= count; i++) {
					System.out.println(i+"��° ������ �����մϴ�.");
					System.out.println("1) ����, 2) ����, 3) ��  4) �ʱ�ȭ������  ");
					num = scan.nextInt();
					ran = (int)(Math.random()*3)+1;
					
					if(num<1 || num>4) {
						System.out.println("�ٽ� �Է����ּ���");
						continue;
					}else if(num == 4) {
						System.out.println("�ʱ�ȭ������ �̵��Ͻðڽ��ϱ�? Y / N");
						yn = scan.next();
						if(yn.equalsIgnoreCase("y")) {
							System.out.println("�ʱ� ȭ������ �̵��մϴ�.");
							continue loop1;
						}else if(yn.equalsIgnoreCase("n")){
							System.out.println("������ ��� �����մϴ�.");
							i--;
							continue;
						}else {
							System.out.println("�߸��� �Է��Դϴ�.");
						}
					}
					
					if(num==ran) {
						System.out.println("�����ϴ�.");
						list += i+"����) ���º� \n"; 
						e++;
					}else if((num==1 && ran == 2) || (num==2 && ran == 3) || (num==3 && ran == 1) ) {
						System.out.println("�й��Ͽ����ϴ�.");
						list += i+"����) �й� \n";
						x++;
					}else {
						System.out.println("�̰���ϴ�.");
						list += i+"����) �¸� \n";
						o++;
					}
					System.out.println("-----------------------------------------");
					break;
			}
			System.out.printf("�¸�: %d��, ���º�: %d��, �й�: %d�� %n�·� :%.1f %n%s%n",o,e,x,(o*100.0/count),list);
			//�Ʒ� �ؽ�Ʈ
			while (true) {
			System.out.println("�絵�� �Ͻðڽ��ϱ�? Y/ �������� N");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				continue loop1;
			}else if(yn.equalsIgnoreCase("n")){
				break loop1;
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			System.out.println("----------------------------------------");
			}
		}//while

		System.out.println("�ý����� �����մϴ�.");
		
		
		
	}//main
}//class


//System.out.println("�¸�: "+o+"��, ���º�: "+e+"��, �й�"+x+"��");
//System.out.println(list);
//System.out.println("�·� : "+(o*100.0/count)+"%");
