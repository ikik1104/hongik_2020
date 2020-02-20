import java.util.Scanner;

public class Ex0210_0101 {

	
	public static void main(String[] args) {
		
		int select = 0; // √ππ¯¬∞ º±≈√∫Øºˆ
		int count = 10;
		int user = 0; //ªÁøÎ¿⁄∞° ≥Ω ∞°¿ßπŸ¿ß∫∏ ∫Øºˆ
		int com = 0; //ƒƒ«ª≈Õ∞°≥Ω ∞°¿ßπŸ¿ß∫∏ ∫Øºˆ
		int win = 0; //Ω¬∏Æ»Ωºˆ∫Ø»ƒ
		int draw = 0; //π´Ω¬∫Œ
		int lose = 0; //∆–πË
	
		String[] confirm = new String[count]; //Ω¬∆–»Æ¿Œ
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("[  ∞°¿ß πŸ¿ß ∫∏ ∞‘¿” / Ω¬∆–»Æ¿Œ «¡∑Œ±◊∑•   ]");
			System.out.println("----------------------------------");
			System.out.println(" 1)∞°¿ßπŸ¿ß∫∏ ∞‘¿”   2) Ω¬∆–»Æ¿Œ ");
			System.out.println("π¯»£∏¶ º±≈√«ÿ¡÷ººø‰. (¡æ∑·:0)>>");
			
			select = scan.nextInt();
			if(select == 0) {
				System.out.println("Ω√Ω∫≈€¿ª ¡æ∑·«’¥œ¥Ÿ.");
				break;
			}
			
			
			switch (select) {
			
			case 1:
				System.out.println("[   ∞°¿ßπŸ¿ß∫∏ START   ]");
				
				for (int i = 0; i < count; i++) {
					System.out.println("1)∞°¿ß, 2)πŸ¿ß, 3)∫∏ ¡ﬂø° 1∞≥∏¶ º±≈√«œººø‰.");
					user = scan.nextInt();
					com = (int)(Math.random()*3)+1;
					
					switch (user-com) {
					// 1
					// 1-3 = -2 (Ω¬∏Æ) / 1-1 = 0(π´Ω¬∫Œ) /1-2 = -1 ( ∆–πË)
					// 2
					// 2-1 = 1 (Ω¬∏Æ) / 2-2 = 0(π´Ω¬∫Œ) / 2-3 = -1 (∆–πË)
					// 3
					// 3-2 = 1 (Ω¬∏Æ) / 3-3 = 0(π´Ω¬∫Œ) / 3-1 = 2 (∆–πË)
					case -2: case 1: //Ω¬∏Æ
						System.out.println("Ω¬∏Æ");
						win++;
						confirm[i] = "Ω¬∏Æ";
						
						break;
						
					case 0: //π´Ω¬∫Œ
						System.out.println("π´Ω¬∫Œ");
						draw++;
						confirm[i] = "π´Ω¬∫Œ";
						
						break;
						
					case -1: case 2: //∆–πË
						System.out.println("∆–πË");
						lose++;
						confirm[i] = "∆–πË";
						
						break;
					}//switch
				}//for
				
				System.out.println("√— ∞‘¿” »Ωºˆ : "+count);
				System.out.println("√— Ω¬∏Æ »Ωºˆ : "+win);
				System.out.println("√— π´Ω¬∫Œ »Ωºˆ : "+draw);
				System.out.println("√— ∆–πË »Ωºˆ : "+lose);
				System.out.printf("Ω¬∑¸ : %.1f %n",((float)win/count)*100);
				
				break;

			case 2:
				System.out.println("[  Ω¬∆–»Æ¿Œ START  ]");
				for (int i = 0; i < confirm.length; i++) {
					System.out.println((i+1)+". "+confirm[i]);
					
				}
				System.out.println("√— ∞‘¿” »Ωºˆ : "+count);
				System.out.println("√— Ω¬∏Æ »Ωºˆ : "+win);
				System.out.println("√— π´Ω¬∫Œ »Ωºˆ : "+draw);
				System.out.println("√— ∆–πË »Ωºˆ : "+lose);
				System.out.printf("Ω¬∑¸ : %.1f %n",((float)win/count)*100);
				
				break;
			

			}//switch
			
		}//while
		
		
		
		
		
	}
}
