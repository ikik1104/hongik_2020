import java.util.Scanner;

public class Ex0210_01 {

	public static void main(String[] args) {
		
		/*���������� ������ �ѹ� ��������.
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int count = 10;
		int num = 0;
		int o = 0;
		int e = 0;
		int x = 0;
		
		
		while(true) {
			System.out.println("����Ƚ�� ����");
			count = scan.nextInt();
			String[] aa = new String[count];

		for (int i = 0; i < count; i++) {
			System.out.println("1) ���ӽ���   2)����Ȯ��");
			num = scan.nextInt();
			
			if(!(num==1 || num ==2)) {
				System.out.println("�ٽ� �Է��ϼ���");
				i--;
			}
			
				int ran = (int)(Math.random()*3)+1;
				System.out.println((i+1)+"��° ����");
				System.out.println("1)���� , 2)����, 3)��");
				num = scan.nextInt();
				
				if(num <1 || num>3) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					i--;
					continue;
				}
				if(num == ran) {
					System.out.println("�����ϴ�.");
					aa[i] = (i+1)+". ���º�";
					e++;
					continue;
				}else if((num == 1 && ran ==2) || (num == 2 && ran ==3) || (num ==3 && ran ==1)) {
					System.out.println("�����ϴ�.");
					aa[i] = (i+1)+". �й�";
					x++;
					continue;
				}else {
					System.out.println("�̰���ϴ�.");
					aa[i] = (i+1)+". �¸�";
					o++;
					continue;
				}
		}
		System.out.println("���� ��");
		System.out.printf("�̱�Ƚ��: %d, ���Ƚ��: %d, �й�Ƚ��: %d%n",o,e,x);
		System.out.println("�·�:"+(100.0*o/10)+"%");
		
		break;
		}
		
		
		/*
		while(true) {
		
			System.out.println("����Ƚ�� ����");
			count = scan.nextInt();
			String[] aa = new String[count];

		for (int i = 0; i < count; i++) {
			System.out.println("1) ���ӽ���   2)����Ȯ��");
			num = scan.nextInt();
			
			if(!(num==1 || num ==2)) {
				System.out.println("�ٽ� �Է��ϼ���");
				i--;
			}
			
			switch (num) {
			case 1: //���ӽ���
				int ran = (int)(Math.random()*3)+1;
				System.out.println((i+1)+"��° ����");
				System.out.println("1)���� , 2)����, 3)��");
				num = scan.nextInt();
				
				if(num <1 || num>3) {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
					i--;
					continue;
				}
				if(num == ran) {
					System.out.println("�����ϴ�.");
					aa[i] = (i+1)+". ���º�";
					e++;
					continue;
				}else if((num == 1 && ran ==2) || (num == 2 && ran ==3) || (num ==3 && ran ==1)) {
					System.out.println("�����ϴ�.");
					aa[i] = (i+1)+". �й�";
					x++;
					continue;
				}else {
					System.out.println("�̰���ϴ�.");
					aa[i] = (i+1)+". �¸�";
					o++;
					continue;
				}
			case 2://����Ȯ��
				for (int j = 0; j < aa.length; j++) {
					System.out.println(aa[j]);
					}
				}
				break;
		}
		System.out.println("���� ��");
		System.out.printf("�̱�Ƚ��: %d, ���Ƚ��: %d, �й�Ƚ��: %d%n",o,e,x);
//		System.out.println("�·�:"+(100.0*o/10)+"%");
		
		break;
		}
		
		
		/*1~100 ������ �迭�� �������ϰ�
		 * ������ 0�� ������ sum
		 * 1���� ������ sum
		 * �� 100���� ������ sum�� �ٸ� �迭��ҿ� ����
		 * 
		int[] score = new int[100];
		int[] sum = new int[100];
		
		for (int i = 0; i < 100; i++) {
			score[i] = (i+1);
			
			if(i == 0) {
				sum[i] = 0+score[i];
			}else {
				sum[i] = sum[i-1]+score[i];
			}
			
			System.out.println(score[i]+"�� ������ �� : "+sum[i]);
		}
		
		*/
		
		
		
		
		/*
		 * 100���� ���ڸ� 1~100���� �ؼ� ������ �迭�� �����غ�����.
		 * 
		 * 	int[] score = new int[100];
		
		for (int i = 0; i < 100; i++) {
			score[i] = (i+1);
			System.out.println(score[i]);
		}
		
		
		 */
		
	
		
		
		
		
		/*
		int[] score1 = new int [5];
		score1[0] = 100;
		score1[1] = 90;
		score1[2] = 80;
		score1[3] = 70;
		score1[4] = 60;
		
		int[] score2 = {100,90,80,70,60};
		
		int[] score3;
		score3 = new int[] {100,90,80,70,60};
		*/

		
		
		/*
		
		int [] ran = new int [5];
		
		for (int i = 0; i < ran.length; i++) {
			ran[i] = (int)(Math.random()*6)+1;
			System.out.println(i+1+"�� ������ : "+ran[i]);
		} 
		
		
		
		int ran1 = (int)(Math.random()*6)+1;
		int ran2 = (int)(Math.random()*6)+1;
		int ran3 = (int)(Math.random()*6)+1;
		int ran4 = (int)(Math.random()*6)+1;
		int ran5 = (int)(Math.random()*6)+1;
		
		System.out.println(ran1);
		System.out.println(ran2);
		System.out.println(ran3);
		System.out.println(ran4);
		System.out.println(ran5);
		
		*/
		
		
	}
}
