import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ex0305_01 {
//Calendar
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //객체를 가져옴
		
		
		Calendar today2 = Calendar.getInstance();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //외국시간을 원하는형태로 만들어주는 객체
		long between = 0L;
		Date enddate = null;
		System.out.println("포맷없는 일시출력 :"+today.getTime());
		System.out.println("포맷있는 일시출력 :"+format1.format(today.getTime()));
		
		System.out.println("현재시간을 밀리세컨드로 표시 :"+today.getTimeInMillis());
		
		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 02);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);
		
		int year = today.get(Calendar.YEAR);
		System.out.println("today 년도 :"+year);
		int month = today.get(Calendar.MONTH);
		System.out.println("today 현재 월 :"+(month+1));
		int date = today.get(Calendar.DATE);
		System.out.println("today 현재 일 :"+date);
		System.out.println("--------------------------------");
		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 년도 :"+year2);
		int month2 = today2.get(Calendar.MONTH);
		System.out.println("today2 현재 월 :"+(month2+1));
		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 현재 일 :"+date2);
		System.out.println("today2 밀리세컨드 :"+today2.getTimeInMillis());
		
		String d_day = "2020-03-14 11:59:59";
		
		try {
			enddate = format1.parse(d_day);
			System.out.println("직접입력 일시 :"+enddate.getTime());
			between = today.getTimeInMillis()-enddate.getTime();
			System.out.println("long타입 변수 :"+between);
			System.out.println("현재시간과 직접입력시간 차이 :"+(today.getTimeInMillis()-enddate.getTime()));
			System.out.println("현재시간과 직접입력시간 차이 :"+Math.abs((today.getTimeInMillis()-enddate.getTime())));
			
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		
	}
}
