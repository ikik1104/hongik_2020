
public class Ex0218_03 {

	public static void main(String[] args) {
		
		Data d = new Data(); //�ν��Ͻ� ��ü����
		d.x = 10; // �ν��Ͻ� ���� ȣ��
		Data.y = 50; // Ŭ���� ������ ȣ��
		
		System.out.println("1��° d.x :"+d.x);
		
		//Ŭ������.������
		
		/*Ex0218_03.  -> ���� Ŭ���� �������� �Ƚᵵ ��*/
		int dx = change(d);
		System.out.println("2��°  d.x :"+dx);
		System.out.println("2��°  d.x :"+d.x);
		
	}//main
	
	static int change(Data d) {  //�ν��Ͻ� �޼ҵ� ��ü����ؾ� , Ŭ�����޼ҵ�(static) ��ü �����ص�
		d.x += 200;
		return d.x;
	}
	
}//class
