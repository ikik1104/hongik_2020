import java.util.ArrayList;
import java.util.Scanner;

public class Ex0303_06 {

	public static void main(String[] args) {
		/*	1) 학생 정보 입력 stu_info
		 * 		- 학번, 이름, 학과, 학년 
		 * 	2) 학생성적 처리 입력 Student
		 * 		- 학번, 이름(학번입력 후 자동으로 등록되도록), 국어, 영어, 합계, 평균, 등수
		 * 		학번입력 - 없으면 (에러메세지 예외처리)
		 * 	3) 학생정보 출력
		 * 	4) 학생 성적 수정
		 * 	5) 학생 정보 검색  학번, 이름검색
		 * 	6) 학생 성적 검색	  학전, 이름검색
		 * 	0) 종료 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Info in = new Info();
		
		loop:
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1) 학생정보 입력                2) 학생성적 입력 ");
			System.out.println("3) 학생정보 출력                4) 학생성적 출력");
			System.out.println("5) 학생정보 검색                6) 학생성적 검색 ");
			System.out.println("-----------------------------------");
			System.out.println("원하는 번호를 입력하세요. ( 종료 : 0 )  >> ");
			switch (scan.nextInt()) {
			case 1:
				//학생 정보 입력
				in.st_insert();
				break;
			case 2:
				//학생 성적입력
				in.sco_insert();
				break;
			case 3:
				//학생 정보 출력
				in.st_list();
				break;
			case 4:
				//학생 성적 출력
				in.sco_list();
				break;
			case 5:
				//학생 검색
				in.stu();
				break;
			case 6:
				//성적검색
				in.sco();
				break;
			case 0:
				System.out.println("시스템을 종료합니다.");
				break loop;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
		
	}
}

class Info {
	Exception e = new Exception("존재하지 않는 학생입니다.( 학번을 먼저 입력하세요. )");
	ArrayList<Student> st = new ArrayList<Student>();
	ArrayList<Stu_score> sco = new ArrayList<Stu_score>();
	String[] st_sub = {"학번","이름","학과","학년"};
	String[] sco_sub = {"학번","이름","국어","영어","합계","평균","등수"};
	
	
	//학생입력
	void st_insert() {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("학생의 이름을 입력하세요. (뒤로가기 : 99)");
		String name = scan.next();
		if(name.equals("99")) {
			return;
		}
		System.out.println("학생의 학과를 입력하세요");
		String major = scan.next();
		System.out.println("학년을 입력하세요.");
		int grade = scan.nextInt();
		st.add(new Student(name,major,grade));
		System.out.println("****  학생 등록이 완료되었습니다. ****");
		}
	}
	
	//학생 리스트
	void st_list() {
		if(st.isEmpty()) { //비어있으면?
			System.out.println("**** 입력된 학생이 없습니다. ****");
			return;
		}
		//subject출력
		for (int i = 0; i < st_sub.length; i++) {
			System.out.print(st_sub[i]+"\t");
		}
		System.out.println();
		
		//content 출력
		for (int i = 0; i < st.size(); i++) {
			Student s = (Student)st.get(i);
			print_stu(s);//출력
		}
	}
	
	//학생 검색
	void stu() {
		Scanner scan = new Scanner(System.in);
		
		if(st.isEmpty()) { //비어있으면?
			System.out.println("**** 입력된 학생이 없습니다. ****");
			return;
		}
		
		System.out.println("검색 방법을 입력하세요. 1) 학번    2) 이름   (뒤로가기 : 99)");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("학생의 학번을 입력하세요.");
			int hak = scan.nextInt();
			
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				
				if(s.hak_num == hak) {
					for (int j = 0; j < st_sub.length; j++) {
						System.out.print(st_sub[j]+"\t");
					}
					print_stu(s);
					return;
				}
			}
			System.out.println("**** 존재하지 않는 학생의 학번입니다. ****");
			break;
		case 2:
			System.out.println("학생의 학번을 입력하세요.");
			String name = scan.next();
			
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				
				if(s.name == name) {
					for (int j = 0; j < st_sub.length; j++) {
						System.out.print(st_sub[j]+"\t");
					}
					print_stu(s);
					return;
				}
			}
			System.out.println("**** 존재하지 않는 학생의 학번입니다. ****");
			break;
		case 99:
			
			return;

		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
	
	//성적 출력 메소드
		void print_stu(Student s) {
			System.out.print(s.hak_num+"\t");
			System.out.print(s.name+"\t");
			System.out.print(s.major+"\t");
			System.out.println(s.grade+"\t");
		}	
	
	//----------------------------------------------------------------성적 관리-----------------------------------
	
	//학생 성적 입력
	void sco_insert() {	
		Scanner scan = new Scanner(System.in);
		loop2:
		while(true) {
		System.out.println("성적을 입력할 학생의 학번을 입력하세요. (뒤로가기 : 99)");
		int hak = scan.nextInt();
		if(hak == 99) {
			return;
		}
		try {
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				if(hak == s.hak_num) {
					
					//이미 성적입력이 완료된 학생인지 체크
					for (int j = 0; j < sco.size(); j++) {
						Stu_score s1 = (Stu_score)sco.get(i); //형변환
						
						if(s1.hak_num == hak) { //성적리스트에 학번이 있으면
							System.out.println("**** 이미 점수가 등록된 학생입니다 ****");
								return;
						}
					}
					
					System.out.println("국어 점수를 입력하세요.");
					int kor = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					int eng = scan.nextInt();
					sco.add(new Stu_score(s.hak_num,s.name,kor,eng));
					System.out.println("**** "+s.name+"학생의 점수입력이 완료되었습니다. ****");
					rank(); //성적처리
					continue loop2;
				}
			}
			throw e;//여기로 빠져나오면 일치하는 학생이 없는것
			
		} catch (Exception e) {
			System.out.println("ERROR :"+e.getMessage());
		}
		
		} //while
	}
	
	//성적 출력
	void sco_list() {
		

		//입력된 성적이 없으면
		if(sco.isEmpty()) {	
			System.out.println("**** 입력된 학생이 없습니다. ****");
			return;
		}
		
		//subject 출력
		for (int i = 0; i < sco_sub.length; i++) {
			System.out.print(sco_sub[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < sco.size(); i++) {
			Stu_score s = (Stu_score)sco.get(i);
			print_score(s); //출력 메소드
		}
	}
	
	//학생 성적 검색
		void sco() {
			Scanner scan = new Scanner(System.in);
			
			if(sco.isEmpty()) {	//입력된 성적이 없으면
				System.out.println("**** 입력된 학생이 없습니다. ****");
				return;
			}
			
			while(true) {
			System.out.println("검색 방법을 입력하세요. 1) 학번    2) 이름   (뒤로가기 : 99)");
			switch (scan.nextInt()) {
			case 1:
				
				System.out.println("학생의 학번을 입력하세요.");
				int hak = scan.nextInt();
				
				for (int i = 0; i < sco.size(); i++) {
					Stu_score s = (Stu_score)sco.get(i);
					if(s.hak_num == hak) {
						for (int j = 0; j < sco_sub.length; j++) {
							System.out.print(sco_sub[j]+"\t");
						}
						print_score(s); //출력 메소드
						return;
					}
				}
				System.out.println("**** 존재하지 않는 학생의 학번입니다. ****");
				
				break;
			case 2:
				
				System.out.println("학생의 이름을 입력하세요.");
				String name = scan.next();
				
				for (int i = 0; i < sco.size(); i++) {
					Stu_score s = (Stu_score)sco.get(i);
					if(s.name == name) {
						
						for (int j = 0; j < sco_sub.length; j++) {
							System.out.print(sco_sub[j]+"\t");
						}
						print_score(s); //출력 메소드
						return;
					}
				}
				System.out.println("**** 존재하지 않는 학생입니다. ****");
				
				break;
			case 99:
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}
		}
	//성적 출력 메소드
		void print_score(Stu_score s) {
			
			System.out.println();
			System.out.print(s.hak_num+"\t");
			System.out.print(s.name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.total+"\t");
			System.out.print(s.avg+"\t");
			System.out.println(s.rank+"\t");
		}
		
		
	//등수처리
		void rank() {
			for (int i = 0; i < sco.size(); i++) {
				Stu_score s1 = (Stu_score)sco.get(i); //형변환
				int rank = 1;
				for (int j = 0; j < sco.size(); j++) {
						Stu_score s2 = (Stu_score)sco.get(j); //형변환
					if(s1.total < s2.total) {
						rank++;
					}
				}
				s1.rank = rank;
			}
		}
	
}


class Student{
	static int count = 0;
	int hak_num;
	String name;
	String major;
	int grade;
	
	{
		hak_num = ++count;
	}
	
	Student() {
	}
	
	Student(String name, String major, int grade){
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
}


class Stu_score{
	
	int hak_num;
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	int rank;
	
	Stu_score(){
		
	}
	
	Stu_score(int hak_num, String name, int kor, int eng){
		this.hak_num = hak_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total(kor, eng);
		this.rank=0;
	}
	
	void total(int kor, int eng) {
		this.total = kor + eng;
		this.avg = total/2;
	}
	
}


