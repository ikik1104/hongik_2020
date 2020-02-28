
public class Ex0228_01 {
	 public static void main(String[] args) {
		Child1 c1 = new Child1();
		Parent1 p1 = new Parent1();
		Parent1 p2 = new Child1(); // 다형성
		
		System.out.println("Parent1객체, 참조변수 x 값:"+p1.getX());
		p1.method();
		System.out.println("-------------------------------");
		System.out.println("Child1객체, 참조변수 x 값:"+c1.getX());
		c1.method();
		System.out.println("-------------------------------");
		System.out.println("Child1객체, 참조변수 x 값:"+p2.getX());
		p2.method();
		
//		System.out.println(p2.getX());
//		p2.setX(50);
//		System.out.println(p2.getX());
		
	}
}

class Parent1{
	private int x = 100;
	
	public int getX() {  
		return x; 
	}
	public void setX(int x) { this.x = x; }




	void method() {
		System.out.println("부모클래스 메소드입니다.");
	}
}

class Child1 extends Parent1{
	private int x = 200;
	
	public int getX() {
		return x; 
	}
	public void setX(int x) {

		this.x = x;
	}
	
	
	void method() {
		System.out.println("자손클래스 메소드 입니다. (오버라이딩)");
	}
	
	void method(int x) {
		System.out.println("자손클래스 메소드2 입니다. (오버로딩)");
	}
}