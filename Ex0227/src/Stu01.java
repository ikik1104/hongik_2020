
final class Stu01 {//�ڵ����� ObjectŬ������ extends��
	
	
	private static Stu01 s = new Stu01(); //** �̱��� ( �ϳ��� ���� �̿��� �� �ְ� ��������) / Ŭ����(static = �����ϸ� �ٷ� �Ҵ�ȴ�.)
	
	
	private int hak_num;
	private String name;
	private int kor;
	
	private Stu01() { /*�ʱ�ȭ ��*/ }

	public static Stu01 geInstance() { //*** �̱����� ����ϱ����� �޼ҵ�
		if(s == null) {
			s = new Stu01();
		}
		return s;
	}
	
	//main���� new�����ڸ� ���� stu�� �������� ���Ѵ� (private�� ���� Ŭ����������) 
	

	public int getHak_num() {
		return hak_num;
	}



	public String getName() {
		return name;
	}



	

	public int getKor() {
		return kor;
	}





	public String toString() {
		return "�й� :"+hak_num+" / �̸� :"+name+" / �������� :"+kor;
	}
}
