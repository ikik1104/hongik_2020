
public class Student {

//	String sub = {"�̸�","����","����","����","�հ�","���"} ;
	String name;
	int kor;	//����
	int eng;	//����
	int math;	//����
	int rank;	//���
	int total;	//�հ�
	double avg;	//���
	
	void total() {
		total = kor+eng+math;
	}
	
	void avg() {
		avg = total/3;
	}





}
