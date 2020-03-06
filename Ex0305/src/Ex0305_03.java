import java.util.Calendar;
import java.util.Date;

public class Ex0305_03 {

	public static void main(String[] args) {
		/*	현재시간에서 도쿄올림픽시간 (2020년 7월 24일 금요일 11:59:59
		 * 	현재까지 몇일 몇분 몇초가 남았는지 계산하시오.
		 * 
		 * */
		int[] time_unit = {24*60*60,60*60,60,1};
		String[] time_name = {"일","시","분","초"};
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, 07, 24, 11, 59, 59);
		
		long d_day = Math.abs(cal2.getTimeInMillis() - cal.getTimeInMillis())/1000 ;
  
		System.out.println("결과 : "+d_day);
		
		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (d_day/time_unit[i]) + time_name[i];
			d_day = d_day%time_unit[i];
		}
		//1000000초
		//1000000/86400 ->일
		//(1000000/86400)/3600 ->일
		//(1000000/86400)%3600)/60 ->일
		//((1000000/86400)%3600)%60)/60->일
		System.out.println("남은시간 :"+ result);
		
	}
}
