import java.util.Scanner;

public class Ex0217_03 {

	public static void main(String[] args) {
//		5���� �л��� �̸����������� �Է¹޾� �հ� ��ճ���
		//��,��,�� �Է¹޾� ������ �غ�����,
		//�� 10��
//		/*
		Scanner scan = new Scanner(System.in);
		//5�� �л� ��ü ����
		Student[] stu = new Student[5];
		
		
		String[] sub = {"�̸�","����","����","����","�հ�","���"} ;
		
		
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();
			System.out.println("�̸��Է�");
			stu[i].name = scan.nextLine();
			System.out.println("���� ������ �Է��ϼ���.");
			stu[i].kor = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.");
			stu[i].eng = scan.nextInt();
			System.out.println("���� ������ �Է��ϼ���.");
			stu[i].math = scan.nextInt();
			scan.nextLine();
			stu[i].total();
			stu[i].avg();
			
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i].name + "\t");
			System.out.print(stu[i].kor + "\t");
			System.out.print(stu[i].eng + "\t");
			System.out.print(stu[i].math + "\t");
			System.out.print(stu[i].total + "\t");
			System.out.println(stu[i].avg + "\t");
		}
		
		
			/*
			for (int j = 0; j < score[i].length-1; j++) {
				System.out.println(sub[j+1]+"���� �Է�");
				score[i][j] = scan.nextInt();
				
				score[i][score[i].length-1] += score[i][j];
			}
			avg[i] = score[i][score[i].length-1] /3;
		}
		
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println(avg[i]+"\t");
		}
		
//		*/
		
		
		/*
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv2 tt1 = new Tv2();
		
		t2 = t1;
		
		t1.channel = 10;
		
		System.out.println(t2.channel);
		*/
		
		/*
    	 //tv2 class
		//volume ������ �����.. main �޼ҵ巹�� ������ 10�� �����غ�����.
		//volume Up,Down ��������.
		
		Tv2 t2 = new Tv2();
		t2.volume = 10;
		
		t2.volumeUp();
		t2.volumeDown();
		*/
		
		/*
		Tv t = new Tv();
		t.channelUp();
		System.out.println(t.power);
		t.power = true;
		*/
		
		
		/*
		Student stu1 = new Student();
		stu1.name="ȫ�浿";
		stu1.kor = 100;
		stu1.eng = 100;
		stu1.math = 90;
		stu1.total = stu1.kor+stu1.eng+stu1.math;
		stu1.avg = stu1.total/3;
		stu1.rank = 1;
		
		System.out.println(stu1.name+" "+stu1.kor+" "+stu1.eng+" ");
		*/
		
		
	}
}
