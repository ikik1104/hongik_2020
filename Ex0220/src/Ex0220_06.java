import java.util.Scanner;

public class Ex0220_06 {

	public static void main(String[] args) {
		//1~25 ������ ���ڸ� 5���� �迭�� �־����
		
		int[] arr = new int[25];
		int[][] num = new int[5][5];
		Scanner scan = new Scanner(System.in);
		String xy ="";
		int x=0,y=0 ;
		
		inArr(arr);  //���ڳֱ�
		shuArr(arr); //���ڼ���
		sixArr(arr,num);//������ �ֱ�
		
		while(true) {
			printArr(num); //����ϱ�
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. >>(x,y)->(0,0)");
//			select = scan.nextInt();
			xy = scan.nextLine();	 //15 -> 1,5
			x = xy.charAt(0)-'0';
			y = xy.charAt(1)-'0';
			if(!(num[x][y]==0)) {
				num[x][y] = 0;
			}else {
				System.out.println("�̹� �����ϼ̽��ϴ�.");
			}
		}
	}//main
	
	//���ڳֱ�
	static void inArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
	}
	
	//���� ����
	static void shuArr(int[] arr) {
		for (int i = 0; i < 200; i++) {
			int a = (int)(Math.random()*25);
			int b = arr[0];
			arr[0] = arr[a];
			arr[a] = b;
		}
	}
	
	//�����ֱ�
	static void sixArr(int[] arr, int[][] num) {
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = arr[j+(i*5)];
			}
		}
		
	}
	//����ϱ�
	static void printArr(int[][] lotto2) {
		System.out.print(" "+"\t"+"0"+"\t"+"1"+"\t"+"2"+"\t"+"3"+"\t"+"4"+"\t");
		System.out.println();
		System.out.println("--------------------------------------------");
		for (int i = 0; i < lotto2.length; i++) {
			System.out.print(i+"\t");
			for (int j = 0; j < lotto2[i].length; j++) {
				System.out.print(lotto2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
	}
	
}
