import java.util.Scanner;

public class Ex0219_06 {

	public static void main(String[] args) {
		//1.학생 점수 입력
		//2. 학생수정
		//3. 학생삭제
		//4. 학생 검색
		//5. 등수처리
		//6.종료
		Scanner scan = new Scanner(System.in);
		
		Student[] stu = new Student[2];
		
		
		double avg;
		
		while(true) {

		
		System.out.println("---------------------------");
		System.out.println("      [  학생성적프로그램  ]     ");
		System.out.println("---------------------------");
		System.out.println("   1. 성적추가           2.성적수정");
		System.out.println("   3. 성적삭제           4.성적검색");
		System.out.println("   5. 등수처리           6.종료");
		
		int select = scan.nextInt();
		switch (select) {
		case 1:
			inputArr(stu);
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;

		default:
			break;
		}
		
		
		
	}
		

//		Lotto[] l = new Lotto[45];
//		for (int i = 0; i < l.length; i++) {
//			l[i] = new Lotto(i+1);
//			System.out.println(l[i].number);
//		}
//		
		/* 카드만들기
		
		//Card 52장의 객체 배열을 만들어서
		//1~13 까지, 클로버, 다이아몬드,하트,스페이스
		//만들어보세요.
		
		Card[] c = new Card[52];
		String[] kind = {"클로버","다이아몬드","하트","스페이스"};

		
		
		//방법1
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card();
				c[(i*13)+j].number = j+1;
				c[(i*13)+j].kind = kind[i];
			}
		}
		
		//방법2
		for (int i = 0; i < kind.length; i++) {
			for (int j = 0; j < 13; j++) {
				c[(i*13)+j] = new Card(j+1,kind[i]);
			}
		}
		
		//출력
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].number+" "+c[i].kind);
		}
		
		
		*/
		
//		Card cc1 = new Card();
		
//		Card c1 = new Card();
//		c1.number = 10;
//		c1.kind = "클로버";
//		System.out.println(c1.number);
		
		
	}
	
	static void inputArr(Student[] stu) {
		Scanner scan = new Scanner(System.in);
		int kor=0,eng=0,math=0,total=0;
		String name = "";
		
		System.out.println("학생성적 추가를 선택하셨습니다.");
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
			System.out.println(stu[i].name+" "+stu[i].total+"  "+stu[i].avg);
		}
	}
}
