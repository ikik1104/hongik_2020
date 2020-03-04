// 추상클래스
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
		
	abstract void move(int x, int y); //중괄호가있으면 구현이 된 것이다.
		
	void stop() {
		System.out.println("현재위치에서 멈춤");
	}
	
}

class Marine extends Unit{

	void move(int x, int y) {
		System.out.println("좌표 :"+x+", "+y);
		System.out.println("움직인 거리 :"+(x+y));
		System.out.println("움직인 시간 :"+(x+y)*4+"초");
		int time = (x+y)*4;
		System.out.println(time/3600+"시간 "+(time%3600)/60+"분"+((time%3600)%60)+"초");
	}
	
	void stimPack() {
		
	}
}

class Tank extends Unit{
	int x,y;
	
	void move(int x, int y) {
		System.out.println(x+","+y+"으로 이동. 걸리는 시간 :");
//		System.out.println(x+","+y+": 땅으로 움직임. 움직이는 속도 5");
	}
	void stop() {
		
	}
	void changeMode() {
		
	}
}

class Dropship extends Unit{
	int x , y;
	void move(int x, int y) {
		System.out.println(x+","+y+": 하늘로 움직임. 걸리는 시간 :"+Math.sqrt(Math.pow(x,2)+(y*y)));
		
	}
	
	void stop() {
		
	}
	
	void load() {
		
	}
	
	void unload() {
		
	}
}