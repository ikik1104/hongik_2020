import java.util.Scanner;

public class Ex0212_01 {

	public static void main(String[] args) {
		//로또번호 생성
		Scanner scan = new Scanner(System.in);
		
		int[] r_num =new int [45];
		int[][] m_num =new int [10][6];
		int temp = 0;
		int num = 0;
		int win = 0;
		
		//로또배열에 숫자 넣기
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = i+1;
		}
		
		//숫자 섞기
		
		for (int i = 0; i < r_num.length; i++) {
			num = (int)(Math.random()*45);
			
			temp = r_num[0];
			r_num[0] = r_num[num];
			r_num[num] = temp;
		}

		
		
		for (int i = 0; i < m_num.length; i++) {
			System.out.println("[ "+(i+1)+". ]");
			for (int j = 0; j < m_num[j].length; j++) {
				System.out.print((j+1)+"번째 숫자를 입력하세요 1~45 >>");
				m_num[i][j] = scan.nextInt();
				if(m_num[i][j] <1 || m_num[i][j] >45) {
					System.out.println();
					System.out.println("다시 입력하세요");
					j--;
					continue;
				}
			}
		}

		
		
		
		
//		System.out.println("숫자 6개를 입력하세요.");
//		for (int i = 0; i < m_num.length; i++) {
//			System.out.print((i+1)+"번째 숫자를 입력하세요 1~45 >>");
//			m_num[i] = scan.nextInt();
//			if(m_num[i] <1 || m_num[i] >45) {
//				System.out.println();
//				System.out.println("다시 입력하세요");
//				i--;
//				continue;
//			}
//		}
		
		
		//로또 6개 출력
				System.out.println("로또 번호 :");
				for (int i = 0; i < 6; i++) {
					System.out.print(r_num[i] +" ");
				}
				System.out.println();
				
				
				/*내 로또 6개 출력
				System.out.println("나의 번호 :");
				for (int i = 0; i < m_num.length; i++) {
					for (int j = 0; j < m_num[i].length; j++) {
						System.out.print(m_num[i] +" ");
					}
					System.out.println();
				}*/
		
	
		for (int i = 0; i < m_num.length; i++) {
			for (int j = 0; j < m_num[i].length; j++) {
				for (int k = 0; k < 6; k++) {
					if(m_num[i][j] == r_num[k]) {
						win++;
					}
				}
		}
			System.out.println("----------"+(i+1)+"번째 -------------");
			System.out.print(win+"개 일치 ");
			switch (win) {
			case 2:
				System.out.println("5등");
				System.out.println("상금 : 5천원 입니다.");
				win = 0;
				break;
			case 3:
				System.out.println("4등");
				System.out.println("상금 : 10만원 입니다.");
				win = 0;
				break;
			case 4:
				System.out.println("3등 입니다.");
				System.out.println("상금 : 1백만원 입니다.");
				win = 0;
				break;
			case 5:
				System.out.println("2등 입니다.");
				System.out.println("상금 : 1억원 입니다.");
				win = 0;
				break;
			case 6:
				System.out.println("1등 입니다.");
				System.out.println("상금 : 10억원 입니다.");
				win = 0;
				break;

			default:
				System.out.println("당첨되지 않았습니다.");
				win = 0;
				break;
			
				
		}
			
		}
		
		
		

		
		
		
		
	}
}
