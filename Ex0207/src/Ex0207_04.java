import java.util.Scanner;

public class Ex0207_04 {

	public static void main(String[] args) {
		/*2020 02 07 
		 * 
		 * 현재 자판기
		 * 커피 100, 설탕 50, 우유 70
		 * 
		 * 1-블랙커피 
		 * 커피 10
		 * 
		 * 2-흑당커피
		 * 커피 7 설탕 5
		 * 
		 * 3-라떼
		 * 커피 5, 우유 5
		 * 
		 * 4-밀크커피
		 * 커피 4, 우유3, 설탕2
		 * 
		 * 9번 관리자모드 (로그인)
		 * 커피, 설탕, 우유의 잔량확인 
		 * 현재 재료가 부족합니다 관리자에게 연락해주세요.
		 * 
		 * 총 판매수
		 * 돈 넣었냐 안넣었냐
		 * 
		*/
		Scanner scan = new Scanner(System.in);
		int select = 0;	//메뉴선택
		int cof = 100; //커피의 양
		int sugar = 50; //설탕의 양
		int milk = 70; //우유의 양
		int count = 0; //총 판매량
		String id = "aaa";
		String pw = "1234";
		int sum = 0; //총 판매액
		int cof_1 = 100; //블랙커피의 가격
		int cof_2 = 300; // 흑당커피의 가격
		int cof_3 = 200; //라떼의 가격
		int cof_4 = 100; //밀크커피의 가격
		int plus = 0; //추가할 재고양 or 수정할 금액?
		boolean cof1_ox = true; //블랙
		boolean cof2_ox = true; //흑당
		boolean cof3_ox = true; //카페
		boolean cof4_ox = true; //밀크

		int won = 0;
	
		
		
		loop1:
		while(true) {
			
			//시작하면 품절확인을 위한 재고
			//없으면 = false로
			if(cof<10) {
				cof1_ox = false;
			}else {
				cof1_ox = true;
			}
			if(cof<7 || sugar<5) {
				cof2_ox = false;
			}else {
				cof2_ox = true;
			}
			if(cof<5 || milk<5) {
				cof3_ox = false;
			}else {
				cof3_ox = true;
			}
			if(cof<4 || milk<3 || sugar<3) {
				cof4_ox = false;
			}else {
				cof4_ox = true;
			}
			
			

			System.out.println("---------------------------------------------------------");
			System.out.println("원하시는 음료를 골라주세요.");
			
			//false면 품절 띄우기...( ***더 짧게 가능하면 수정하기 *** )
			if(cof1_ox==true) {
			System.out.println("1) 블랙커피 "+cof_1+"원");
			}else {
				System.out.println("1) 블랙커피 (품절입니다.)");
			}
			if(cof2_ox==true) {
			System.out.println("2) 흑당커피 "+cof_2+"원");
			}else {
				System.out.println("2) 흑당커피 (품절입니다.)");
			}
			if(cof3_ox==true) {
			System.out.println("3) 카페라떼 "+cof_3+"원");
			}else {
				System.out.println("3) 카페라떼 (품절입니다.)");
			}
			if(cof4_ox==true) {
			System.out.println("4) 밀크커피 "+cof_4+"원");
			}else {
				System.out.println("4) 밀크커피 (품절입니다.)");
			}
			
	
			/*
			System.out.println("1) 블랙커피 "+cof_1+"원");
			System.out.println("2) 흑당커피 "+cof_2+"원");
			System.out.println("3) 카페라떼 "+cof_3+"원");
			System.out.println("4) 밀크커피 "+cof_4+"원");
			*/
			System.out.println("9) 관리자모드");
			System.out.println("0) 시스템 종료");
			System.out.println();
			select = scan.nextInt();
			
			//메뉴 이외의 것들 입력시
			if(!(select==9 || (select>0 && select<5))) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			
			//메뉴 선택 후에 돈을 넣는다.
			System.out.println("넣으실 금액을 입력하세요.");
			won = scan.nextInt();
			
			switch (select) {
			
			case 1:
				
				if(cof<10) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
					break;
				}
				//넣은 금액이 상품 금액보다 작으면
				if(won<cof_1) {
					System.out.println("상품보다 적은 가격입니다.");
					break;
				}
				cof -= 10;
				System.out.println("거스름돈 :"+(won-cof_1)+"원");
				System.out.println("블랙커피가 나왔습니다. 맛있게 드세용");
				sum += cof_1;
				count++;
				break;
			case 2:
				if(cof<7 || sugar <5) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
					break;
				}
				if(won<cof_2) {
					System.out.println("상품보다 적은 가격입니다.");
					break;
				}
				cof -= 7;
				sugar -= 5;
				System.out.println("거스름돈 :"+(won-cof_2)+"원");
				System.out.println("흑당커피가 나왔습니다. 맛있게 드세용");
				sum += cof_2;
				count++;
				break;
			case 3:
				if(won<cof_3) {
					System.out.println("상품보다 적은 가격입니다.");
					break;
				}
				if(cof<5 || milk<5) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
					break;
				}
				cof -= 5;
				milk -= 5;
				System.out.println("거스름돈 :"+(won-cof_3)+"원");
				System.out.println("카페라떼가 나왔습니다. 맛있게 드세용");
				sum += cof_3;
				count++;
				break;
			case 4:
				if(won<cof_4) {
					System.out.println("상품보다 적은 가격입니다.");
					break;
				}
				if(cof<4 || sugar<3 || milk<2 ) {
					System.out.println("재료가 부족합니다. 관리자에게 문의하세요.");
					break;
				}
				cof -= 4;
				sugar -= 3;
				milk -= 2;
				System.out.println("거스름돈 :"+(won-cof_4)+"원");
				System.out.println("밀크커피가 나왔습니다. 맛있게 드세용");
				sum += cof_4;
				count++;
				break;
			case 9 :
				System.out.println("관리자모드로 로그인합니다. 아이디를 입력해주세요.");
				String id_ch = scan.next();
				
