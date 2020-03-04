
public class Stu_info {
	// 학생 정보
	// 1. 학번 - hak_num, 이름- name , 학과- major, 학년- grade, 전화-tel
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
