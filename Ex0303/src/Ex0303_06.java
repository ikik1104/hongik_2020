import java.util.ArrayList;
import java.util.Scanner;

public class Ex0303_06 {

	public static void main(String[] args) {
		/*	1) �л� ���� �Է� stu_info
		 * 		- �й�, �̸�, �а�, �г� 
		 * 	2) �л����� ó�� �Է� Student
		 * 		- �й�, �̸�(�й��Է� �� �ڵ����� ��ϵǵ���), ����, ����, �հ�, ���, ���
		 * 		�й��Է� - ������ (�����޼��� ����ó��)
		 * 	3) �л����� ���
		 * 	4) �л� ���� ����
		 * 	5) �л� ���� �˻�  �й�, �̸��˻�
		 * 	6) �л� ���� �˻�	  ����, �̸��˻�
		 * 	0) ���� 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		Info in = new Info();
		
		loop:
		while(true) {
			System.out.println("----------------------------------");
			System.out.println("1) �л����� �Է�                2) �л����� �Է� ");
			System.out.println("3) �л����� ���                4) �л����� ���");
			System.out.println("5) �л����� �˻�                6) �л����� �˻� ");
			System.out.println("-----------------------------------");
			System.out.println("���ϴ� ��ȣ�� �Է��ϼ���. ( ���� : 0 )  >> ");
			switch (scan.nextInt()) {
			case 1:
				//�л� ���� �Է�
				in.st_insert();
				break;
			case 2:
				//�л� �����Է�
				in.sco_insert();
				break;
			case 3:
				//�л� ���� ���
				in.st_list();
				break;
			case 4:
				//�л� ���� ���
				in.sco_list();
				break;
			case 5:
				//�л� �˻�
				in.stu();
				break;
			case 6:
				//�����˻�
				in.sco();
				break;
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break loop;

			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
		}
		
		
	}
}

class Info {
	Exception e = new Exception("�������� �ʴ� �л��Դϴ�.( �й��� ���� �Է��ϼ���. )");
	ArrayList<Student> st = new ArrayList<Student>();
	ArrayList<Stu_score> sco = new ArrayList<Stu_score>();
	String[] st_sub = {"�й�","�̸�","�а�","�г�"};
	String[] sco_sub = {"�й�","�̸�","����","����","�հ�","���","���"};
	
	
	//�л��Է�
	void st_insert() {
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("�л��� �̸��� �Է��ϼ���. (�ڷΰ��� : 99)");
		String name = scan.next();
		if(name.equals("99")) {
			return;
		}
		System.out.println("�л��� �а��� �Է��ϼ���");
		String major = scan.next();
		System.out.println("�г��� �Է��ϼ���.");
		int grade = scan.nextInt();
		st.add(new Student(name,major,grade));
		System.out.println("****  �л� ����� �Ϸ�Ǿ����ϴ�. ****");
		}
	}
	
	//�л� ����Ʈ
	void st_list() {
		if(st.isEmpty()) { //���������?
			System.out.println("**** �Էµ� �л��� �����ϴ�. ****");
			return;
		}
		//subject���
		for (int i = 0; i < st_sub.length; i++) {
			System.out.print(st_sub[i]+"\t");
		}
		System.out.println();
		
		//content ���
		for (int i = 0; i < st.size(); i++) {
			Student s = (Student)st.get(i);
			print_stu(s);//���
		}
	}
	
	//�л� �˻�
	void stu() {
		Scanner scan = new Scanner(System.in);
		
		if(st.isEmpty()) { //���������?
			System.out.println("**** �Էµ� �л��� �����ϴ�. ****");
			return;
		}
		
		System.out.println("�˻� ����� �Է��ϼ���. 1) �й�    2) �̸�   (�ڷΰ��� : 99)");
		switch (scan.nextInt()) {
		case 1:
			System.out.println("�л��� �й��� �Է��ϼ���.");
			int hak = scan.nextInt();
			
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				
				if(s.hak_num == hak) {
					for (int j = 0; j < st_sub.length; j++) {
						System.out.print(st_sub[j]+"\t");
					}
					print_stu(s);
					return;
				}
			}
			System.out.println("**** �������� �ʴ� �л��� �й��Դϴ�. ****");
			break;
		case 2:
			System.out.println("�л��� �й��� �Է��ϼ���.");
			String name = scan.next();
			
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				
				if(s.name == name) {
					for (int j = 0; j < st_sub.length; j++) {
						System.out.print(st_sub[j]+"\t");
					}
					print_stu(s);
					return;
				}
			}
			System.out.println("**** �������� �ʴ� �л��� �й��Դϴ�. ****");
			break;
		case 99:
			
			return;

		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	//���� ��� �޼ҵ�
		void print_stu(Student s) {
			System.out.print(s.hak_num+"\t");
			System.out.print(s.name+"\t");
			System.out.print(s.major+"\t");
			System.out.println(s.grade+"\t");
		}	
	
	//----------------------------------------------------------------���� ����-----------------------------------
	
	//�л� ���� �Է�
	void sco_insert() {	
		Scanner scan = new Scanner(System.in);
		loop2:
		while(true) {
		System.out.println("������ �Է��� �л��� �й��� �Է��ϼ���. (�ڷΰ��� : 99)");
		int hak = scan.nextInt();
		if(hak == 99) {
			return;
		}
		try {
			for (int i = 0; i < st.size(); i++) {
				Student s = (Student)st.get(i);
				if(hak == s.hak_num) {
					
					//�̹� �����Է��� �Ϸ�� �л����� üũ
					for (int j = 0; j < sco.size(); j++) {
						Stu_score s1 = (Stu_score)sco.get(i); //����ȯ
						
						if(s1.hak_num == hak) { //��������Ʈ�� �й��� ������
							System.out.println("**** �̹� ������ ��ϵ� �л��Դϴ� ****");
								return;
						}
					}
					
					System.out.println("���� ������ �Է��ϼ���.");
					int kor = scan.nextInt();
					System.out.println("���� ������ �Է��ϼ���.");
					int eng = scan.nextInt();
					sco.add(new Stu_score(s.hak_num,s.name,kor,eng));
					System.out.println("**** "+s.name+"�л��� �����Է��� �Ϸ�Ǿ����ϴ�. ****");
					rank(); //����ó��
					continue loop2;
				}
			}
			throw e;//����� ���������� ��ġ�ϴ� �л��� ���°�
			
		} catch (Exception e) {
			System.out.println("ERROR :"+e.getMessage());
		}
		
		} //while
	}
	
	//���� ���
	void sco_list() {
		

		//�Էµ� ������ ������
		if(sco.isEmpty()) {	
			System.out.println("**** �Էµ� �л��� �����ϴ�. ****");
			return;
		}
		
		//subject ���
		for (int i = 0; i < sco_sub.length; i++) {
			System.out.print(sco_sub[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < sco.size(); i++) {
			Stu_score s = (Stu_score)sco.get(i);
			print_score(s); //��� �޼ҵ�
		}
	}
	
	//�л� ���� �˻�
		void sco() {
			Scanner scan = new Scanner(System.in);
			
			if(sco.isEmpty()) {	//�Էµ� ������ ������
				System.out.println("**** �Էµ� �л��� �����ϴ�. ****");
				return;
			}
			
			while(true) {
			System.out.println("�˻� ����� �Է��ϼ���. 1) �й�    2) �̸�   (�ڷΰ��� : 99)");
			switch (scan.nextInt()) {
			case 1:
				
				System.out.println("�л��� �й��� �Է��ϼ���.");
				int hak = scan.nextInt();
				
				for (int i = 0; i < sco.size(); i++) {
					Stu_score s = (Stu_score)sco.get(i);
					if(s.hak_num == hak) {
						for (int j = 0; j < sco_sub.length; j++) {
							System.out.print(sco_sub[j]+"\t");
						}
						print_score(s); //��� �޼ҵ�
						return;
					}
				}
				System.out.println("**** �������� �ʴ� �л��� �й��Դϴ�. ****");
				
				break;
			case 2:
				
				System.out.println("�л��� �̸��� �Է��ϼ���.");
				String name = scan.next();
				
				for (int i = 0; i < sco.size(); i++) {
					Stu_score s = (Stu_score)sco.get(i);
					if(s.name == name) {
						
						for (int j = 0; j < sco_sub.length; j++) {
							System.out.print(sco_sub[j]+"\t");
						}
						print_score(s); //��� �޼ҵ�
						return;
					}
				}
				System.out.println("**** �������� �ʴ� �л��Դϴ�. ****");
				
				break;
			case 99:
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}
			
		}
		}
	//���� ��� �޼ҵ�
		void print_score(Stu_score s) {
			
			System.out.println();
			System.out.print(s.hak_num+"\t");
			System.out.print(s.name+"\t");
			System.out.print(s.kor+"\t");
			System.out.print(s.eng+"\t");
			System.out.print(s.total+"\t");
			System.out.print(s.avg+"\t");
			System.out.println(s.rank+"\t");
		}
		
		
	//���ó��
		void rank() {
			for (int i = 0; i < sco.size(); i++) {
				Stu_score s1 = (Stu_score)sco.get(i); //����ȯ
				int rank = 1;
				for (int j = 0; j < sco.size(); j++) {
						Stu_score s2 = (Stu_score)sco.get(j); //����ȯ
					if(s1.total < s2.total) {
						rank++;
					}
				}
				s1.rank = rank;
			}
		}
	
}


class Student{
	static int count = 0;
	int hak_num;
	String name;
	String major;
	int grade;
	
	{
		hak_num = ++count;
	}
	
	Student() {
	}
	
	Student(String name, String major, int grade){
		this.name = name;
		this.major = major;
		this.grade = grade;
	}
}


class Stu_score{
	
	int hak_num;
	String name;
	int kor;
	int eng;
	int total;
	double avg;
	int rank;
	
	Stu_score(){
		
	}
	
	Stu_score(int hak_num, String name, int kor, int eng){
		this.hak_num = hak_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.total(kor, eng);
		this.rank=0;
	}
	
	void total(int kor, int eng) {
		this.total = kor + eng;
		this.avg = total/2;
	}
	
}


