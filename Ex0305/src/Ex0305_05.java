import java.util.ArrayList;
import java.util.Collections;

public class Ex0305_05 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
//		Student stu1 = new Student(1,"홍길동",300);
//		Student stu2 = new Student(2,"이순신",299);
//		Student stu3 = new Student(3,"김유신",280);
//		Student stu4 = new Student(4,"유관순",270);
//		Student stu5 = new Student(5,"강감찬",288);
//		
//		list2.add(stu3);
//		list2.add(stu1);
//		list2.add(stu2);
//		list2.add(stu5);
//		list2.add(stu4);
//		
//		Collections.sort(list2);
////		Collections.reverse(list2);
//		
//		for (int i = 0; i < list2.size(); i++) {
//			System.out.println(list2.get(i));
//		}
//		
		System.out.println("-----------------------------");
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		list.add(3); //자동으로 객체로 들어간다 오토박싱
		list.add(3, new Integer(7));
		list.add(5, new Integer(8));
//		list.clear();
//		list.remove(1);

//		for (int i = 0; i < list.size(); i++) {
//			list.remove(i);
//		}
	
		for (int i = list.size()-1 ; i>=0; i--) {
			list.remove(i);
		}
		
		
//		Collections.sort(list); //작은것부터 정렬
//		Collections.reverse(list); //큰것부터 정렬
		
		System.out.println(list);
	}
}