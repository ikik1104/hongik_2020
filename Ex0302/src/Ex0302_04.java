// �߻�Ŭ����
public class Ex0302_04 {

	public static void main(String[] args) {
//		Marine m1 = new Marine();
//		m1.move(10, 10);
		Unit[] group = new Unit[10];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
//		group[2] = new Marine();
//		group[3] = new Dropship();
		
		for (int i = 0; i < group.length; i++) {
			if(group[i] == null) {
				break;
			}
			group[i].move(1000, 1000);
		}
	}
}

abstract class Unit{
	int x,y;
		
	abstract void move(int x, int y); //�߰�ȣ�������� ������ �� ���̴�.
		
	void stop() {
		System.out.println("������ġ���� ����");
	}
	
}

class Marine extends Unit{

	void move(int x, int y) {
		System.out.println("��ǥ :"+x+", "+y);
		System.out.println("������ �Ÿ� :"+(x+y));
		System.out.println("������ �ð� :"+(x+y)*4+"��");
		int time = (x+y)*4;
		System.out.println(time/3600+"�ð� "+(time%3600)/60+"��"+((time%3600)%60)+"��");
	}
	
	void stimPack() {
		
	}
}

class Tank extends Unit{
	int x,y;
	
	void move(int x, int y) {
		System.out.println(x+","+y+"���� �̵�. �ɸ��� �ð� :");
//		System.out.println(x+","+y+": ������ ������. �����̴� �ӵ� 5");
	}
	void stop() {
		
	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{
	int x , y;
	void move(int x, int y) {
		System.out.println(x+","+y+": �ϴ÷� ������. �ɸ��� �ð� :"+Math.sqrt(Math.pow(x,2)+(y*y)));
		
	}
	
	void stop() {
		
	}
	
	void load() {
		
	}
	
	void unload() {
		
	}
}