import java.util.Scanner;

public class Ex0212_07 {

	public static void main(String[] args) {
		//����ó�� ���α׷�
		//�̸� ,����, ����, ����, �հ�, ���
		Scanner scan = new Scanner(System.in);
		String[] sub = {"�̸�","����","����","����","�հ�","���"};
		double[] avg = new double[3];
		int[][] score = new int[3][4];
		String[] name = new String[3];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"������ �Է��ϼ���");
				score[i][j] = scan.nextInt();
				score[i][score[i].length-1] += score[i][j];
			}
//			score[i][score[i].length] = score[i][score[i].length-1];   ----????
			//���
			avg[i] = score[i][score[i].length-1]/2.0;
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%.1f",avg[i]);
			System.out.println();
		}
		
	}
}
