import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// 숫자 3개를 입력받아 3항식을 써서 제일 큰수 찾기
//		(조건식)?식1:식2 조건식이 맞으면 식 1, 틀리면식2

		int[] num = new int[3];
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세오");
			num[i] = scan.nextInt();
		}
		result = num[0] >= num[1] ? num[0] : num[1];
		result = result >= num[2] ? result : num[2];
		System.out.println(result);

		
		
		
		// ------------알파벳 변환
//		String input="";
//		char result=' '; //사이띄움을 안하면 오류
//		
//		System.out.println("알파벳을 입력하세요");
//		input=scan.nextLine();
//		
//		if(!(input.length()==1)) {
//			System.out.println("다시입력하세오");
//		}
//		
//		char input_1=input.charAt(0);
//		
//		if(input_1>='a'&&input_1<='z') {
////			input=input.toUpperCase();
//			result=(char)(input.charAt(0)-32);
//			
//		}
//		else if(input_1>='A'&&input_1<='Z') {
////			input=input.toLowerCase();
//			result=(char)(input.charAt(0)+32);
//			
//		}else {
//			System.out.println("잘못입력했습니다.");
//		}
//		System.out.println(input);
//		System.out.println(result);
//		
	}

}
