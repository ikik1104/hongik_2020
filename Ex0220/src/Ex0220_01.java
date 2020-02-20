
public class Ex0220_01 {

	public static void main(String[] args) {
		Data d = new Data();
		/* 
		 * d.x를 보내면 주소값을 보낸게 아니라 그냥 변수명&값 만 보내서 Date에 반영이 안된다. 
		 * --> Data d -> 주소값을 보내야함 change(d)  --> d.x = ???;(반영됨)
		 * 
		 * */
		d.x = 10;
		d.y = 100;
		
		change1(d.x); //주소값을 보내는거 아님 그냥 10을 보내줌
		System.out.println("main : "+d.x); //리턴받아오지않아서 그래도 10
		
		d.y = change2(d.x, d.y); //d.x - d.y
		System.out.println("minus : "+d.y);
		
		change3(d); //주소값을 넘겨줌
		
		System.out.println("y의 값은 : "+d.y);
		
	}//main
	
	static void change1(int x) {
		x = 1000; // 10 -> 1000으로
	}
	
	static int change2(int x, int y) {
		int result = 0;
		result = x-y;
		return result;
	}
	
	//리턴값없이 y의 값을 2000으로
	static void change3(Data d) {
		d.y = 2000;
	}
	
}

class Data{
	int x;
	int y;
}