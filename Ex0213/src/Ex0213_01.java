import java.util.Scanner;

public class Ex0213_01 {

	public static void main(String[] args) {
		//�ζǹ�ȣ
		
		int[] ran = new int[45];
		int[] m_num = new int[6];
		int temp = 0;
		int num = 0;
		int count = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i+1;
		}
		
		for (int i = 0; i < ran.length; i++) {
			num = (int)(Math.random()*45);
			
			temp = ran[0];
			ran[0] = ran[num];
			ran[num] = temp;
			
		}

		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ��� 1~45");
			m_num[i] = scan.nextInt();
			if(m_num[i] < 1  || m_num[i] > 45) {
				System.out.println("�ٽ� �Է��ϼ���.");
				i--;
			}
		}
		
		for (int i = 0; i < m_num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(m_num[i] == ran[j]) {
					count++;
				}
			}
		}
		
		System.out.print("�ζǹ�ȣ :");
		for (int i = 0; i < 6; i++) {
			System.out.print(ran[i]+" ");
		}
		System.out.println();
		
		switch (count) {
		case 3:
			System.out.println("4��");
			break;
		case 4:
			System.out.println("3��");
			break;
		case 5:
			System.out.println("2��");
			break;
		case 6:
			System.out.println("1��");
			break;

		default:
			System.out.println("��������:"+count);
			System.out.println("��÷���� �ʾҽ��ϴ�.");
			break;
		}
		
		
		
	}
	
}
