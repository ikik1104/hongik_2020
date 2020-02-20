import java.util.Scanner;

public class Ex0204_05 {
	public static void main(String[] args) {
		
		//1~100숫자중 입력값이랑 랜덤값이랑 비교를해서 입력값이 크면 "랜덤숫자는 입력값보다 작습니다 크면 큽니다하고 다시 입력할수 있게 반복
		
		Scanner scan = new Scanner(System.in);
		String save ="";
		int ran = (int)(Math.random()*100)+1;
//		/*
		System.out.println("1~100까지의 숫자중 하나를 고르세요. (0을 입력하면 프로그램이 종료됩니다.)");
		while(true) {
			
			int input_num = scan.nextInt();
			save = save + input_num + " ";
			if(input_num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				if(input_num < ran) {
					System.out.println("랜덤숫자는 입력값보다 큽니다.(재입력하세요)");
				}else if(input_num > ran ) {
					System.out.println("랜덤숫자는 입력값보다 작습니다.(재입력하세요)");
				}else if(input_num == ran ){
					System.out.println("랜덤값과 입력값이 같습니다. 당첨");
					System.out.println("입력한 번호 : "+save);
					break;
				}
			}
			System.out.println("입력한 번호 : "+save);
		}
//				*/
		
		/*
		System.out.println("1~100까지의 숫자중 하나를 고르세요. (0을 입력하면 프로그램이 종료됩니다.)");
		while(true) {
			
			int input_num = scan.nextInt();
			if(input_num == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(input_num < ran) {
					System.out.println("랜덤숫자는 입력값보다 큽니다.(재입력하세요)");
				}else if(input_num > ran ) {
					System.out.println("랜덤숫자는 입력값보다 작습니다.(재입력하세요)");
				}else if(input_num == ran ){
					System.out.println("랜덤값과 입력값이 같습니다. 재도전 Y, N ");
					String out = scan.next();
					if(out.equalsIgnoreCase("y")) {
						System.out.println("종료");
					}else {
					}
				
				}
			}
			*/
	}
}
