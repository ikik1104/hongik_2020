import java.util.HashMap;
import java.util.Scanner;

public class Ex0306_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("aaa", "1234");
		map.put("koitt", "k001");
		map.put("bbb", "1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.(��ҹ��� ����) >>");
			System.out.print("id :");
			String id = scan.next().trim(); //trim() �յڰ��� ������
			
			//���̵� �ߺ�üũ
			map.containsKey(id); //boolean���� ��ȯ
			if(map.containsKey(id)==false) { //�� key���� �����ϴ���?
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				continue;
			}
			System.out.print("password :");
			String pw = scan.next().trim(); //trim() �յڰ��� ������
			
			if(!(map.get(id).equals(pw))) { //value�� ��ȯ
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				continue;
			}else {
				System.out.println("�α����� �Ϸ�Ǿ����ϴ�.");
				break;
			}
			
		}//while
		
		System.out.println("�ý�������");
		
	}
}
