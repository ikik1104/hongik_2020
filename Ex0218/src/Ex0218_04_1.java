import java.util.Scanner;

public class Ex0218_04_1 {
	
	static int stu_count = 0;
	
	public static void main(String[] args) {
		/* 학생 성적처리 프로그램 10명
		 * 학생 - student class : 학번/이름/국어/영어/수학/합계/평균/등수
		 * [학생 성적처리 프로그램]
		 * 1.성적추가
		 *  - 성적추가를 입력하셨습니다. -> 학번입력하세요 >이름,국영수
		 * 2.성적수정
		 * 	- 수정할 학색의 학번을 입력하세요.>
		 * 	- 1.이름 2.국 3.영 4.수 (수정)
		 * 	- 1. 이름을 입력하세요 > 홍길동 엔터 > 홍길동 이름이 수정되었습니다.
		 //////////////////////////////////////////////////////
		 * 3.성적삭제
		 * 4.성적검색
		 * 0.종료
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
		
		
		
		//첫번째 메인 반복
		while(true) {
			main_print(); //메인출력 메소드 분리
			
			switch (scan.nextInt()) {
			case 1: //메소드 분리
				System.out.println("성적 추가를 선택하셨습니다.");
				insert(stu);//학생 성적추가 메소드 분리
				break;
			case 2:
				System.out.println("성적 수정를 선택하셨습니다.");
				break;
			case 3:
				System.out.println("성적 삭제를 선택하셨습니다.");
				break;
			case 4:
				System.out.println("성적 검색를 선택하셨습니다.");
				break;
			case 5:
				System.out.println("등수처리를 선택하셨습니다.");
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				break;
				
			default:
				break;
			}
		}
	}//main

	static void main_print () {
		System.out.println("---------------------------");
		System.out.println("      [  학생성적프로그램  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. 성적추가           2.성적수정");
		System.out.println("   3. 성적삭제           4.성적검색");
		System.out.println("   5. 등수처리           0.종료");
	}
	
	static void insert(Student[] stu) {
		String insert_name;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입력하세요 (이전화면 : 99)");
			insert_name= scan.next();
			if(insert_name.equals("99")) {
				System.out.println("이전화면으로 이동합니다.");
				break;
			}
			stu[i] = new Student();
			stu[i].num = (Student.first_num += 1);
			stu[i].name = insert_name;
			System.out.println("국어점수를 입력하세요.");
			stu[i].kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			stu[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			stu[i].math = scan.nextInt();
			System.out.println();
			System.out.println();
			stu[i].total();
			stu[i].avg();
			Ex0218_04_1.stu_count++;
			System.out.println(stu_count+"번째 학생:"+stu[i].num);
		}
	}


} //class

