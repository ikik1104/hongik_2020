import java.util.Date;
import java.util.Vector;

import javax.xml.crypto.Data;

public class Ex0302_01 {
	public static void main(String[] args) {
		// 제품이라는 형태  - tv.com.audio - 제품에는 
		// 학생이라는 제품
		// 상속 개념으로 만들기가 어렵습니다.
		
		//구매자 - money, bonus, 구매목록 / 구매, 환불, 출력
		
		Buyer user = new Buyer(); //구매자 1명 생성
		
		user.buy(new Tv());
		user.buy(new Computer());
		user.buy(new Audio());
		user.summary();
		
	}
}//class

class Buyer{
	
	int money = 10000;
	int bonus = 0;
	Tv t = new Tv();
	Date d = new Date();
	Vector cart = new Vector();// <> -> 제너럴?  넣어도 안넣어도 문제없다. vector에 들어갈수 있는걸 정해준다. 상관없으면 안씀
//	Product[] cart = new Product[10]; //배열 구조
	int i = 0; //총 구매 개수
	String listPrint = "";
	
	//구매 메소드
	void buy (Product p) {
		
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price; // 10000 - 1000 = 9000
		bonus += p.bonus; // 0 + 100 = 100
		cart.add(p); // ==  card[i++] = p
		System.out.println(p.name+" 구매를 하였습니다.");
	}
	
	
	void summary() {
		//구매 목록, 총 구매 금액
		int sum = 0;

		//cart가 공백이라면
		if(cart.isEmpty()) {
				return;
		}
		
		for (int i = 0; i < cart.size(); i++) { //size() 현재 들어가있는 만큼
			Product p = (Product)cart.get(i);  //Object,0,1,2,3,...
			sum += p.price;
			listPrint += p.name+", ";
			
//			listPrint += cart[i].name+","; //tv, com, audio
//			sum += cart[i].price;
		}//for
			System.out.println("구매 총 금액 : "+sum);
			System.out.println("구매물품 : "+listPrint);
		
	}
	
}


class Product	{
	String name;
	int price;
	int bonus;

	Product(){
		
	}
	
	Product(String name,int price){
		this.name = name;
		this.price = price;
		this.bonus = (int)(price/10);
	}
	
}



class Tv extends Product{

	Tv(){
		super("Tv",1000);
	}
}

class Computer extends Product{
	
	Computer(){
		super("Com",900);
	}
	
}
class Audio extends Product{
	
	Audio(){
		super("Audio",500);
	}
	
}