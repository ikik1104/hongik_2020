import java.util.Scanner;

public class Ex0205_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1) 반올림 
		//2	올림
		//3)버림
		//4) 반올림원하는 곳에서 반올림
		//원하는 번호를 입력하세요.
		
		//무한반복으로해서 소수점을 하나 받는다.
		
		//1번 선택시 
		//소수점 계산할 실수를 입력하세요.
		//3.1454 -> 3 , 4.523 -> 5 0 이전 99종료
		
		int select = 0;
		double num = 0.0;
		int num2 = 0;
		
		int abc=(int)e(4);
		System.out.println(abc);
		
		loop1 : while (true) {
			System.out.println("원하는 번호를 입력하세요. (종료 : 99)");
			System.out.println("1) 반올림");
			System.out.println("2) 올림");
			System.out.println("3) 버림");
			System.out.println("4) 반올림 자리수 선택");
			select =scan.nextInt(); //메뉴 입력받음
			
			if(select ==99) {
				break;
			}
			if(!(select>=1 && select <=4)) {
				System.out.println("1~4번 사이의 번호를 입력하세요");
				System.out.println("----------------------------");
			}
			
			switch (select) {
			case 1: //반올림
				while(true) {
					System.out.println("반올림할 실수를 입력하세요.(상위이동:0 , 종료:99)");
					num = scan.nextDouble();
					if(num==0) {
						continue loop1;
					}else if(num == 99) {
						break loop1; 
					}
					num2 = (int)Math.round(num);
					System.out.println("반올림 : "+num2);
					System.out.println("----------------------------");
					
				}
				
			case 2: //올림
				while(true) {
				System.out.println("올림할 실수를 입력하세요.(상위이동:0 , 종료:99)");
				num = scan.nextDouble();
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("시스템을 종료합니다.");
					break loop1;
				}
				num2 = (int)Math.ceil(num);
				System.out.println("올림 : "+num2);
				System.out.println("----------------------------");
				}
			case 3: //버림
				while(true) {
				System.out.println("내림할 실수를 입력하세요.(상위이동:0 , 종료:99)");
				num = scan.nextDouble();
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("시스템을 종료합니다.");
					break loop1;
				}
				num2 = (int)Math.floor(num);
				System.out.println("내림 : "+num2);
				System.out.println("----------------------------");
				}
				
			case 4 : //반올림 자리수 선택
				while(true) {
				int aa = 1;
				System.out.println("반올림할 실수를 입력하세요 (상위이동:0 , 종료:99)");
				num = scan.nextDouble();
				
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("시스템을 종료합니다.");
					break loop1;
				}
				
				System.out.println("반올림 할 자리수를 입력하세요.");
				num2 = scan.nextInt(); // 10*num2
				
				for (int i = 1; i < num2; i++) {
				
					aa = aa*10;
				}
				
				double aa1 = (Math.round(num*aa)/(double)aa);
				System.out.println(num2+"번째 자리에서 반올림 :"+aa1);
				System.out.println("---------------------------");
				
				//---------------------------------------------------------------------------선생님 풀이
				System.out.println("반올림할 실수를 입력하세요 (상위이동:0 , 종료:99)");
				num = scan.nextDouble();
				
				if(num==0) {
					continue loop1;
				}else if(num == 99) {
					System.out.println("시스템을 종료합니다.");
					break loop1;
				}
				
				System.out.println("소수 몇째자리에서 반올림 할건가요?");
				select = scan.nextInt(); 
				if(select<0 || select>3) {
					System.out.println("소수점3까지 가능");
					continue;
				}
				
				switch (select) {
				case 1:
					System.out.println("소수첫째자리 반올림 값 : "+Math.round(num));
					break;
				case 2:
					System.out.println("소수둘째자리 반올림 값 : "+Math.round(num*10)/10.0);
					break;
				case 3:
					System.out.println("소수셋째자리 반올림 값 : "+Math.round(num*100)/100.0);
					break;

				default:
					break;
				}
				
				
				
				}
			}
			
			
		}
	
		
		
		
		
		System.out.println("시스템을 종료합니다.");
		
	}

	private static int e(int aa) {
		// TODO Auto-generated method stub
		return 0;
	}
}
