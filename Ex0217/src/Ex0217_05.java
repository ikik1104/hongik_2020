import java.util.Scanner;

public class Ex0217_05 {
 public static void main(String[] args) {
	//��ȣ ���� ���� �ۼ��� ��ȸ��
	 //1�� �Է��� ��� ���
	 //2�� �Է��� ��� ���
	 //...
	 Scanner scan = new Scanner(System.in);
	 int b_num = 0;
	 String[] sub = {"�۹�ȣ","�ۼ���","����","����","��ȸ��"};
	 Board[] board = new Board[5];
	 
	 for (int i = 0; i < board.length; i++) {
		board[i]= new Board(); 
//		System.out.println("��ȣ�� �Է��ϼ���.");
//		board[i].num = scan.nextInt();
		board[i].num = b_num+1;
		System.out.println("�ۼ��ڸ� �Է��ϼ���.");
		board[i].name = scan.next();
		System.out.println("������ �Է��ϼ���.");
		board[i].title = scan.next();
		System.out.println("������ �Է��ϼ���.");
		board[i].content = scan.next();
		b_num++;
		
		
		
		System.out.println("--------------------------------------");
		System.out.println("             [ �� ����Ʈ ��� ]");
		System.out.println("--------------------------------------");
		for (int j = 0; j < sub.length; j++) {
			System.out.print(sub[j]+"\t");
		}
		System.out.println();
		for (int j = 0; j < b_num; j++) {
			board[j].list();
		}
	}
	 
}
}
