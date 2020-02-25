
public class Ex0221_02 {

	public static void main(String[] args) {
		//for kind -  클로버, 하트, 다이아몬드, 스페이스
		// number - 1~13 총 52
		String[] kind = {"클로버","하트","다이아몬드","스페이스"};
		String num = "0123456789XJQK";
		Card[] c = new Card[52];
		Card[] c2 = new Card[52];
		
//		for (int i = 0; i < kind.length; i++) {
//			for (int j = 0; j < 13; j++) {
//				c[(i*13)+j] = new Card();
//				c[(i*13)+j].kind = kind[i];
//				c[(i*13)+j].number = j+1;
//				System.out.println(c[(i*13)+j].kind+" / "+num.charAt(c[(i*13)+j].number));
//			}
//		}
//		
		
		
//		System.out.println("2번째 카드");
//		for (int i = 0; i < kind.length; i++) {
//			for (int j = 0; j < 13; j++) {
//				if(j==10) {
//					c2[(i*13)+j] = new Card(kind[i],"J");
//				}else if(j==11) {
//					c2[(i*13)+j] = new Card(kind[i],"Q");
//				}else if(j==12) {
//					c2[(i*13)+j] = new Card(kind[i],"K");
//				}else {
//					c2[(i*13)+j] = new Card(kind[i],(j+1+""));
//				}
//				System.out.println(c2[(i*13)+j].kind+" / "+c2[(i*13)+j].number);
//			}
//		}
//		
//		
		
//		
//		Card c2 = new Card("하트",2);
//		System.out.println("매개변수가 있는 생성자 :"+ c2.kind + " "+c2.number);
		
		
		
		
		
	}
	
}
