
public class Student {

	static int first_num =1000; //�л���
	static int stu_cnt =0; //�л���
	static int num = 999; //�й�  1000����
	int s_num;
	String name; //�̸�
	int kor; //��
	int eng;	//��
	int math;	//��
	int total; 	//�հ�
	float avg; 	//���
	int rank; 	//���
	
	void total () {
		total = kor+eng+math;
	}
	
	void avg () {
		avg = total/3;
	}
}
