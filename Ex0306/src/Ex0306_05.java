import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex0306_05 {

	public static void main(String[] args) {
		/*	set -> 4,6,57,3,2,10�����ؼ� ����غ�����
		 * 	map -> 1,��   2,��   3,��  4,��  5,����
		 * 	�α������¸� ��������. map
		 * 	map ��� ����ϼ���.
		 * */
		HashSet set = new HashSet();
		HashMap map = new HashMap();
		HashMap map2 = new HashMap();
		Scanner scan = new Scanner(System.in);
		
		//set
		
		set.add(new Integer(4));
		set.add(new Integer(6));
		set.add(new Integer(57));
		set.add(new Integer(3));
		set.add(new Integer(2));
		set.add(new Integer(10));
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//map
		map.put(1, "��");
		map.put(2, "��");
		map.put(3, "��");
		map.put(4, "��");
		map.put(5, "����");
		
		Iterator it2 = map.entrySet().iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		//�α���
		map2.put("aaa", "1111");
		map2.put("bbb", "2222");
		map2.put("ccc", "33331");
		while(true) {
		System.out.println("���̵� �Է��ϼ���");
		System.out.print("id :");
		String id = scan.next();
		if(!(map2.containsKey(id))) {
			System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
			continue;
		}
		
		System.out.print("password : ");
		String pw = scan.next();
		
		if(!(map2.get(id).equals(pw))) {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			continue;
		}else {
			System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
			break;
		}
		}
		
		Iterator it3 = map2.entrySet().iterator();
		
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		
		System.out.println("�ý����� �����մϴ�.");
	}
}
