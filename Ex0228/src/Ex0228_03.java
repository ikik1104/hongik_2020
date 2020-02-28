import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Ex0228_03 {

	public static void main(String[] args) {
		/* 1)컴퓨터    2)TV   3)냉장고     4)세탁기    5)에어컨 
		 * 6) 구매물품, 구매금액 출력      7)보유금액,보너스 포인트 출력
		 * 8)보유금액 충전     0 ) 종료
		 * */
		Buyer1 b = new Buyer1();
		
		loop1:
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("---------------------------------------------");
		System.out.println("1)컴퓨터    2)TV   3)냉장고     4)세탁기    5)에어컨 ");
		System.out.println("6) 구매물품, 구매금액 출력         7)보유금액,보너스 포인트 출력");
		System.out.println("8)보유금액 충전            9) 검색     10)물품취소     0) 종료");
		System.out.println("---------------------------------------------");
		System.out.println("원하시는 번호를 입력하세요. >>");
		
		switch (scan.nextInt()) {
		case 1://컴퓨터
			b.buy(new Computer1());
			break;
		case 2://TV
			b.buy(new Tv1());
			break;
		case 3://냉장고
			b.buy(new Ref1());
			break;
		case 4://세탁기
			b.buy(new Washer1());
			break;
		case 5://에어컨
			b.buy(new Condi1());
			break;
		case 6://구매물품, 구매금액 출력
			b.buy_list();
			break;
		case 7://보유금액, 보너스 포인트 출력
			b.point();
			break;
		case 8://보유 금액 충전
			b.charge(); //충전금액 가지고 넘어가기
			break;
		case 9://시스템 종료
			b.search();
			break;
		case 10://구매 물품에서 삭제
			System.out.println("취소할 물품을 선택하세요. >>");
			System.out.println("1) 컴퓨터       2)Tv   3)냉장고     4)세탁기     5)에어컨");
			switch (scan.nextInt()) {
			case 1:
				b.delete2("컴퓨터");
				break;
			case 2:
				b.delete2("Tv");
				break;
			case 3:
				b.delete2("냉장고");
				break;
			case 4:
				b.delete2("세탁기");
				break;
			case 5:
				b.delete2("에어컨");
				break;
			default:
				break;
			}
			break;
		case 0://시스템 종료
			System.out.println("시스템을 종료합니다.");
			break loop1;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		
		}//while
	}
}

class Buyer1{ //구매자
	
	
	int money = 100000; //기본 잔액
	Product1[] cart = new Product1[10];  //가능한 구매 제품 수 
	int cnt = 0;	// 현재 구매 수
	int bonusPoint; //보너스 포인트
	int sum; //구매 총금액
	int del_cnt=0; //삭제횟수
	
	//구매 메소드
	void buy(Product1 p) {
		if(cnt == 10) { //구매개수가 10개이면
			System.out.println("구매 가능개수 초과");
			return;
		}
		if(money < p.price) { //현재 잔액이 제품 가격보다 작으면
			System.out.println("잔액부족");
			return;
		}
		
		bonusPoint += p.bonusPoint; //보너스 누적
		money -= p.price; //현재 잔액에서 제품가격 빼기
		sum += p.price; //총 구매금액(사용액) 누적
		cart[cnt] = p; //넘어온 제품의 정보를 user의 제품 리스트에 담는다.
		System.out.println(p.name+" 1대를 구매하였습니다.");
		cnt++; //구매 개수 증가
		
	}
	
	//구매목록 리스트
	void buy_list() {
		if(cnt == 0) { //구매한 제품이 없을 경우
			System.out.println("구매하신 제품이 없습니다.");
			return;
		}
		System.out.println("_____________________[ 구매목록 ]______________________");
		for (int i = 0; i < cnt; i++) { //구매 개수만큼 출력되도록
			if((i%5) == 0) {
				System.out.println();
			}
			if(!(cart[i].name.equals(""))){
				System.out.print("\t"+cart[i].name); //구매한 리스트의 이름 출력
			}
		}
		System.out.println();
		System.out.println("____________________________________________________");
		System.out.println("총 제품 구매개수 :"+(cnt-del_cnt)+"개");
		System.out.println("총 구매 금액:"+sum+"원");
	}
	