				//아이디가 일치하지않으면 제일 초기 메뉴로 간다.. -> 나중에 계속 로그인 입력받게 수정***
				if(!(id.equals(id_ch))){
					System.out.println("존재하지 않는 아이디 입니다.");
					continue;
				}
				
				System.out.println("패스워드를 입력하세요.");
				String pw_ch = scan.next();
				
				//패스워드 안맞아도 초기 메뉴로..
				if(!(pw.equals(pw_ch))) {
					System.out.println("패스워드가 일치하지 않습니다.");
					continue;
				}
				loop2:
				while(true) {
				System.out.println("------------------------------------------------");
				System.out.printf("현재 재고: 커피  %dg, 설탕 %dg, 우유 %dg %n",cof,sugar,milk);
				System.out.println("총 판매 수 : "+count+"잔");
				System.out.println("총 판매금액 :"+sum+"원");
				System.out.println("------------------------------------------------");
				System.out.println("원하시는 메뉴를 선택하세요. 1) 재료보충, 2) 제품 가격수정, 3)초기 화면으로");
				select = scan.nextInt();
				
				//메뉴에 없는 번호 선택시
				if(!(select>0 && select <4)) {
					System.out.println("잘못된 입력입니다.");
					continue loop2;
				}
				//초기화면으로
				if(select ==3 ) {
					break;
				}
				
				switch (select) {
				case 1:
					System.out.println("추가할 재료를 고르세요 1)커피, 2)설탕, 3)우유");
					select = scan.nextInt();
					if(!(select>0 && select<4)) {
						System.out.println("잘못된 입력입니다.");
						continue ;
					}
					
					if(select == 1) {
						System.out.println("커피 몇그람을 추가하시겠습니까?");
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("잘못된 입력입니다.");
							continue ;
						}
						cof += plus;
						System.out.println("추가가 완료되었습니다.");
						continue;
					}
					if(select == 2) {
						System.out.println("설탕 몇그람을 추가하시겠습니까?");
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("잘못된 입력입니다.");
							continue ;
						}
						sugar += plus;
						System.out.println("추가가 완료되었습니다.");
						continue;
					}
					if(select == 3) {
						System.out.println("우유 몇그람을 추가하시겠습니까?");
						milk = scan.nextInt();
						if(plus<1) {
							System.out.println("잘못된 입력입니다.");
							continue ;
						}
						cof += plus;
						System.out.println("추가가 완료되었습니다.");
						continue;
					}
					break;
				case 2:
					System.out.println("상품의 가격을 수정합니다. 가격을 변경하실 상품을 선택하세요");
					System.out.println("1)블랙커피 ["+cof_1+"원]  2)흑당커피 ["+cof_2+"원]  3)라떼커피 ["+cof_3+"원]  4)밀크커피 ["+cof_4+"원]");
					select = scan.nextInt();
					if(select<1 || select >4) {
						System.out.println("잘못된 접근입니다.");
						break;
					}
					switch (select) {
					case 1:
						System.out.println("얼마로 변경하시겠습니까? 현재 가격 :"+cof_1);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("금액 오류: 다시 접근하세요");
							break;
						}
						cof_1 = plus;
						System.out.println("금액 수정을 완료하였습니다.");
						continue;
					case 2:
						System.out.println("얼마로 변경하시겠습니까? 현재 가격 :"+cof_2);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("금액 오류: 다시 접근하세요");
							break;
						}
						cof_2 = plus;
						System.out.println("금액 수정을 완료하였습니다.");
						continue;
					case 3:
						System.out.println("얼마로 변경하시겠습니까? 현재 가격 :"+cof_3);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("금액 오류: 다시 접근하세요");
							break;
						}
						cof_3 = plus;
						System.out.println("금액 수정을 완료하였습니다.");
						continue;
					case 4:
						System.out.println("얼마로 변경하시겠습니까? 현재 가격 :"+cof_4);
						plus = scan.nextInt();
						if(plus<1) {
							System.out.println("금액 오류: 다시 접근하세요");
							break;
						}
						cof_4 = plus;
						System.out.println("금액 수정을 완료하였습니다.");
						continue;

					}
					break;
				}
				
				break;
				}//loop2
				
				break;
			
			}
			
		}
	}
}
