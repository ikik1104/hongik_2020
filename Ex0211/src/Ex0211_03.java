import java.util.Scanner;

public class Ex0211_03 {

	
	
	public static void main(String[] args) {
	//   /-> 나누나  % -> 나머지
		// 5680원 -> 500, 100 50 ,10

		Scanner scan = new Scanner(System.in);
		
		int[] money = new int[3];
		int[] coin = {500,100,50,10};
		
		int num500 = 0;
		int num100 = 0;
		int num50 = 0;
		int num10 = 0;
		
		
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"번째 금액을 입력하세요");
			money[i] = scan.nextInt();
		}
		
		for (int i = 0; i < money.length; i++) {
			System.out.println((i+1)+"번째 입력한 금액 : "+ money[i] + "원");
			for (int j = 0; j < coin.length; j++) {
				System.out.println(coin[j]+"원 :"+money[i]/coin[j]);
				money[i] %= coin[j];
			}
			System.out.println("---------------------------------------");
		}
		
		
		//3번의 금액을 입력해서. 3번의 결과를 출력하세요.
		//배열을 사용해서
		
		/*
		
		System.out.println("입력한 금액 : "+ money + "원");
		for (int i = 0; i < coin.length; i++) {
			System.out.println(coin[i]+"원 :"+money/coin[i]);
			money %= coin[i];
		}
	
		
		num500 = money/500;
		num100 = (money%500)/100;
		num50 = ((money%500)%100)/50;
		num10 = (((money%50)%100)%50)/10;
		
		System.out.println("500원 :"+num500);
		System.out.println("100원 :"+num100);
		System.out.println("50원 :"+num50);
		System.out.println("10원 :"+num10);
		*/
		
		
	}

}
