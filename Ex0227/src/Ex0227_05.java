import java.util.Scanner;

import org.omg.CORBA.TCKind;

public class Ex0227_05 {
	public static void main(String[] args) {
//		SamsungTv[] sam = new SamsungTv[10];
//		Ref[] ref = new Ref[10];
		User user = new User();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("-----------------------------------------");
		System.out.println("1) 삼성 TV 구매");
		System.out.println("2) 냉장고 구매");
		System.out.println("3) 에어컨 구매");
		System.out.println("4) 현재 잔액 확인");
		System.out.println("원하는 번호를 입력하세요. >>");
		System.out.println("-----------------------------------------");
		switch (scan.nextInt()) {
		case 1:
			user.buy(new SamsungTv());
			break;
		case 2:
			user.buy(new Ref());
			break;
		case 3:
			user.buy(new Condi());
			break;
		case 4:
			user.money_now();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			continue;
		}
		}//while
	}
}
class User{
	int money = 10000;
	String name = "홍길동";
	//tv몇대, ref몇대 ... -
	int tv_cnt = 0;
	int ref_cnt = 0;
	int con_cnt = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println(p.name+" 1대를 구매했습니다.");
			money -= p.price;
			
			if(p instanceof SamsungTv) {
				tv_cnt++;
				System.out.println(p.name+"구매대수 : "+tv_cnt);
			}
			if(p instanceof Ref) {
				ref_cnt++;
				System.out.println(p.name+"구매대수 : "+ref_cnt);
			}
			if(p instanceof Condi) {
				con_cnt++;
				System.out.println(p.name+"구매대수 : "+con_cnt);
			}
		}
	}
	void money_now() {
		System.out.println("현재 유저의 잔액 :"+money);
	}
	
}