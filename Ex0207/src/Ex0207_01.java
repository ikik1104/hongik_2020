import java.util.Scanner;

public class Ex0207_01 {
	//���̰�� + �������� 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//�¾ ���� Ȯ���ؼ�
		//12��, 1��, 2�� -> �ܿ￡ �¾����.
		//3,4,5 - ���� �¾����
		//6,7,8 - ������ �¾����
		// 9,10,11 -> ������ �¾����
		//����ġ��
	
		String jumin = "";
		int jumin2 = 0; 
		
		while(true) {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���");
		jumin = scan.next();
		jumin2 = Integer.parseInt(jumin.substring(2,4));
		
		if(!(jumin.length()==14)||!(jumin.charAt(6)=='-')) {
			System.out.println("�߸��� �Է��Դϴ�.");
			continue;
		}
		
		/*
		System.out.println(jumin2+"���� �¾����");
		switch (Integer.parseInt(jumin.substring(2,4))) {
		case 12: case 1: case 2:
			System.out.println("�ܿ￡ �¾����.");
			break;
		case 3: case 4: case 5:
			System.out.println("���� �¾����.");
			break;
		
		case 6: case 7: case 8:
			System.out.println("������ �¾����.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ �¾����.");
			break;
		}
		
		*/
		
		
		if(jumin2 == 12 ||jumin2 == 1 || jumin2 == 2 ) {
			System.out.println("�ܿ￡ �¾����.");
		}else if(jumin2 == 3 ||jumin2 == 4 || jumin2 == 5) {
			System.out.println("���� �¾����.");
		}else if(jumin2 == 6 ||jumin2 == 7 || jumin2 == 8){
			System.out.println("������ �¾����.");
		}else if(jumin2 == 9 ||jumin2 == 10 || jumin2 == 11){
			System.out.println("������ �¾����.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		System.out.println("-----------------------------------");
		
		}//while
		
		
		/*
		//string �޼ҵ� : subString , charAt, Integer.parseInt
		//1���� �Է��ؼ� 0���� �ƴ��� �Ǵ��ϴ� ���α׷��� ����� ���ô�.
		 //�ֹι�ȣ�� 880101-1101111 �������� �ƴ����� �Ǵ�
		//���̰���� �غ�����.
		 * 
		String jumin = "";
		int age = 0;
		
		while(true) {
		System.out.print("�ֹι�ȣ�� �Է��ϼ���. ( - ���� ) >>  ");
		jumin = scan.next();
		age = Integer.parseInt(jumin.substring(0,2)); 

		//��������
		if(jumin.charAt(7)=='3' || jumin.charAt(7)=='4') {
			System.out.println("���̴� : "+(20-age+1)+"�� �Դϴ�."); //2000��� ���� ���̰���
		}
		if(jumin.charAt(7)=='1' || jumin.charAt(7)=='2') {
			System.out.println("���̴� : "+(100-age+20+1)+"�� �Դϴ�."); //1900��� ���� ����
		}
		
		//��������
		if(!(jumin.length()==14)) {
			System.out.println("�߸��� �Է��Դϴ�.");
			continue;
		}else if(jumin.charAt(7)== '1' || jumin.charAt(7)== '3') {
			System.out.println("�����Դϴ�.");
		}else if(jumin.charAt(7)== '2' || jumin.charAt(7)== '4'){
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		System.out.println("--------------------------------------");
		
	  } //while

		 */
		

} //main
 } //class
