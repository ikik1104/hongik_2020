import java.util.Scanner;

public class Main_Mall {

   public static void main(String[] args) {
      /* <<  20.03.05 (쇼핑몰) 회원가입, 로그인, 제품구매  >>
       *    1.회원가입  - 아이디 중복체크, 아이디길이는 3자리 이상, 객체로 ArrayList저장
       *    2.로그인
       *       - ArrayList 데이터에서 확인을 한 후 map에 저장할것
       *       - 아이디/패스워드 확인
       *       - 객체 생성해서 ArrayList 저장
       *  3.로그아웃 - 객체삭제
       *  4.상품보기
       *     -Product 상속 price, bonuspoint, name
       *     1) LCD_TV 2) LED_TV 3)OLED_TV ---- TV: screen, inch / hdr (기능)
       *     4) 일반냉장고   5)양문형냉장고    ---- 냉장고: liter,door / d_cooling 더블냉각(기능)- 양문형만
       *     6) 통돌이세탁기   7)드럼세탁기   8)드림건조세탁기  ---- 세탁기 : size,shape / Sterilization 살균(기능) -드럼
       *  
       *  5.상품구매 목록보기
       *     -상품구매한 리스트 id, 날짜
       *  
       *  8.회원정보검색 - ex)홍 -> 홍길동,홍길순,김무홍 전체검색
       *  9.회원정보보기 - 회원전체보여짐- 이름 오름차순 정렬
       * */
      Scanner scan = new Scanner(System.in);
      Mall_excute m = new Mall_excute(); //기능클래스 객체 선언 
      m.start(); //기본적인 Member데이터 입력
      
      loop:
      while(true) {
      
      //메인프린트
      int select = m.main_print();
      
      switch (select) {
      case 1://회원가입
         m.insert();
         break;
      case 2://로그인
         m.login();
         break;
      case 3://로그아웃
         m.logout();
         break;
      case 4://상품보기 및 구매
         loop1:
         while(true) {
         System.out.println("-------------[   상품 목록     ]--------------");
         System.out.println("1) LCD_TV      2) LED_TV     3)OLED_TV");
         System.out.println("4) 일반냉장고            5) 양문형냉장고                               ");
         System.out.println("6) 통돌이세탁기         7) 드럼세탁기          8)드림건조세탁기 ");
         System.out.println("----------------------------------------");
         System.out.print("구매 하실 제품을 선택하세요. (뒤로가기 : 99)  >> ");
         
         switch (scan.nextInt()) {
         case 1:
            m.tv(new Lcd_Tv());
            break;
         case 2:
            m.tv(new Led_Tv());
            break;
         case 3:
            m.tv(new Oled_Tv());
            break;
         case 4:
            m.ref(new D_Ref());
            break;
         case 5:
            m.ref(new DD_Ref());
            break;
         case 6:
            m.wash(new Tong_Wash());
            break;
         case 7:
            m.wash(new D_Wash());
            break;
         case 8:
            m.wash(new DD_Wash());
            break;
         case 99:
            break loop1;
         default:
            System.out.println("[※ ERROR : 잘못된 입력입니다.]");
            break;
         }
      }
         break;
      case 5://구매상품보기
         //로그인이 아니면 못봄
         m.buy_list();
         break;
      case 8://회원정보 검색 (admin만 볼 수 있음)
         m.u_select();
         break;
      case 9://회원정보 (admin- 전체 회원 / user -자신의 것만
         m.u_list();
         break;
      case 0:
         System.out.println("[ ** 시스템을 종료합니다. 안녕히가세요. ** ]");
         break loop;

      default:
         System.out.println("[※ ERROR : 잘못된 입력입니다.]");
         break;
      }
      
      }
   }
}