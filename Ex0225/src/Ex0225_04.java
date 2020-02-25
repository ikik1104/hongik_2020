
public class Ex0225_04 {
	public static void main(String[] args) {
		CaptionTv c1 = new CaptionTv();
		Data d1 = new Data();
		System.out.println(d1);
		
		c1.channel = 7;
		c1.channelUp();//8번
		c1.channelUp();//9번
		c1.channelDown();//8번
		System.out.println("현재 채널:"+c1.channel);
		c1.caption = true;
		c1.displayCap("Hello Java");
	}
}
class Tv {
	boolean power; //전원 -on(true) / off(false)
	int channel;
	int volume;
	
	void power() {  power = !power; } // 클릭할때마다 반대로  
	
	void channelUp() { 
		//100번이 넘어가면 다시 1번으로 돌아가도록. 0->
		++channel; 
		if(channel >= 101) {
			channel = 1;
		}
	}
	
	void channelDown() { 
		//1번이면 안돌아가게?
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
	
	public String toString() { //toString (최상위 클래스 객체) Data를 출력하면 주소값만 나오는게 아닌 이 메소드를 실행시킨다.
		
		return "x의 값 :"+x+" / Y의 값 :"+y;
	}
	
}