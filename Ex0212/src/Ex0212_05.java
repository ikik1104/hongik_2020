import java.util.Scanner;

public class Ex0212_05 {

	public static void main(String[] args) {
		//�̸�, ����, ����, ����, ����,�հ�
		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][5];
		String[] sub = {"����","����","����","����","�հ�"};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i+1)+"��° �л��� �̸��� �Է��ϼ���");
			name[i] = scan.next();
			for (int j = 0; j < score[i].length-1; j++) {
						System.out.println(sub[j]+"������ �Է��ϼ���.");
						score[i][j] = scan.nextInt();
					
					//�հ�
					score[i][score[i].length-1] += score[i][j];
			}
		}//for
		
		System.out.println("-----------------------------------------");
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]+"\t");
		}
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
