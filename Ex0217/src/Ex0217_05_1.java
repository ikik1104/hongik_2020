import java.util.Scanner;

public class Ex0217_05_1 {
 public static void main(String[] args) {
	//��ȣ ���� ���� �ۼ��� ��ȸ��
	 //1�� �Է��� ��� ���
	 //2�� �Է��� ��� ���
	 //...
	 Scanner scan = new Scanner(System.in);
	 
	 String[] sub = {"�۹�ȣ","�ۼ���","����","����","��ȸ��"};
	 Board[] board = new Board[5];
	 int select;
	 int b_num= 0;
//1)�Խ��� ����Ʈ,�ۺ��� 2)�۾��� 3.�ۻ��� 4�ۼ��� 0����
	 
	 loop1:
	 while(true) {
	 
	 System.out.println("1)�Խ��Ǹ���Ʈ   2)�۾���   3)�ۻ���   4)�ۼ���  0)����");
	 select = scan.nextInt();
	 
	 
	 switch (select) {
	case 1:
		if(b_num== 0) {
			System.out.println("�ۼ��� �Խù��� �����ϴ�.");
			continue loop1;
		}
		for (int j = 0; j < sub.length; j++) {
			System.out.print(sub[j]+"\t");
		}
		System.out.println();
		for (int i = 0; i < b_num; i++) {
			board[i]= new Board(); 
			board[i].list();
		}
		
		System.out.println("��ȸ�Ͻ� �Խù� ��ȣ�� �Է��ϼ���.");
		select = scan.nextInt();
		
		break;
	case 2:
		board[b_num]= new Board(); 
		board[b_num].num = b_num+1;
		System.out.println("�ۼ��ڸ� �Է��ϼ���.");
		board[b_num].name = scan.next();
		System.out.println("������ �Է��ϼ���.");
		board[b_num].title = scan.next();
		System.out.println("������ �Է��ϼ���.");
		board[b_num].content = scan.next();
		b_num++;
		break;
	case 3:
		
		break;
	case 4:
		
		break;
	case 5:
		
	break;

	default:
		break;
	}
	 }
}
}
