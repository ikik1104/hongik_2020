import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

//Student class
public class Ex0302_02 {
	public static void main(String[] args) {
		// Student ��ü
		// �л� 10��
		// ����ó�����α׷�
		// ���� - Student[] stu = new Student[10];
		// ---> Vector list = new Vector();

		Scanner scan = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>(); //student ��ü�� ���� �� �ִ�.
		
		String[] name1 = {"ȫ�浿","�̼���","������"};
		int[] kor1 = {100,90,95};
		int[] eng1 = {80,70,89};

		list.add(new Student(name1[0],kor1[0],eng1[0]));
		list.add(new Student(name1[1],kor1[1],eng1[1]));
		list.add(new Student(name1[2],kor1[2],eng1[2]));
		
		if(list.isEmpty()) {
			System.out.println("�Էµ� �л��� �����ϴ�.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student s = (Student)list.get(i);
				System.out.print(s.hak_num+"\t"); 
				System.out.print(s.name+"\t"); 
				System.out.print(s.kor+"\t"); 
				System.out.print(s.eng+"\t"); 
				System.out.print(s.total+"\t"); 
				System.out.print(s.avg+"\t"); 
				System.out.println(s.rank);

			}
		}
		
		/*
		while(true) {
			
		System.out.println("�̸��� �Է��ϼ���");
		String name = scan.next();
		System.out.println("���� ������ �Է��ϼ���");
		int kor = scan.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int eng = scan.nextInt();
		
		list.add(new Student(name, kor, eng)); //���Ϳ� ����
		System.out.println("���� �߰��� �Ϸ�Ǿ����ϴ�.");
		
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.name + ","+ stu.kor);
		}

		}
		*/
		
		
	}
}

