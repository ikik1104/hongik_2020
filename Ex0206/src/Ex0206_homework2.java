import java.util.Scanner;

public class Ex0206_homework2 {

	public static void main(String[] args) {
				
				/*
				 * 가위바위보
				 * 1,2,3
				 * 
				 * 컴터 랜덤으로 가위바위보진행
				 * 
				 * 10번 게입해서
				 * 총 몇번 이겼는지
				 * 
				 * 이기면 승리, 비기면  무승부 , 지면 패배 출력
				 * 총 승리, 무승부, 패배 횟수 출력
				 * 승률
				 * 
				 * 옵션: 경기횟수 입력받기
				 * 
				 * 
				 * */
				Scanner scan = new Scanner(System.in);
				
				System.out.println("[    가위 바위 보 게임        ]");
				int num = 0; 
				int ran = 0;
				int count =0; //게임 횟수
				int o = 0; //승리
				int e = 0; //무승부
				int x = 0; //패배
				String list = "";
				
				loop1 :
				while(true) {
					
					System.out.println("원하는 게임 횟수를 지정하세요 종료:0");
					count = scan.nextInt();
					
					if(count == 0) {
						break loop1;
					}else if(count <0) {
						System.out.println("다시 입력하세요");
						continue loop1;
					}
					System.out.println(count+"번 게임을 진행합니다.");
					
					
					
					for (int i = 1; i <= count; i++) {
						loop2:
						while(true) {
						System.out.println(i+"번째 게임");
						System.out.println("1) 가위, 2) 바위, 3)보 , 0)뒤로가기 ");
						num = scan.nextInt();
						ran = (int)(Math.random()*3)+1;
						if(num<0 || num>3) {
							System.out.println("다시 입력하세요");
							continue loop2;
						}
						if(num==0) {
							continue loop1;
						}
						
						System.out.println(ran);
						if(num == ran) {
							System.out.println("비겼습니다.");
							list += i+". 무승부 \n";
							e++;
						}else if((num==1 && ran==2) || (num==2 && ran==3) ||(num==3 && ran==1)) {
							System.out.println("패배하였습니다.");
							list += i+". 패배 \n";
							x++;
						}else {
							System.out.println("이겼습니다.");
							list += i+". 승리 \n";
							o++;
						}
						break;
						
					}//loop2 while
						
					}//for
					System.out.println("이긴횟수 :"+o+"번, 무승부 :"+e+"번, 패배:"+x+"번");
					System.out.println("승률:"+(o*100.0)/count+"%");
					System.out.println(list);
					break loop1;
					
				}//loop1 while
				System.out.println("시스템을 종료합니당");
			}//main
		}//class

