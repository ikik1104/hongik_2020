import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ex0305_01 {
//Calendar
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //��ü�� ������
		
		
		Calendar today2 = Calendar.getInstance();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //�ܱ��ð��� ���ϴ����·� ������ִ� ��ü
		long between = 0L;
		Date enddate = null;
		System.out.println("���˾��� �Ͻ���� :"+today.getTime());
		System.out.println("�����ִ� �Ͻ���� :"+format1.format(today.getTime()));
		
		System.out.println("����ð��� �и�������� ǥ�� :"+today.getTimeInMillis());
		
		today2.set(Calendar.YEAR, 2021);
		today2.set(Calendar.MONTH, 02);
		today2.set(Calendar.DATE, 14);
		today2.set(Calendar.HOUR, 11);
		today2.set(Calendar.MINUTE, 59);
		today2.set(Calendar.SECOND, 59);
		
		int year = today.get(Calendar.YEAR);
		System.out.println("today �⵵ :"+year);
		int month = today.get(Calendar.MONTH);
		System.out.println("today ���� �� :"+(month+1));
		int date = today.get(Calendar.DATE);
		System.out.println("today ���� �� :"+date);
		System.out.println("--------------------------------");
		int year2 = today2.get(Calendar.YEAR);
		System.out.println("today2 �⵵ :"+year2);
		int month2 = today2.get(Calendar.MONTH);
		System.out.println("today2 ���� �� :"+(month2+1));
		int date2 = today2.get(Calendar.DATE);
		System.out.println("today2 ���� �� :"+date2);
		System.out.println("today2 �и������� :"+today2.getTimeInMillis());
		
		String d_day = "2020-03-14 11:59:59";
		
		try {
			enddate = format1.parse(d_day);
			System.out.println("�����Է� �Ͻ� :"+enddate.getTime());
			between = today.getTimeInMillis()-enddate.getTime();
			System.out.println("longŸ�� ���� :"+between);
			System.out.println("����ð��� �����Է½ð� ���� :"+(today.getTimeInMillis()-enddate.getTime()));
			System.out.println("����ð��� �����Է½ð� ���� :"+Math.abs((today.getTimeInMillis()-enddate.getTime())));
			
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
		
	}
}
