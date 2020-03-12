import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mall_excute {
   //실행문 단
   ArrayList<Member> m = new ArrayList<Member>(); //회원 array
   ArrayList<Buy> buy = new ArrayList<Buy>(); //구매 array
   HashMap log = new HashMap();
   //구매된 제품 리스트..?? 없음
   String[] sub = {"아이디","비밀번호","이름","전화번호\t","보유금액","포인트"};
   String[] st = {"구매자","제품명         ","제품가격","제품포인트","구매일시"};
   String nowId = null; //상품들어갈때 입력한 아이디
   
   void start() {
      m.add(new Member("222","11111","홍길동","01035352651"));
      m.add(new Member("admin","11111","admin","01052351535")); //관리자
      m.add(new Member("333","11111","김홍익","01051352153"));
      m.add(new Member("hong","11111","김익홍","01052351535"));
   }
   
   int main_print(){
      Scanner scan= new Scanner(System.in);
      System.out.println("----------------------------------------");
      System.out.println("\t     [ 쇼핑몰 프로그램  ] ");
      
      //로그인 아이디가 null이면
      if(nowId==null){  // == if((log.isEmpty())
         System.out.println("      ( 회원님은 현재 '로그아웃'상태입니다. )");
      }else if(nowId.equals("admin")){
         System.out.println("       ( '관리자 모드'로 접속되었습니다. )");
      }else{
         System.out.println("          ('"+nowId+"'회원님 어서오세요.)");
      }
      System.out.println("________________________________________");
      System.out.println("    1.회원가입             2.로그인              3.로그아웃");
      System.out.println("    4.상품보기             5.구매상품보기 ");
      System.out.println("    8.회원정보검색       9.회원정보보기     0.종료");
      System.out.println("----------------------------------------");
      System.out.print("원하시는 번호를 입력하세요. >> ");
      
      return scan.nextInt();
      
   }
   
   //회원 가입------------------------------------------------------------------
   void insert() {
      String id;   //아이디
      String pw;   //비밀번호
      String name;   //이름
      String tel;   //전화번호
      
      Scanner scan = new Scanner(System.in);
      
      //로그인 상태면
      if(!(log.isEmpty())){
         System.out.println("[※ ERROR : 회원님은 현재 '로그인'상태 입니다. '로그아웃'후 가입해 주세요.]");
         return;
      }
      
      //아이디입력
      loop1:
      while(true) {
         System.out.println("----------------------------------------");
         System.out.print("아이디를 입력하세요.(3~5자리) >> ");
         id = scan.next().trim();
         //길이체크
         if(id.length() < 3 || id.length()>5 ) {
            System.out.println("[※ ERROR : 3~5자리를 입력해주세요 ]");
            
            continue;
         }
         //중복체크
         for (int i = 0; i < m.size(); i++) {
            Member mm = (Member)m.get(i);
            if(mm.id.equals(id)) {
               System.out.println("[※ ERROR : 이미 존재하는 아이디 입니다.]");
               continue loop1;
            }
         }
         System.out.println("[  ** 사용가능한 아이디 입니다. **  ]");
         break;
      }//while
      
      //비밀번호 입력
      while(true) {
         System.out.println("----------------------------------------");
         System.out.print("패스워드를 입력하세요.(5~10자리) >>  ");
         pw = scan.next();
         //비밀번호 길이 체크
         if(pw.length() < 5 || pw.length()>10 ) {
            System.out.println("[※ ERROR :5~10자리 입력해주세요.]");
            continue;
         }else {
            System.out.print("패스워드를 한번 더 입력하세요.재확인  >>  ");
            String pw_chk = scan.next();
            if(pw.equals(pw_chk)) {
               break; //while문 빠져나가기
            }else {
               System.out.println("[※ ERROR : 입력한 비밀번호와 일치하지 않습니다.]");
               continue;
            }
         }
      }

      //이름
      System.out.print("이름을 입력하세요. >>  ");
      name = scan.next();
      
      //전화번호
      System.out.print("전화번호를 입력하세요. >>  ");
      tel = scan.next();
      
      //member 리스트로 넣어줌
         m.add(new Member(id,pw,name,tel));
         System.out.println("[ ** 회원가입이 완료되었습니다. ** ]");
         
   }//insert
   
   //로그인------------------------------------------------------------------
   void login() {
      Scanner scan = new Scanner(System.in);
      String id;
      String pw;
      int index = 0;
      boolean chk = false;
      
      //로그인map이 비어있으면
      if(!(log.isEmpty())) {
         System.out.println("[※ ERROR : 이미 로그인상태입니다. 로그아웃 후 다시 로그인해주세요.]");
         return; //빠져나감
      }
      
      while(true) {
      System.out.print("아이디를 입력하세요. >>  ");
      id = scan.next();
      
      //중복체크
      for (int i = 0; i < m.size(); i++) {
         Member mm = (Member)m.get(i);
         if(mm.id.equals(id)) {
            chk = true;//일치하는 아이디 찾음
            index = i; //인덱스 저장(비밀번호를 위해서)
            break;
         }
      }
      if(chk == false) {
         System.out.println("[※ ERROR : 일치하는 아이디가 없습니다.]");
         continue;
      }
      
      System.out.print("패스워드를 입력하세요.>>  ");
      pw = scan.next();
      
      Member mm = (Member)m.get(index); //아이디와 같은 인덱스의 회원정보를 가져옴
      if(!(mm.pw.equals(pw))) {//입력한 비밀번호와 패스워드가 일치하지 않으면
         System.out.println("[※ ERROR : 비밀번호가 일치하지 않습니다.]");
         continue;//빠져나감
      }//일치하면 그냥 넘어감
      
      System.out.println("[ ** "+id+"회원님의 로그인이 완료되었습니다. ** ]");
      
      nowId = id;//현재 로그인 되어있는 아이디를 담는 String변수
      log.put(id,pw); //로그인 객체에 넣어줌
      return;//되돌아 간다.
      }//while
   }//login
   
   //로그아웃------------------------------------------------------------------
   void logout() {
      Scanner scan = new Scanner(System.in);
      //로그인map에 아무것도 없으면 (로그인 된 상태가 아니라면)
      if(log.isEmpty()) {
         System.out.println("[※ ERROR : 로그인 상태가 아닙니다.]");
         return;
      }
      
      System.out.print("로그아웃하시겠습니까? 1) 예    2)아니오  >>  ");
      switch (scan.nextInt()) {
      
      case 1:
         log.clear(); //로그인 객체 초기화
         nowId = null; // 현재 로그인 아이디 없음으로 바꿈
         System.out.println("[ ** 로그아웃되었습니다. ** ]");
         break;
      case 2:
         return; //뒤로가기
      default:
         System.out.println("[※ ERROR : 잘못된 입력입니다.]");
         break;
      }
   }
   
   //회원정보 검색------------------------------------------------------------------
   void u_select() {
      //로그인 되어있는 아이디 null or 로그인이 되어있다면 id가 admin인지 체크
      if( nowId == null || !(nowId.equals("admin"))) {
         System.out.println("[※ ERROR : 접근권한이 없습니다.]");
         return;
      }
      
      Scanner scan = new Scanner(System.in);
      System.out.print("검색어를 입력하세요. >>  ");
      String text = scan.next();
      boolean chk = false; //조회결과를 찾는 변수
      
      //멤버리스트에 아무도 없으면
      if(m.isEmpty()) {
         System.out.println("_______가입된 회원이 없습니다.");
         return;
      }
      
      System.out.println("---------'"+text+"'(으)로 검색한 회원리스트입니다.--------");
      
      //sub출력
      for (int i = 0; i < sub.length; i++) {
         System.out.print(sub[i]+"\t");
      }
      System.out.println();
      
      //출력
      for (int i = 0; i < m.size(); i++) {
         Member mm = (Member)m.get(i);
         if(mm.name.contains(text)) { //입력한 단어가 이름에 포함된 유저를 찾는다
            System.out.print(mm.id+"\t");
            System.out.print(mm.pw+"\t");
            System.out.print(mm.name+"\t");
            System.out.print(mm.tel+"\t");
            System.out.print(mm.money+"\t");
            System.out.println(mm.bonuspoint);
            chk = true; //검색결과가 하나라도 나오면
         }
      }
      //검색 결과가 없으면
      if(chk == false) {
         System.out.println("_______조회결과가 없습니다.");
      }
   }
   
   //회원정보보기(이름으로 오름차순)------------------------------------------------------------------
   void u_list() {
      Scanner scan = new Scanner(System.in);
      //로그인이 되어있지 않으면.
      if( nowId==null || log.isEmpty()) {
         System.out.println("[※ ERROR : 접근권한이 없습니다.]");
         return;
      }
      //admin으로 로그인 되어있으면
      if(nowId.equals("admin")) {
         //가입된 회원이 있으면
         if(m.isEmpty()) {
            System.out.println("_______가입된 회원이 없습니다.");
            return;
         }
         //출력방법 선택
         System.out.print("1) 입력순    2) 아이디순    3) 이름순    >>  ");
         switch (scan.nextInt()) {
         case 1: //입력순
            //그냥 출력한다.
            break;
         case 2: //아이디순
            //아이디순으로 정렬...
            Collections.sort(m,new Comparator<Member>() {
               @Override
               public int compare(Member o1, Member o2) {
                  // TODO Auto-generated method stub
                  return o1.id.compareTo(o2.id);
               }
            });
            break;
         case 3: //이름순
            //이름으로 정렬...
            Collections.sort(m,new Comparator<Member>() {
               @Override
               public int compare(Member o1, Member o2) {
                  // TODO Auto-generated method stub
                  return o1.name.compareTo(o2.name);
               }
            });
            break;
         default:
            System.out.println("[※ ERROR : 잘못된 입력입니다.]");
            break;
         }

      //sub출력
      for (int i = 0; i < sub.length; i++) {
         System.out.print(sub[i]+"\t");
      }
         System.out.println();
      //전체 회원 출력
      for (int i = 0; i < m.size(); i++) {
         Member mm = (Member)m.get(i);
         System.out.print(mm.id+"\t");
         System.out.print(mm.pw+"\t");
         System.out.print(mm.name+"\t");
         System.out.print(mm.tel+"\t");
         System.out.print(mm.money+"\t");
         System.out.println(mm.bonuspoint);
      }
      //자신의 정보만 출력
      }else {
         //sub출력
         for (int i = 0; i < sub.length; i++) {
            System.out.print(sub[i]+"\t");
         }
         System.out.println();
         for (int i = 0; i < m.size(); i++) {
            Member mm = (Member)m.get(i);
            if(mm.id.equals(nowId)) { //지금 로그인 된 회원과 일치하는 정보
            System.out.print(mm.id+"\t");
            System.out.print(mm.pw+"\t");
            System.out.print(mm.name+"\t");
            System.out.print(mm.tel+"\t");
            System.out.print(mm.money+"\t");
            System.out.println(mm.bonuspoint);
            }
         }
      }
   }
   
   //구매 목록 ------------------------------------------------------------------
   void buy_list() {
      int sum = 0;// 구매 총액
      int cnt = 0; //구매 개수

      //로그인이 아니면
      if(log.isEmpty()) {
         System.out.println("[※ ERROR : 로그인 후 조회 가능합니다.]");
         return;
      }
      
      //sub출력
      for (int i = 0; i < st.length; i++) {
         System.out.print(st[i]+"\t");
      }
      System.out.println();
      
      //admin일 경우 전체 구매 목록
      if(nowId.equals("admin")) {
         for (int i = 0; i < buy.size(); i++) {
            Buy b = (Buy)buy.get(i);
               sum += b.price; // 구매합에 누적
               cnt++; //개수 추가
               System.out.print(b.id+"\t");
               System.out.print(b.name+"\t");
               System.out.print(b.price+"\t");
               System.out.print(b.bonuspoint+"\t");
               System.out.println(b.d+"\t");
               
         }
         System.out.println("-----------------------------------------");
         System.out.println("총 판애 금액 :"+sum);
         System.out.println("총 판매 개수 :"+cnt);
         
      }else {//admin이 아닐 경우, 로그인한 회원의 구매 목록
         for (int i = 0; i < buy.size(); i++) {
            Buy b = (Buy)buy.get(i);
            if(b.id.equals(nowId)) {
               sum += b.price;
               cnt++;
               System.out.print(b.id+"\t");
               System.out.print(b.name+"\t");
               System.out.print(b.price+"\t");
               System.out.print(b.bonuspoint+"\t");
               System.out.println(b.d+"\t");
            }
         }
         System.out.println("-----------------------------------------");
         System.out.println("총 구매 금액 :"+sum);
         System.out.println("총 구매 개수 :"+cnt);
      }
   }
   
   //Tv구매------------------------------------------------------------------
   void tv(Tv t) {
      Scanner scan = new Scanner(System.in);
      System.out.println("--------------[ 상품 상세보기  ]--------------");
      System.out.println("* 상품명 :"+t.name);
      System.out.println("* 가격 :"+t.price +" 원" );
      System.out.println("* 화면 :"+t.screen);
      System.out.println("* 화면인치 :"+t.inch+"인치");
      System.out.println("-----------------------------------------");
      System.out.print("1) 구매하기   2)뒤로가기   >>  ");
      switch (scan.nextInt()) {
      case 1:
         
         if(log.isEmpty()) {
            System.out.println("[※ ERROR : 로그인 후 이용하세요.]");
            break;
         }
         
         for (int i = 0; i < m.size(); i++) {
            Member mm = (Member)m.get(i);
            if(mm.id.equals(nowId)){
               
               if(mm.money < t.price) {
                  System.out.println("[※ ERROR : 잔액이 부족합니다.]");
                  return;
               }
               
               mm.money -= t.price; //돈빼줌
               mm.bonuspoint += t.bonusPoint; //포인트 빼줌
               buy.add(new Buy(mm.id,t.name,t.price,t.bonusPoint));
               System.out.println("구매가 완료되었습니다.");
            }
         }
         System.out.println();
         break;
      case 2:
         return;
      default:
         System.out.println("[※ ERROR : 잘못된 입력입니다.]");
         break;
      }
   }
   
   //냉장고 구매------------------------------------------------------------------
   void ref(Ref r) {
      Scanner scan = new Scanner(System.in);
      System.out.println("--------------[ 상품 상세보기  ]--------------");
      System.out.println("* 상품명 :"+r.name);
      System.out.println("* 가격 :"+r.price +"원");
      System.out.println("* 크기 :"+r.liter +" L");
      System.out.println("* 문 형태 :"+r.door +"타입");
      System.out.println("-----------------------------------------");
      System.out.print("1) 구매하기   2)뒤로가기   >>  ");
      switch (scan.nextInt()) {
      case 1:
         
         if(log.isEmpty()) {
            System.out.println("[※ ERROR : 로그인 후 이용하세요.]");
            break;
         }
         
         for (int i = 0; i < m.size(); i++) {
            Member mm = (Member)m.get(i);
            if(mm.id.equals(nowId)){ //로그인된 아이디 == 회원아이디
               
               if(mm.money < r.price) {
                  System.out.println("[※ ERROR : 잔액이 부족합니다.]");
                  return;
               }
               
               mm.money -= r.price; //돈빼줌
               mm.bonuspoint += r.bonusPoint; //포인트 빼줌
               buy.add(new Buy(mm.id,r.name,r.price,r.bonusPoint));
               System.out.println("[ ** 구매가 완료되었습니다. ** ]");
            }
         }
         System.out.println();
         break;
      case 2:
         return;
      default:
         System.out.println("[※ ERROR : 잘못된 입력입니다.]");
         break;
      }
   }
   
   //세탁기 구매------------------------------------------------------------------
   void wash(Wash w) {
      Scanner scan = new Scanner(System.in);
      System.out.println("--------------[ 상품 상세보기  ]--------------");
      System.out.println("* 상품명  : "+w.name);
      System.out.println("* 가격  : "+w.price+"원");
      System.out.println("* 크기  : "+w.size+" 리터");
      System.out.println("* 모양  : "+w.shape +" 형태");
      System.out.println("----------------------------------------");
      System.out.print("1) 구매하기   2)뒤로가기  >>  ");
      switch (scan.nextInt()) {
      case 1:
         
         if(log.isEmpty()) {
            System.out.println("[※ ERROR : 로그인 후 이용하세요.]");
            break;
         }
         
         for (int i = 0; i < m.size(); i++) {
            Member mm = (Member)m.get(i);
            if(mm.id.equals(nowId)){ //로그인된 아이디 == 회원아이디
               
               if(mm.money < w.price) {
                  System.out.println("[※ ERROR : 잔액이 부족합니다.]");
                  return;
               }
               
               
               mm.money -= w.price; //돈빼줌
               mm.bonuspoint += w.bonusPoint; //포인트 빼줌
               buy.add(new Buy(mm.id,w.name,w.price,w.bonusPoint));
               System.out.println("[ ** 구매가 완료되었습니다. ** ]");
            }
         }
         System.out.println();
         break;
      case 2:
         return;
      default:
         System.out.println("[※ ERROR : 잘못된 입력입니다.]");
         break;
      }
   }
   
   
}