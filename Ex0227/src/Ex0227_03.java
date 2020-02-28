
public class Ex0227_03 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		
		FireEngine f = null;
		FireEngine f2 = new FireEngine();
		
		c.drive();
		c2 = (Car)f2;
//		f = (FireEngine)c2;
		//FireEngine f = new Car();
		//자손의 참조변수로 조상의 객체를 선언하는 것은 안된다. --> 구동시키면 에러남
	
		
		f.water();
		
//		Car c = new Car();
//		FireEngine f = new FireEngine();
//		Car c2 = new FireEngine(); //다형성
////		FireEngine f1 = new Car(); //불가능 
//		FireEngine f2 = new FireEngine();
//		FireEngine f3 = null;
//		c = f2;
//		f3 = (FireEngine)c;
//
//		System.out.println("< 깡통차 >");
//		c.drive();
//		c.stop();
////		c.water(); c는 water() 이 없음
//		
//		System.out.println("< 소방차 >");
//		f.drive();
//		f.stop();
//		f.water();
		
	}
}

class Car{

	
	String color;
	int door;
	
	void drive() {
		System.out.println("엑셀을 밟으면 출발~~~");
	}

	void stop() {
		System.out.println("브레이크를 밟으면 멈춤~~");
	}
	
	
}


class FireEngine extends Car {
	
	void water() {
		System.out.println("물이 발사~");
	}
	
}

class Ambulance extends Car{
	
	void siren() {
		System.out.println(" 삐용 삐용 ");
	}
	
	void move() {
		System.out.println("사람을 옮깁니다.");
	}
}

class Truck extends Car{
	
	void stuff() {
		System.out.println("물건을 옮깁니다.");
	}
	
}






