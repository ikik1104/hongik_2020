import java.util.Scanner;

public class Ex0224_02 {

	public static void main(String[] args) {
		//2명의 학생 - 홍길동 100,100,90 / 이순신 80,90,70
		Scanner scan = new Scanner(System.in);
		/*
		Student s1 = new Student("홍길동",100,100,90);
		Student s2 = new Student("이순신",80,90,70);
		Student s3 = new Student();
		
		System.out.println(s1.name+" "+s1.kor+" "+s1.eng+" "+s1.math+" "+s1.total+" "+s1.avg);
		System.out.println(s2.name+" "+s2.kor+" "+s2.eng+" "+s2.math+" "+s2.total+" "+s2.avg);
		System.out.println(s3.name+" "+s3.kor+" "+s3.eng+" "+s3.math+" "+s3.total+" "+s3.avg);
		
		*/

		Student[] stu = new Student[2];
		int[] score = new int[3];
		int stu_cnt = 0;
		
		//입력
		stu_cnt = insertArr(stu, score);
		System.out.println("입력된 학생 :"+stu_cnt);
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name+" "+stu[i].kor+" "+stu[i].eng+" "
								+stu[i].math+" "+stu[i].total+" "+stu[i].avg);
		}
		
	}//main
	
	static int insertArr (Student[] stu, int[] score) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입력하세요.");
			String name = scan.nextLine();
			for (int j = 0; j < 3; j++) {
				System.out.println("값을 입력하세요.");
				score[j] = scan.nextInt();
				scan.nextLine();
			}
			stu[i] = new Student(name,score[0],score[1],score[2]);
			cnt++;
		}

		return cnt;
	}
}
