import java.util.Scanner;

public class Ex0214_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제를 입력해서 영문, 한글 5개씩 입력받아서 문제풀이.
		// 영단어 맞추기 게임
		// 영어- 한글설명
		// 1.문제입력
		// 2.문제풀이
		// 0.이전화면

		// words[5][2]
		int input = 0;
		String[][] words = new String[10][2];
		String in_str = "";// 문제풀이용 인풋..
		int count = 0;// 도전기회용
		int words_num=0;//문제번호
		String eng="";//영어입력변수
		int count1=0;
		int ex_num=0;//문제풀이 변수
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			System.out.println("--------");
			System.out.println("퀴즈 프로그램");
			System.out.println("--------");
			System.out.println("번호를 입력하세요");
			System.out.println("1.문제입력");
			System.out.println("2.문제풀이");
			System.out.println("0.종료");
			input = scan.nextInt();

			s_loop:
				switch (input) {
			case 0:
				System.out.println("프로그램을 종료합니다");
				break loop;
			case 1:
				System.out.println("문제입력을 시작압니다");
				for (int i = 0; i < words.length; i++) {
					System.out.println("----------------");
					System.out.println("영단어를 입력해주세요");
					eng = scan.next();
					if(eng.equals("99")) {
						System.out.println("이전화면으로 이동합니다");
						break s_loop;
					}
					words[i][0]=eng;
					System.out.println("뜻을 입력해주세요");
					words[i][1] = scan.next();
					words_num++;
					if(words_num==10) {
						System.out.println("10개가 모두 입력되었습니다. 더이상 입력할수 없습니다.");
					}
				}
//				System.out.println("문제입력을 시작압니다");
//				for (int i = 0; i < words.length; i++) {
//					System.out.println("영단어를 입력해주세요");
//					words[i][0] = scan.next();
//					System.out.println("뜻을 입력해주세요");
//					words[i][1] = scan.next();
//				}
				System.out.println("문제입력을 완료했습니다. 선택창으로 돌아갑니다.");
				continue loop;
			case 2:
				System.out.println("문제풀이를 시작합니다");
					
				for (int i = ex_num; i < words.length; i++) {
					System.out.println(words[i][0] + "은 무엇일까요?");
					in_str = scan.next();
					if(in_str.equals("99")) {
						System.out.println("이전화면으로 이동합니다");
						break;
					}
					if (words[i][1].equals(in_str)) {
						System.out.println("정답입니다. 다음문제!");
					} else {
						if (count < 2) {
							System.out.println((count + 1) + "차시도 오답입니다. 다시풀어보세요");
							i--;
							count++;
							continue;
						}
						System.out.println((count + 1) + "차시도 오답입니다. 다음문제로 넘어갑니다");
						ex_num++;
						count = 0;
					}
				}
				System.out.println("문제풀이를 모두 하였습니다.");
				System.out.println("1)종료 2)선택창");
				input=scan.nextInt();
				switch(input) {
				case 1:
					System.out.println("프로그램을 종료합니다.");
					break loop;
				case 2:
					continue loop;
				default:
					System.out.println("잘못 입력하였습니다");
					continue;
				}
			default:
				System.out.println("잘못 입력하였습니다");
				continue;

			}// switch
		}
//			
//			
//		for (int i = 0; i < words.length; i++) {
//			System.out.println(words[i][0] + "뜻은 무엇일까요?");
//			in_str = scan.nextLine();
//			if (words[i][1].equals(in_str)) {
//				System.out.println("정답입니다. 다음문제 도전!");
//			} else {
//				if (count < 2) {
//					// 횟수가 0,1,2해서 총 3번이된다요..
//					System.out.println((count + 1) + "번째 오답입니다.");
//					i--;
//					count++;
//					continue;
//				} else {
//					System.out.println("오답입니다. 정답은?" + words[i][1]);
//					count = 0;// 초기화
//				}
//			}
//		}

//		// 영단어 맞추기 게임
//		// 영어- 한글설명
//		// 1.영어,한글 데이터 입력- 미리 입력만듬.
//		// 2.영어 출력후 한글 입력받음
//		// 3.한글이 맞는지? 확인
//		// 4.결과출력
//		// 5.다시 문제출력
//
//		// words[3][2]
//		String[][] words = { { "chair", "의자" }, { "computer", "컴퓨터" }, { "array", "배열" } };
//		String in_str = "";
//		Scanner scan = new Scanner(System.in);
//		int count = 0;
//
//		for (int i = 0; i < words.length; i++) {
//			count=0;//초기화
//			System.out.println(words[i][0] + "뜻은 무엇일까요?");
//			in_str = scan.nextLine();
//			if (words[i][1].equals(in_str)) {
//				System.out.println("정답입니다. 다음문제 도전!");
//			} else {
//				if (count < 2) {
//					// 횟수가 0,1,2해서 총 3번이된다요..
//					System.out.println((count+1)+"번째 오답입니다.");
//					i--;
//					count++;
//					continue;
//				} else {
//					System.out.println("오답입니다. 정답은?" + words[i][1]);
//				}
//			}
//		}
	}// main

}// class
