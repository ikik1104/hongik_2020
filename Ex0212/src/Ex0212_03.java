import java.util.Scanner;

public class Ex0212_03 {

	public static void main(String[] args) {
		//�迭 12��¥��
		String[] ganji = {"��","��","ȣ����","�䳢","��","��","��","��","������","��","��","����"}; //�����ι�������̽�������
		String[] ganji2 = {"��","��","��","��","��","��","��","��","��","��","��","��"};
		
		Scanner scan = new Scanner(System.in);
		int select = 0;
		String select2 = "";
		int count =0;
		
		while(count<=12) {
			System.out.println("���������� �ϳ� �Է�");
			select2 = scan.next();
			
			for (int i = 0; i < ganji2.length; i++) {
				if(ganji2[i].equals(select2)) {
					System.out.println(select2+"��(��) ���������� "+(i+1)+" ��°�� "+ganji[i]);
					break;
				}
			}
			
			count++;
			
			/*
		System.out.println("1~12������ ���ڸ� �Է��ϼ���. >>");
		select = scan.nextInt();
		
		System.out.println(select+"��° ���? "+ganji[select-1]+"/"+ganji2[select-1]);
	
	*/
		}
		
		
		
	}
}
