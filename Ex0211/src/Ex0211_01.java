import java.util.Scanner;

public class Ex0211_01 {

	public static void main(String[] args) {
		// 로또 프로그램
		int[] r_num = new int[45]; // 45개의 배열
		int[] m_num = new int[6]; // 내가뽑은 6개의 수
		int num1 = 0; // 임시 변수
		int num2 = 0; // 임시 변수
		int success = 0; // 맞은 수

		Scanner scan = new Scanner(System.in);

		// 입력받기
		for (int i = 0; i < m_num.length; i++) {
			System.out.println((i + 1) + "번째 숫자를 입력하세요.");
			m_num[i] = scan.nextInt();

			if (m_num[i] < 1 || m_num[i] > 45) {
				System.out.println("1~45 까지의 숫자만 입력하세요");
				i--;
				continue;
			}
		}

		// 배열에 숫자를 1~45까지 넣는다.
		for (int i = 0; i < r_num.length; i++) {
			r_num[i] = i + 1;
		}

		// 섞어주기
		for (int i = 0; i < 100; i++) {
			num1 = (int) (Math.random() * 45); // 0~44까지의 랜덤수

			num2 = r_num[0];
			r_num[0] = r_num[num1];
			r_num[num1] = num2;
		}

		// 6개의 로또 뽑기
		System.out.print("로또번호 :");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < m_num.length; j++) {
				if (r_num[i] == m_num[j]) {
					success++;
				}
			}

			System.out.print(r_num[i] + " ");
		}
		
		System.out.println();
		System.out.print("뽑은 숫자 :");
		for (int i = 0; i < m_num.length; i++) {
			System.out.print(m_num[i]+" ");
			
		}

		System.out.println();
		System.out.println("일치하는 갯수: " + success + " 개");
		switch (success) {
		case 2:
			System.out.println("******* 5 등 당첨 *******");
			System.out.println("**** 당첨금액: 5 천원  ****");
			System.out.println("****** 축하드립니다 ******");
			break;
		case 3:
			System.out.println("******* 4 등 당첨 *******");
			System.out.println("**** 당첨금액: 10만원 ****");
			System.out.println("****** 축하드립니다 ******");
			break;
		case 4:
			System.out.println("******* 3 등 당첨 *******");
			System.out.println("**** 당첨금액:100만원 ****");
			System.out.println("****** 축하드립니다 ******");
			break;
		case 5:
			System.out.println("******* 2 등 당첨 *******");
			System.out.println("**** 당첨금액:10 만원  ****");
			System.out.println("****** 축하드립니다 ******");
			break;
		case 6:
			System.out.println("******* 1 등 당첨 *******");
			System.out.println("**** 당첨금액: 10 억원 ****");
			System.out.println("****** 축하드립니다 ******");
			break;

		default:
			System.out.println("당첨되지 않았습니다.");
			break;
		}

	}
}
