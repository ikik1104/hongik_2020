
public class Student {

	static int first_num =1000; //학생수
	static int stu_cnt =0; //학생수
	static int num = 999; //학번  1000번대
	int s_num;
	String name; //이름
	int kor; //국
	int eng;	//영
	int math;	//수
	int total; 	//합계
	float avg; 	//평균
	int rank; 	//등수
	
	void total () {
		total = kor+eng+math;
	}
	
	void avg () {
		avg = total/3;
	}
}
