
public class Member {

	String id;
	String pw;
	String name;
	String s_number; //주민번호
	int gender; //성별
	String email; 
	String tel;

	
	Member(){
		
	}
	
	Member(String id, String pw, String name, String s_number, int gender, String email, String tel){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.s_number = s_number;
		this.gender = gender;
		this.email = email;
		this.tel = tel;
	}
	
	
}
