
public class Stu_info {
	// �л� ����
	// 1. �й� - hak_num, �̸�- name , �а�- major, �г�- grade, ��ȭ-tel
	static int cnt = 0;
	int hak_num;
	String name;
	String major;
	int grade;
	String tel;
	
	{
		hak_num = ++cnt;
	}
	
	Stu_info(){
		
	}
	
	Stu_info(String name, String major, int grade, String tel){
		this.name = name;
		this.major = major;
		this.grade = grade;
		this.tel = tel;
		
	}
	
	/*
	public String toString() {
		
		return "??";
	}
	*/
	
}
