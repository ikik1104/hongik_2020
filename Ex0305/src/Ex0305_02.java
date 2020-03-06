import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class Ex0305_02 {
	public static void main(String[] args) {
		/*	1. 2020-03-05 10:44:55 현재날짜시간 출력
		 * 	2. 2020년 3월 5일 목요일 출력(dateofweek)
		 * 	3. 요일은 switch
		 * 
		 * */
		Calendar today = Calendar.getInstance();
		
		//1번
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("현재일시 :"+format.format(today.getTime()));
		
		//2번
		
		//1번째 방법
//		SimpleDateFormat format2 = new SimpleDateFormat("yyyy년 MM월 dd일");  
		
		
		//2번째 방법
		int year = today.get(Calendar.YEAR);
		int month = (today.get(Calendar.MONTH))+1;
		int date = today.get(Calendar.DATE);
		int week = today.get(Calendar.DAY_OF_WEEK);
		String[] week1 = {"","월요일","화요일","수요일","목요일","금요일","토요일"}; 
		System.out.println(year+"년 "+month+"월 "+date+"일 "+week1[week]);
		
		//3번째 방법
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DATE, 14);
		
		
		
		
	}
}
