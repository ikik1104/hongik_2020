import java.util.Scanner;

public class Ex0217_05_1 {
 public static void main(String[] args) {
	//번호 제목 내용 작성자 조회수
	 //1개 입력후 모두 출력
	 //2개 입력후 모두 출력
	 //...
	 Scanner scan = new Scanner(System.in);
	 
	 String[] sub = {"글번호","작성자","제목","내용","조회수"};
	 Board[] board = new Board[5];
	 int select;
	 int b_num= 0;
//1)게시판 리스트,글보기 2)글쓰기 3.글삭제 4글수정 0종료
	 
	 loop1:
	 while(true) {
	 
	 System.out.println("1)게시판리스트   2)글쓰기   3)글삭제   4)글수정  0)종료");
	 select = scan.nextInt();
	 
	 
	 switch (select) {
	case 1:
		if(b_num== 0) {
			System.out.println("작성된 게시물이 없습니다.");
			continue loop1;
		}
		for (int j = 0; j < sub.length; j++) {
			System.out.print(sub[j]+"\t");
		}
		System.out.println();
		for (int i = 0; i < b_num; i++) {
			board[i]= new Board(); 
			board[i].list();
		}
		
		System.out.println("조회하실 게시물 번호를 입력하세요.");
		select = scan.nextInt();
		
		break;
	case 2:
		board[b_num]= new Board(); 
		board[b_num].num = b_num+1;
		System.out.println("작성자를 입력하세요.");
		board[b_num].name = scan.next();
		System.out.println("제목을 입력하세요.");
		board[b_num].title = scan.next();
		System.out.println("내용을 입력하세요.");
		board[b_num].content = scan.next();
		b_num++;
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	case 5:
		
	break;

	default:
		break;
	}
	 }
}
}
