
public class Product {

	static int count;
	int serialNo;
	String color;// white, black, red
	int tvInch; //42 50 72
	String standard; // lcd, led

	/*�������� �������� �κе��� �ν��Ͻ� �ʱ�ȭ������ ���� �ѹ��� ����� �� �ִ�.
	 *�������ΰ� ������ ���� �ʿ䰡 ����.
	 *	count++;
		serialNo = count;
	 */
	{
		count++;
		serialNo = count;
	}//�ʱ�ȭ ���
	
	
	Product(){
		//�⺻������
		
	}
	
	Product(String color, int tvInch, String standard){
		this.color = color;
		this.tvInch = tvInch;
		this.standard = standard;
	}
	
	
}
