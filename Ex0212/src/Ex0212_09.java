import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {
		// 게시판 프로그램
		// 번호(순차적 ) 이름 제목 글내용 (String) 조회수 (int)
		
		
		//10개까지 입력가능 -> 1개만하고 물어본다 더 쓸건지.
		//1) 글쓰기, 2 목록- 리스트 1) 읽기,2)수정,3)삭제
		Scanner scan = new Scanner(System.in);
//		int[] num = new int[2];
		String[] sub = {"글번호","이름","제목","글내용","조회수"};
		String[][] bor = new String[2][4];
		int count = 0;
		int b_count = 0;
		

		while(true) {
		for (int i = 0; i < bor.length; i++) {
//			 num[i] = i+1;
			for (int j = 0; j < bor[i].length-1; j++) {
				System.out.println(sub[j+1]+"를 입력하세요.");
				bor[i][j] = scan.nextLine();
			}
			bor[i][bor[i].length-1] = "0";
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t\t");
		}
		System.out.println();
		for (int i = 0; i < bor.length; i++) {
//			글번호
			System.out.print((i+1)+"\t\t");
			for (int j = 0; j < bor[i].length; j++) {
				
				System.out.print(bor[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		}
		
		
	}
}
