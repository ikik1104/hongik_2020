import java.util.Scanner;

public class Ex0217_01_test {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] sub = {"�̸�","����","����","����","�հ�","���","���"};
		int[][] score = new int[10][4];
		String[] name = new String[10];
		double[] avg = new double[10];
		int[] rank = new int[10];
		int select = 0;
		int stu = 0; //�л���?	
		String aa = " ";
		
		loop1:
		while(true) {
		System.out.println();
		System.out.println("---------------------  �л� ���� ���α׷�  ----------------------");
		System.out.println();
		System.out.println("1) �л��߰�       2) �л����      3)�л��˻�    4) �л�����   5) ���ó��     0) ����");
		System.out.println();
		System.out.println("---------------------------------------------------------");
		select = scan.nextInt();
		
		
		switch (select) {
		case 1:
			for (int i = 0; i < score.length; i++) {
				if(stu == 10) {
					System.out.println("�Է� ������ �л��� ���� �ʰ��Ͽ����ϴ�.");
					continue loop1;
				}
				System.out.println("�̸��� �Է��ϼ���. (�ڷΰ��� :99 )");
				name[i] = scan.next();
				if(name[i].equals("99")) {
					continue loop1;
				}
				
				for (int j = 0; j < score[i].length-1; j++) {
					System.out.println(name[i]+"�л��� "+sub[j+1]+"������ �Է��ϼ���");
					score[i][j] = scan.nextInt();
					if(score[i][j] <0 || score[i][j] >100) {
						System.out.println("�ٽ� �Է��ϼ���");
						j--;
						continue;
					}
					score[i][score[i].length-1] += score[i][j];
				}
				avg[i] = score[i][score[i].length-1]/3.0;
				stu++;
			}
			
			break;
		case 2:
			if(stu == 0) {
				System.out.println("�Էµ� �л��� �����ϴ�.");
				break;
			}
			for (int i = 0; i < sub.length; i++) {
				System.out.print(sub[i]+"\t");
			}
			System.out.println();
			
			for (int i = 0; i < stu; i++) {
				System.out.print(name[i]+"\t");
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%.1f \t",avg[i]);
				System.out.println(rank[i]);
			}
			break;
			
		case 3://�л��˻�
			while(true) {
				if(stu == 0) {
					System.out.println("�Էµ� �л��� �����ϴ�.");
					continue loop1;
				}
			System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.	�ڷΰ��� (99)");
			aa = scan.next();
			if(aa.equals("99")) {
				continue loop1;
			}
			for (int i = 0; i < stu; i++) {
				if(name[i].equals(aa)) {
					for (int j = 0; j < sub.length; j++) {
						System.out.print(sub[j]+"\t");
					}
					System.out.println();
					System.out.print(name[i]+"\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.printf("%.1f \t",avg[i]);
					System.out.println(rank[i]);
					continue loop1;
				}
			}
			System.out.println("�Է��� �л��� �������� �ʽ��ϴ�.");
			continue;
			
			}
		case 4://�л�����
			System.out.println("�غ����� ���� �Դϴ٤���");
			continue loop1;
			
		case 5:
			//���
			if(stu == 0) {
				System.out.println("�Էµ� �л��� �����ϴ�.");
				break;
			}
			for (int i = 0; i < score.length; i++) {
				int rank_ch = 1;
				for (int j = 0; j < score.length; j++) {
					if(score[i][score[i].length-1] < score[j][score[i].length-1]) {
						rank_ch++;
					}
				}
				rank[i] = rank_ch;
			}
			System.out.println("���ó���� �Ϸ�Ǿ����ϴ�.");
			break;
			
		case 0:
			System.out.println("�ý����� �����մϴ�.");
			break loop1;

		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			continue loop1;
		}
		
		
		
		
		}//while
  }
}
