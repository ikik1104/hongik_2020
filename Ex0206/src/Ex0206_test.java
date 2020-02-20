import java.util.Scanner;

public class Ex0206_test {

	public static void main(String[] args) {
		/* [지하철 요금 프로그램]
		 * 1호선만
		 * 가산1 구로2.....회기역까지
		 * 기본요금 : 1,250원
		 * 1-5정거장 무료/  6-10 +100원씩 /11-15 +200원 /16-20 +300원
		 *
		 * */
		
		//절대갑값: Math.abs(1-2) +1
		Scanner scan = new Scanner(System.in);
		/*
		int num1 = 1; //가산
		int num2 = 2;  //구로
		int num3 = 3;  //신도림
		int num4 = 4;  //영등포
		int num5 = 5; //신길
		int num6 = 6; //대방
		int num7 = 7; //노량진
		int num8 = 8; //용산
		int num9 = 9; //남영
		int num10 = 10; //서울역
		int num11 = 11; //시청
		int num12= 12; //종각
		int num13 = 13; //종로3가
		int num14 = 14; //종로5가
		int num15 = 15; //동대문
		int num16 = 16; //동묘앞
		int num17 = 17; //신설동
		int num18 = 18; //제기동
		int num19 = 19; //청량리
		int num20 = 20; //회기
		*/
		
		int sub1 = 0; //출발역
		int sub2 = 0; //도착역
		
		
		 loop1 :while(true) {
			int num = 1250;
			System.out.println("1.가산디지털단지역    2.구로             3.신도림         4.영등포          5.신길");
			System.out.println("6.대방                      7.노량진          8.용산            9.남영            10.서울역");
			System.out.println("11.시청                   12.종각           13.종로3가    14.종로5가      15.동대문");
			System.out.println("16.동묘앞                17.신설동        18.제기동       19.청량리        20.회기");
			System.out.println("--------------------------------------------------------");
			
			System.out.println("출발하실 역을 입력하세요.");
			sub1 = scan.nextInt();
			if(sub1<1 || sub1>20) {
				System.out.println("다시 입력하세요.");
				continue loop1;
			}
			
			System.out.println("도착하실 역을 입력하세요. 뒤로가기 : 0");
			sub2 = scan.nextInt();
			
			if(sub2==0) {
				continue loop1;
			}
			
			if(sub1<0 || sub1>20) {
				System.out.println("다시 입력하세요.");
				continue loop1;
			}
			
			int a = Math.abs(sub1-sub2)+1;
//			System.out.println(a); //이동거리
			
				for (int i = 1; i <a+1; i++) {
					if(i>=6 && i<=10) {
						num += 100; 
						i++;
					}else if(i>=11 && i<=15) {
						num += 200; 
						i++;
					}else if(i>=16 && i<=20) {
						num += 200; 
						i++;
					}
				}
				
				
				System.out.println(a+"정거장 이동 ---요금은 "+num+"원 입니다.");
				
			}
			
		
		
		}
}
