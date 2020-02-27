import java.util.Scanner;

public class Ex0226_07 {

	public static void main(String[] args) {
		//��,��,�ʸ� �Է¹޾Ƽ� ����غ�����
		//�߸��� �ø� �Է������� �ٽ� �Է¹޾Ƽ� ����ϼ���.
		Scanner scan = new Scanner(System.in);
		Time t = new Time();
		int hour;
		int minute;
		int second;
		
		while(true) {
		System.out.println("�ø� �Է��ϼ���");
		hour = scan.nextInt();
		if(!(t.setHour(hour))) {
			continue;
		}
		System.out.println("���� �Է��ϼ���");
		t.setMinute(scan.nextInt());
		System.out.println("�ʸ� �Է��ϼ���");
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
			System.out.println("�߸��� �ð��� �ԷµǾ����ϴ�.");
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
			System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0 || second > 59) {
			System.out.println("�߸��� �ʰ� �ԷµǾ����ϴ�.");
			return;
		}
		this.second = second;
	}
	
	public String toString() {
		return hour+"��  "+minute+"��  "+second+"��  ";
	}
	
}