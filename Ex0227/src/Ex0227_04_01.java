import java.util.Scanner;

public class Ex0227_04_01 {

	public static void main(String[] args) {
		/*변신 카 프로그램
		 * 1) 소방차생성 -- 클래스
		 * 2) 앰블런스 생성 -- 클래스
		 * 3) 트럭 생성 -- 클래스
 		 * ---------------------------
		 * 4) 기본차로 변신 -- 메소드
		 * ---------------------------
		 * 5) 원래 생성된 차로 변신 -- 메소드 instanceof
		 * 6) 종료
		 * 원하는 번호를 입력하시오.>>
		 * */
		Scanner scan = new Scanner(System.in);
		Car c = null;
		Car c2 = null;
		FireEngine f = new FireEngine();
		Ambulance am = new Ambulance();
		Truck t = new Truck();
		
		loop1:
		while(true) {
			
			System.out.println("1) 소방차생성           2) 앰블런스 생성         3) 트럭 생성");
			System.out.println("4) 기본차로 변신");
			System.out.println("5) 원래 생성된 차로 변신 ");
			System.out.println("6) 종료");
			System.out.println("원하는 번호를 입력하세요 . >>");
			
			
			switch (scan.nextInt()) {
			case 1:
				f.water();
				c = f;
				System.out.println("소방차가 생성되었습니다.");
				break;

			case 2:
				am.siren();
				c = am;
				System.out.println("앰블런스가 생성되었습니다.");
				break;
			case 3:
				t.stuff();
				c = t;
				System.out.println("트럭이 생성되었습니다.");
				break;
			case 4:
				//기본차로 변신하는 메소드
//				change2(c2,c);
				System.out.println(c2);
				c2 = change(c2,c);
				break;
			case 5:
				//원래 생성된 차로 변신하는 메소드
				in_of(c2,f,am,t);
				break;
			case 6:
				System.out.println("시스템을 종료합니다.");
				break loop1;
				
			default:
				System.out.println("잘못된 입력입니다.");
				continue loop1;
			}
			
		}
	}
	
	static Car change(Car c2, Car c) {
		c2 = c;
		System.out.println("기본차로 변신하였습니다.");
		c2.drive();
		return c2;
	}
	static void change2(Car c2, Car c) {
		c2 = c;
		System.out.println("기본차로 변신하였습니다.");
		c2.drive();
	}
	
	
	static void in_of(Car c2,FireEngine f, Ambulance am, Truck t) {
		if(c2 instanceof FireEngine) {
			f = (FireEngine) c2;
			System.out.println("소방차로 변경되었습니다.");
			f.water();
		}
		if(c2 instanceof Ambulance) {
			am = (Ambulance) c2;
			System.out.println("앰블런스로 변경되었습니다.");
			am.siren();
		}
		if(c2 instanceof Truck) {
			t = (Truck) c2;
			System.out.println("트럭으로 변경되었습니다.");
			t.stuff();
		}
	}



}

