
public class Card{
	static final int NUM_MAX = 13;
	static final int KIND_MAX = 4;
	
	static final int CLOVER = 1;
	static final int HEART = 2;
	static final int DIAMIND = 3;
	static final int SPADE = 4;
	
	int kind;
	int number;
	
	Card(){
		super(); //자동생성
		//생성자에 아무것도 없으면 아래 오버로딩된 생성자에도 super가 생성된다
//		this(1,CLOVER); 내용이 있으면 호출하는 생성자로 간다 super안붙음
	}
	
	Card(int kind, int number){
		super(); //자동생성
		this.kind = kind;
		this.number = number;
	}
	//출력
	public String toString() { //toString -> Object에서 가져온 메소드 (오버라이딩)
		String[] kinds = {"","CLOVER","HEAER","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
	
}