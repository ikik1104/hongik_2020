
public class Ex0220_03 {
	public static void main(String[] args) {
		
		Arith a = new Arith();
		a.x = 60;
		a.y = 10;
		a.z = 2;
		int add = 0;
		int sub = 0;
		int mult = 0;
		int div = 0;
		int[] rule = new int[4];
		
		rule(a,rule);
		
		add = rule[0];
		sub = rule[1];
		mult = rule[2];
		div = rule[3];
		
//		/*
//		rule = rule1(a.x,a.y,a.z);
		for (int i = 0; i < rule.length; i++) {
			System.out.println(rule[i]);
		}
		
//		rule2(a);
		
		/*
		//���ϱ� ����
		a.result =  add1(a.x,a.y,a.z);
		System.out.println(a.result);
		//���ϱ�
		add2(a);
		System.out.println(a.result);
		//���� ����
		a.result =  sub1(a.x,a.y,a.z);
		System.out.println(a.result);
		//����
		sub2(a);
		System.out.println(a.result);
		//���ϱ� ����
		a.result =  mult1(a.x,a.y,a.z);
		System.out.println(a.result);
		//���ϱ�
		mult2(a);
		System.out.println(a.result);
		//������ ����
		a.result =  div1(a.x,a.y,a.z);
		System.out.println(a.result);
		//������
		div2(a);
		System.out.println(a.result);
		*/
//		sub();
//		mult();
//		div();
//		
		//add1 -> a,b,c ���ؼ� ���� ���Ϲ޾Ƽ� result�� �־����
		//add2 -> ���Ͼ��� �ּҰ� �Ѱܼ� result�� ���� �־����
	}
	
	static void rule(Arith a,int[] rule) {
		rule[0] = a.x+a.y+a.z;
		rule[1] = a.x-a.y-a.z;
		rule[2] = a.x*a.y*a.z;
		rule[3] = a.x/a.y/a.z;
	}
	
	/*
	//x,y,z �� �޾Ƽ� ���ϱ�,����,���ϱ�,������ 4���� ���� ���Ϲ޾Ƽ� ����ϼ���.
	static int[] rule1(int a, int b, int c) {
		int[] rule = new int[4];
		rule[0] = a+b+c;
		rule[1] = a-b-c;
		rule[2] = a*b*c;
		rule[3] = a/b/c;
		
		return rule;
	}
	
	//���Ͼ��ϰ� ������ ���� ��ȯ�Ͽ� ���
	static void rule2(Arith a) {
		Ex0220_03 e = new Ex0220_03();
		e.add = a.x+a.y+a.z;
		e.sub = a.x-a.y-a.z;
		e.mult = a.x*a.y*a.z;
		e.div = a.x/a.y/a.z;
		System.out.print(e.add+" "+e.sub+" "+e.mult+" "+e.div);
		System.out.println();
	}
	*/
	
	//���� ����
	static int add1(int a, int b, int c){
		int result = 0;
		result = a+b+c;
		return result;
	}
	//���� void
	static void add2(Arith a){
		a.result = a.x + a.y + a.z;
	}
	
	//���� ����
	static int sub1(int a, int b, int c){
		int result = 0;
		result = a-b-c;
		return result;
	}
	
	//���� void
	static void sub2(Arith a){
		a.result = a.x - a.y - a.z;
	}
	
	//���ϱ� ����
	static int mult1(int a, int b, int c){
		int result = 0;
		result = a*b*c;
		return result;
	}
	
	//���ϱ� void
	static void mult2(Arith a){
		a.result = a.x * a.y * a.z;
	}
	
	//������ ����
	static int div1(int a, int b, int c){
		int result = 0;
		result = a/b/c;
		return result;
	}
	//������ void
	static void div2(Arith a){
		a.result = a.x / a.y / a.z;
	}
}

class Arith{
	int x;
	int y;
	int z;
	int result;
	int result2;
	int result3;
	int result4;

}