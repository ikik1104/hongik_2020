
public class Student {

//	String sub = {"이름","국어","영어","수학","합계","평균"} ;
	String name;
	int kor;	//국어
	int eng;	//영어
	int math;	//수학
	int rank;	//등수
	int total;	//합계
	double avg;	//평균
	
	void total() {
		total = kor+eng+math;
	}
	
	void avg() {
		avg = total/3;
	}





}
