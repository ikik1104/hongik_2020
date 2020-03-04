import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

//Student class
public class Ex0302_02 {
	public static void main(String[] args) {
		// Student 객체
		// 학생 10명
		// 성적처리프로그램
		// 기존 - Student[] stu = new Student[10];
		// ---> Vector list = new Vector();

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>(); //student 객체만 들어올 수 있다.
		
		String[] name1 = {"홍길동","이순신","김유신"};
		int[] kor1 = {100,90,95};
		int[] eng1 = {80,70,89};

		list.add(new Student(name1[0],kor1[0],eng1[0]));
		list.add(new Student(name1[1],kor1[1],eng1[1]));
		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
		if(list.isEmpty()) {
			System.out.println("입력된 학생이 없습니다.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				System.out.print(s.hak_num+"\t"); 
				System.out.print(s.name+"\t"); 
				System.out.print(s.kor+"\t"); 
				System.out.print(s.eng+"\t"); 
				System.out.print(s.total+"\t"); 
				System.out.print(s.avg+"\t"); 
				System.out.println(s.rank);

			}
		}
		
		/*
		while(true) {
			
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("국어 점수를 입력하세요");
		int kor = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = scan.nextInt();
		
		list.add(new Student(name, kor, eng)); //백터에 넣음
		System.out.println("성적 추가가 완료되었습니다.");
		
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.name + ","+ stu.kor);
		}

		}
		*/
		
		
	}
}

