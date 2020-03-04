import java.util.Scanner;

public class Ex0304_03 {
	public static void main(String[] args) {
		
	
		
		Card c1 = new Card("ȫ�浿","������","���",100,3,1,"01033332222");
		Card c2 = new Card("ȫ�浿2","������2","���3",100,3,1,"01033332222");
		Card c3 = new Card("ȫ�浿3","������3","���2",100,3,1,"01033332222");
		//3���� ������ �Է��ϰ� toString�� �������̵��ؼ� ����� �غ�����.
		
		
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
	String position; //��å
	int salary; //����
	int period; //�ٹ��Ⱓ
	int v_count;//����
	String tel;//��ȭ��ȣ
	
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