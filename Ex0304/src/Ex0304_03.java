import java.util.Scanner;

public class Ex0304_03 {
	public static void main(String[] args) {
		
	
		
		Card c1 = new Card("홍길동","마케팅","사원",100,3,1,"01033332222");
		Card c2 = new Card("홍길동2","마케팅2","사원3",100,3,1,"01033332222");
		Card c3 = new Card("홍길동3","마케팅3","사원2",100,3,1,"01033332222");
		//3명의 직원을 입력하고 toString을 오버라이딩해서 출력을 해보세요.
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
	}
}

class Card{
	static int num = 0;
	int id_num;
	String name;
	String department;
	String position; //직책
	int salary; //월급
	int period; //근무기간
	int v_count;//년차
	String tel;//전화번호
	
	{
		id_num = ++num;
	}
	Card(){
	
	}
	
	Card(String name, String department,String position, int salary, int period, int v_count, String tel){
		this.name = name;
		this.department = department;
		this.position = position;
		this.salary =salary;
		this.period = period;
		this.v_count = v_count;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return id_num+"\t"+
				name+"\t"+
				department+"\t"+
				position+"\t"+
				salary+"\t"+
				period+"\t"+
				v_count+"\t"+
				tel;
	}
}