
public class Deck {
	static final int CARD_MAX = 52;
	Card[] cardArr = new Card[CARD_MAX];
	
	Deck(){
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				cardArr[(i*13)+j] = new Card(i+1,j+1);
			}
		}
	}
	
	//입력받은 카드 출력
	Card pick(int index) {
		return cardArr[index];
	}
	
	//랜덤카드 출력
	Card pick() {
		int index = 0;
		index = (int)(Math.random()*CARD_MAX);
		return cardArr[index];
	}
	
	//카드 섞기
	
	void shuffle() {
		for (int i = 0; i < 2000; i++) {
			int num = (int)(Math.random()*CARD_MAX);
			
			Card temp = cardArr[0];
			cardArr[0] = cardArr[num];
			cardArr[num] = temp;
		}
		
	}
	
	
}
