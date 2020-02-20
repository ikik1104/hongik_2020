import java.util.Scanner;

public class Ex0206_01 {

	public static void main(String[] args) {
		
		//자신의 계좌를 만든다.
		//쇼핑몰에서 1개의 상품을 구매
		//자신의 계좌에서 상품가격을 빼주는 프로그램
		String list1 = ""; //구매목록
		
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int my_bank = 5000000;
		int p_num = 0; //구매 상품 번호
		int com1 = 1300000; //컴퓨터 금액
		int tv1 = 1000000; //티비금액
		int p1 = 880000; //폰 금액
		
		loop1 :while (true) {
		System.out.println("_______________________[    하이마트 쇼핑      ]____________________");
		System.out.printf(" 1.컴퓨터(%d원)  2.TV(%d원)  3.스마트폰(%d원) 4.금액충전  %n ",com1,tv1,p1);
		System.out.println("-------------------------------------------------------------");
		System.out.printf("구매하고싶은 상품을 선택하세요 .  종료 : 0 >>");
	
		p_num = scan.nextInt();
		
		if(p_num==0) {
			break loop1;
		}else if(p_num <0 || p_num > 4) {
			System.out.println("※※※※※※ 잘못된 입력입니다. 다시 입력하세요.※※※※※※");
			continue loop1 ;
		}
		
		
		switch (p_num) {
		case 1:
			if(my_bank >= com1) {
				my_bank -= com1; // my_bank = my_bank - 1250000
				point += (com1*0.1);
				System.out.println("컴퓨터 1대를 구매했습니다.");
				System.out.println("컴퓨터 금액 : "+com1+"원");
				list1 += " 컴퓨터 1대";
			}else {
				System.out.println(" --------------◈◈◈◈잔고가 부족합니다.◈◈◈◈------------- ");
				break;
			}
			break;
			
			
		case 2:
			if(my_bank >= com1) {
				my_bank -= tv1; // my_bank = my_bank - 1250000
				point += (tv1*0.1);
				System.out.println("TV 1대를 구매했습니다.");
				System.out.println("TV 금액 : "+tv1+"원");
				list1 += " TV1대";
			}else {
				System.out.println("--------------◈◈◈◈잔고가 부족합니다.◈◈◈◈--------------");
				break ;
			}
			break;
			
			
			
			
		case 3:
			if(my_bank >= com1) {
				my_bank -= p1; // my_bank = my_bank - 1250000
				point += (p1*0.1);
				System.out.println("스마트폰 1대를 구매했습니다.");
				System.out.println("스마트폰 금액 : "+p1+"원");
				list1 += " 스마트폰 1대";
			}else {
				System.out.println("--------------◈◈◈◈잔고가 부족합니다.◈◈◈◈--------------");
				break;
			}
			break;
			
			
			
			
		case 4:
			System.out.println("충전할 금액을 입력하세요.");
			int charge = scan.nextInt(); //my_bank = my_bank + scan
			my_bank += charge ;
			System.out.printf("%d 원이 충전되었습니다. %n", charge);
			break;
		}
		
		System.out.println("현재 보유금액 : "+ my_bank+" 원");
		System.out.println("현재 포인트 :"+point +"점");
		System.out.println("-----------------------------------");
		System.out.println("구매목록 :"+list1);
		
		}//while
		System.out.println("시스템을 종료합니다.");
		
	}//main
}
