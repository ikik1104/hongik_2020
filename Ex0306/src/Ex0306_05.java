import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex0306_05 {

	public static void main(String[] args) {
		/*	set -> 4,6,57,3,2,10저장해서 출력해보세요
		 * 	map -> 1,개   2,소   3,말  4,범  5,돼지
		 * 	로그인형태를 만들어보세요. map
		 * 	map 모두 출력하세요.
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
		map.put(1, "개");
		map.put(2, "소");
		map.put(3, "말");
		map.put(4, "범");
		map.put(5, "돼지");
		
		Iterator it2 = map.entrySet().iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
		
		//로그인
		map2.put("aaa", "1111");
		map2.put("bbb", "2222");
		map2.put("ccc", "33331");
		while(true) {
		System.out.println("아이디를 입력하세요");
		System.out.print("id :");
		String id = scan.next();
		if(!(map2.containsKey(id))) {
			System.out.println("일치하는 회원이 없습니다.");
			continue;
		}
		
		System.out.print("password : ");
		String pw = scan.next();
		
		if(!(map2.get(id).equals(pw))) {
			System.out.println("비밀번호가 일치하지 않습니다.");
			continue;
		}else {
			System.out.println("로그인이 완료되었습니다.");
			break;
		}
		}
		
		Iterator it3 = map2.entrySet().iterator();
		
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		
		System.out.println("시스템을 종료합니다.");
	}
}
