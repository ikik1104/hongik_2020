import java.util.Scanner;

public class Ex0213_05_01 {

	public static void main(String[] args) {
		//�̸�  1���� 2 ���� 3 �հ�
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3]; 
		int[] rank = new int[3];
		int rank_cnt = 1; //���ī��Ʈ
		int select = 0;
		String temp = "";
		String[] sub = {"�̸�","����","����","����","�հ�","���","���"};
		
		//�л�����ó�� ���α׷�
		//1. �л������߰� 2. �л���������, 3 �л����� ����, 0����
		//1 -> �������� �Է� ...
		while(true) {
		System.out.println("------------------[ �л� ����ó�� ���α׷� ]-----------------");
		System.out.println("1.�л����� �߰�\t2.�л����� ����\t3.�л����� ����\t0.����");
		select = scan.nextInt();

		switch (select) {
		case 1: //1. �л������߰�
			
			for (int i = 0; i < score.length; i++) {
				System.out.println((i+1)+"��° �л� �̸��� �Է��ϼ���");
				name[i] = scan.next(); //�̸��ޱ�
				name[i].trim(); //������ ������
				for (int j = 0; j < score[i].length-1; j++) {
					System.out.println(name[i]+" �л��� "+sub[j+1]+"������ �Է��ϼ���.");
					score[i][j] = scan.nextInt();
					
					if(score[i][j]<0 ||score[i][j]>100) {
						System.out.println("�ٽ� �Է��ϼ���.");
						j--;
						continue;
					}//if
					
					score[i][score[i].length-1] += score[i][j]; //�հ� �ֱ�
				}//for j
				avg[i] = score[i][score[i].length-1]/2.0; //��հ��
			}//for i
			
			//���
			for (int i = 0; i < score.length; i++) {
				rank_cnt = 1;
				for (int j = 0; j < score.length; j++) {//40 10 60
					//score[0][2] < score[0][2]  1
					//score[0][2] < score[1][2]  1
					//score[0][2] < score[2][2]  3
					if(score[i][score[i].length-1] < score[j][score[i].length-1] ) {
						rank_cnt++;
					}
				}
				rank[i] = rank_cnt; //����Է�
			}
			
			//subject ���
				for (int i = 0; i < sub.length; i++) {
					System.out.print(sub[i]+"\t");
					}	
				System.out.println();
				
			
			//������ ���
			for (int i = 0; i < score.length; i++) {
				System.out.print(name[i]+"\t"); //�̸����
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t"); //���������
				}
				System.out.print(avg[i]+"\t");
				System.out.println(rank[i]+"\t");
			}
			
			break;
		case 2: //2. �л���������
			System.out.println("������ ������ �л��� �̸��� �Է��ϼ���");
//			temp = scan
			break;
		case 3:
			break;
		case 0:
			break;
		default:
			break;
		}
		
		}
		
	}
}
