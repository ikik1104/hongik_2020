import java.util.Scanner;

public class Ex0214_02 {

	public static void main(String[] args) {
		// [��������]--�ӵ��� ����..
		//����~1427548419
		//1.10���� �迭�� �����
		//2.�� �������� 0~9�����l ���ڸ� �ִ´�
		//3.1��° 2��° �� �ڸ��ٲ�, 2��° 3��° �� �ڸ��ٲ�
		//4.�������� üũ
		//5.���
		
		Scanner scan=new Scanner(System.in);
		
		int[]arr1=new int[10];
		int temp=0;
		boolean check=false;//�ڸ�����
		//�迭�� 0~9������ �������ڸ� ����
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=(int)(Math.random()*10);
		}
		System.out.print("ó���迭 : ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		//�ڸ�����(1��° 2��° �� �ڸ��ٲ�)
		
		for(int i=0;i<arr1.length;i++) {
			
			check=false;
			for(int j=0;j<arr1.length-1-i;j++) {
				//1�� �����Ҷ����� �� ū���� �ڿ� ��ġ�ǹǷ� i�� ��ŭ�� �ȵ�������..
				if(arr1[j]>arr1[j+1]) {
					temp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
					check=true;
					
				}//if
			}//for2
			
			System.out.print((i+1)+"��° ���� ����: ");
			for(int k=0;k<arr1.length;k++) {
				System.out.print(arr1[k]+" ");
			}System.out.println(); 
			
			
			
			if(check==false) {
				System.out.println("��� ������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}//for1
		
		
		//���
		System.out.println("�����迭 :");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}System.out.println();
		
		
		
	}//main

}//class
