import java.util.Scanner;

public class Ex0226_02 extends Object{
	
	Ex0226_02() {
		super();
	}
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,4);
		System.out.println(p.getLocation());
	}
	
}

class Point extends Object{
	int x;
	int y;
	
	Point() { //기본생성자
		
	}
	
	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "X좌표 : "+x+" / Y좌표 : "+y;
	}
}

class Point3D extends Point{
	
	int z;
	
	Point3D(int x, int y,int z) {
		super();// 기본생성자가 없는 경우 자동으로 생성된 super()에서 오류가 난다. 기본생성자를 사용하지 않을 경우 부모클래스의 생성자와 동일한 매개 변수를 넣어줘야한다.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation()+" / Z좌표 : "+z;
	}

	
	
	
}