import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Ex0306_04 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		HashSet set1 = new HashSet();
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		map.put("myId", "1234");
		map.put("dream", "b1111");
		map.put("aaa", "aoooo"); //�ߺ��� ���̵� �� ��� ���� ������ �����ͺ��� �������.
		map.put("bbb", "b1111");
		map.put("aaa", "a1a1");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
				
			}
		
		Iterator it1 = map.entrySet().iterator(); //map�� set���� ��ȯ
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}
}
