//È¥ÀÚ¼­ ¾Èº¸°í Àû¾îº¸±â
public class Ex0225_03 {

	public static void main(String[] args) {
		
		//¿ø
		Circle1 c = new Circle1(new Point1(50,100),200);
		c.draw();
		
		//»ï°¢Çü
		Triangle1 t = new Triangle1(new Point1(30,30),new Point1(70,70),new Point1(100,20));
		t.draw();
	}
}

class Shape1{
	String color = "pink";
	
	void draw() {
		System.out.println("»ö»óÀº "+color+"ÀÔ´Ï´Ù");
	}
}

class Point1{
	int x;
	int y;
	
	Point1(){
		this(0,0);
	}

	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "("+x+","+y+")";
	}
}

class Circle1 extends Shape1{
	Point1 center;
	int r;
	
	Circle1(){
		this(new Point1(0,0),100);
	}
	
	Circle1(Point1 center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.println("¿øÀ» ±×¸³´Ï´Ù.");
		System.out.println("xÁÂÇ¥ : "+center.x+" / yÁÂÇ¥ :"+center.y+"/ ¹ÝÁö¸§ :"+r);
	}
	
}

class Triangle1 extends Shape1{
	Point1[] p = new Point1[3];
	
	Triangle1() {//±âº»»ý¼ºÀÚ
		this(new Point1(0,0),new Point1(0,100), new Point1(100,0));
	}
	
	Triangle1(Point1[] p) {
		this.p = p;
		//????
	}
	
	Triangle1(Point1 p1, Point1 p2, Point1 p3){
		p = new Point1[] {p1,p2,p2};
		//???
	}
	
	void draw() {
		System.out.println("»ï°¢ÇüÀ» ±×¸³´Ï´Ù.");
		System.out.println("(xÀÇ ÁÂÇ¥ :"+p[0].x+",yÀÇ ÁÂÇ¥"+p[0].y+") / (xÀÇ ÁÂÇ¥ :"+p[1].x+",yÀÇ ÁÂÇ¥"+p[1].y+") / (xÀÇ ÁÂÇ¥ :"+p[2].x+",yÀÇ ÁÂÇ¥"+p[2].y+")");
	}
}
