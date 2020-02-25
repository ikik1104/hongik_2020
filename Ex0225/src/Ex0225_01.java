import java.util.Scanner;

public class Ex0225_01 {

	public static void main(String[] args) {
		/*
		//��--------------------------------------------------------------------------------------------------------------------
		Circle c = new Circle(); 
		c.draw();
		
		//������ 150,30 ������ 200
		Point p = new Point(150,30);
		Circle c2 = new Circle(p,200);
//		Circle c2 = new Circle(new Point(150,30),200);
		c2.draw();
		
		//������ 0,0 ������ 200
		Point p2 = new Point();
		Circle c3 = new Circle(p2,200);
//		Circle c3 = new Circle(new Point(),200);
		c3.draw();
		
		//������ 300,300������ 70
		Point p3 = new Point(300,300);
		Circle c4 = new Circle(p3,70);
//		Circle c4 = new Circle(new Point(300,300),70);
		c4.draw();
		
		System.out.println("--------------------------------------------");
//		Point �迭 (100,100/ 200,200/ 300,300) 50,60,70;
		Point[] pp = new Point[] {new Point(100,100),new Point(200,200),new Point(300,300)};
		int[] rr = {50,60,70};
		Circle[] cc = new Circle[3];
		
		for (int i = 0; i < cc.length; i++) {
			cc[i] = new Circle(pp[i],rr[i]);
			cc[i].draw();
		}
		
		//scan -> ��ǥ 60,50 -> 100 2���� �� �־����
		Scanner scan = new Scanner(System.in);
		Circle[] ccc = new Circle[3];
		Point[] ppp = new Point[3];
		
		/* ���� ����
		for (int i = 0; i < ccc.length; i++) {
			System.out.println("x��ǥ�� �Է��ϼ���.");
			int x = scan.nextInt();
			System.out.println("y��ǥ�� �Է��ϼ���.");
			int y = scan.nextInt();
			System.out.println("�������� �Է��ϼ���.");
			int r = scan.nextInt();
//			Point ppp = new Point(x,y); //�̷��� ��ü�����ؼ� ppp�� �־ �Ǵµ� �׳� �ȿ� ����
			ccc[i] = new Circle(new Point(x,y),r);
			ccc[i].draw();
		}
		
		int[] num = new int[3];
		String[] sub = {"x��ǥ","y��ǥ","������"}; 
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				System.out.println(sub[i]+"���� ��������");
				num[j] = scan.nextInt();
			}
			pp[i] = new Point(num[0],num[1]);
			ccc[i] = new Circle(pp[i],num[2]);
		}
		for (int i = 0; i < ccc.length; i++) {
			ccc[i].draw();
		}
	*/
	
	//Ʈ���� �ޱ�--------------------------------------------------------------------------------------------------------------------
//		Triangle t1 = new Triangle();
//		t1.draw();
		System.out.println("��� 1 (�Ű����� 3�� )---------------------------------------------");
		//20,20 / 40,100 / 30,10
		
		Point p1 = new Point(20,20);
		Point p2 = new Point(40,100);
		Point p3 = new Point(30,10);
		Triangle t1 = new Triangle(p1,p2,p3);
		t1.draw();
		
		System.out.println("��� 2) (�Ű����� 3�� ) ---------------------------------------------");
		Triangle t2 = new Triangle(new Point(20,20),new Point(40,100),new Point(30,10));
		t2.draw();
	
		System.out.println("��� 3) (�迭)---------------------------------------------");
		Point[] p = new Point[3];
		p[0] = new Point(20,20);
		
		
		
		
	}

	
	
}
//�����׸��� Ŭ����
class shape{
	String color = "black";
	void draw() {
		System.out.println("���� ����ϴ�.");
		System.out.println("���� ���� : "+color);
	}
}
//��ǥ �� Ŭ����
class Point {
	int x ;
	int y ;
	
	Point(){//�⺻ ������
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		
		return "(x�� ��ǥ:"+x+",y�� ��ǥ :"+y+")";
	}
}

//���� �׸��� Ŭ����
class Circle extends shape{
	Point center ; //����Ʈ ��ǥ
	int r;
	
	Circle(){ //�⺻������
		center = new Point(0,0);
		r = 100;
	}
//	Circle c1 = new Circle(p1,50); �̷��� ������ �Ǿ� ���� �� �̴� -> �̷��� ���ο��� ������
	Circle(Point center, int r){ //����� �޴´�.
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.println("������ �׸��ϴ�.");
		System.out.println("( ���� : "+center.x+","+center.y+"/ ������ :"+r+"/ ���� : "+color+")");
	}
}

//�ﰢ�� �׸��� Ŭ����
class Triangle extends shape{
	
	Point[] p = new Point[3];
	
	Triangle() {//�⺻������
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
		System.out.println("�ﰢ���� �׸��ϴ�.");
		System.out.println("( ��ǥ1 :"+p[0].getXY()+" / ��ǥ2 :"+p[1].getXY()+" / ��ǥ3 :"+p[2].getXY()+" / ���� : "+color+")");
	}
	
	
}






