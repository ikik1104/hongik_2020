import java.util.Scanner;

public class Ex0210_0202 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[6]; //�ζ� �Է¹�ȣ
		int temp = 0;
		int ball_index = 0;
		int[] win_num = new int[6]; //��÷��ȣ
		int success = 0;// �Ȱ��� ���ڰ� �ִ��� Ȯ���ϴ� ����
		
		while(true) {
		
		for (int i = 0; i < num.length; i++) {
			System.out.println((i+1)+"��° ���ڸ� �ϳ��� �Է��ϼ��� 1~45");
			num[i] = scan.nextInt();
			if(!(num[i]>=1 && num[i] <=45)) {
				System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. �ٽ��Է�");
				i--;
				continue;
				}
			}
		break;
		}
		

		int[] ball = new int[45]; //45���� �迭����
		
		for (int i = 0; i < ball.length; i++) { // 1~45������ ���ڰ� ��
			ball[i] = i+1;
		}
		
		//�ڸ���ȯ
		for (int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45); //0~44������ �迭 index��ȣ ����
			
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
		}
		

		
			for (int j = 0; j < num.length; j++) {
				for (int i = 0; i <6; i++) {
					 if(num[j]==ball[i]) {
						 success++;
						 win_num[j] = num[j];
				}
			}
		}
		
		
		System.out.println("�ζǹ�ȣ ?");
		for (int i = 0; i <6; i++) {
			System.out.print(ball[i]+" ");
		}
		
		
		System.out.println();
		System.out.println("*** "+success+"�� ��ġ ***");
		
		System.out.print("���� ��ȣ: ");
			for (int i = 0; i < win_num.length; i++) {
				if(win_num[i] != 0) {
					System.out.print(win_num[i]+" ");	
				}
			}
		System.out.println();
			
			
			switch (success) {
			case 3:
				System.out.println("4�� ��÷�Ǿ����ϴ� (5õ��)");
				break;
				
			case 4:
				System.out.println("3�� ��÷�Ǿ����ϴ� (5����)");
				break;
				
			case 5:
				System.out.println("2�� ��÷�Ǿ����ϴ� (150����)");
				break;
				
			case 6:
				System.out.println("1�� ��÷�Ǿ����ϴ� (16��)");
				break;
		default:
			System.out.println("��÷���� �ʾҽ��ϴ�.");
			break;

			}
		
	}
}
