
public class Lotto{
	
	 int[] ball = new int[45];
	 
	 Lotto(){ //기본생성자
		 for (int i = 0; i < ball.length; i++) {
			 ball[i] = i+1;
		}
		 
		 for (int i = 0; i < 100; i++) {
			int temp = (int)(Math.random()*45);
			
			int temp2 = ball[0];
			ball[0] = ball[temp];
			ball[temp] = temp2;
		}
		 
	 }
	 
	 
 }