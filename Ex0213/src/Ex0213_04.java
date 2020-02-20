import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ex0213_04 {

	public static void main(String[] args) {
		
		//1~100 까지 숫자 1개를 랜덤으로 뽑습니다.
		// 무한으로 돌ㄹ서, 숫자를 맞추는 게임
		//입력한 숫자가 랜덤숫자 1개보다 높으면 숫자가 큽니다. - 다시입력
		//작으면 작습니다. 다시입력
		//맞으면 빙고
		//정답은 ㅇㅖ) 5번입니다.
		
		//자신이 입력한 숫자를 모두 출력해주세요
		//최대20번까지 하겠다.
		Scanner scan = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100)+1;
		int[] m_num = new int[20];
		int count = 0;
		
		while(count<20) {
			System.out.println("숫자 하나를 입력하세요. 남은 기회:"+(20-count));
			m_num[count] = scan.nextInt();
			
			if(m_num[count] > ran) {
				System.out.println("입력하신 숫자가 큽니다."+m_num[count]+"보다 작은 숫자를 입력하세요");
			}else if(m_num[count] == ran) {
				System.out.println("*****빙고*****");
				count++;
				break;
			}else {
				System.out.println("입력하신 숫자가 작습니다."+m_num[count]+"보다 큰 숫자를 입력하세요");
			}
			count++;
			
		}
		if(count == 20) {
			System.out.println("------------------------------------");
			System.out.println("게임이 종료되었습니다. ");
		}else {
			System.out.println(count+"번째에 맞췄습니다.");
		}
		
		System.out.println("당첨 숫자 : "+ran+"입니다.");
		System.out.print("횟수:\t\t");
		for (int i = 0; i < count; i++) {
			System.out.print((i+1)+"\t");
		}
		System.out.println();
		System.out.print("내가 입력한 숫자:\t");
		for (int i = 0; i < m_num.length; i++) {
			if(m_num[i] == 0) {
				break;
			}
			System.out.print(m_num[i]+"\t");
		}
		
	}
}
