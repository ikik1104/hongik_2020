
public class Ex0220_02 {

	public static void main(String[] args) {
		Plus p = new Plus();
		p.x = 10;
		p.y = 20;
		p.z = 30;
		
//		p.x = add(p.x,p.y,p.z);
//		System.out.println(p.x);
		add2(p);
		System.out.println(p.x);
		
/*  *((( Str 클래스  )))*
		Str s = new Str();
		s.x = "abc";
		s.y = "def";
		
		merge(s);
		
		// s.x -> abc+def
		System.out.println(s.x);
		
	}//main
	
	//리턴값을 만들어서, 2개의 변수의 값을 합쳐보세요.
	static void merge(Str s) {
		s.x = s.x + s.y;
*/
	}//main
	
	//xyz값을 받아서 3개의 값을 더하여 리턴 p.x에 넣기
	static int add(int x, int y , int z) {
		int result = 0;
		result = x+y+z;
		return result;
	}
	
	//주소값을 받아서
	static void add2(Plus p) {
		p.x = p.x + p.y + p.z;
	}
}

class Plus{
	int x;
	int y;
	int z;
}

class Str {
	String x;
	String y;
}
