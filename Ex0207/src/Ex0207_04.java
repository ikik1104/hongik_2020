import java.util.Scanner;

public class Ex0207_04 {

	public static void main(String[] args) {
		/*2020 02 07 
		 * 
		 * ���� ���Ǳ�
		 * Ŀ�� 100, ���� 50, ���� 70
		 * 
		 * 1-��Ŀ�� 
		 * Ŀ�� 10
		 * 
		 * 2-���Ŀ��
		 * Ŀ�� 7 ���� 5
		 * 
		 * 3-��
		 * Ŀ�� 5, ���� 5
		 * 
		 * 4-��ũĿ��
		 * Ŀ�� 4, ����3, ����2
		 * 
		 * 9�� �����ڸ�� (�α���)
		 * Ŀ��, ����, ������ �ܷ�Ȯ�� 
		 * ���� ��ᰡ �����մϴ� �����ڿ��� �������ּ���.
		 * 
		 * �� �Ǹż�
		 * �� �־��� �ȳ־���
		 * 
		*/
		Scanner scan = new Scanner(System.in);
		int select = 0;	//�޴�����
		int cof = 100; //Ŀ���� ��
		int sugar = 50; //������ ��
		int milk = 70; //������ ��
		int count = 0; //�� �Ǹŷ�
		String id = "aaa";
		String pw = "1234";
		int sum = 0; //�� �Ǹž�
		int cof_1 = 100; //��Ŀ���� ����
		int cof_2 = 300; // ���Ŀ���� ����
		int cof_3 = 200; //���� ����
		int cof_4 = 100; //��ũĿ���� ����
		int plus = 0; //�߰��� ���� or ������ �ݾ�?
		boolean cof1_ox = true; //��
		boolean cof2_ox = true; //���
		boolean cof3_ox = true; //ī��
		boolean cof4_ox = true; //��ũ

		int won = 0;
	
		
		
		loop1:
		while(true) {
			
			//�����ϸ� ǰ��Ȯ���� ���� ���
			//������ = false��
			if(cof<10) {
				cof1_ox = false;
			}else {
				cof1_ox = true;
			}
			if(cof<7 || sugar<5) {
				cof2_ox = false;
			}else {
				cof2_ox = true;
			}
			if(cof<5 || milk<5) {
				cof3_ox = false;
			}else {
				cof3_ox = true;
			}
			if(cof<4 || milk<3 || sugar<3) {
				cof4_ox = false;
			}else {
				cof4_ox = true;
			}
			
			

			System.out.println("---------------------------------------------------------");
			System.out.println("���Ͻô� ���Ḧ ����ּ���.");
			
			//false�� ǰ�� ����...( ***�� ª�� �����ϸ� �����ϱ� *** )
			if(cof1_ox==true) {
			System.out.println("1) ��Ŀ�� "+cof_1+"��");
			}else {
				System.out.println("1) ��Ŀ�� (ǰ���Դϴ�.)");
			}
			if(cof2_ox==true) {
			System.out.println("2) ���Ŀ�� "+cof_2+"��");
			}else {
				System.out.println("2) ���Ŀ�� (ǰ���Դϴ�.)");
			}
			if(cof3_ox==true) {
			System.out.println("3) ī��� "+cof_3+"��");
			}else {
				System.out.println("3) ī��� (ǰ���Դϴ�.)");
			}
			if(cof4_ox==true) {
			System.out.println("4) ��ũĿ�� "+cof_4+"��");
			}else {
				System.out.println("4) ��ũĿ�� (ǰ���Դϴ�.)");
			}
			
	
			/*
			System.out.println("1) ��Ŀ�� "+cof_1+"��");
			System.out.println("2) ���Ŀ�� "+cof_2+"��");
			System.out.println("3) ī��� "+cof_3+"��");
			System.out.println("4) ��ũĿ�� "+cof_4+"��");
			*/
			System.out.println("9) �����ڸ��");
			System.out.println("0) �ý��� ����");
			System.out.println();
			select = scan.nextInt();
			
			//�޴� �̿��� �͵� �Է½�
			if(!(select==9 || (select>0 && select<5))) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			
			
			//�޴� ���� �Ŀ� ���� �ִ´�.
			System.out.println("������ �ݾ��� �Է��ϼ���.");
			won = scan.nextInt();
			
			switch (select) {
			
			case 1:
				
				if(cof<10) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
					break;
				}
				//���� �ݾ��� ��ǰ �ݾ׺��� ������
				if(won<cof_1) {
					System.out.println("��ǰ���� ���� �����Դϴ�.");
					break;
				}
				cof -= 10;
				System.out.println("�Ž����� :"+(won-cof_1)+"��");
				System.out.println("��Ŀ�ǰ� ���Խ��ϴ�. ���ְ� �弼��");
				sum += cof_1;
				count++;
				break;
			case 2:
				if(cof<7 || sugar <5) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
					break;
				}
				if(won<cof_2) {
					System.out.println("��ǰ���� ���� �����Դϴ�.");
					break;
				}
				cof -= 7;
				sugar -= 5;
				System.out.println("�Ž����� :"+(won-cof_2)+"��");
				System.out.println("���Ŀ�ǰ� ���Խ��ϴ�. ���ְ� �弼��");
				sum += cof_2;
				count++;
				break;
			case 3:
				if(won<cof_3) {
					System.out.println("��ǰ���� ���� �����Դϴ�.");
					break;
				}
				if(cof<5 || milk<5) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
					break;
				}
				cof -= 5;
				milk -= 5;
				System.out.println("�Ž����� :"+(won-cof_3)+"��");
				System.out.println("ī��󶼰� ���Խ��ϴ�. ���ְ� �弼��");
				sum += cof_3;
				count++;
				break;
			case 4:
				if(won<cof_4) {
					System.out.println("��ǰ���� ���� �����Դϴ�.");
					break;
				}
				if(cof<4 || sugar<3 || milk<2 ) {
					System.out.println("��ᰡ �����մϴ�. �����ڿ��� �����ϼ���.");
					break;
				}
				cof -= 4;
				sugar -= 3;
				milk -= 2;
				System.out.println("�Ž����� :"+(won-cof_4)+"��");
				System.out.println("��ũĿ�ǰ� ���Խ��ϴ�. ���ְ� �弼��");
				sum += cof_4;
				count++;
				break;
			case 9 :
				System.out.println("�����ڸ��� �α����մϴ�. ���̵� �Է����ּ���.");
				String id_ch = scan.next();
				
