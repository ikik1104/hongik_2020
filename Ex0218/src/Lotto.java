
public class Lotto {


	static int money = 10000;//�ܾ�
	int[] m_num = new int[6];
	static int cnt;//��ġ����
	int game_cnt =1;
	
	
	void game() {
		money -= 1000;
	}
	
	void same() {
		cnt += 1;
	}
	
	
	void game_cnt() {
		game_cnt += 1;
	}
	
	
}
