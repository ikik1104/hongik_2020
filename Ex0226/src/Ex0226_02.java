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
	
	Point() { //�⺻������
		
	}
	
	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "X��ǥ : "+x+" / Y��ǥ : "+y;
	}
}

class Point3D extends Point{
	
	int z;
	
	Point3D(int x, int y,int z) {
		super();// �⺻�����ڰ� ���� ��� �ڵ����� ������ super()���� ������ ����. �⺻�����ڸ� ������� ���� ��� �θ�Ŭ������ �����ڿ� ������ �Ű� ������ �־�����Ѵ�.
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return super.getLocation()+" / Z��ǥ : "+z;
	}

	
	
	
}