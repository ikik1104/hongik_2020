import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ex0213_04 {

	public static void main(String[] args) {
		
		//1~100 ���� ���� 1���� �������� �̽��ϴ�.
		// �������� ������, ���ڸ� ���ߴ� ����
		//�Է��� ���ڰ� �������� 1������ ������ ���ڰ� Ů�ϴ�. - �ٽ��Է�
		//������ �۽��ϴ�. �ٽ��Է�
		//������ ����
		//������ ����) 5���Դϴ�.
		
		//�ڽ��� �Է��� ���ڸ� ��� ������ּ���
		//�ִ�20������ �ϰڴ�.
		Scanner scan = new Scanner(System.in);
		
		int ran = (int)(Math.random()*100)+1;
		int[] m_num = new int[20];
		int count = 0;
		
		while(count<20) {
			System.out.println("���� �ϳ��� �Է��ϼ���. ���� ��ȸ:"+(20-count));
			m_num[count] = scan.nextInt();
			
			if(m_num[count] > ran) {
				System.out.println("�Է��Ͻ� ���ڰ� Ů�ϴ�."+m_num[count]+"���� ���� ���ڸ� �Է��ϼ���");
			}else if(m_num[count] == ran) {
				System.out.println("*****����*****");
				count++;
				break;
			}else {
				System.out.println("�Է��Ͻ� ���ڰ� �۽��ϴ�."+m_num[count]+"���� ū ���ڸ� �Է��ϼ���");
			}
			count++;
			
		}
		if(count == 20) {
			System.out.println("------------------------------------");
			System.out.println("������ ����Ǿ����ϴ�. ");
		}else {
			System.out.println(count+"��°�� ������ϴ�.");
		}
		
		System.out.println("��÷ ���� : "+ran+"�Դϴ�.");
		System.out.print("Ƚ��:\t\t");
		for (int i = 0; i < count; i++) {
			System.out.print((i+1)+"\t");
		}
		System.out.println();
		System.out.print("���� �Է��� ����:\t");
		for (int i = 0; i < m_num.length; i++) {
			if(m_num[i] == 0) {
				break;
			}
			System.out.print(m_num[i]+"\t");
		}
		
	}
}
