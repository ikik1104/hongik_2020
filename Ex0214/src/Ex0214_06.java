import java.util.Scanner;

public class Ex0214_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		// ���� 3���� �Է¹޾� 3�׽��� �Ἥ ���� ū�� ã��
//		(���ǽ�)?��1:��2 ���ǽ��� ������ �� 1, Ʋ�����2

		int[] num = new int[3];
		int result = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.println((i + 1) + "��° ���ڸ� �Է��ϼ���");
			num[i] = scan.nextInt();
		}
		result = num[0] >= num[1] ? num[0] : num[1];
		result = result >= num[2] ? result : num[2];
		System.out.println(result);

		
		
		
		// ------------���ĺ� ��ȯ
//		String input="";
//		char result=' '; //���̶���� ���ϸ� ����
//		
//		System.out.println("���ĺ��� �Է��ϼ���");
//		input=scan.nextLine();
//		
//		if(!(input.length()==1)) {
//			System.out.println("�ٽ��Է��ϼ���");
//		}
//		
//		char input_1=input.charAt(0);
//		
//		if(input_1>='a'&&input_1<='z') {
////			input=input.toUpperCase();
//			result=(char)(input.charAt(0)-32);
//			
//		}
//		else if(input_1>='A'&&input_1<='Z') {
////			input=input.toLowerCase();
//			result=(char)(input.charAt(0)+32);
//			
//		}else {
//			System.out.println("�߸��Է��߽��ϴ�.");
//		}
//		System.out.println(input);
//		System.out.println(result);
//		
	}

}