	//현재잔고 & 현재 포인트 출력
	void point() {
		System.out.println("현재 잔고   : "+money); 
		System.out.println("Point  : "+bonusPoint);
	}
	
	//충전
	void charge() { //넘어온 충전금액
		Scanner scan = new Scanner(System.in);
		System.out.println(" [ 금액충전 ] ");
		System.out.println("원하는 금액을 입력하세요.>> 1) 카드결제");
		int ch_money = scan.nextInt();
		//카드회사 - card(num,card_num,ch_money,price); 회원번호 , 카드번호, 금액
		//회원번호, 금액, true/false
		money += ch_money;
		
		System.out.println(ch_money+"원이 충전되었습니다.");
		System.out.println("충전 후 잔액  : "+this.money);
	}
	
	//삭제(환불)
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.println("환불을 원하시는 제품의 번호를 고르세요");
		buy_list(); //구매한 제품들 목록 불러오기
		int num = scan.nextInt();
		
		bonusPoint -= cart[num-1].bonusPoint;
		money += cart[num-1].price;
		sum -= cart[num-1].price;
		cart[num-1].name = "";
		cart[num-1].price = 0;
		del_cnt++;
		System.out.println("환불이 완료되었습니다.");
	}
	
	void search() {
		System.out.println("[ 검색 ]");
		int tv_count = 0;
		int com_count = 0;
		int ref_count = 0;
		int washer_count = 0;
		int condi_count = 0;
		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			if(cart[i].name.equals("컴퓨터")) {
				com_count++;
			}else if(cart[i].name.equals("Tv")) {
				tv_count++;
			}else if(cart[i].name.equals("에어컨")) {
				condi_count++;
			}else if(cart[i].name.equals("냉장고")) {
				ref_count++;
			}else {
				washer_count++;
			}
		}
		System.out.println("컴퓨터 구매대수 :"+com_count+"대");
		System.out.println(" TV 구매대수  :"+tv_count+"대");
		System.out.println("에어컨 구매대수 :"+condi_count+"대");
		System.out.println("냉장고 구매대수 :"+ref_count+"대");
		System.out.println("세탁기 구매대수 :"+washer_count+"대");
	}
	
	
	void delete2(String name) {
		System.out.println("[ 삭제 ]");

		for (int i = 0; i < cart.length; i++) {
			if(cart[i] == null) {
				System.out.println("구매 내역이 없습니다.");
				return;
			}
			if(cart[i].name.equals(name)) {
				bonusPoint -= cart[i].bonusPoint;
				money += cart[i].price;
				sum -= cart[i].price;
				cart[i].name = "";
				cart[i].price = 0;
				del_cnt++;
				System.out.println("삭제가 완료되었습니다.");
				return;
			}
		}
		System.out.println("선택하신 제품을 구매하신 이력이 없습니다.");
		
	}
	
	
}



class Product1{ //상품
	int price; //상품의 가격
	int bonusPoint; //상품의 포인트
	String name; //상품의 이름
	int product_cnt;//제품의 구매 개수
	int p_cnt; 
	
	Product1() {

	}
	
	Product1(String name, int price, int bonusPoint) {
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
}

class Computer1 extends Product1{ //컴퓨터
	
	Computer1() {
		super("컴퓨터",100,(100/10));
	}
}

class Tv1 extends Product1{ //티비
	
	Tv1(){
		super("Tv",200,(200/10));
	}
}

class Ref1 extends Product1{ //냉장고
	
	Ref1(){
		super("냉장고",300,(300/10));
	}
}

class Washer1 extends Product1{ //세탁기
	Washer1(){
		super("세탁기",400,(400/10));
	}
}

class Condi1 extends Product1{ //에어컨
	
	Condi1(){
		super("에어컨",500,(500/10));
	}
	
}
