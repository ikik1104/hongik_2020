import java.util.Scanner;

public class Ex0207_02_2 {

	public static void main(String[] args) {
		String id = "aaa";
		String pass = "1234";
		int count = 0;//�ڽ��� ������ ����������
		int user = 0; //��ǻ�Ͱ� ������ ����������
		int com = 0;
		int win = 0;//�̱�Ƚ��
		int draw = 0;
		int lose = 0;
		int login_ch = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� .>> ");
		count = scan.nextInt();
		
		loop1:
		while(true) {
		System.out.println("�����ϱ� ���� login���ּ���. >>");
		System.out.println("���� id�� �Է����ּ���");
		String id_ch = scan.next();
		
		if(login_ch>3) {
			System.out.println("�α��� ���� 3ȸ �ʰ� / �ý����� ����˴ϴ�.");
			break loop1;
		}
		
		if(!(id.equals(id_ch))) {
			System.out.println("id�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			login_ch++;
			continue loop1;
		}
		
		System.out.println("Pw �� �Է����ּ���");
		String pass_ch = scan.next();
		
		if(!(pass.equals(pass_ch))) {
			System.out.println("id�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
			login_ch++;
			continue loop1;
		}
		
	}//while
		
		
		
		for (int i = 1; i <=count; i++) {
			
			System.out.println("����(1), ����(2), ��(3) �߿� �ϳ��� �����ϼ���");
			user = scan.nextInt();
			
			if(user<1 || user>3) {
				System.out.println("��� ���ڸ� �߸��־����ϴ�. ����������.(1-3������)");
				i--; //�׳� �ϸ� i�� +�� �ȴ�.
				continue; 
			}
			
			com = (int) (Math.random()*3)+1;
			System.out.println(i+"��° �� ���ڴ�?");
			//1-3 =-2(�¸�) 1-1 = 0 (���º�) 1-2 =-1(�й�)
			//2-1 = 1(�¸�) 2-2 = 0(���º�)  2-3 = -1(�й�)
			//3-2 = 1(�¸�) 3- 3= 0 (���º�) 3-1 = 2(�й�)
			
			switch (user-com) {
			case -2: case 1:
				System.out.println("����� �¸�");
				win++;
				break ;
			case 0:
				System.out.println("���º�");
				draw++;
				break ;
			case 2: case -1:
				System.out.println("��ǻ�� �¸�");
				lose++;
				break ;
			}//swi
		}
	
		System.out.println("����Ƚ�� :"+count);
		System.out.println("�¸� Ƚ�� : "+win);
		System.out.println("���º� Ƚ��: "+draw);
		System.out.println("���º� Ƚ��: "+lose);
		System.out.printf("�·� : %.1f%n ", win/count*100);
	
   }
}
