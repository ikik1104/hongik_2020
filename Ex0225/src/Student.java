
public class Student {

	static int count = 1000;
	int hak_num;
	String name;
	int grade;
	
	{
		count++;
		hak_num = count;
	}
	
	Student() {
	}

	Student(String name, int grade ){
		this.name = name;
		this.grade = grade;
	}

}
