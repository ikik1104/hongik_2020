
public class Ex0204_06 {
	public static void main(String[] args) {
		
		
		/*
		 * int sum = 0;
		int i = 0;
		int j = 0;
		while(true) {
			if(sum>100) {
				break;
			}
				i++;
				sum += i;
			}// end of while
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	
		*/
		
		
		/*
		for (i = 1; i<=100; i++) {
			if(sum>100) {
				break;
			}
			sum += i;
		}
		System.out.println("i="+(i-1));
		System.out.println("sum="+sum);
		*/
		
		
//		/*
		//홀수만 더해서  200이 넘는 형태의 i값과 sum값
		
		int sum = 0;
		int i = 1;
		
		while (true) {
			if(sum>200) {
				break;
			}
				sum +=i;
				i+=2;  //2씩증가 -> 홀수
		}
		System.out.println("i값 :"+(i-2)+" sum값 : "+sum);
//		*/
		
		/*
		int sum = 0;
		int i = 0;
		
		while (true) {
			if(sum>200) {
				break;
			}
			if(!(i%3 == 0)){
				sum +=i;
			}
				i++; 
		}
		
		System.out.println("i="+(i-1));
		System.out.println("sum="+sum);
		*/
		
	}
		
		
}
