import java.util.HashSet;
import java.util.Iterator;

//iterator
public class Ex0306_02 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add(new Integer(1));
		set1.add(new Integer(5));
		set1.add(new Integer(4));
		set1.add(new Integer(3));
		set1.add(new Integer(1));// �ߺ��̴ϱ� �ȵ���.
		set1.add(new Integer(8));
		set1.add(new Integer(6));

		Iterator it = set1.iterator(); //��ȸ����. �ѹ� ����ϸ� ������

		System.out.println("1��° ���");
		while(it.hasNext()) { //�ҷ��� ���� �ִ�?
			System.out.println(it.next()); //������ ��� ������� ���´�.
			it.remove(); //�Ѱ��о�ͼ� �Ѱ� ����� 
		}
		
		Iterator it1 = set1.iterator();
		//�� ����Ϸ��� Iterator�� �� ����������Ѵ�.
		System.out.println("2��° ���");
		while(it.hasNext()) { //�ҷ��� ���� �ִ�?
			System.out.println(it1.next()); //������ ��� ������� ���´�.
//			it.remove(); //�Ѱ��о�ͼ� �Ѱ� ����� 
		}
		
		
	}
}
