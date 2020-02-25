
public class Student2 {

	static int num ;
	int hak_num;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	{
		num++;
		hak_num = num;
	}
	
	Student2(){ //기본생성자
		this("test",50,50,50);
	}
	
	Student2(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3;
		this.rank = 0;
	}
	
	void modify () {
		total();
		avg();
		rank = 0;
	}
	
	void total () {
		total = kor+eng+math;
	}
	
	void avg () {
		avg = total/3;
	}
	
}
