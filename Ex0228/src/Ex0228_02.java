
public class Ex0228_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		//1.TV구매  2.컴퓨터구매  3.구매물품 출력 (Product를 for문으로
		//1 -> b.buy(new Tv()); 
		//2 -> b.buy(new Computer()); 
		
//		b.buy(new Tv()); // TV 1대 구매
//		System.out.println("TV 1대 구매");
//		b.buy(new Computer());
//		System.out.println("컴퓨터 1대 구매");
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
			System.out.println("금액이 부족합니다.");
			System.out.println("금액을 충전하세요.");
			return; // 이 메소드를 종료하고 다시 돌아간다.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; 
	}
	
	//출력
	void summary() {
		if(item[0] == null) {
			System.out.println("구매물품이 없습니다.");
		}else {
			for (int j = 0; j < i; j++) {
				System.out.print(item[j].name+",");
				sum += item[j].price;
			}
			System.out.println("총구매개수 : "+(i-1));
			System.out.println("총구매금액 : "+sum);
			System.out.println("보유금액 : "+money);
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