				//���̵� ��ġ���������� ���� �ʱ� �޴��� ����.. -> ���߿� ��� �α��� �Է¹ް� ����***
				if(!(id.equals(id_ch))){
					System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
					continue;
				}
				
				System.out.println("�н����带 �Է��ϼ���.");
				String pw_ch = scan.next();
				
				//�н����� �ȸ¾Ƶ� �ʱ� �޴���..
				if(!(pw.equals(pw_ch))) {
					System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
					continue;
				}
				loop2:
				while(true) {
				System.out.println("------------------------------------------------");
				System.out.printf("���� ���: Ŀ��  %dg, ���� %dg, ���� %dg %n",cof,sugar,milk);
				System.out.println("�� �Ǹ� �� : "+count+"��");
				System.out.println("�� �Ǹűݾ� :"+sum+"��");
				System.out.println("------------------------------------------------");
				System.out.println("���Ͻô� �޴��� �����ϼ���. 1) ��Ẹ��, 2) ��ǰ ���ݼ���, 3)�ʱ� ȭ������");
				select = scan.nextInt();
				
				//�޴��� ���� ��ȣ ���ý�
				if(!(select>0 && select <4)) {
					System.out.println("�߸��� �Է��Դϴ�.");
					continue loop2;
				}
				//�ʱ�ȭ������
				if(select ==3 ) {
					break;
				}
				
				switch (select) {
				case 1:
					System.out.println("�߰��� ��Ḧ ������ 1)Ŀ��, 2)����, 3)����");
					select = scan.nextInt();
					if(!(select>0 && select<4)) {
						System.out.println("�߸��� �Է��Դϴ�.");
						continue ;
					}
					
					if(select == 1) {
						System.out.println("Ŀ�� ��׶��� �߰��Ͻðڽ��ϱ�?");
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�߸��� �Է��Դϴ�.");
							continue ;
						}
						cof += plus;
						System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
						continue;
					}
					if(select == 2) {
						System.out.println("���� ��׶��� �߰��Ͻðڽ��ϱ�?");
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�߸��� �Է��Դϴ�.");
							continue ;
						}
						sugar += plus;
						System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
						continue;
					}
					if(select == 3) {
						System.out.println("���� ��׶��� �߰��Ͻðڽ��ϱ�?");
						milk = scan.nextInt();
						if(plus<1) {
							System.out.println("�߸��� �Է��Դϴ�.");
							continue ;
						}
						cof += plus;
						System.out.println("�߰��� �Ϸ�Ǿ����ϴ�.");
						continue;
					}
					break;
				case 2:
					System.out.println("��ǰ�� ������ �����մϴ�. ������ �����Ͻ� ��ǰ�� �����ϼ���");
					System.out.println("1)��Ŀ�� ["+cof_1+"��]  2)���Ŀ�� ["+cof_2+"��]  3)��Ŀ�� ["+cof_3+"��]  4)��ũĿ�� ["+cof_4+"��]");
					select = scan.nextInt();
					if(select<1 || select >4) {
						System.out.println("�߸��� �����Դϴ�.");
						break;
					}
					switch (select) {
					case 1:
						System.out.println("�󸶷� �����Ͻðڽ��ϱ�? ���� ���� :"+cof_1);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�ݾ� ����: �ٽ� �����ϼ���");
							break;
						}
						cof_1 = plus;
						System.out.println("�ݾ� ������ �Ϸ��Ͽ����ϴ�.");
						continue;
					case 2:
						System.out.println("�󸶷� �����Ͻðڽ��ϱ�? ���� ���� :"+cof_2);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�ݾ� ����: �ٽ� �����ϼ���");
							break;
						}
						cof_2 = plus;
						System.out.println("�ݾ� ������ �Ϸ��Ͽ����ϴ�.");
						continue;
					case 3:
						System.out.println("�󸶷� �����Ͻðڽ��ϱ�? ���� ���� :"+cof_3);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�ݾ� ����: �ٽ� �����ϼ���");
							break;
						}
						cof_3 = plus;
						System.out.println("�ݾ� ������ �Ϸ��Ͽ����ϴ�.");
						continue;
					case 4:
						System.out.println("�󸶷� �����Ͻðڽ��ϱ�? ���� ���� :"+cof_4);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("�ݾ� ����: �ٽ� �����ϼ���");
							break;
						}
						cof_4 = plus;
						System.out.println("�ݾ� ������ �Ϸ��Ͽ����ϴ�.");
						continue;

					}
					break;
				}
				
				break;
				}//loop2
				
				break;
			
			}
			
		}
	}
}
