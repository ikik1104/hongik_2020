import java.util.Date;
import java.util.Vector;

import javax.xml.crypto.Data;

public class Ex0302_01 {
	public static void main(String[] args) {
		// ��ǰ�̶�� ����  - tv.com.audio - ��ǰ���� 
		// �л��̶�� ��ǰ
		// ��� �������� ����Ⱑ ��ƽ��ϴ�.
		
		//������ - money, bonus, ���Ÿ�� / ����, ȯ��, ���
		
		Buyer user = new Buyer(); //������ 1�� ����
		
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
	Vector cart = new Vector();// <> -> ���ʷ�?  �־ �ȳ־ ��������. vector�� ���� �ִ°� �����ش�. ��������� �Ⱦ�
//	Product[] cart = new Product[10]; //�迭 ����
	int i = 0; //�� ���� ����
	String listPrint = "";
	
	//���� �޼ҵ�
	void buy (Product p) {
		
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		money -= p.price; // 10000 - 1000 = 9000
		bonus += p.bonus; // 0 + 100 = 100
		cart.add(p); // ==  card[i++] = p
		System.out.println(p.name+" ���Ÿ� �Ͽ����ϴ�.");
	}
	
	
	void summary() {
		//���� ���, �� ���� �ݾ�
		int sum = 0;

		//cart�� �����̶��
		if(cart.isEmpty()) {
				return;
		}
		
		for (int i = 0; i < cart.size(); i++) { //size() ���� ���ִ� ��ŭ
			Product p = (Product)cart.get(i);  //Object,0,1,2,3,...
			sum += p.price;
			listPrint += p.name+", ";
			
//			listPrint += cart[i].name+","; //tv, com, audio
//			sum += cart[i].price;
		}//for
			System.out.println("���� �� �ݾ� : "+sum);
			System.out.println("���Ź�ǰ : "+listPrint);
		
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