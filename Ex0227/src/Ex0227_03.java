
public class Ex0227_03 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		
		FireEngine f = null;
		FireEngine f2 = new FireEngine();
		
		c.drive();
		c2 = (Car)f2;
//		f = (FireEngine)c2;
		//FireEngine f = new Car();
		//�ڼ��� ���������� ������ ��ü�� �����ϴ� ���� �ȵȴ�. --> ������Ű�� ������
	
		
		f.water();
		
//		Car c = new Car();
//		FireEngine f = new FireEngine();
//		Car c2 = new FireEngine(); //������
////		FireEngine f1 = new Car(); //�Ұ��� 
//		FireEngine f2 = new FireEngine();
//		FireEngine f3 = null;
//		c = f2;
//		f3 = (FireEngine)c;
//
//		System.out.println("< ������ >");
//		c.drive();
//		c.stop();
////		c.water(); c�� water() �� ����
//		
//		System.out.println("< �ҹ��� >");
//		f.drive();
//		f.stop();
//		f.water();
		
	}
}

class Car{

	
	String color;
	int door;
	
	void drive() {
		System.out.println("������ ������ ���~~~");
	}

	void stop() {
		System.out.println("�극��ũ�� ������ ����~~");
	}
	
	
}


class FireEngine extends Car {
	
	void water() {
		System.out.println("���� �߻�~");
	}
	
}

class Ambulance extends Car{
	
	void siren() {
		System.out.println(" �߿� �߿� ");
	}
	
	void move() {
		System.out.println("����� �ű�ϴ�.");
	}
}

class Truck extends Car{
	
	void stuff() {
		System.out.println("������ �ű�ϴ�.");
	}
	
}






