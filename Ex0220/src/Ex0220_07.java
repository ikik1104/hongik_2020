
public class Ex0220_07 {
	public static void main(String[] args) {
		//1~25���� �������� 5���� ���ڸ� �迭�� �ְ�
		//�� ��� �ִ밪�� ���Ͻÿ�.
		int[] ran = new int[5];
		int[] num = new int[25];
		
			insert_1(num);
			shuff(num,ran);
			print(ran);
		
	}
	
	//���� �ֱ�
	static void insert_1(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
	}
	
	//���� ���� �ֱ�
	static void shuff(int[] num,int[] ran) {
		for (int i = 0; i <100; i++) {
			int number = (int)(Math.random()*25);
			
			int temp = num[0];
			num[0] = num[number];
			num[number] = temp;
		}
		
		for (int i = 0; i < ran.length; i++) {
				ran[i] = num[i];
		}
		
		
//		for (int i = 0; i < ran.length-1; i++) {
//			boolean change = false;
//			for (int j = 0; j < ran.length-1; j++) {
//				if(ran[j]>ran[j+1]) {
//					int temp = ran[j+1];
//					ran[i+1] = ran[j];
//					ran[j] = temp;
//					change = true;
//				}
//				if(change==false) {
//					break;
//				}
//			}
//		}
	}
	
	static void print(int[] ran) {
		for (int i = 0; i < ran.length; i++) {
			System.out.print(ran[i]+" ");
		}
		int max = Math.max(ran[4], Math.max(ran[3], Math.max(ran[2], Math.max(ran[1], ran[0]))));
		System.out.println("�ִ밪 :"+max);
	}
}
