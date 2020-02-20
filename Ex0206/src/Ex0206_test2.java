import java.util.Scanner;

public class Ex0206_test2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int start = 0;
		int end = 0;
		int cal = 0;
		int price = 0; //지하철요금 금액
		String yn = "";
		int time1 = 0;
		int time2 = 0; 
		
		
		loop1 :
		while(true) {//while1
			System.out.println("1.가산디지털단지역    2.구로             3.신도림         4.영등포          5.신길");
			System.out.println("6.대방                      7.노량진          8.용산            9.남영            10.서울역");
			System.out.println("11.시청                   12.종각           13.종로3가    14.종로5가      15.동대문");
			System.out.println("16.동묘앞                17.신설동        18.제기동       19.청량리        20.회기");
			System.out.println("--------------------------------------------------------");
			System.out.println("출발하는 역번호를 선택하세요.");
			start = scan.nextInt();
			System.out.println("도착하는 역번호를 선택하세요.");
			end = scan.nextInt();
			
			cal = Math.abs(start-end)+1;
			time1 =  ((cal-1)*150)/60;
			time2 =  ((cal-1)*150)%60;
			System.out.println(time1+"  "+time2);
			
			//기본요금 + 0 *100 = 기본요금
			//기본요금 + 1 *100 = 기본요금 +100
			price = 1250 + (int)(Math.ceil(cal/5))*100 ;
			
			System.out.println("출발역: "+start);
			System.out.println("도착역: "+end);
			System.out.println("구간: "+cal );
			System.out.println("지하철 요금 :"+ price);
			System.out.println("소요시간:"+time1+"분  "+time2+"초");
			
			loop2:while(true) { //while2
			System.out.println("다시 지하철요금계산을 하시겠습니까? Y/N");
			yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				continue loop1;
			}else if(yn.equalsIgnoreCase("n")) {
				System.out.println("시스템을 종료합니다.");
				break loop1;
			}else{
				System.out.println("다시 입력하세요");
				continue loop2;
			}
		}//while2
			
		}//while1
		
		
		
		
	}
}
