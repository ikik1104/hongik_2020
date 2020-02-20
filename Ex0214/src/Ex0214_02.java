import java.util.Scanner;

public class Ex0214_02 {

	public static void main(String[] args) {
		// [더블정렬]--속도가 느림..
		//정렬~1427548419
		//1.10개의 배열을 만든다
		//2.각 랜덤으로 0~9까지릐 숫자를 넣는다
		//3.1번째 2번째 비교 자리바꿈, 2번째 3번째 비교 자리바꿈
		//4.연속으로 체크
		//5.출력
		
		Scanner scan=new Scanner(System.in);
		
		int[]arr1=new int[10];
		int temp=0;
		boolean check=false;//자리변경
		//배열에 0~9까지의 랜덤숫자를 삽입
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(int)(Math.random()*10);
		}
		System.out.print("처음배열 : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		//자리변경(1번째 2번째 비교 자리바꿈)
		
		for(int i=0;i<arr1.length;i++) {
			
			check=false;
			for(int j=0;j<arr1.length-1-i;j++) {
				//1번 시행할때마다 젤 큰수가 뒤에 배치되므로 i번 만큼은 안돌려도됨..
				if(arr1[j]>arr1[j+1]) {
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					check=true;
					
				}//if
			}//for2
			
			System.out.print((i+1)+"번째 정렬 진행: ");
			for(int k=0;k<arr1.length;k++) {
				System.out.print(arr1[k]+" ");
			}System.out.println(); 
			
			
			
			if(check==false) {
				System.out.println("모든 정렬이 완료되었습니다.");
				break;
			}
		}//for1
		
		
		//출력
		System.out.println("최종배열 :");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		
		
	}//main

}//class
