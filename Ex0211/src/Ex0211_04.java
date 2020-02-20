
public class Ex0211_04 {
	public static void main(String[] args) {
		
		int[] coin = {500,100,50,10};
		int[] money = new int[4]; // 0
		money = coin;
		
		for (int i = 0; i < money.length; i++) {
			System.out.println(money[i]);
		}
		
		
	}
}
