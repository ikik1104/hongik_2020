import java.util.Scanner;

public class Ex0213_05 {

	public static void main(String[] args) {
		//�̸�  1���� 2 ���� 3 �հ�
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("����� �Է��ұ��?");
		num = scan.nextInt();
		
		String[] name = new String[num];
		int[][] score = new int[num][4];
		double[] avg = new double[num]; 
		int[] rank = new int[num];
		int rank_cnt = 1; //���ī��Ʈ
		int select = 0;
		String temp = "";
		String[] sub = {"�̸�","����","����","����","�հ�","���","���"};
		
			
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
			
			/*
			 	//���
			for (int i = 0; i < score.length; i++) {
				rank[i] = 1;
				for (int j = 0; j < score.length; j++) {//40 10 60
					//score[0][2] < score[0][2]  
					//score[0][2] < score[1][2]  +1
					//score[0][2] < score[2][2]  +1
					if(score[i][score[i].length-1] < score[j][score[i].length-1] ) {
						rank[i] += 1;
					}
				}
			}
			 
			 */
			
			
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
			
		
	}
}
