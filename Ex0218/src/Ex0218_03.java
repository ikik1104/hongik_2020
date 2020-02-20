
public class Ex0218_03 {

	public static void main(String[] args) {
		
		Data d = new Data(); //인스턴스 객체선언
		d.x = 10; // 인스턴스 변수 호출
		Data.y = 50; // 클래스 변수를 호출
		
		System.out.println("1번째 d.x :"+d.x);
		
		//클래스명.변수명
		
		/*Ex0218_03.  -> 같은 클래스 내에서는 안써도 됌*/
		int dx = change(d);
		System.out.println("2번째  d.x :"+dx);
		System.out.println("2번째  d.x :"+d.x);
		
	}//main
	
	static int change(Data d) {  //인스턴스 메소드 객체사용해야 , 클래스메소드(static) 객체 사용안해도
		d.x += 200;
		return d.x;
	}
	
}//class
