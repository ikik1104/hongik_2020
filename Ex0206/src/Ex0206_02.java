import java.util.Scanner;

public class Ex0206_02 {

	public static void main(String[] args) {

		/* 1. 쇼핑몰 화면을 만든다
		 * 	- 변수 ) 계좌 잔액, 각각의 상품과 가격, 
		 * 2. 구매할 상품번호 입력
		 * 3. 제품을 구매한다.
		 * 
		 * 
		 * ---결제방법 선택
		 * 1) 현금결제
		 * 2) 카드결제
		 * 카드결제를 선택하셨습니다.
		 * 카드셜제 하시겠습니다?
		 * 결제처리중
		 * Y -->(math.random*1)
		 * 11이면 -> 정상결제
		 * 12이면 -> 비정상결ㅈ
		 * 다시물어봄 -> 카드결제하시겠습니까?
		 * 
		 * 
		 * 잔고와 제품금액과 비교
		 * 잔고가 제품 금액보다 크면 -> 구매를 진행 
		 * 잔고가 제품 금액보다 작으면 -> 잔고가 부족함을 띄우고 메뉴 선택화면으로
		 * 잔고에서 제품 금액을 뺀다
		 * 뺀 금액을 계좌에 넣는다
		 * 포인트를 10% 적립한다
		 * 4. 구매목록 저장
		 * 5. 잔고, 구매금액 출력
		 * 계속 구매, 종료
		 * */
		
		Scanner scan = new Scanner(System.in);
		int select = 0; //메뉴
		int select2 = 0;
		int point = 0;//포인트 초기화
		int c_point = 0;//전환할 포인트
		String list = "";//구매목록 초기화
		int bank = 10000;//계좌 잔액 설정 백마논
		int com1 = 1000; //상품1 가격 설정
		int tv1 = 2000;//상품2 가격 설정
		int p1 = 3000;//상품3 가격 설정
		int charge = 0;//계좌 추가금 받을 변수초기화
		
		loop1:
		while (true) {
			System.out.println("                          [ 하이마트 ]                                 ");
//			System.out.println("회원님의 현재 잔액 :"+bank+"원  ");
			System.out.printf(" 1) 컴퓨터 %d원    2) TV %d원    3) 스마트폰 %d원     4) 계좌충전    5) 포인트 전환      0) 종료       %n",com1,tv1,p1);
			System.out.println("구매하실 상품번호를 입력하세요.");
			
			select = scan.nextInt();
			
			if(select == 0 ) {
				System.out.println("시스템을 종료합니다.");
				break loop1 ;
			}else if(select < 0 || select > 5) {
				System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
				continue loop1;
			}
			
			
			switch (select) {
			case 1://com1
				if(bank<com1) {
					System.out.println("잔액이 부족합니다. 현재 잔액 : "+bank);
					break;
				}else {
					System.out.println("결제 방법을 선택하세요 . 1) 현금결제   |  2) 카드결제");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("다시 입력하세요.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("현금결제로 진행합니다.");
						bank -= com1;
						point += (com1*0.1);
						list += "컴퓨터1대";
						System.out.println("상품 구매를 완료하였습니다");
						System.out.println("잔여 잔액 : "+bank+"원  , 누적포인트 : "+ point+"점");
						System.out.println("현재 구매 내역 :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("카드결제 하시겠습니까? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("다시 입력하세요.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("카드결제를 진행합니다. 결제 처리중");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += " 컴퓨터1대";
								point += (com1*0.1);
								System.out.println("결제 완료 되었습니다. 적립포인트 :"+(int)(com1*0.1)+"원   누적포인트 :"+point+"원");
								System.out.println("현재 구매 내역 :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("결제 실패 - 결제처리가 취소되었습니다.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("결제를 취소합니다.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 2://tv1
				if(bank<tv1) {
					System.out.println("잔액이 부족합니다. 현재 잔액 : "+bank);
					break;
				}else {
					System.out.println("결제 방법을 선택하세요 . 1) 현금결제   |  2) 카드결제");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("다시 입력하세요.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("현금결제로 진행합니다.");
						bank -= tv1;
						point += (tv1*0.1);
						list += " TV1대";
						System.out.println("상품 구매를 완료하였습니다");
						System.out.println("잔여 잔액 : "+bank+"원  , 누적포인트 : "+ point+"점");
						System.out.println("현재 구매 내역 :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("카드결제 하시겠습니까? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("다시 입력하세요.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("카드결제를 진행합니다. 결제 처리중");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += "TV1대";
								point += (tv1*0.1);
								System.out.println("결제 완료 되었습니다. 적립포인트 :"+(int)(tv1*0.1)+"원   누적포인트 :"+point+"원");
								System.out.println("현재 구매 내역 :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("결제 실패 - 결제처리가 취소되었습니다.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("결제를 취소합니다.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 3://p1
				if(bank<p1) {
					System.out.println("잔액이 부족합니다. 현재 잔액 : "+bank);
					break;
				}else {
					System.out.println("결제 방법을 선택하세요 . 1) 현금결제   |  2) 카드결제");
					select2 = scan.nextInt();
					
					if(select2 < 0 || select2 >2) {
						System.out.println("다시 입력하세요.");
						break;
					}
					switch (select2) {
					case 1:
						System.out.println("현금결제로 진행합니다.");
						bank -= p1;
						point += (p1*0.1);
						list += "스마트폰1대";
						System.out.println("상품 구매를 완료하였습니다");
						System.out.println("잔여 잔액 : "+bank+"원  , 누적포인트 : "+ point+"점");
						System.out.println("현재 구매 내역 :"+list);
						break;
					case 2:
						while(true) {
						System.out.println("카드결제 하시겠습니까? 1) Y  2) N");
						String select3 = scan.next();
						
						if(!(select3.equalsIgnoreCase("Y") || select3.equalsIgnoreCase("N"))) {
							System.out.println("다시 입력하세요.");
						}
						
						if(select3.equalsIgnoreCase("Y")){
							System.out.println("카드결제를 진행합니다. 결제 처리중");
							int ran = (int)(Math.random()*2);
							
							if(ran == 1) {
								list += " 스마트폰 1대";
								point += (p1*0.1);
								System.out.println("결제 완료 되었습니다. 적립포인트 :"+(int)(p1*0.1)+"원   누적포인트 :"+point+"원");
								System.out.println("현재 구매 내역 :"+list);
								System.out.println("------------------------------------------------------------------");
								break;
							}else {
								System.out.println("결제 실패 - 결제처리가 취소되었습니다.");
							}
						  }//if
						
						if(select3.equalsIgnoreCase("n")) {
							System.out.println("결제를 취소합니다.");
							continue loop1;
						}
						
						}
					}//while
				}
				break;
			case 4://charge
				System.out.println("충전하실 금액을 입력해주세요.");
				charge = scan.nextInt();
				bank += charge;
				list += "스마트폰1대";
				System.out.println(charge+"원이 충전되었습니다.  총 금액 :"+bank);
				break;
				
			
			case 5 :
				while(true) {
				System.out.println("금액으로 전환하실 포인트를 입력해주세요. 전환 가능 포인트 :"+point);
				c_point = scan.nextInt();
				if(c_point > point || c_point < 1) {
					System.out.println("잘못 입력되었거나, 보유 포인트보다 전환금액이 많습니다. 다시 입력하세요.");
				}else {
					point -= c_point;
					 bank += c_point;
					 System.out.println(c_point+"포인트가 현금으로 전환되어"+bank+"원이 되었습니다.");
					 continue;
				 }
				break;
				}
			

			}
			
			
			
		}
		
		
	}

}
