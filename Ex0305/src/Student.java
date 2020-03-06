
public class Student implements Comparable<Student> {
	int hak_num;
	String name;
	int total;
	
	Student(){
		
	}
	Student(int hak_num, String name, int total){
		this.hak_num = hak_num;
		this.name = name;
		this.total = total;
	}
	
	public String toString() {
		return "학번 : "+hak_num+", 이름 : "+name+", 합계 : "+total;
	}
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
//		return this.name.compareTo(s.name); //순서 바꿀때 사용하는것 더 클때1, 같을때 0,작을때 -1 이름으로 리턴
		
//		if(this.total < s.total) {
//			return -1;
//		}else if(this.total > s.total) {
//			return 1;
//		}
//		return 0;
//	}
	
		if(this.hak_num > s.hak_num) {
			return -1;
		}else if(this.hak_num < s.hak_num) {
			return 1;
		}
		return 0;
	}
		
	
}
