import java.util.Scanner;

public class Ex0212_08 {

	public static void main(String[] args) {
		
		//����ó�� ���α׷�
		//�̸�String ,����, ����,����, �հ�int, ���(double)
		String[] name = new String[10];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		String[] subject = {"�̸�","����","����","����","�հ�","���"};
		
		Scanner scan = new Scanner(System.in);
		
		//�Է� ��
		for (int i = 0; i < score.length; i++) {
			//�̸��Է�
			System.out.println((i+1)+"�� �л��� �̸��� �Է� ���ּ���.");
			//�����Է�
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(subject[j+1]+"������ �Է��� �ּ���.");
				score[i][j] = scan.nextInt();
				//�հ��Է�
				score[i][score[i].length-1] += score[i][j]; 
//				score[i][3] + score[i][3]+score[i][j] ;
			}
			avg[i] = score[i][score[i].length-1] / (score[i].length-1); //�հ�/3 ���
//			avg[i]= score[i][3] /3 ;
		}
		
		//���
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]+"\t");
		}
		//Ÿ��Ʋ �������� ����Ű
		System.out.println( );
		
		for (int i = 0; i < score.length; i++) { //int=>[3][4]
			//�̸����
			System.out.print(name[i]+"\t");
			//���� ���
			for (int j = 0; j < score.length+1; j++) { //int[3]->[4]
				System.out.print(score[i][j]+"\t");
			}
			//������
			System.out.print(avg[i]+"\n");
		}
		
	}
}
