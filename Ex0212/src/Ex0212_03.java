import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		//배열 12개짜리
		String[] ganji = {"쥐","소","호랑이","토끼","용","뱀","말","양","원숭이","닭","개","돼지"}; //자축인묘진사오미신유슬해
		String[] ganji2 = {"자","축","인","묘","진","사","오","미","신","유","술","해"};
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		String select2 = "";
		int count =0;
		
		while(count<=12) {
			System.out.println("십이지신을 하나 입력");
			select2 = scan.next();
			
			for (int i = 0; i < ganji2.length; i++) {
				if(ganji2[i].equals(select2)) {
					System.out.println(select2+"는(은) 십이지신의 "+(i+1)+" 번째의 "+ganji[i]);
					break;
				}
			}
			
			count++;
			
			/*
		System.out.println("1~12번까지 숫자를 입력하세요. >>");
		select = scan.nextInt();
		
		System.out.println(select+"번째 띠는? "+ganji[select-1]+"/"+ganji2[select-1]);
	
	*/
		}
		
		
		
	}
}
