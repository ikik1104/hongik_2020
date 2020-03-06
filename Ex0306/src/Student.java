//Ex0304_01 <->
public class Student {
	int hak_num;
	String name;
	int total;
	
	Student(){}
	
	Student(int hak_num, String name, int total){
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}

	public String toString() {
		return "학번 : "+hak_num+
				" 이름 :"+name+
				" 총점 :"+total;
	}

//	@Override
//	public int compareTo(Student o) { //리턴이 하나밖에 없어서 한가지 방법밖에 할 수 가 없다.
//		return this.name;
//	}
}
