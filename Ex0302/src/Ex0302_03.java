import java.util.*;

public class Ex0302_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Stu_info> s = new ArrayList<Stu_info>();
		String[] sub = {"학번","이름","학과","학년","연락처"};
		loop1:
		while(true) {
			System.out.println("1) 학생정보입력      2) 출력      3) 검색");
			System.out.println("-------------------------------------------");
			switch (scan.nextInt()) {
			case 1:
				while(true) {
				System.out.println("학생의 이름을 입력하세요.>> (이전화면 99)");
				String name = scan.next();
				if(name.equals("99")) {
					System.out.println("이전화면으로 돌아갑니다.");
					break;
				}
				System.out.println("학생의 학과를 입력하세요.");
				String major = scan.next();
				System.out.println("학생의 학년을 입력하세요.");
				int grade = scan.nextInt();
				System.out.println("학생의 전화번호를 입력하세요.");
				String tel = scan.next();
				
				s.add(new Stu_info(name,major,grade,tel));
				}
				break;
			case 2:
				if(s.isEmpty()) {
					System.out.println("입력된 데이터가 없습니다.");
					break;
				}
				for (int i = 0; i < sub.length; i++) {
					System.out.print(sub[i]+"\t");
				}
					System.out.println();
				
				
				for (int i = 0; i < s.size(); i++) {
					Stu_info st = (Stu_info)s.get(i);
//					System.out.println(st); -> Stu_info - toString()으로 감
					
					System.out.print(st.hak_num+"\t");
					System.out.print(st.name+"\t");
					System.out.print(st.major+"\t");
					System.out.print(st.grade+"\t");
					System.out.println(st.tel+"\t");
				}
				
				break;
			
			case 3:
				System.out.println("검색할 학생의 이름을 입력하세요.>> (이전화면: 99)");
				String name = scan.next();
				
				if(name.equals("99")) {
					System.out.println("이전화면으로 이동합니다.");
					break;
				}
				
				
				//------상단 출력
				for (int j = 0; j < sub.length; j++) {
					System.out.print(sub[j]+"\t");
				}
				
				for (int i = 0; i < s.size(); i++) {
					Stu_info st = (Stu_info)s.get(i);//다시 Stu_info에 넣기
					if(name.equals(st.name)) {
						System.out.println();
						
						//학생정보 출력
						System.out.println("찾는 학생은");
						System.out.print(st.hak_num+"\t");
						System.out.print(st.name+"\t");
						System.out.print(st.major+"\t");
						System.out.print(st.grade+"\t");
						System.out.println(st.tel+"\t");
					}
				}
//				System.out.println("일치하는 학생이 존재하지 않습니다.");
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}
}
