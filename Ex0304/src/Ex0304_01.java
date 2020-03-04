
public class Ex0304_01 {

	public static void main(String[] args) {
		Person p1 = new Person(880101110559L);
		Person p2 = new Person(880101110559L);

		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);

		System.out.println("==���� �� :"+(p1==p2)); //false
		System.out.println("equals�� �� :"+p1.equals(p2)); //�������̵��� ���� ������ false
		// ��ü���� ���� ���� ObjectŬ����(�ְ�����)�� �޼ҵ� �� �ϳ��� equals�� ������� �ؼ� ����ؾ��Ѵ�.
	}
}

class Person{
	
	long id;

	//������
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
//		return "���� �� :"+id;
//	}
}
