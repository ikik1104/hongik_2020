import java.util.Scanner;

public class Ex0206_02 {

	public static void main(String[] args) {

		/* 1. ���θ� ȭ���� �����
		 * 	- ���� ) ���� �ܾ�, ������ ��ǰ�� ����, 
		 * 2. ������ ��ǰ��ȣ �Է�
		 * 3. ��ǰ�� �����Ѵ�.
		 * 
		 * 
		 * ---������� ����
		 * 1) ���ݰ���
		 * 2) ī�����
		 * ī������� �����ϼ̽��ϴ�.
		 * ī����� �Ͻðڽ��ϴ�?
		 * ����ó����
		 * Y -->(math.random*1)
		 * 11�̸� -> �������
		 * 12�̸� -> ������ᤸ
		 * �ٽù�� -> ī������Ͻðڽ��ϱ�?
		 * 
		 * 
		 * �ܰ�� ��ǰ�ݾװ� ��
		 * �ܰ� ��ǰ �ݾ׺��� ũ�� -> ���Ÿ� ���� 
		 * �ܰ� ��ǰ �ݾ׺��� ������ -> �ܰ� �������� ���� �޴� ����ȭ������
		 * �ܰ��� ��ǰ �ݾ��� ����
		 * �� �ݾ��� ���¿� �ִ´�
		 * ����Ʈ�� 10% �����Ѵ�
		 * 4. ���Ÿ�� ����
		 * 5. �ܰ�, ���űݾ� ���
		 * ��� ����, ����
		 * */
		
		Scanner scan = new Scanner(System.in);
		int select = 0; //�޴�
		int select2 = 0;
		int point = 0;//����Ʈ �ʱ�ȭ
		int c_point = 0;//��ȯ�� ����Ʈ
		String list = "";//���Ÿ�� �ʱ�ȭ
		int bank = 10000;//���� �ܾ� ���� �鸶��
		int com1 = 1000; //��ǰ1 ���� ����
		int tv1 = 2000;//��ǰ2 ���� ����
		int p1 = 3000;//��ǰ3 ���� ����
		int charge = 0;//���� �߰��� ���� �����ʱ�ȭ
		
		loop1:
		while (true) {
			System.out.println("                          [ ���̸�Ʈ ]                                 ");
//			System.out.println("ȸ������ ���� �ܾ� :"+bank+"��  ");
			System.out.printf(" 1) ��ǻ�� %d��    2) TV %d��    3) ����Ʈ�� %d��     4) ��������    5) ����Ʈ ��ȯ      0) ����       %n",com1,tv1,p1);
			System.out.println("�����Ͻ� ��ǰ��ȣ�� �Է��ϼ���.");
			
			select = scan.nextInt();
			
			if(select == 0 ) {
				System.out.println("�ý����� �����մϴ�.");
				break loop1 ;
			}else if(select < 0 || select > 5) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���");
				continue loop1;
			}
			
			
			switch (select) {
			case 1://com1
				if(bank<com1) {
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ� : "+bank);
					break;
				}else {
					System.out.println("���� ����� �����ϼ��� . 1) ���ݰ���   |  2) ī�����");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("�ٽ� �Է��ϼ���.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("���ݰ����� �����մϴ�.");
						bank -= com1;
						point += (com1*0.1);
						list += "��ǻ��1��";
						System.out.println("��ǰ ���Ÿ� �Ϸ��Ͽ����ϴ�");
						System.out.println("�ܿ� �ܾ� : "+bank+"��  , ��������Ʈ : "+ point+"��");
						System.out.println("���� ���� ���� :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("ī����� �Ͻðڽ��ϱ�? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("�ٽ� �Է��ϼ���.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("ī������� �����մϴ�. ���� ó����");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += " ��ǻ��1��";
								point += (com1*0.1);
								System.out.println("���� �Ϸ� �Ǿ����ϴ�. ��������Ʈ :"+(int)(com1*0.1)+"��   ��������Ʈ :"+point+"��");
								System.out.println("���� ���� ���� :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("���� ���� - ����ó���� ��ҵǾ����ϴ�.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("������ ����մϴ�.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 2://tv1
				if(bank<tv1) {
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ� : "+bank);
					break;
				}else {
					System.out.println("���� ����� �����ϼ��� . 1) ���ݰ���   |  2) ī�����");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("�ٽ� �Է��ϼ���.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("���ݰ����� �����մϴ�.");
						bank -= tv1;
						point += (tv1*0.1);
						list += " TV1��";
						System.out.println("��ǰ ���Ÿ� �Ϸ��Ͽ����ϴ�");
						System.out.println("�ܿ� �ܾ� : "+bank+"��  , ��������Ʈ : "+ point+"��");
						System.out.println("���� ���� ���� :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("ī����� �Ͻðڽ��ϱ�? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("�ٽ� �Է��ϼ���.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("ī������� �����մϴ�. ���� ó����");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += "TV1��";
								point += (tv1*0.1);
								System.out.println("���� �Ϸ� �Ǿ����ϴ�. ��������Ʈ :"+(int)(tv1*0.1)+"��   ��������Ʈ :"+point+"��");
								System.out.println("���� ���� ���� :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("���� ���� - ����ó���� ��ҵǾ����ϴ�.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("������ ����մϴ�.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 3://p1
				if(bank<p1) {
					System.out.println("�ܾ��� �����մϴ�. ���� �ܾ� : "+bank);
					break;
				}else {
					System.out.println("���� ����� �����ϼ��� . 1) ���ݰ���   |  2) ī�����");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("�ٽ� �Է��ϼ���.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("���ݰ����� �����մϴ�.");
						bank -= p1;
						point += (p1*0.1);
						list += "����Ʈ��1��";
						System.out.println("��ǰ ���Ÿ� �Ϸ��Ͽ����ϴ�");
						System.out.println("�ܿ� �ܾ� : "+bank+"��  , ��������Ʈ : "+ point+"��");
						System.out.println("���� ���� ���� :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("ī����� �Ͻðڽ��ϱ�? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("�ٽ� �Է��ϼ���.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("ī������� �����մϴ�. ���� ó����");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += " ����Ʈ�� 1��";
								point += (p1*0.1);
								System.out.println("���� �Ϸ� �Ǿ����ϴ�. ��������Ʈ :"+(int)(p1*0.1)+"��   ��������Ʈ :"+point+"��");
								System.out.println("���� ���� ���� :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("���� ���� - ����ó���� ��ҵǾ����ϴ�.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("������ ����մϴ�.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 4://charge
				System.out.println("�����Ͻ� �ݾ��� �Է����ּ���.");
				charge = scan.nextInt();
				bank += charge;
				list += "����Ʈ��1��";
				System.out.println(charge+"���� �����Ǿ����ϴ�.  �� �ݾ� :"+bank);
				break;
				
			
			case 5 :
				while(true) {
				System.out.println("�ݾ����� ��ȯ�Ͻ� ����Ʈ�� �Է����ּ���. ��ȯ ���� ����Ʈ :"+point);
				c_point = scan.nextInt();
				if(c_point > point || c_point < 1) {
					System.out.println("�߸� �ԷµǾ��ų�, ���� ����Ʈ���� ��ȯ�ݾ��� �����ϴ�. �ٽ� �Է��ϼ���.");
				}else {
					point -= c_point;
					 bank += c_point;
					 System.out.println(c_point+"����Ʈ�� �������� ��ȯ�Ǿ�"+bank+"���� �Ǿ����ϴ�.");
					 continue;
				 }
				break;
				}
			

			}
			
			
			
		}
		
		
	}

}
