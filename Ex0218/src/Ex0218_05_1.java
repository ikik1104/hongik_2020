import java.util.Scanner;

public class Ex0218_05_1 {

	public static void main(String[] args) {
		//�ζǹ�ȣ �迭 ����
		//�ζǹ�ȣ 1~45�� ���� �Է�
		//�ζǹ�ȣ �������� ����
		//�Է��ϴ� ��ȣ ��ü 10�� ����
		//�Է� 10�� ����
		//��ġ ����
		
		
		int same = 0;
		Scanner scan = new Scanner(System.in);
		
		int[] lotto = new int[45];
		My_lotto[] me = new My_lotto[10];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//���� ����
		shuffle(lotto);
		
		for (int i = 0; i < me.length; i++) {
				me[i] = new My_lotto();
				for (int j = 0; j < 6; j++) {
					System.out.println((i+1)+"��°"+(j+1)+"�� �ζǹ�ȣ�� �Է��ϼ���");
					me[i].lotto_num[j] = scan.nextInt();
					//�ζǹ�ȣ�� �Է¹�ȣ�� ��ġ��
					if(lotto[i]==me[i].lotto_num[j]) {
						same++;
					}
				}
				me[i].same_num = same;
				
				//��ġ������
				switch (same) {
				case 0:
					me[i].rank = 7;
					me[i].reward = 0;
					break;
				case 1:
					me[i].rank = 6;
					me[i].reward = 0;
					break;
				case 2:
					me[i].rank = 5;
					me[i].reward = 0;
					break;
				case 3:
					me[i].rank = 4;
					me[i].reward = 10000;
					break;
				case 4:
					me[i].rank = 3;
					me[i].reward = 10000000;
					break;
				case 5:
					me[i].rank = 2;
					me[i].reward = 100000000;
					break;
				case 6:
					me[i].rank = 1;
					me[i].reward = 1000000000;
					break;

				default:
					break;
				}
			}//for
		
		System.out.print("�ζǹ�ȣ: ");
		for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i]+"  ");
		}
		System.out.println("�Է¹�ȣ 10��");
		for (int i = 0; i < me.length; i++) {
			for (int j = 0; j < me[i].lotto_num.length; j++) {
				System.out.print("�Է¹�ȣ: "+me[i].lotto_num[j]);
			}
			System.out.print(""+me[i].same_num);
			System.out.print(""+me[i].rank);
			System.out.print(""+me[i].reward);
			System.out.println();
			
		}
		
	}//main
	
	//����
	static void shuffle(int[] lotto) {
		int temp=0;
		int num =0;
		
		for (int i = 0; i < 100; i++) {
			num = (int)(Math.random()*45);
			
			temp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = temp;
		}
	}
	
	
}//class
