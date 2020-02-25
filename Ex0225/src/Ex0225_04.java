
public class Ex0225_04 {
	public static void main(String[] args) {
		CaptionTv c1 = new CaptionTv();
		Data d1 = new Data();
		System.out.println(d1);
		
		c1.channel = 7;
		c1.channelUp();//8��
		c1.channelUp();//9��
		c1.channelDown();//8��
		System.out.println("���� ä��:"+c1.channel);
		c1.caption = true;
		c1.displayCap("Hello Java");
	}
}
class Tv {
	boolean power; //���� -on(true) / off(false)
	int channel;
	int volume;
	
	void power() {  power = !power; } // Ŭ���Ҷ����� �ݴ��  
	
	void channelUp() { 
		//100���� �Ѿ�� �ٽ� 1������ ���ư�����. 0->
		++channel; 
		if(channel >= 101) {
			channel = 1;
		}
	}
	
	void channelDown() { 
		//1���̸� �ȵ��ư���?
		--channel; 
		if(channel <= 0) {
			channel = 100;
		}
	}
}

class CaptionTv extends Tv{
	boolean caption;
	
	void displayCap(String text) {
		if(caption == true) {
			System.out.println("caption On");
			System.out.println(text);
		}
	}
}

class Data{
	int x;
	int y;
	
	Data(){
		x = 10;
		y = 10;
	}
	
	public String toString() { //toString (�ֻ��� Ŭ���� ��ü) Data�� ����ϸ� �ּҰ��� �����°� �ƴ� �� �޼ҵ带 �����Ų��.
		
		return "x�� �� :"+x+" / Y�� �� :"+y;
	}
	
}