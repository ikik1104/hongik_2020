import java.util.Calendar;

public class Ex0305_04 {
	public static void main(String[] args) {
		/*	2020�� 3�� 14��  15�� 39�� 42��
		 * 	2021�� 4�� 14��  12�� 59�� 50��
		 *	���� ��� ��� ���ʰ� ���Ҵ���
		 * 
		 * 	2021�� 4�� 14���� ��������
		 * */
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		int[] time_unit = {24*60*60, 60*60, 60, 1};
		String[] st = {"��","��","��","��"};
		String[] week = {"","��","��","ȭ","��","��","��"};
		
		
		cal1.set(2020, 02, 14, 15, 39, 42);
		cal2.set(2021, 04, 14, 12, 59, 59);
		cal3.set(2021,03,14);
		
		System.out.println("2021�� 4�� 14���� ��������? "+week[cal3.get(Calendar.DAY_OF_WEEK)]+"����");
		
		
		long dday = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000;
		
		long day = dday/(24*60*60*1);
		long hour = (dday%(24*60*60*1))/(60*60*1);
		long minute = ((dday%(24*60*60*1))%(60*60*1))/60;
		long second = (((dday%(24*60*60*1))%(60*60*1))%60)/1;
		
		System.out.println(day+"��"+hour+"��"+minute+"��"+second+"��");
		
		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (dday/time_unit[i])+st[i];
			dday = dday%time_unit[i];
		}
		
		System.out.println(result);
		
	}
}
