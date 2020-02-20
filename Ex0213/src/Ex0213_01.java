import java.util.Scanner;

public class Ex0213_01 {

	public static void main(String[] args) {
		//로또번호
		
		int[] ran = new int[45];
		int[] m_num = new int[6];
		int temp = 0;
		int num = 0;
		int count = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] = i+1;
		}
		
		for (int i = 0; i < ran.length; i++) {
			num = (int)(Math.random()*45);
			
			temp = ran[0];
			ran[0] = ran[num];
			ran[num] = temp;
			
		}

		for (int i = 0; i < 6; i++) {
			System.out.println((i+1)+"번째 숫자를 입력하세요 1~45");
			m_num[i] = scan.nextInt();
			if(m_num[i] < 1  || m_num[i] > 45) {
				System.out.println("다시 입력하세요.");
				i--;
			}
		}
		
		for (int i = 0; i < m_num.length; i++) {
			for (int j = 0; j < 6; j++) {
				if(m_num[i] == ran[j]) {
					count++;
				}
			}
		}
		
		System.out.print("로또번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.print(ran[i]+" ");
		}
		System.out.println();
		
		switch (count) {
		case 3:
			System.out.println("4등");
			break;
		case 4:
			System.out.println("3등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 6:
			System.out.println("1등");
			break;

		default:
			System.out.println("맞은갯수:"+count);
			System.out.println("당첨되지 않았습니다.");
			break;
		}
		
		
		
	}
	
}
