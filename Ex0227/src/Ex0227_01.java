
public class Ex0227_01 {

	public static void main(String[] args) {
		Stu01 s1 = Stu01.geInstance(); //싱글톤 메소드로 넘어간다. (주소값을 넘겨줌)
		Stu01 s2 = Stu01.geInstance(); // s1 == s2 새로운 객체가 아니라 같은 곳을 바라본다.
//		s1.setName("홍길동");
//		s2.setName("이순신");
		
		//Time t = new Time();
		//Time t2 = new Time2();
		// t2 = t;
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
