import java.util.Scanner;

public class Ex0221_01 {
	//메소드 오버로딩
	public static void main(String[] args) {
		//랜덤으로 10개의 1차원 배열을 만들어서
		//1~45의 배열을 만들어서 값을 넣어보세요. 섞기
		//10개를 배열에 넣으면 되겠습니다.
		//단 중복은 허락하지 않음
		int[] num = new int [10];
		int[] ran = new int [45];
		
		while(true) {
			
			switch (main_pArr()) {
			case 1:
				inArr(ran);
				System.out.println("***  45개의 값 넣기 완료   ***");
				break;
			case 2:
				shuArr(ran,num);
				System.out.println("***  랜덤섞기 완료   ***");
				break;
			case 3:
				inNum(num,ran);
				System.out.println("***  10개의 값 넣기 완료   ***");
				break;
			case 4:
				print(num);
				System.out.println("***  10개 출력 완료   ***");
				break;
			case 5:
				int result = numAdd(num);
				System.out.println("10개의 합 : "+result);
				System.out.println("***  10개 합 구하기완료   ***");
				break;
			case 6:
				print(num);
				temp(num);
				print(num);
				System.out.println("***  10개 정렬하기 완료   ***");
				break;

			default:
				break;
			}
			
			                
			
			
		}
		
	}//main

		static int main_pArr() {
			Scanner scan = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println("     1. 45개의 값 넣기            2. 랜덤섞기");
			System.out.println("     3. 10개의 값 넣기            4. 10개 출력");
			System.out.println("     5. 10개 합 구하기            6. 10개 정렬하기");
			System.out.println("---------------------------------------");
			System.out.println("원하는 번호를 입력하세요. >>");
			return scan.nextInt();
		}
	
		//숫자 넣기
		static void inArr(int[] ran) { //1~45를 넣어준다
			for (int i = 0; i < ran.length; i++) {
				ran[i] = i+1;
			}
		}
		
		//섞고 담기
		static void shuArr(int[] ran,int[] num) {
			for (int i = 0; i < 200; i++) {
				int temp1 = (int)(Math.random()*45);
				
				int temp2 = ran[0];
				ran[0] = ran[temp1];
				ran[temp1]  = temp2;
				
			}
			
			
		}

		//랜덤숫자 넣어주기
		static void inNum(int[] num,int[] ran) { //1~45를 넣어준다
			for (int i = 0; i < num.length; i++) {
				num[i] = ran[i];
			}
		}
		
		
		//순서 바꾸기
		static void temp (int[] num) {
			
			for (int i = 0; i < num.length-1; i++) {
				boolean boo = false;
				for (int j = 0; j < num.length-1; j++) {
					if(num[j] > num[j+1]) { //앞 숫자가 더 크면!
						int temp = num[j];  //뒤와 순서를 바꾼다.
						num[j] = num[j+1];
						num[j+1] = temp;
						boo = true; //바꿨습니다.
					}
				}
				if(boo == false) { //하나도 바꾸지 않는다 ( = 정렬이 완료 되었다.)
					break; // 나가준다 ( 속도 향상을 위해서)
				}
			}
			
		}
		
		//10개의 합
		static int numAdd(int[] num) {
			int result = 0;
			for (int i = 0; i < num.length; i++) {
				result += num[i];
			}
			return result;
		}
		
		
		//출력
		static void print(int[] num) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+"  ");
			}
			System.out.println();
		}

}
