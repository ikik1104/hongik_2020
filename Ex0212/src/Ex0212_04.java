import java.util.Scanner;

public class Ex0212_04 {

	public static void main(String[] args) {
		
		//�л����� ������ �Է��ϴ� �迭
		//�̸��� �Է��ϴ� �迭 3
		//������ �Է��ϴ� �迭[3][3]
		Scanner scan = new Scanner(System.in);
//		/*
		String[] name = new String[3];
		int[][] score = new int[3][4];
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			name[i] = scan.next();
			//�����Է�
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println("�����Է� >>");
				score[i][j] = scan.nextInt();
			}
			
			//�հ�
			for (int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j]; 
			}
		}
		
		
		
		
		System.out.println("\t"+"����\t"+"����\t"+"����\t"+"�հ�\t\n");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" :\t");
			for (int j = 0; j < score.length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
//		*/
		
		/*
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		
		for (int i = 0; i < name.length; i++) {
			System.out.println((i+1)+"��° �л��� �̸��� �Է��ϼ���.");
			for (int j = 0; j < score.length; j++) {
				name[i] = scan.next();
				for (int k = 0; k < score[j].length; k++) {
					System.out.println("�����Է�");
					score[j][k] = scan.nextInt();
					/*
					if(k==0) {
						System.out.println("���� ������ �Է��ϼ���.");
						score[j][k] = scan.nextInt();
					}else if(k==1) {
						System.out.println("���� ������ �Է��ϼ���.");
						score[j][k] = scan.nextInt();
					}else {
						System.out.println("���������� �Է��ϼ���.");
						score[j][k] = scan.nextInt();
					}
			
					
				}
			}
		}
		
			
			System.out.println("�ȳ�");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0;  j< score.length; j++) {
				for (int k = 0; k < score.length; k++) {
					System.out.print(score[j][k]+"\t");
				}
			}
			System.out.println();
		}
	
				*/
		
		
		
	}
}
