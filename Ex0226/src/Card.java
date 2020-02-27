
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
		super(); //�ڵ�����
		//�����ڿ� �ƹ��͵� ������ �Ʒ� �����ε��� �����ڿ��� super�� �����ȴ�
//		this(1,CLOVER); ������ ������ ȣ���ϴ� �����ڷ� ���� super�Ⱥ���
	}
	
	Card(int kind, int number){
		super(); //�ڵ�����
		this.kind = kind;
		this.number = number;
	}
	//���
	public String toString() { //toString -> Object���� ������ �޼ҵ� (�������̵�)
		String[] kinds = {"","CLOVER","HEAER","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		return kinds[kind]+" "+numbers.charAt(number);
	}
	
}