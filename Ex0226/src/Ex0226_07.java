import java.util.Scanner;

public class Ex0226_07 {

	public static void main(String[] args) {
		//시,분,초를 입력받아서 출력해보세요
		//잘못된 시를 입력했을때 다시 입력받아서 출력하세요.
		Scanner scan = new Scanner(System.in);
		Time t = new Time();
		int hour;
		int minute;
		int second;
		
		while(true) {
		System.out.println("시를 입력하세요");
		hour = scan.nextInt();
		if(!(t.setHour(hour))) {
			continue;
		}
		System.out.println("분을 입력하세요");
		t.setMinute(scan.nextInt());
		System.out.println("초를 입력하세요");
		t.setSecond(scan.nextInt());
		System.out.println(t);
		break;
		}
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	Time(){
		this(1,1,1);
	}
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	public boolean setHour(int hour) {
		if(hour < 0 || hour > 24) {
			System.out.println("잘못된 시간이 입력되었습니다.");
			return false;
		}
		this.hour = hour;
		return true;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) {
			System.out.println("잘못된 분이 입력되었습니다.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("잘못된 초가 입력되었습니다.");
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return hour+"시  "+minute+"분  "+second+"초  ";
	}
	
}