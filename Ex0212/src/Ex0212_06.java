import java.util.Scanner;

public class Ex0212_06 {

	public static void main(String[] args) {
		//��� ��� /1����� /2����� /�� /��� �Ҽ���1°�ڸ�
		//200����
		//3�� 200�� �̻��̸� �ٽ��Է�
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][4];
		String[] name = new String [3]; 
		String[] sub = {"�̸�","1��°���","2��°���","�հ�","������","���"};
		double[] score2 = new double[3];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"��° ������ �̸��� �Է��ϼ���.");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-2; j++) {
				System.out.print((j+1)+"��° ���>>");
				score[i][j] =scan.nextInt();
				if(score[i][j] >= 200) {
					System.out.println("�ٽ� �Է��ϼ���");
					j--;
					continue;
				}
				score[i][score[i].length-2] += score[i][j];
			}
			
			if(score[i][0] > score[i][1]) {
				score[i][score[i].length-1] = score[i][0];
			}else {
				score[i][score[i].length-1] = score[i][1];
			}
			score2[i] = score[i][score[i].length-1]/2.0;
		}
		
		System.out.println("-----------------------------------");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.1f \t",score2[i]);
			System.out.println();
		}
	}
}
