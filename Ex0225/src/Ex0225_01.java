import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {
		/*
		//원--------------------------------------------------------------------------------------------------------------------
		Circle c = new Circle(); 
		c.draw();
		
		//원점이 150,30 반지름 200
		Point p = new Point(150,30);
		Circle c2 = new Circle(p,200);
//		Circle c2 = new Circle(new Point(150,30),200);
		c2.draw();
		
		//원점이 0,0 반지름 200
		Point p2 = new Point();
		Circle c3 = new Circle(p2,200);
//		Circle c3 = new Circle(new Point(),200);
		c3.draw();
		
		//원점이 300,300반지름 70
		Point p3 = new Point(300,300);
		Circle c4 = new Circle(p3,70);
//		Circle c4 = new Circle(new Point(300,300),70);
		c4.draw();
		
		System.out.println("--------------------------------------------");
//		Point 배열 (100,100/ 200,200/ 300,300) 50,60,70;
		Point[] pp = new Point[] {new Point(100,100),new Point(200,200),new Point(300,300)};
		int[] rr = {50,60,70};
		Circle[] cc = new Circle[3];
		
		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Circle(pp[i],rr[i]);
			cc[i].draw();
		}
		
		//scan -> 좌표 60,50 -> 100 2개를 더 넣어보세요
		Scanner scan = new Scanner(System.in);
		Circle[] ccc = new Circle[3];
		Point[] ppp = new Point[3];
		
		/* 내가 만든
		for (int i = 0; i < ccc.length; i++) {
			System.out.println("x좌표를 입력하세요.");
			int x = scan.nextInt();
			System.out.println("y좌표를 입력하세요.");
			int y = scan.nextInt();
			System.out.println("반지름을 입력하세요.");
			int r = scan.nextInt();
//			Point ppp = new Point(x,y); //이렇게 객체선언해서 ppp를 넣어도 되는데 그냥 안에 써줌
			ccc[i] = new Circle(new Point(x,y),r);
			ccc[i].draw();
		}
		
		int[] num = new int[3];
		String[] sub = {"x좌표","y좌표","반지름"}; 
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(sub[i]+"값을 넣으세요");
				num[j] = scan.nextInt();
			}
			pp[i] = new Point(num[0],num[1]);
			ccc[i] = new Circle(pp[i],num[2]);
		}
		for (int i = 0; i < ccc.length; i++) {
			ccc[i].draw();
		}
	*/
	
	//트라이 앵글--------------------------------------------------------------------------------------------------------------------
//		Triangle t1 = new Triangle();
//		t1.draw();
		System.out.println("방법 1 (매개변수 3개 )---------------------------------------------");
		//20,20 / 40,100 / 30,10
		
		Point p1 = new Point(20,20);
		Point p2 = new Point(40,100);
		Point p3 = new Point(30,10);
		Triangle t1 = new Triangle(p1,p2,p3);
		t1.draw();
		
		System.out.println("방법 2) (매개변수 3개 ) ---------------------------------------------");
		Triangle t2 = new Triangle(new Point(20,20),new Point(40,100),new Point(30,10));
		t2.draw();
	
		System.out.println("방법 3) (배열)---------------------------------------------");
		Point[] p = new Point[3];
		p[0] = new Point(20,20);
		
		
		
		
	}

	
	
}
//도형그리기 클래스
class shape{
	String color = "black";
	void draw() {
		System.out.println("면을 만듭니다.");
		System.out.println("면의 색상 : "+color);
	}
}
//좌표 점 클래스
class Point {
	int x ;
	int y ;
	
	Point(){//기본 생성자
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		
		return "(x의 좌표:"+x+",y의 좌표 :"+y+")";
	}
}

//원형 그리기 클래스
class Circle extends shape{
	Point center ; //포인트 좌표
	int r;
	
	Circle(){ //기본생성자
		center = new Point(0,0);
		r = 100;
	}
//	Circle c1 = new Circle(p1,50); 이렇게 선언이 되어 있을 것 이다 -> 이렇게 메인에서 보내줌
	Circle(Point center, int r){ //여기로 받는다.
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.println("원형을 그립니다.");
		System.out.println("( 원점 : "+center.x+","+center.y+"/ 반지름 :"+r+"/ 색상 : "+color+")");
	}
}

//삼각형 그리기 클래스
class Triangle extends shape{
	
	Point[] p = new Point[3];
	
	Triangle() {//기본생성자
	/*	p[0] = new Point();
		p[0].x = 0;
		p[0].y = 0;  */
		this(new Point (0,0),new Point (100,0),new Point (0,100));
	/*	p[0] = new Point (0,0);
		p[1] = new Point (100,0);
		p[2] = new Point (0,100);  */
	}
	
	Triangle(Point[] p){
		this.p = p;
	}
	
	Triangle(Point p1, Point p2, Point p3){
//		Point[] p = { p1,p2,p3 };
		p = new Point[] { p1,p2,p3 };
	}
	
	void draw() {
		System.out.println("삼각형을 그립니다.");
		System.out.println("( 좌표1 :"+p[0].getXY()+" / 좌표2 :"+p[1].getXY()+" / 좌표3 :"+p[2].getXY()+" / 색상 : "+color+")");
	}
	
	
}






