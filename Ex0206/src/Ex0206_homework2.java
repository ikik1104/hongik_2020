import java.util.Scanner;

public class Ex0206_homework2 {

	public static void main(String[] args) {
				
				/*
				 * ����������
				 * 1,2,3
				 * 
				 * ���� �������� ��������������
				 * 
				 * 10�� �����ؼ�
				 * �� ��� �̰����
				 * 
				 * �̱�� �¸�, ����  ���º� , ���� �й� ���
				 * �� �¸�, ���º�, �й� Ƚ�� ���
				 * �·�
				 * 
				 * �ɼ�: ���Ƚ�� �Է¹ޱ�
				 * 
				 * 
				 * */
				Scanner scan = new Scanner(System.in);
				
				System.out.println("[    ���� ���� �� ����        ]");
				int num = 0; 
				int ran = 0;
				int count =0; //���� Ƚ��
				int o = 0; //�¸�
				int e = 0; //���º�
				int x = 0; //�й�
				String list = "";
				
				loop1 :
				while(true) {
					
					System.out.println("���ϴ� ���� Ƚ���� �����ϼ��� ����:0");
					count = scan.nextInt();
					
					if(count == 0) {
						break loop1;
					}else if(count <0) {
						System.out.println("�ٽ� �Է��ϼ���");
						continue loop1;
					}
					System.out.println(count+"�� ������ �����մϴ�.");
					
					
					
					for (int i = 1; i <= count; i++) {
						loop2:
						while(true) {
						System.out.println(i+"��° ����");
						System.out.println("1) ����, 2) ����, 3)�� , 0)�ڷΰ��� ");
						num = scan.nextInt();
						ran = (int)(Math.random()*3)+1;
						if(num<0 || num>3) {
							System.out.println("�ٽ� �Է��ϼ���");
							continue loop2;
						}
						if(num==0) {
							continue loop1;
						}
						
						System.out.println(ran);
						if(num == ran) {
							System.out.println("�����ϴ�.");
							list += i+". ���º� \n";
							e++;
						}else if((num==1 && ran==2) || (num==2 && ran==3) ||(num==3 && ran==1)) {
							System.out.println("�й��Ͽ����ϴ�.");
							list += i+". �й� \n";
							x++;
						}else {
							System.out.println("�̰���ϴ�.");
							list += i+". �¸� \n";
							o++;
						}
						break;
						
					}//loop2 while
						
					}//for
					System.out.println("�̱�Ƚ�� :"+o+"��, ���º� :"+e+"��, �й�:"+x+"��");
					System.out.println("�·�:"+(o*100.0)/count+"%");
					System.out.println(list);
					break loop1;
					
				}//loop1 while
				System.out.println("�ý����� �����մϴ�");
			}//main
		}//class

