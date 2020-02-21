import java.util.Scanner;

public class Ex0221_01 {
	//�޼ҵ� �����ε�
	public static void main(String[] args) {
		//�������� 10���� 1���� �迭�� ����
		//1~45�� �迭�� ���� ���� �־����. ����
		//10���� �迭�� ������ �ǰڽ��ϴ�.
		//�� �ߺ��� ������� ����
		int[] num = new int [10];
		int[] ran = new int [45];
		
		while(true) {
			
			switch (main_pArr()) {
			case 1:
				inArr(ran);
				System.out.println("***  45���� �� �ֱ� �Ϸ�   ***");
				break;
			case 2:
				shuArr(ran,num);
				System.out.println("***  �������� �Ϸ�   ***");
				break;
			case 3:
				inNum(num,ran);
				System.out.println("***  10���� �� �ֱ� �Ϸ�   ***");
				break;
			case 4:
				print(num);
				System.out.println("***  10�� ��� �Ϸ�   ***");
				break;
			case 5:
				int result = numAdd(num);
				System.out.println("10���� �� : "+result);
				System.out.println("***  10�� �� ���ϱ�Ϸ�   ***");
				break;
			case 6:
				print(num);
				temp(num);
				print(num);
				System.out.println("***  10�� �����ϱ� �Ϸ�   ***");
				break;

			default:
				break;
			}
			
			                
			
			
		}
		
	}//main

		static int main_pArr() {
			Scanner scan = new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println("     1. 45���� �� �ֱ�            2. ��������");
			System.out.println("     3. 10���� �� �ֱ�            4. 10�� ���");
			System.out.println("     5. 10�� �� ���ϱ�            6. 10�� �����ϱ�");
			System.out.println("---------------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. >>");
			return scan.nextInt();
		}
	
		//���� �ֱ�
		static void inArr(int[] ran) { //1~45�� �־��ش�
			for (int i = 0; i < ran.length; i++) {
				ran[i] = i+1;
			}
		}
		
		//���� ���
		static void shuArr(int[] ran,int[] num) {
			for (int i = 0; i < 200; i++) {
				int temp1 = (int)(Math.random()*45);
				
				int temp2 = ran[0];
				ran[0] = ran[temp1];
				ran[temp1]  = temp2;
				
			}
			
			
		}

		//�������� �־��ֱ�
		static void inNum(int[] num,int[] ran) { //1~45�� �־��ش�
			for (int i = 0; i < num.length; i++) {
				num[i] = ran[i];
			}
		}
		
		
		//���� �ٲٱ�
		static void temp (int[] num) {
			
			for (int i = 0; i < num.length-1; i++) {
				boolean boo = false;
				for (int j = 0; j < num.length-1; j++) {
					if(num[j] > num[j+1]) { //�� ���ڰ� �� ũ��!
						int temp = num[j];  //�ڿ� ������ �ٲ۴�.
						num[j] = num[j+1];
						num[j+1] = temp;
						boo = true; //�ٲ���ϴ�.
					}
				}
				if(boo == false) { //�ϳ��� �ٲ��� �ʴ´� ( = ������ �Ϸ� �Ǿ���.)
					break; // �����ش� ( �ӵ� ����� ���ؼ�)
				}
			}
			
		}
		
		//10���� ��
		static int numAdd(int[] num) {
			int result = 0;
			for (int i = 0; i < num.length; i++) {
				result += num[i];
			}
			return result;
		}
		
		
		//���
		static void print(int[] num) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+"  ");
			}
			System.out.println();
		}

}
