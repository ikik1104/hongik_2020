
public class Draw {

	public static void main(String[] args) {
		Point2 p = new Point2(50,200);
		Circle2 c = new Circle2(p,200);
		c.draw();
	}
}

class Shape2{
	String color = "black";
	void draw() {
		System.out.println("");
	}
}

class Point2{
	int x;
	int y;
	
	Point2(){
		
	}
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle2{
	Point2 p2;
	int r;
	
	Circle2(){
		
	}
	
	Circle2(Point2 p2,int r){
		this.p2 = p2;
		this.r = r;
	}
	
	void draw() {
		System.out.println("���� �׸���");
		System.out.println("x��ǥ :"+p2.x+" / y��ǥ :"+p2.y+" / ������ :"+r);
	}
}
class Triangle2{
	Point2[] p = new Point2[3];
	
	void draw() {
		System.out.println("�ﰢ�� �׸���");
		System.out.println("(x�� ��ǥ :"+p[0].x+",y�� ��ǥ"+p[0].y+") / (x�� ��ǥ :"+p[1].x+",y�� ��ǥ"+p[1].y+") / (x�� ��ǥ :"+p[2].x+",y�� ��ǥ"+p[2].y+")");
	}
}