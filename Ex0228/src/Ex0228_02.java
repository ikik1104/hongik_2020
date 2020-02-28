
public class Ex0228_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		//1.TV����  2.��ǻ�ͱ���  3.���Ź�ǰ ��� (Product�� for������
		//1 -> b.buy(new Tv()); 
		//2 -> b.buy(new Computer()); 
		
//		b.buy(new Tv()); // TV 1�� ����
//		System.out.println("TV 1�� ����");
//		b.buy(new Computer());
//		System.out.println("��ǻ�� 1�� ����");
		b.summary();
	}
}

class Buyer{
	int money = 100000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	int sum = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ݾ��� �����մϴ�.");
			System.out.println("�ݾ��� �����ϼ���.");
			return; // �� �޼ҵ带 �����ϰ� �ٽ� ���ư���.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; 
	}
	
	//���
	void summary() {
		if(item[0] == null) {
			System.out.println("���Ź�ǰ�� �����ϴ�.");
		}else {
			for (int j = 0; j < i; j++) {
				System.out.print(item[j].name+",");
				sum += item[j].price;
			}
			System.out.println("�ѱ��Ű��� : "+(i-1));
			System.out.println("�ѱ��űݾ� : "+sum);
			System.out.println("�����ݾ� : "+money);
		}
		
	}
	
}


class Product{
	int price;
	String name;
	int bonusPoint;
	
	Product(){
		
	}
	
	Product(String name, int price, int bonusPoint){
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
}


class Tv extends Product{
	
	
	Tv(){
		super("TV",1000,1000/10);
	}
	
	
}


class Computer extends Product{
	
	Computer(){
		super("Computer",900,900/10);
	}
	
}