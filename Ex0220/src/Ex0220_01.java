
public class Ex0220_01 {

	public static void main(String[] args) {
		Data d = new Data();
		/* 
		 * d.x�� ������ �ּҰ��� ������ �ƴ϶� �׳� ������&�� �� ������ Date�� �ݿ��� �ȵȴ�. 
		 * --> Data d -> �ּҰ��� �������� change(d)  --> d.x = ???;(�ݿ���)
		 * 
		 * */
		d.x = 10;
		d.y = 100;
		
		change1(d.x); //�ּҰ��� �����°� �ƴ� �׳� 10�� ������
		System.out.println("main : "+d.x); //���Ϲ޾ƿ����ʾƼ� �׷��� 10
		
		d.y = change2(d.x, d.y); //d.x - d.y
		System.out.println("minus : "+d.y);
		
		change3(d); //�ּҰ��� �Ѱ���
		
		System.out.println("y�� ���� : "+d.y);
		
	}//main
	
	static void change1(int x) {
		x = 1000; // 10 -> 1000����
	}
	
	static int change2(int x, int y) {
		int result = 0;
		result = x-y;
		return result;
	}
	
	//���ϰ����� y�� ���� 2000����
	static void change3(Data d) {
		d.y = 2000;
	}
	
}

class Data{
	int x;
	int y;
}