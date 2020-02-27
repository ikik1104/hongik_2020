
public class Ex0225_05 {
	public static void main(String[] args) {
		
		Deck d = new Deck(); //52장의 카드 만들기
		Card c1 = d.pick(10); //cardArr[10] 이 넘어온다
//		for (int i = 0; i < d.CARD_NUM; i++) {
//			System.out.println(d.pick(i));
//		}
		System.out.println("-----------------------------------------");
//		d.shuffle();
//		Card c2 = d.pick(10);
//		for (int i = 0; i < d.CARD_NUM; i++) {
//			System.out.println(d.pick(i));
//		}

		//7장만 출력하기
		System.out.println("-----------------------------------------");
		d.shuffle();
		for (int i = 0; i < 7; i++) {
			System.out.println(d.pick(i));
		}
	}
}

class Deck{
	final int CARD_NUM = 52;
	Card[] cardArr = new Card[CARD_NUM];

	//초기화 완성 1~13,종류 4개
	Deck() { //kind,number
		for (int i = 0; i < Card.KIND_MAX; i++) { //카드 종류가 4개 클로버 하트 다이아몬드 스페이드
			for (int j = 0; j < Card.NUM_MAX; j++) { //0~13까지의 숫자
				cardArr[(i*13)+j] = new Card(i+1,j+1);
			}
		}
	}
	//Card 뽑기
	Card pick(int index) {
		return cardArr[index]; //10 -> CLOVER 10
	}
	
	//랜덤 뽑기
	Card pick() {
		int index = 0;
		index = (int)(Math.random()*52); //0~51번 배열을 선택
		return cardArr[index]; // pick(index) 가능
	}

	//카드 섞기
	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int temp = (int)(Math.random()*52);
			Card temp2 = cardArr[0];
			cardArr[0] = cardArr[temp];
			cardArr[temp] = temp2;
		}
	}
	
	
}





class Card{
	
	static final int KIND_MAX = 4; // 카드 무늬 개수
	static final int NUM_MAX = 13; //무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind; // 1=clover, 2=heart, 3=diamond, 4=spade
	int number; // 1,2,3,4,....9,X,J,Q,K
	
	Card(){
		
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	//카드 객체 찍기
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMIND","SPADE"};
		String numbers = "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
}