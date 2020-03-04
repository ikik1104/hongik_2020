
public class Ex0303_01 {
	
	public static void main(String[] args) {
		/* 마린2, 탱크2, 메딕2
		 * 드럽십 1대, 벌쳐 4대, 터렛2대를 생성해서
		 * 드럽십을 태울수 있는 것은 
		 * 태울수 있는 공간은 transit_space = 7만큼
		 * 마린 공간3, 탱크 공간 4, 메딕 공간2
 		 * 마린, 탱크, 메딕은  int transit 
 		 * 드럽십 transport()메소드
		 * */
		
		//마린 2명, 탱크 2대, 메딕 2대
		//벌쳐 4대, 탱크 2대, 마린 4명
		//터렛 1대
		Unit[] group = new Unit[6];
		Unit[] group1 = new Unit[10];
		
		group[0] = new Marine();
		group[1] = new Marine();
		group[2] = new Tank();
		group[3] = new Tank();
		group[4] = new Medic();
		group[5] = new Medic();
		
		group1[0] = new Dropship();
		group1[1] = new Marine();
		group1[2] = new Marine();
		group1[3] = new Marine();
		group1[6] = new Tank();
		group1[7] = new Tank();
		group1[8] = new Vulture();
		group1[9] = new Vulture();
		group1[10] = new Vulture();
		group1[11] = new Vulture();
		
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(200, 100);
		}
		
		for (int i = 0; i < group1.length; i++) {
			group[i].move(300, 300);
		}
		
	}

} //class

interface tran{ } //드럽십에 태울수 있는 유닛을 선정하기 위한 인터페이스

class GroundUnit extends Unit{
	int transit;// 공간할당변수

	@Override
	void move(int x, int y) {
		System.out.println("좌표:"+x+", "+y);
	}
	
}

class Marine extends GroundUnit implements tran{
	void stimPack() {	}
}

class Tank extends GroundUnit implements tran{
	int transit = 4;
	void changMode() {	}
	void move(int x, int y){
		
	}
	
}

class Dropship extends Unit{	
	int transit_space; //운송할수 있는 공간 7까지
	GroundUnit[] ground = new GroundUnit[7]; //태우는 유닛저장
	int i = 0; //배열 몇번째에 들어갈것인지
	
	void transport(tran t) {
		if(t instanceof GroundUnit) {
			GroundUnit g = (GroundUnit)t;
			if((transit_space+=g.transit)<7) {
				System.out.println("태웠습니다.");
				ground[i] = g;
				i++;
			}else {
				System.out.println("공간이 없어 태울수 없습니다.");
				transit_space -=g.transit;
			}
		}
	}
	
	void load() {	}
	void unload() {   }
	void move(int x, int y){
		
	}
}

