
public class Ex0304_01 {

	public static void main(String[] args) {
		Person p1 = new Person(880101110559L);
		Person p2 = new Person(880101110559L);

		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);

		System.out.println("==으로 비교 :"+(p1==p2)); //false
		System.out.println("equals로 비교 :"+p1.equals(p2)); //오버라이딩을 하지 않으면 false
		// 객체끼리 비교할 때는 Object클래스(최고조상)의 메소드 중 하나인 equals를 오버라딩 해서 사용해야한다.
	}
}

class Person{
	
	long id;

	//생성자
	Person() { }
	
	Person(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person) {
			Person p = (Person)obj;
			if(id == p.id) {
				return true;
			}
		}
		return false;
	}
	
//	public String toString() {
//		return "변수 값 :"+id;
//	}
}
