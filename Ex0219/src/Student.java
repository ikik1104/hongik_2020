
public class Student {

	Student(){ //student 생성자 만들기
		
	}
	
	Student(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		math = m;
		total = k+e+m;
		avg = total/3;
		rank = 0;
	}
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	static int s_cnt = 0;
	
}
