import java.util.*;

public class Ex0302_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Stu_info> s = new ArrayList<Stu_info>();
		String[] sub = {"�й�","�̸�","�а�","�г�","����ó"};
		loop1:
		while(true) {
			System.out.println("1) �л������Է�      2) ���      3) �˻�");
			System.out.println("-------------------------------------------");
			switch (scan.nextInt()) {
			case 1:
				while(true) {
				System.out.println("�л��� �̸��� �Է��ϼ���.>> (����ȭ�� 99)");
				String name = scan.next();
				if(name.equals("99")) {
					System.out.println("����ȭ������ ���ư��ϴ�.");
					break;
				}
				System.out.println("�л��� �а��� �Է��ϼ���.");
				String major = scan.next();
				System.out.println("�л��� �г��� �Է��ϼ���.");
				int grade = scan.nextInt();
				System.out.println("�л��� ��ȭ��ȣ�� �Է��ϼ���.");
				String tel = scan.next();
				
				s.add(new Stu_info(name,major,grade,tel));
				}
				break;
			case 2:
				if(s.isEmpty()) {
					System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
					break;
				}
				for (int i = 0; i < sub.length; i++) {
					System.out.print(sub[i]+"\t");
				}
					System.out.println();
				
				
				for (int i = 0; i < s.size(); i++) {
					Stu_info st = (Stu_info)s.get(i);
//					System.out.println(st); -> Stu_info - toString()���� ��
					
					System.out.print(st.hak_num+"\t");
					System.out.print(st.name+"\t");
					System.out.print(st.major+"\t");
					System.out.print(st.grade+"\t");
					System.out.println(st.tel+"\t");
				}
				
				break;
			
			case 3:
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.>> (����ȭ��: 99)");
				String name = scan.next();
				
				if(name.equals("99")) {
					System.out.println("����ȭ������ �̵��մϴ�.");
					break;
				}
				
				
				//------��� ���
				for (int j = 0; j < sub.length; j++) {
					System.out.print(sub[j]+"\t");
				}
				
				for (int i = 0; i < s.size(); i++) {
					Stu_info st = (Stu_info)s.get(i);//�ٽ� Stu_info�� �ֱ�
					if(name.equals(st.name)) {
						System.out.println();
						
						//�л����� ���
						System.out.println("ã�� �л���");
						System.out.print(st.hak_num+"\t");
						System.out.print(st.name+"\t");
						System.out.print(st.major+"\t");
						System.out.print(st.grade+"\t");
						System.out.println(st.tel+"\t");
					}
				}
//				System.out.println("��ġ�ϴ� �л��� �������� �ʽ��ϴ�.");
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
	}
}
