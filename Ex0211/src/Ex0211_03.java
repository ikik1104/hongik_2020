import java.util.Scanner;

public class Ex0211_03 {

	
	
	public static void main(String[] args) {
	//   /-> ������  % -> ������
		// 5680�� -> 500, 100 50 ,10

		Scanner scan = new Scanner(System.in);
		
		int[] money = new int[3];
		int[] coin = {500,100,50,10};
		
		int num500 = 0;
		int num100 = 0;
		int num50 = 0;
		int num10 = 0;
		
		
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"��° �ݾ��� �Է��ϼ���");
			money[i] = scan.nextInt();
		}
		
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"��° �Է��� �ݾ� : "+ money[i] + "��");
			for (int j = 0; j < coin.length; j++) {
				System.out.println(coin[j]+"�� :"+money[i]/coin[j]);
				money[i] %= coin[j];
			}
			System.out.println("---------------------------------------");
		}
		
		
		//3���� �ݾ��� �Է��ؼ�. 3���� ����� ����ϼ���.
		//�迭�� ����ؼ�
		
		/*
		
		System.out.println("�Է��� �ݾ� : "+ money + "��");
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i]+"�� :"+money/coin[i]);
			money %= coin[i];
		}
	
		
		num500 = money/500;
		num100 = (money%500)/100;
		num50 = ((money%500)%100)/50;
		num10 = (((money%50)%100)%50)/10;
		
		System.out.println("500�� :"+num500);
		System.out.println("100�� :"+num100);
		System.out.println("50�� :"+num50);
		System.out.println("10�� :"+num10);
		*/
		
		
	}

}
