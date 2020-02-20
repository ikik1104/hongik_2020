import java.util.Scanner;

public class Ex0210_01 {

	public static void main(String[] args) {
		
		/*가위바위보 게임을 한번 만들어보세요.
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int count = 10;
		int num = 0;
		int o = 0;
		int e = 0;
		int x = 0;
		
		
		while(true) {
			System.out.println("게임횟수 지정");
			count = scan.nextInt();
			String[] aa = new String[count];

		for (int i = 0; i < count; i++) {
			System.out.println("1) 게임시작   2)승패확인");
			num = scan.nextInt();
			
			if(!(num==1 || num ==2)) {
				System.out.println("다시 입력하세요");
				i--;
			}
			
				int ran = (int)(Math.random()*3)+1;
				System.out.println((i+1)+"번째 게임");
				System.out.println("1)가위 , 2)바위, 3)보");
				num = scan.nextInt();
				
				if(num <1 || num>3) {
					System.out.println("잘못입력하였습니다.");
					i--;
					continue;
				}
				if(num == ran) {
					System.out.println("비겼습니다.");
					aa[i] = (i+1)+". 무승부";
					e++;
					continue;
				}else if((num == 1 && ran ==2) || (num == 2 && ran ==3) || (num ==3 && ran ==1)) {
					System.out.println("졌습니다.");
					aa[i] = (i+1)+". 패배";
					x++;
					continue;
				}else {
					System.out.println("이겼습니다.");
					aa[i] = (i+1)+". 승리";
					o++;
					continue;
				}
		}
		System.out.println("게임 끝");
		System.out.printf("이긴횟수: %d, 비긴횟수: %d, 패배횟수: %d%n",o,e,x);
		System.out.println("승률:"+(100.0*o/10)+"%");
		
		break;
		}
		
		
		/*
		while(true) {
		
			System.out.println("게임횟수 지정");
			count = scan.nextInt();
			String[] aa = new String[count];

		for (int i = 0; i < count; i++) {
			System.out.println("1) 게임시작   2)승패확인");
			num = scan.nextInt();
			
			if(!(num==1 || num ==2)) {
				System.out.println("다시 입력하세요");
				i--;
			}
			
			switch (num) {
			case 1: //게임시작
				int ran = (int)(Math.random()*3)+1;
				System.out.println((i+1)+"번째 게임");
				System.out.println("1)가위 , 2)바위, 3)보");
				num = scan.nextInt();
				
				if(num <1 || num>3) {
					System.out.println("잘못입력하였습니다.");
					i--;
					continue;
				}
				if(num == ran) {
					System.out.println("비겼습니다.");
					aa[i] = (i+1)+". 무승부";
					e++;
					continue;
				}else if((num == 1 && ran ==2) || (num == 2 && ran ==3) || (num ==3 && ran ==1)) {
					System.out.println("졌습니다.");
					aa[i] = (i+1)+". 패배";
					x++;
					continue;
				}else {
					System.out.println("이겼습니다.");
					aa[i] = (i+1)+". 승리";
					o++;
					continue;
				}
			case 2://승패확인
				for (int j = 0; j < aa.length; j++) {
					System.out.println(aa[j]);
					}
				}
				break;
		}
		System.out.println("게임 끝");
		System.out.printf("이긴횟수: %d, 비긴횟수: %d, 패배횟수: %d%n",o,e,x);
//		System.out.println("승률:"+(100.0*o/10)+"%");
		
		break;
		}
		
		
		/*1~100 각각의 배열에 저장을하고
		 * 각각의 0방 까지의 sum
		 * 1번방 까지의 sum
		 * 총 100번방 까지의 sum을 다른 배열장소에 저장
		 * 
		int[] score = new int[100];
		int[] sum = new int[100];
		
		for (int i = 0; i < 100; i++) {
			score[i] = (i+1);
			
			if(i == 0) {
				sum[i] = 0+score[i];
			}else {
				sum[i] = sum[i-1]+score[i];
			}
			
			System.out.println(score[i]+"번 까지의 합 : "+sum[i]);
		}
		
		*/
		
		
		
		
		/*
		 * 100개의 숫자를 1~100까지 해서 각각의 배열에 저장해보세요.
		 * 
		 * 	int[] score = new int[100];
		
		for (int i = 0; i < 100; i++) {
			score[i] = (i+1);
			System.out.println(score[i]);
		}
		
		
		 */
		
	
		
		
		
		
		/*
		int[] score1 = new int [5];
		score1[0] = 100;
		score1[1] = 90;
		score1[2] = 80;
		score1[3] = 70;
		score1[4] = 60;
		
		int[] score2 = {100,90,80,70,60};
		
		int[] score3;
		score3 = new int[] {100,90,80,70,60};
		*/

		
		
		/*
		
		int [] ran = new int [5];
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int)(Math.random()*6)+1;
			System.out.println(i+1+"번 랜덤수 : "+ran[i]);
		} 
		
		
		
		int ran1 = (int)(Math.random()*6)+1;
		int ran2 = (int)(Math.random()*6)+1;
		int ran3 = (int)(Math.random()*6)+1;
		int ran4 = (int)(Math.random()*6)+1;
		int ran5 = (int)(Math.random()*6)+1;
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		System.out.println(ran4);
		System.out.println(ran5);
		
		*/
		
		
	}
}
