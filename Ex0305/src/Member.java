
class Member{
	String id;	//아이디
	String pw;	//비밀번호
	String name;	//이름
	String tel;	//전화번호
	int money;	//잔액?
	int bonuspoint;	//포인트
	
	Member(){
		
	}
	Member(String id, String pw, String name, String tel){
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.bonuspoint = 0;
		this.money = 10000;
	}
	
}