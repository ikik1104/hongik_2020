
public class Ex0218_01 {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//10:10:10
		
		t1.minute = 10;
		t1.second = 10;
		t1.setHour(10);
		System.out.println(t1.getHour());
		
	}
}
