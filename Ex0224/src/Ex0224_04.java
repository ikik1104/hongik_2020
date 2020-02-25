import java.util.Scanner;

public class Ex0224_04 {

	public static void main(String[] args) {
		/* 3명의 학생을 입력받아서
		 * 학번, 이름, 국어, 영어, 수학, 합계, 평균, 등수
		 * 학번은 1에서 1씩증가 - 자동입력되도록
		 * 입력부분은 메소드로 분리
		 * 출력부분 메소드로 분리
		 * 등수 출력 메소드로 분리
		 * 1. 학생성적입력
		 * 2. 학생성적출력
		 * 3. 학생성적수정
		 * 4. 학생등수입력
		 * 5. 종료
		 * while문으로 반복
		 * */
		Scanner scan = new Scanner(System.in);
		Student2[] stu = new Student2[5];
		String[] sub = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		loop1:
		while(true) {
			System.out.println("1. 학생성적입력        2. 학생성적출력");
			System.out.println("3. 학생성적수정        4. 학생등수입력");
			System.out.println("5. 종료 ");
			int select = scan.nextInt();
			
			switch (select) {
			case 1:
				input_stu(stu,sub);
				System.out.println("학생성적 입력완료");
				System.out.println("-------------------------------");
				break;
			case 2:
				print_stu(stu,sub);
				System.out.println("-------------------------------");
				break;
			case 3:
				update_stu(stu);
				System.out.println("학생 정보수정완료");
				System.out.println("-------------------------------");
				break;
			case 4:
				rank_stu(stu);
				System.out.println("***** 등수처리가 완료되었습니다. *****");
				System.out.println("-------------------------------");
				break;
			case 5:
				System.out.println("시스템을 종료합니다.");
				break loop1;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}//main
	//학생 입력하기
	static void input_stu(Student2[] stu,String[] sub){
		Scanner scan = new Scanner(System.in);
		int[] score = new int[3];
		String name = "";
		loop2:
		while(true) {
			if(Student2.num == stu.length) {
				System.out.println("입력가능한 학생 수 "+Student2.num+"명이 초과하였습니다.");
				break;
			}
		for (int i = Student2.num; i < stu.length; i++) {
			System.out.println("현재 입력학생 수 :"+Student2.num);
			System.out.println("이름을 입력하세요  (뒤로가기: 99)");
			name = scan.next();
			if(name.equals("99")) {
				break loop2;
			}
			for (int j = 0; j < score.length; j++) {
				System.out.println(sub[j+2]+"점수를 입력하세요");
				score[j] = scan.nextInt();
			}
			stu[i] = new Student2(name,score[0],score[1],score[2]);
		}
		}//while
	}
	//학생 출력하기
	static void print_stu(Student2[] stu,String[] sub){
		//sub 출력
		if(Student2.num == 0) {
			System.out.println("입력된 학생이 없습니다.");
		}else {
			for (int i = 0; i < sub.length; i++) {
				System.out.print(sub[i]+"\t");
			}
			System.out.println();
			
			for (int i = 0; i < Student2.num; i++) {
				System.out.println(stu[i].hak_num+"\t"+stu[i].name+"\t"+stu[i].kor+"\t"+
						stu[i].eng+"\t"+stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
			}
		}
	}
	//성적수정
	static void update_stu(Student2[] stu){
		System.out.println("학생성적수정");
		Scanner scan = new Scanner(System.in);
		if(Student2.num == 0) {
			System.out.println("입력된 학생이 없습니다.");
		}else {
			System.out.println("수정하실 학생의 이름을 입력하세요.");
			String name = scan.next();
			int cnt = 0;
			
			for (int i = 0; i < Student2.num; i++) {
				
				if(stu[i].name.equals(name)) {
					System.out.println("1) 이름수정           2) 국어 점수수정");
					System.out.println("3) 영어 점수수정    4) 수학 점수수정");
					int select = scan.nextInt();
					cnt++;
					switch (select) {
					case 1:
						System.out.println("변경하실 이름을 입력하세요. (현재 이름 :"+stu[i].name+")");
						stu[i].name = scan.next();
						break;
					case 2:
						System.out.println("변경하실 국어 점수를 입력하세요.(현재 국어점수 :"+stu[i].kor+")");
						stu[i].kor = scan.nextInt();
						stu[i].modify();
						break;
					case 3:
						System.out.println("변경하실 영어 점수를 입력하세요.(현재 영어점수 :"+stu[i].eng+")");
						stu[i].eng = scan.nextInt();
						stu[i].modify();
						break;
						
					case 4:
						System.out.println("변경하실 수학 점수를 입력하세요.(현재 수학점수 :"+stu[i].math+")");
						stu[i].math = scan.nextInt();
						stu[i].modify();
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						break;
					}//switch
					
				}//if
				rank_stu(stu);
			}
			if(cnt == 0) {
				System.out.println("일치하는 학생이 존재하지 않습니다.");
			}
			
		}

		
	}
	
	//등수입력
	static void rank_stu(Student2[] stu){
		for (int i = 0; i < Student2.num; i++) {
			int rank = 1;
			for (int j = 0; j < Student2.num; j++) {
				if(stu[i].total < stu[j].total ) {
					rank++;
				}
			}
			stu[i].rank = rank;
		}
	}
}
