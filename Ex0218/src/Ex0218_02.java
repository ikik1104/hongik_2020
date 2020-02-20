
public class Ex0218_02 {
	public static void main(String[] args) {
		
		System.out.println("카드 넓이 :"+Card.width);
		System.out.println("카드 높이 :"+Card.height);
		System.out.println("------------------------------");
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
//		c2.kind = "Spade";
//		c2.number = 5 ;
		
		System.out.println("c1카드 : "+c1.kind+"/"+c1.number);
		System.out.println("c1크기 : "+c1.width+"/"+c1.height);
		System.out.println("------------------------------");
		System.out.println("c2카드 : "+c2.kind+"/"+c2.number);
		System.out.println("c2크기 : "+c2.width+"/"+c2.height);
		System.out.println("------------------------------");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1카드 : "+c1.kind+"/"+c1.number);
		System.out.println("c1크기 : "+c1.width+"/"+c1.height);
		System.out.println("------------------------------");
		System.out.println("c2카드 : "+c2.kind+"/"+c2.number);
		System.out.println("c2크기 : "+c2.width+"/"+c2.height);
		System.out.println("------------------------------");
		
	}
}
