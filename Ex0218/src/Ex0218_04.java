import java.util.Scanner;

public class Ex0218_04 {

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
		String[] sub = {"학번","이름","국어","영어","수학","합계","평균","등급"};
		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
//		Student Student = new Student();
		int select = 0;
		
		loop1:
		while (true) {
			System.out.println("입력 학생 수:" + Student.stu_cnt);
			rank(stu);// 등수처리
			System.out.println("            [학생성적 프로그램]");
			System.out.println("1) 성적추가   2)전체학생성적   3) 성적수정   4)성적삭제    5)성적검색  0) 종료");
			System.out.println("------------------------------------------------------------------");
			
			
			
			select = scan.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("성적 추가를 입력하셨습니다.");
				for (int i = Student.stu_cnt; i < stu.length; i++) {
					stu[i] = new Student();
					System.out.println("이름을 입력하세요   (뒤로가기 99)");
					stu[i].name = scan.next();
					if(stu[i].name.equals("99")) {
						continue loop1;
					}
					System.out.println("국어 점수를 입력하세요");
					stu[i].kor = scan.nextInt();
					System.out.println("영어을 입력하세요");
					stu[i].eng = scan.nextInt();
					System.out.println("수학을 입력하세요");
					stu[i].math = scan.nextInt();
					stu[i].total = stu[i].kor+stu[i].eng+stu[i].math;
					stu[i].avg = stu[i].total/3;
					stu[i].s_num = stu_cnt();
					Student.stu_cnt++;

				}
				break;
			case 2:
				if(Student.stu_cnt == 0) {
					System.out.println("성적이 입력된 학생이 없습니다.");
					continue loop1;
				}
				
				sub(sub); //서브메뉴 출력
//				rank(stu,Student);//등수처리
				
				for (int i = 0; i < Student.stu_cnt; i++) {
					list(stu,i); //출력
					
				}
				break;
			case 3:
				loop2:
				while(true) {
					System.out.println("수정할 학생의 학번을 입력하세요. (뒤로가기 : 0)");
					select = scan.nextInt();
					if(select == 0) {
						continue loop1;
					}
					if(select<1000 || select > Student.num ) {
						System.out.println("존재하지 않는 학번입니다.");
						continue;
					}
					
					
					sub(sub); //서브 메뉴 출력
					
					for (int i = 0; i < Student.stu_cnt; i++) {
						if(stu[i].s_num == select) {
							list(stu,i); //출력
							while(true) {
								System.out.println("수정하실 부분을 선택해 주세요");
								System.out.println("1) 이름    2)국어   3)영어   4)수학  0)뒤로가기");
								select = scan.nextInt();
								switch (select) {
								case 1:
									System.out.println("수정하실 이름을 입력해주세요");
									stu[i].name = scan.next();
									System.out.println("수정이 완료되었습니다.");
									continue loop1;
								case 2:
									System.out.println("수정하실 국어 점수를 입력하세요");
									stu[i].kor = scan.nextInt();
									System.out.println("수정이 완료되었습니다.");
									continue loop1;
								case 3:
									System.out.println("수정하실 영어 점수를 입력하세요");
									stu[i].eng = scan.nextInt();
									System.out.println("수정이 완료되었습니다.");
									continue loop1;
								case 4:
									System.out.println("수정하실 수학 점수를 입력하세요");
									stu[i].math = scan.nextInt();
									System.out.println("수정이 완료되었습니다.");
									continue loop1;
								case 0:
									continue loop2;
								default:
									System.out.println("잘못된 입력입니다.");
									continue;
								}
								//합계
								//평균
								//등수
							}
						}
					}
				}
			case 4:
				System.out.println("삭제하실 학번을 입력하세요");
				break loop1;
			case 5:
				System.out.println("검색하실 학생의 학번을 입력하세요 (뒤로가기 :0)");
				select = scan.nextInt();
				if(select == 0) {
					continue loop1;
				}
				if(select<1000 || select > Student.num ) {
					System.out.println("존재하지 않는 학번입니다.");
					continue;
				}
				
				for (int i = 0; i < Student.stu_cnt; i++) {
					if(select == stu[i].s_num) {
						sub(sub);
						list(stu, i);
					}
				}
				break loop1;
			default:
				System.out.println("잘못된 입력입니다.");
				continue loop1;
			}
			
		}
		
	}
	
	static void insert_stu () {
		
	}
	
	static int stu_cnt () { //학번
		Student.num += 1 ;
		System.out.println("현재 학번 :"+Student.num);
		return Student.num;
	}
	
	static void list (Student[] stu,int i) {//출력
		System.out.print(stu[i].s_num+"\t");
		System.out.print(stu[i].name+"\t");
		System.out.print(stu[i].kor+"\t");
		System.out.print(stu[i].eng+"\t");
		System.out.print(stu[i].math+"\t");
		System.out.print(stu[i].total+"\t");
		System.out.print(stu[i].avg+"\t");
		System.out.println(stu[i].rank);
		System.out.println("----------------------------------------------------------");
	}
	
	static void sub (String[] sub) {
		System.out.println("********************** [  학생 정보   ]  ***********************");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
	}
	
	static void rank (Student[] stu) {
		for (int i = 0; i < Student.stu_cnt; i++) {
			int rank = 1;
			for (int j = 0; j < Student.stu_cnt; j++) {
				if(stu[i].total < stu[j].total) {
					rank++;
				}
			}
			stu[i].rank = rank;
		}
	}
	
}
