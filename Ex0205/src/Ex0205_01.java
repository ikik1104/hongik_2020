import java.util.Scanner;

public class Ex0205_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* ------------------------------------------------------------------countinue를 사용하여 순서건너뛰기
			Loop1 : for (int i = 2; i <=9 ; i++) {
				for (int j = 1; j <= 9 ; j++) {
					if(j==5) {
						continue Loop1; //다음 순서로 건너뛰기
					}
					System.out.println(i+"*"+j+"="+i*j);
			}
				System.out.println("------");
		}
		*/
		
		
		/*-------------------------------------------------------------단수를 입력해서 입력한 값의 단만 4단이면 4단 출력
		
		System.out.println("단수 하나를 입력하세요.");
		int num = scan.nextInt();
		
		for (int i = 1;  i <=9; i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		*/
		
		/*-------------------------------------------------------------입력수 부터 이후의 구구단까지 출력(1~9까지 입력 그 이외는 다시 입력하세여)
		
		//---------------------------------------------------------------내가 푼것
		while (true) { 
			System.out.println("단수 하나를 입력하세요");
			int num2 = scan.nextInt();//입력받는데
			if(1>num2 || num2>9) { //1보다 num이 작거나 , 9보다 num이 크면;
				System.out.println("다시 입력하세요"); //다시입력받기
			}else {
				for (int i = num2; i <=9; i++) {
					for (int j =1; j <=9; j++) {
						System.out.println(i+"*"+j+"="+i*j);
					}
					System.out.println("----------------");
				}
				break;
			}
		}
		*/
		//---------------------------------------------------------------선생님이 풀것
		int dan = 0;
		int select = 0;

		
		loop1: while(true) { //단만출력, 단부터출력 선택하세요
			System.out.println("구구단 출력형태 선택");
			System.out.println("1) 선택 구구단만 출력");
			System.out.println("2) 선택 구구단부터출력");
			System.out.println("원하는 메뉴를 선택하세요.(종료  : 0)");
			
			select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			
			if(!(select >=1 && select <=2)) {
				System.out.println("숫자를 잘못 입력하셨습니다. 다시 입력하세요.");
				System.out.println();
			}
			
			 while (true) { //1번 선택 - 단만 출력
				
			System.out.println("단만 출력하는 것을 선택했습니다.");
			System.out.println("원하는 단을 입력하세요.( 상위이동 : 0 )");
			dan = scan.nextInt();
			
			if(dan==0) {
				System.out.println("선택페이지로 이동합니다.");
				System.out.println("-----------------");
				break ;
			}
			if(!(dan>=1 && dan <=9)) {
				System.out.println("1-9까지 숫자를 입력");
				continue;
			}
			for (int i = dan; i <=dan; i++) {
				for (int j = 1; j <=9; j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println("--------------------");
			}//for
			}//작은while
		}//큰while
		
		/*-------------------------------------------------------숫자 2개를 입력, 입력한 숫자를 빼고 
		System.out.println("제외할 첫번째 숫자를 입력하세여");
		int num1 = scan.nextInt();
		System.out.println("제외할 두번쨰 숫자를 입력하세여");
		int num2 = scan.nextInt();
		
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				if(j==num1 || j==num2) {
					continue;
				}
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("-----------------");
		}
		*/
	}
}
