import java.util.Scanner;

public class Ex0219_07 {


	public static void main(String[] args) {
		//1.학생 점수 입력
		//2. 학생수정
		//3. 학생삭제
		//4. 학생 검색
		//5. 등수처리
		//6.종료
		Scanner scan = new Scanner(System.in);
		
		Student[] stu = new Student[3];
		String name = "";
		String[] sub = {"이름","국어","영어","수학","합계","평균","등수"};
		int kor=0,eng=0,math=0,total=0, select = 0;
		double avg;
		
		loop1:
		while(true) {
		
		print(); //메뉴 프린트
		select = scan.nextInt();
		switch (select) {
		case 1: //성적입력
			System.out.println("학생성적 추가를 선택하셨습니다.");
			insert(stu,name,kor,eng,math);
			break;
		case 2://학생 수정
			if(Student.s_cnt == 0) {
				System.out.println("등록된 학생이 없습니다.");
				break;
			}
			
			System.out.println("정보를 수정할 학생의 이름을 입력해주세요. (뒤로가기 99)");
			name = scan.next();
			loop3:
			for (int i = 0; i < stu.length; i++) {
				if(stu[i].name.equals(name)) {
//					for (int j = 0; j < sub.length; j++) {
//						System.out.print(sub[i]+"\t");
//					}
//					System.out.println();
//					System.out.println(stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+
//				stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
					
					System.out.println(stu[i].name+"이 검색되었습니다. 수정하실 부분을 입력해주세요.");
					System.out.println("1.국어  2.영어   3.수학");
					
					switch (scan.nextInt()) {
					case 1:
						System.out.println("변경점수를 입력하세요. >>");
						stu[i].kor = scan.nextInt();
						scan.nextLine();
						System.out.println("국어점수 "+stu[i].kor+"변경되었습니다.");
						continue loop1;
					case 2:
						System.out.println("변경점수를 입력하세요. >>");
						stu[i].eng = scan.nextInt();
						scan.nextLine();
						System.out.println("영어점수 "+stu[i].eng+"변경되었습니다.");
						continue loop1;
					case 3:
						System.out.println("변경점수를 입력하세요. >>");
						stu[i].math = scan.nextInt();
						scan.nextLine();
						System.out.println("수학점수 "+stu[i].math+"변경되었습니다.");
						continue loop1;
					default:
						System.out.println("잘못된 입력입니다.");
						continue loop1;
					}
				}
			}
			System.out.println("일치하는 학생이 없습니다.");
			break;
		case 3://학생 삭제
			
			break;
		case 4://학색 검색
			System.out.println("검색하실 학생의 이름을 입력해주세요.");
			name = scan.next();
			for (int i = 0; i < stu.length; i++) {
				if(stu[i].name.equals(name)) {
					stu_1(sub, stu,i);
				}
			}
			break;
		case 5://등수처리
			
			break;
		case 6://학생목록
			if(Student.s_cnt == 0) {
				System.out.println("입력된 학생이 없습니다.");
				continue loop1;
			}
			for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].name+"\t"+stu[i].kor+"\t"+stu[i].eng+"\t"+
					stu[i].math+"\t"+stu[i].total+"\t"+stu[i].avg+"\t"+stu[i].rank);
		}
			continue loop1;

		default:
			System.out.println("잘못입력하였습니다.");
			break;
		}
	}
		
		
	}//main
	
	
	static void print() {
		System.out.println("---------------------------");
		System.out.println("      [  학생성적프로그램  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. 성적추가           2.성적수정");
		System.out.println("   3. 성적삭제           4.성적검색");
		System.out.println("   5. 등수처리           6.학생 목록");
	}
	
	//학생입력
	static void insert(Student[] stu,String name,int kor,int eng,int math) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름을 입력하세요");
			name = scan.next();
			System.out.println("국어점수를 입력");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력");
			math = scan.nextInt();
			stu[i] = new Student(name,kor,eng,math);
			Student.s_cnt += 1;
//			System.out.println(stu[i].name+" "+stu[i].total+"  "+stu[i].avg);
		}
	}
	
	//학생 한명의 정보
	static void stu_1(String[] sub, Student[] stu, int num) {
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		System.out.println(stu[num].name+"\t"+stu[num].kor+"\t"+stu[num].eng+"\t"+
				stu[num].math+"\t"+stu[num].total+"\t"+stu[num].avg+"\t"+stu[num].rank);
		
	}
	
	
}
