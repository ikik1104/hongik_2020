import java.util.Scanner;

public class Ex0217_05 {
 public static void main(String[] args) {
	//번호 제목 내용 작성자 조회수
	 //1개 입력후 모두 출력
	 //2개 입력후 모두 출력
	 //...
	 Scanner scan = new Scanner(System.in);
	 int b_num = 0;
	 String[] sub = {"글번호","작성자","제목","내용","조회수"};
	 Board[] board = new Board[5];
	 
	 for (int i = 0; i < board.length; i++) {
		board[i]= new Board(); 
//		System.out.println("번호를 입력하세요.");
//		board[i].num = scan.nextInt();
		board[i].num = b_num+1;
		System.out.println("작성자를 입력하세요.");
		board[i].name = scan.next();
		System.out.println("제목을 입력하세요.");
		board[i].title = scan.next();
		System.out.println("내용을 입력하세요.");
		board[i].content = scan.next();
		b_num++;
		
		
		
		System.out.println("--------------------------------------");
		System.out.println("             [ 글 리스트 출력 ]");
		System.out.println("--------------------------------------");
		for (int j = 0; j < sub.length; j++) {
			System.out.print(sub[j]+"\t");
		}
		System.out.println();
		for (int j = 0; j < b_num; j++) {
			board[j].list();
		}
	}
	 
}
}
