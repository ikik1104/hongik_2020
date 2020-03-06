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
		set1.add(new Integer(1));// 중복이니까 안들어간다.
		set1.add(new Integer(8));
		set1.add(new Integer(6));

		Iterator it = set1.iterator(); //일회용임. 한번 사용하면 없어짐

		System.out.println("1번째 출력");
		while(it.hasNext()) { //불러올 값이 있니?
			System.out.println(it.next()); //순서가 없어서 지맘대로 나온다.
			it.remove(); //한개읽어와서 한개 지우고 
		}
		
		Iterator it1 = set1.iterator();
		//또 사용하려면 Iterator를 또 선언해줘야한다.
		System.out.println("2번째 출력");
		while(it.hasNext()) { //불러올 값이 있니?
			System.out.println(it1.next()); //순서가 없어서 지맘대로 나온다.
//			it.remove(); //한개읽어와서 한개 지우고 
		}
		
		
	}
}
