
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
		
/*  *((( Str Ŭ����  )))*
		Str s = new Str();
		s.x = "abc";
		s.y = "def";
		
		merge(s);
		
		// s.x -> abc+def
		System.out.println(s.x);
		
	}//main
	
	//���ϰ��� ����, 2���� ������ ���� ���ĺ�����.
	static void merge(Str s) {
		s.x = s.x + s.y;
*/
	}//main
	
	//xyz���� �޾Ƽ� 3���� ���� ���Ͽ� ���� p.x�� �ֱ�
	static int add(int x, int y , int z) {
		int result = 0;
		result = x+y+z;
		return result;
	}
	
	//�ּҰ��� �޾Ƽ�
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
