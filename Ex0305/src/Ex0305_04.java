import java.util.Calendar;

public class Ex0305_04 {
	public static void main(String[] args) {
		/*	2020년 3월 14일  15시 39분 42초
		 * 	2021년 4월 14일  12시 59분 50초
		 *	몇일 몇시 몇분 몇초가 남았는지
		 * 
		 * 	2021년 4월 14일은 무슨요일
		 * */
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		int[] time_unit = {24*60*60, 60*60, 60, 1};
		String[] st = {"일","시","분","초"};
		String[] week = {"","일","월","화","수","목","금"};
		
		
		cal1.set(2020, 02, 14, 15, 39, 42);
		cal2.set(2021, 04, 14, 12, 59, 59);
		cal3.set(2021,03,14);
		
		System.out.println("2021년 4월 14일은 무슨요일? "+week[cal3.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		
		long dday = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000;
		
		long day = dday/(24*60*60*1);
		long hour = (dday%(24*60*60*1))/(60*60*1);
		long minute = ((dday%(24*60*60*1))%(60*60*1))/60;
		long second = (((dday%(24*60*60*1))%(60*60*1))%60)/1;
		
		System.out.println(day+"일"+hour+"시"+minute+"분"+second+"초");
		
		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (dday/time_unit[i])+st[i];
			dday = dday%time_unit[i];
		}
		
		System.out.println(result);
		
	}
}
