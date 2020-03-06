import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class Ex0305_02 {
	public static void main(String[] args) {
		/*	1. 2020-03-05 10:44:55 ���糯¥�ð� ���
		 * 	2. 2020�� 3�� 5�� ����� ���(dateofweek)
		 * 	3. ������ switch
		 * 
		 * */
		Calendar today = Calendar.getInstance();
		
		//1��
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("�����Ͻ� :"+format.format(today.getTime()));
		
		//2��
		
		//1��° ���
//		SimpleDateFormat format2 = new SimpleDateFormat("yyyy�� MM�� dd��");  
		
		
		//2��° ���
		int year = today.get(Calendar.YEAR);
		int month = (today.get(Calendar.MONTH))+1;
		int date = today.get(Calendar.DATE);
		int week = today.get(Calendar.DAY_OF_WEEK);
		String[] week1 = {"","������","ȭ����","������","�����","�ݿ���","�����"}; 
		System.out.println(year+"�� "+month+"�� "+date+"�� "+week1[week]);
		
		//3��° ���
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 3);
		cal.set(Calendar.DATE, 14);
		
		
		
		
	}
}
