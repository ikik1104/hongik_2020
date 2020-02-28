
final class Stu01 {//자동으로 Object클래스를 extends함
	
	
	private static Stu01 s = new Stu01(); //** 싱글톤 ( 하나만 만들어서 이용할 수 있게 돌려쓴다) / 클래스(static = 구동하면 바로 할당된다.)
	
	
	private int hak_num;
	private String name;
	private int kor;
	
	private Stu01() { /*초기화 블럭*/ }

	public static Stu01 geInstance() { //*** 싱글톤을 사용하기위한 메소드
		if(s == null) {
			s = new Stu01();
		}
		return s;
	}
	
	//main에서 new연산자를 통해 stu에 접근하지 못한다 (private는 같은 클래스에서만) 
	

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
		return "학번 :"+hak_num+" / 이름 :"+name+" / 국어점수 :"+kor;
	}
}
