
public class Ex0211_08 {

	public static void main(String[] args) {
		
		/*�迭�� ���ֱ�
		 * 1���� �迭 ũ�� 10�� �����.
		 * �迭�� �������� 0,500,1000,3000 �߿� 1���� �ִ´�.
		 * 
		 * */
		
		int[] num = new int[10];
		int[] num2 = new int[10];
		int[] ran = {0,500,1000,3000};
		int a = 0;
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < ran.length; j++) {
				a = (int)(Math.random()*4);
				num[i] = ran[a];
			}
		}
		
		System.out.println("���� �� 1 :");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
		
		for (int i = 0; i < num2.length; i++) {
			int a2 = 1;
			
			a = (int)(Math.random()*4);
			if(a == 0) {
				num2[i] = 0;
			}else {
				for (int j = 0; j < a; j++) {
					a2 = a2*10;
				}
				num2[i] = a2;
			}
				
		}
		
		/*
		for (int i = 0; i < num2.length; i++) {
			
			a1 = (int)(Math.random()*3);

			switch (a1) {
			case 0:
				num2[i] =1;
				break;
			case 1:
				num2[i] =(10*1);
				break;
			case 2:
				num2[i] =(10*10);
				break;
			case 3:
				num2[i] =(10*10*10);
				break;
			}
			
		}
		*/
		
		System.out.println();
		System.out.println("���� ��2 :");
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		
	}
}
