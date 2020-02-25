
//  <-> Car class
// 생성자 관련
public class Ex0224_01 {

	static int num = 50; //클래스 변수
	public static void main(String[] args) {
		Car c1 = new Car("white","수동",4);
		Car c2 = new Car("red","오토",5);
		Car c3 = new Car("blue","오토",4);
		
		Car[] c = new Car[100];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Car();
//			System.out.println(c[i].color+"/"+c[i].gearType+"/"+c[i].door);
		}
		
		int num  =1;
		System.out.println(Ex0224_01.num);
		System.out.println(num);
		
		System.out.println(c1.color+"/"+c1.gearType+"/"+c1.door);
		System.out.println(c2.color+"/"+c2.gearType+"/"+c2.door);
		System.out.println(c3.color+"/"+c3.gearType+"/"+c3.door);
		
		
	}
}
