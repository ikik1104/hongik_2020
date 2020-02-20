
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
		//더하기 리턴
		a.result =  add1(a.x,a.y,a.z);
		System.out.println(a.result);
		//더하기
		add2(a);
		System.out.println(a.result);
		//빼기 리턴
		a.result =  sub1(a.x,a.y,a.z);
		System.out.println(a.result);
		//빼기
		sub2(a);
		System.out.println(a.result);
		//곱하기 리턴
		a.result =  mult1(a.x,a.y,a.z);
		System.out.println(a.result);
		//곱하기
		mult2(a);
		System.out.println(a.result);
		//나누기 리턴
		a.result =  div1(a.x,a.y,a.z);
		System.out.println(a.result);
		//나누기
		div2(a);
		System.out.println(a.result);
		*/
//		sub();
//		mult();
//		div();
//		
		//add1 -> a,b,c 더해서 값을 리턴받아서 result에 넣어보세요
		//add2 -> 리턴없이 주소값 넘겨서 result에 값을 넣어보세요
	}
	
	static void rule(Arith a,int[] rule) {
		rule[0] = a.x+a.y+a.z;
		rule[1] = a.x-a.y-a.z;
		rule[2] = a.x*a.y*a.z;
		rule[3] = a.x/a.y/a.z;
	}
	
	/*
	//x,y,z 값 받아서 더하기,빼기,곱하기,나누기 4개의 값을 리턴받아서 출력하세요.
	static int[] rule1(int a, int b, int c) {
		int[] rule = new int[4];
		rule[0] = a+b+c;
		rule[1] = a-b-c;
		rule[2] = a*b*c;
		rule[3] = a/b/c;
		
		return rule;
	}
	
	//리턴안하고 변수에 값을 반환하여 출력
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
	
	//덧셈 리턴
	static int add1(int a, int b, int c){
		int result = 0;
		result = a+b+c;
		return result;
	}
	//덧셈 void
	static void add2(Arith a){
		a.result = a.x + a.y + a.z;
	}
	
	//뺄셈 리턴
	static int sub1(int a, int b, int c){
		int result = 0;
		result = a-b-c;
		return result;
	}
	
	//뺄셈 void
	static void sub2(Arith a){
		a.result = a.x - a.y - a.z;
	}
	
	//곱하기 리턴
	static int mult1(int a, int b, int c){
		int result = 0;
		result = a*b*c;
		return result;
	}
	
	//곱하기 void
	static void mult2(Arith a){
		a.result = a.x * a.y * a.z;
	}
	
	//나누기 리턴
	static int div1(int a, int b, int c){
		int result = 0;
		result = a/b/c;
		return result;
	}
	//나누기 void
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