
public class Ex0227_01 {

	public static void main(String[] args) {
		Stu01 s1 = Stu01.geInstance(); //�̱��� �޼ҵ�� �Ѿ��. (�ּҰ��� �Ѱ���)
		Stu01 s2 = Stu01.geInstance(); // s1 == s2 ���ο� ��ü�� �ƴ϶� ���� ���� �ٶ󺻴�.
//		s1.setName("ȫ�浿");
//		s2.setName("�̼���");
		
		//Time t = new Time();
		//Time t2 = new Time2();
		// t2 = t;
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
