
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
		System.out.println("¿øÀ» ±×¸®±â");
		System.out.println("xÁÂÇ¥ :"+p2.x+" / yÁÂÇ¥ :"+p2.y+" / ¹ÝÁö¸§ :"+r);
	}
}
class Triangle2{
	Point2[] p = new Point2[3];
	
	void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
		System.out.println("(xÀÇ ÁÂÇ¥ :"+p[0].x+",yÀÇ ÁÂÇ¥"+p[0].y+") / (xÀÇ ÁÂÇ¥ :"+p[1].x+",yÀÇ ÁÂÇ¥"+p[1].y+") / (xÀÇ ÁÂÇ¥ :"+p[2].x+",yÀÇ ÁÂÇ¥"+p[2].y+")");
	}
}