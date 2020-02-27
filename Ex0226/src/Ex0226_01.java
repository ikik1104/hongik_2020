public class Ex0226_01 {
	Ex0226_01() {
		super();
	}
	
	public static void main(String[] args) {
		Child c  = new Child();
		c.method();
		
	}
}


class Parent{
	int x = 20;
	
	Parent() {

	}
}
class Child extends Parent{
	int x = 50;
	Child(){
		super();
	}
	void method () {
		String a = "aaa";
		String b = "aaa";
		if(a.equals(b)) {
			System.out.println("aaa 똑같습니다.");
		}
		int x = 100;
		System.out.println("local x = "+x);
		System.out.println("인스턴스 x = "+this.x);
		System.out.println("조상 x = "+super.x);
	}
}