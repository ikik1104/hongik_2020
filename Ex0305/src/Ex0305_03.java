import java.util.Calendar;
import java.util.Date;

public class Ex0305_03 {

	public static void main(String[] args) {
		/*	����ð����� ����ø��Ƚð� (2020�� 7�� 24�� �ݿ��� 11:59:59
		 * 	������� ���� ��� ���ʰ� ���Ҵ��� ����Ͻÿ�.
		 * 
		 * */
		int[] time_unit = {24*60*60,60*60,60,1};
		String[] time_name = {"��","��","��","��"};
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2020, 07, 24, 11, 59, 59);
		
		long d_day = Math.abs(cal2.getTimeInMillis() - cal.getTimeInMillis())/1000 ;
  
		System.out.println("��� : "+d_day);
		
		String result = "";
		for (int i = 0; i < time_unit.length; i++) {
			result += (d_day/time_unit[i]) + time_name[i];
			d_day = d_day%time_unit[i];
		}
		//1000000��
		//1000000/86400 ->��
		//(1000000/86400)/3600 ->��
		//(1000000/86400)%3600)/60 ->��
		//((1000000/86400)%3600)%60)/60->��
		System.out.println("�����ð� :"+ result);
		
	}
}
