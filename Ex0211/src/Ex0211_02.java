
public class Ex0211_02 {

	public static void main(String[] args) {
		//�������� ���

		for (int i= 1; i<10; i ++) {
			
			System.out.print("["+i+"�� ] \t");
		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			if(i%3!=0) {
				continue;
			}
				for (int j = 1; j < 10; j++) {
					if(j%2 != 0) {
						continue;
					}
					System.out.print(j+"*"+i+"="+(i*j)+"\t");
				}
				System.out.println();
			}
			
		
	}
}
