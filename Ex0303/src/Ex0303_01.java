
public class Ex0303_01 {
	
	public static void main(String[] args) {
		/* ����2, ��ũ2, �޵�2
		 * �巴�� 1��, ���� 4��, �ͷ�2�븦 �����ؼ�
		 * �巴���� �¿�� �ִ� ���� 
		 * �¿�� �ִ� ������ transit_space = 7��ŭ
		 * ���� ����3, ��ũ ���� 4, �޵� ����2
 		 * ����, ��ũ, �޵���  int transit 
 		 * �巴�� transport()�޼ҵ�
		 * */
		
		//���� 2��, ��ũ 2��, �޵� 2��
		//���� 4��, ��ũ 2��, ���� 4��
		//�ͷ� 1��
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

interface tran{ } //�巴�ʿ� �¿�� �ִ� ������ �����ϱ� ���� �������̽�

class GroundUnit extends Unit{
	int transit;// �����Ҵ纯��

	@Override
	void move(int x, int y) {
		System.out.println("��ǥ:"+x+", "+y);
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
	int transit_space; //����Ҽ� �ִ� ���� 7����
	GroundUnit[] ground = new GroundUnit[7]; //�¿�� ��������
	int i = 0; //�迭 ���°�� ��������
	
	void transport(tran t) {
		if(t instanceof GroundUnit) {
			GroundUnit g = (GroundUnit)t;
			if((transit_space+=g.transit)<7) {
				System.out.println("�¿����ϴ�.");
				ground[i] = g;
				i++;
			}else {
				System.out.println("������ ���� �¿�� �����ϴ�.");
				transit_space -=g.transit;
			}
		}
	}
	
	void load() {	}
	void unload() {   }
	void move(int x, int y){
		
	}
}

