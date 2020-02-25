
public class Ex0225_02 {

	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		String[] name = {"홍길동","이순신","김유신"};
		int[] grade = {3,4,1};
		
		/*
		
		stu[0] = new Student(name[0],grade[0]);
		stu[1] = new Student(name[1],grade[1]);
		stu[2] = new Student(name[2],grade[2]);
		
		*/
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student(name[i],grade[i]);
		}
		
		//lotto라는 45 개 배열을 만들어서 1~45까지 숫자를 넣어보세요.
		int[] lotto  = new int[45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		//lotto 객체를 만들어서 객체에서 1~45까지 숫자가 들어가서
		//만들어 질 수 있도록 해보세요.
		//선언만하면 1~45까지 들어가있는 lotto가 생성될수있도록

		Lotto lo = new Lotto();
		for (int i = 0; i < lo.ball.length; i++) {
			System.out.println(lo.ball[i]);
		}
		
		
	}
}


