import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Ex0304_06 {

	public static void main(String[] args) {
		/*	< ȸ������ >
		 * ��ü�� �����ϱ� ArrayList
		 * 
		 * 1)ȸ���Է�    2)ȸ�����
		 * �Է¹��� ��      id �빮�� 1���̻�, 5�ڸ� �̻�, �ߺ�üũ 
		 * 			 pw Ư������ 1���̻�, ���̴� 8�ڸ� �̻�
		 * 			�ֹι�ȣ - �����ؼ� 14�ڸ� ���� �Է�
		 * 			email @,.�ִ��� üũ
		 * 
		 * ��� 		gender 0: ����, 1:���� (���ڷ��Է¹޴´� �ƴϸ� �ٽ��Է�)
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);	
		User u = new User();
		
		while(true) {
		System.out.println("1) ȸ���Է�         2) ȸ�����");
		switch (scan.nextInt()) {
		case 1:
			System.out.println(" [  ȸ���Է�   ] ");
			u.insert();
			break;
		case 2:
			u.print();
			break;
		default:
			System.out.println("**** �߸��� �Է��Դϴ�. ****");
			break;
		}
		}
	}
}

class User{
	ArrayList<Member> m = new ArrayList<Member>();
	String[] sub = {"���̵�","��й�ȣ","�̸�","�ֹι�ȣ","����","�̸���","��ȭ��ȣ"}; 
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		String name;
		String s_number; //�ֹι�ȣ
		int gender; //����
		String email; 
		String tel;
		
		//id
		while(true) {
			System.out.println("���̵� �Է��ϼ���. (�빮�� 1�� ����, 5�ڸ� �̻�)>>");
			id = scan.next();
			
			//���̵� �ߺ�üũ
			if(!(m.isEmpty())) {
				boolean chk = id_chk(id); 
				if(chk == false) {
					System.out.println("**** �̹� �����ϴ� ���̵��Դϴ�. ****");
					continue;
				}
			}
			
			//���̵� ����üũ
			if(id.length() < 5) {
				System.out.println("**** 5�ڸ� �̻� �Է����ּ��� ****");
				continue;
			}
			
			//���̵� �빮�� üũ
			int id_cnt = 0;
			for (int i = 0; i < id.length(); i++) {
				if( id.charAt(i)>='A' && id.charAt(i) <= 'Z') { //�빮�ڰ� 1���� ����
					id_cnt++;
				}
				if(id_cnt != 0) {
					break;
				}
			}
			if(id_cnt==0) {
				System.out.println("**** �빮�ڸ� �����ؾ� �մϴ�. ****");
				continue;
			}
		 break;
		}
			
			//��й�ȣ
		while(true) {
			System.out.println("��й�ȣ�� �Է��ϼ���. ( Ư������ 1���̻�, ���� 8�ڸ� �̻� )");
			pw = scan.next();
			int pw_cnt = 0;
			if(pw.length() < 8) {
				System.out.println("**** 8�ڸ� �̻� �Է��ϼ���. ****");
				continue;
			}
			
			for (int i = 0; i < pw.length(); i++) {
				char ch = pw.charAt(i);
				
				if(!('a' <= ch && ch <= 'z')&&!('A'<=ch && ch <= 'Z')&&!('0'<=ch && ch <= '9')) {
					pw_cnt++;
				}
				if(pw_cnt != 0) {
					break;
				}
			}
			if(pw_cnt == 0) {
				System.out.println("**** Ư�����ڸ� 1���̻� �����ؾ��մϴ�. ****");
				continue;
			}
			
			break;
		}
		
		System.out.println("�̸��� �Է��ϼ���.");
		name = scan.next();
		
		//�ֹι�ȣ �Է�
		while(true) {
		System.out.println("�ֹι�ȣ�� �Է��ϼ���. (-���� 14�ڸ�)");
		s_number = scan.next();
		if(s_number.length() != 14) {
			System.out.println("**** �߸��� �Է��Դϴ�. ****");
			continue;
		}
		
		if(!(s_number.contains("-"))) {
			System.out.println("'-'�� �����Ͽ� �Է��Ͽ��ּ���.");
			continue;
		}
			break;
		}
		
		//����
		while(true) {
		System.out.println("������ �����ϼ��� 0:����  1:����");
		gender = scan.nextInt();
			if(gender!=0 && gender!=1) {
				System.out.println("**** �߸��� �Է��Դϴ�. ****");
				continue;
			}
			break;
		}
		
		//�̸���
		while(true) {
		System.out.println("�̸����� �Է��ϼ���.");
		email = scan.next();
		
		if(!(email.contains("@")&&email.contains("."))){
			System.out.println("**** �߸��� �̸��� �����Դϴ�. �ٽ� �Է��ϼ���. ****");
			continue;
		}
		break;
		}
		
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		tel = scan.next();
		
		m.add(new Member(id,pw,name,s_number,gender,email,tel));
		System.out.println("ȸ������� �Ϸ�Ǿ����ϴ�.");
		
		return;
	}
	
	//���̵� �ߺ�üũ
	boolean id_chk(String id) {
		for (int i = 0; i < m.size(); i++) {
			Member m1 = (Member)(m.get(i));
			
			if(m1.id.equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	void print(){
		if(m.isEmpty()) {
			System.out.println("**** �Էµ� ȸ���� �����ϴ�. ****");
			return;
		}
		System.out.println(" [  ȸ�����   ] ");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"      \t");
		}
		System.out.println();
		
		for (int i = 0; i < m.size(); i++) {
			Member m1 = (Member)m.get(i);
			System.out.print(m1.id+"\t");
			System.out.print(m1.pw+"\t");
			System.out.print(m1.name+"\t");
			System.out.print(m1.s_number+"\t");
			if(m1.gender == 0) {
				System.out.print("����\t");
			}else if(m1.gender == 1){
				System.out.print("����\t");
			}
			System.out.print(m1.email+"\t");
			System.out.println(m1.tel);
		}
	}
	
}
