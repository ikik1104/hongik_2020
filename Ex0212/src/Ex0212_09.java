import java.util.Scanner;

public class Ex0212_09 {

	public static void main(String[] args) {
		// �Խ��� ���α׷�
		// ��ȣ(������ ) �̸� ���� �۳��� (String) ��ȸ�� (int)
		
		
		//10������ �Է°��� -> 1�����ϰ� ����� �� ������.
		//1) �۾���, 2 ���- ����Ʈ 1) �б�,2)����,3)����
		Scanner scan = new Scanner(System.in);
//		int[] num = new int[2];
		String[] sub = {"�۹�ȣ","�̸�","����","�۳���","��ȸ��"};
		String[][] bor = new String[2][4];
		int count = 0;
		int b_count = 0;
		

		while(true) {
		for (int i = 0; i < bor.length; i++) {
//			 num[i] = i+1;
			for (int j = 0; j < bor[i].length-1; j++) {
				System.out.println(sub[j+1]+"�� �Է��ϼ���.");
				bor[i][j] = scan.nextLine();
			}
			bor[i][bor[i].length-1] = "0";
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t\t");
		}
		System.out.println();
		for (int i = 0; i < bor.length; i++) {
//			�۹�ȣ
			System.out.print((i+1)+"\t\t");
			for (int j = 0; j < bor[i].length; j++) {
				
				System.out.print(bor[i][j]+"\t\t");
			}
			System.out.println();
		}
		
		}
		
		
	}
}
