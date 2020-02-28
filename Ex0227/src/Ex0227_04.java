import java.util.Scanner;

public class Ex0227_04 {

	public static void main(String[] args) {
		
		/*앰블런스 객체 1개 생성
		 *카객체에 넣고
		 *드라이브 메소드 실행
		 *다시 형변환을 해서
		 *앰블런스 1개 객체를 추가해서 넣어서
		 *사이렌을 실행해 보세요
		*/
		
		Ambulance am = new Ambulance();
//		Car c = null;
		Car c = am;
		c.drive();
		
		Ambulance am2 = (Ambulance)c;
//		Ambulance am2 = null;
		am2.siren();
		
		
		
	/* ===2
	 

		FireEngine fe = new FireEngine();
		if(fe instanceof FireEngine) {
			System.out.println("네 FireEngine객체 맞습니다.");
		}
		
		if(fe instanceof Car) {
			System.out.println("네 Car객체 맞습니다.");
		}
		
		if(fe instanceof Object) {
			System.out.println("네 Object객제 맞습니다.");
		}
	*/
	}

}

