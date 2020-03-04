
public class Ex0304_02 {

	public static void main(String[] args) {
		People p1 = new People(10001);
		People p2 = new People(10001);
		//equals 메소드를 사용해서 비교
	
		System.out.println("=을 사용 : "+(p1==p2));
		System.out.println("equals를 사용 :"+p1.equals(p2));
	}
}

class People{
	int stu_number;
	
	People(){/*기본생성자*/}
	People(int stu_number){
		this.stu_number = stu_number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof People) {
			return stu_number == ((People)obj).stu_number;
		}
		return false;
	}
}