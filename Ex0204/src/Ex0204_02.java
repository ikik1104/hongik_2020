import java.util.Scanner;

public class Ex0204_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double ran = (int)(Math.random()*45)+1; // 	랜덤 숫자 뽑기 *(int)(Math.random()*최대수)+1;
		
		//  10/3.0 =3.33333 int/double -> double
		//  10/3 = 3 -> int/int ->int
		
		/*
		// ***** O X 게 임  (2까지의 난수를 만들고 그걸 맞추는 게임 )
		int ox = (int) (Math.random()*2)+1;  //1~2 까지의 랜덤한 수
		
		System.out.println("생각하는 번호를 입력하세요. 1 or 2");
		int ox_true = scan.nextInt();
		
		if ( ox == ox_true ) {
			System.out.printf("정답입니다. 랜덤난수 %d", ox);
		}else {
			System.out.printf("오답입니다. 랜덤난수 %d", ox);
		}
		*/
		
		
		//3개입력 맞는지 틀린지
		/*
		System.out.println("1 ~ 45 첫번째 숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("1 ~ 45 두번째 숫자를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.println("1 ~ 45 세번째 숫자를 입력하세요.");
		int num3 = scan.nextInt();
		
		int num = (int)(Math.random()*45)+1; //랜덤한 숫자
		
		
		if(num == num1 || num == num2 || num ==num3) {
			System.out.printf("당첨되었습니다. 입력한 숫자 : %d,%d,%d 당첨 숫자 : %d", num1,num2,num3,num);
		}else {
			System.out.printf("당첨되지 않았습니다. 입력한 숫자 : %d,%d,%d 당첨 숫자 : %d", num1,num2,num3,num);
		}
		*/
		
		//4~10 2개의 숫자 입력
		
		System.out.println("4~10까지의 첫번째 숫자를 고르세요");
		int num1 = scan.nextInt();
		System.out.println("4~10까지의 두번째 숫자를 고르세요");
		int num2 = scan.nextInt();
		int random  = (int)(Math.random()*7)+4; // 4 <= x < 11 
		
		if(num1 == random || num2==random) {
			System.out.printf("당첨되었습니다. 뽑은숫자 %d,%d  랜덤수 : %d", num1,num2,random);
		}else {
			System.out.printf("당첨이 아닙니다. 뽑은숫자 %d,%d  랜덤수 : %d", num1,num2,random);
		}
		
	}
}
