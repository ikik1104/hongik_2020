import java.util.Scanner;

public class Ex0217_04 {

	public static void main(String[] args) {
		
		/*
		//시,분,int 24,60 초 float-59.5소수점 첫째자리까지 받음 10개의 time을 받습니다.
		//배열을 선언해서 받으세요.
		//알람 시간 맞춤 프로그램
		Scanner scan = new Scanner(System.in);
		Time[] t = new Time[3];
		String[] sub = {"시","분","초"};
		
		for (int i = 0; i < t.length; i++) {
			t[i] = new Time();
			System.out.println("시를 입력하세요. >>");
			t[i].hour = scan.nextInt();
			System.out.println("분을 입력하세요. >>");
			t[i].minute = scan.nextInt();
			System.out.println("초를 입력하세요. >>");
			t[i].second = scan.nextFloat();
			t[i].print();
		}
		*/
		
		
		/*
		Scanner scan = new Scanner(System.in);
		int[] h = new int[10];
		int[] m = new int[10];
		float[] s = new float[10];
		
		System.out.println(" [ 알람시간 설정 프로그램 ] ");
		for (int i = 0; i < s.length; i++) {
			System.out.println("시간을 입력하세요. >>");
			h[i] = scan.nextInt();
			System.out.println("분을 입력하세요. >>");
			m[i] = scan.nextInt();
			System.out.println("초를 입력하세요. >>");
			s[i] = scan.nextFloat();
			System.out.printf("알람설정 : %d시     %d분     %.1f초   알람이 설정되었습니다. %n",h[i],m[i],s[i]);
		}
		
		*/
		
		
		
		
		/*
		for (int i = 0; i < h.length; i++) {
			System.out.println("시를 입력하세요 0~24");
			h[i] = scan.nextInt();
			if(h[i]<0 || h[i]>24) {
				System.out.println("재입력");
				i--;
				continue;
			}
			System.out.println("분을 입력하세요 0~60");
			m[i] = scan.nextInt();
			if(m[i]<0 || m[i]>60) {
				System.out.println("재입력");
				i--;
				continue;
			}
			System.out.println("초를 입력하세요 ");
			s[i] = scan.nextFloat();
			if(s[i]<0.0 || s[i]>60.0) {
				System.out.println("재입력");
				i--;
				continue;
			}
		}
		
		for (int i = 0; i < h.length; i++) {
			System.out.printf(" %d시     %d분     %.1f초   알람이 설정되었습니다. %n",h[i],m[i],s[i]);
		}
		
		
		*/
	}
}
