
public class Student {

	static int count = 0;
	int hak_num;
	String name;
	int kor;
	int eng;
	int total;
	float avg;
	int rank;
	
	{
		hak_num = ++count;
	}
	
	Student(){
		
	}
	
	Student(String name,int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total = kor + eng;
		this.avg = total/2;
		this.rank = 0;
	}
}
