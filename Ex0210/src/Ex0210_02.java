import java.util.Scanner;

public class Ex0210_02 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int temp = 0;
		int ball_index = 0;
		int success = 0;// �Ȱ��� ���ڰ� �ִ��� Ȯ���ϴ� ����
		
		while(true) {
		System.out.println("���ڸ� �ϳ��� �Է��ϼ��� 1~45");
		num = scan.nextInt();
		if(!(num>=1 || num <=45)) {
			System.out.println("��ȣ�� �߸� �ԷµǾ����ϴ�. �ٽ��Է�");
			continue;
			}
			break;
		}
		
		int[] ball = new int[45]; //45���� �迭����
		for (int i = 0; i < ball.length; i++) { // 1~45������ ���ڰ� ��
			ball[i] = i+1;
		}
		for (int i = 0; i < 200; i++) {
			ball_index = (int)(Math.random()*45); //0~44������ �迭 index��ȣ ����
			
				temp = ball[0];
				ball[0] = ball[ball_index];
				ball[ball_index] = temp;
		}
		

		System.out.println("�ζǹ�ȣ ? ;");
		for (int i = 0; i <6; i++) {
			if(num == ball[i]) {
				success++;
			}
			System.out.print(ball[i]+" ");
		}
		
		System.out.println();
		if(success != 0) {
			System.out.println("��÷�Ǿ����ϴ�. ��÷��ȣ :"+num);
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
		/*
		System.out.println("���ڸ� �ϳ��� �Է��ϼ��� 1~45");
		num = scan.nextInt();
		for (int i = 0; i <6; i++) {
			if(num == ball[i]) {
				System.out.println("���÷");
			}else {
				System.out.println(i+1+"��° ���ڿ� ��ġx");
			}
//			System.out.println(ball[i]+" ");
		}
		*/
		
		
	}
}
