import java.util.Scanner;

public class Ex0217_03 {

	public static void main(String[] args) {
//		5명의 학생의 이름국영수점수 입력받아 합계 평균내기
		//시,분,초 입력받아 저장을 해보세요,
		//총 10개
//		/*
		Scanner scan = new Scanner(System.in);
		//5명 학생 객체 선언
		Student[] stu = new Student[5];
		
		
		String[] sub = {"이름","국어","영어","수학","합계","평균"} ;
		
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
			System.out.println("이름입력");
			stu[i].name = scan.nextLine();
			System.out.println("국어 점수를 입력하세요.");
			stu[i].kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			stu[i].eng = scan.nextInt();
			System.out.println("수학 점수를 입력하세요.");
			stu[i].math = scan.nextInt();
			scan.nextLine();
			stu[i].total();
			stu[i].avg();
			
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor + "\t");
			System.out.print(stu[i].eng + "\t");
			System.out.print(stu[i].math + "\t");
			System.out.print(stu[i].total + "\t");
			System.out.println(stu[i].avg + "\t");
		}
		
		
			/*
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"점수 입력");
				score[i][j] = scan.nextInt();
				
				score[i][score[i].length-1] += score[i][j];
			}
			avg[i] = score[i][score[i].length-1] /3;
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
		
//		*/
		
		
		/*
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv2 tt1 = new Tv2();
		
		t2 = t1;
		
		t1.channel = 10;
		
		System.out.println(t2.channel);
		*/
		
		/*
    	 //tv2 class
		//volume 변수를 만들고.. main 메소드레어 변수에 10을 저장해보세요.
		//volume Up,Down 만들어보세요.
		
		Tv2 t2 = new Tv2();
		t2.volume = 10;
		
		t2.volumeUp();
		t2.volumeDown();
		*/
		
		/*
		Tv t = new Tv();
		t.channelUp();
		System.out.println(t.power);
		t.power = true;
		*/
		
		
		/*
		Student stu1 = new Student();
		stu1.name="홍길동";
		stu1.kor = 100;
		stu1.eng = 100;
		stu1.math = 90;
		stu1.total = stu1.kor+stu1.eng+stu1.math;
		stu1.avg = stu1.total/3;
		stu1.rank = 1;
		
		System.out.println(stu1.name+" "+stu1.kor+" "+stu1.eng+" ");
		*/
		
		
	}
}
