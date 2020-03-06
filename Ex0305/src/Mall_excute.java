import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mall_excute {
	//���๮ ��
	ArrayList<Member> m = new ArrayList<Member>(); //ȸ�� array
	ArrayList<Buy> buy = new ArrayList<Buy>(); //���� array
	HashMap log = new HashMap();
	//���ŵ� ��ǰ ����Ʈ..?? ����
	String[] sub = {"���̵�","��й�ȣ","�̸�","��ȭ��ȣ","�����ݾ�","����Ʈ"};
	String[] st = {"������","��ǰ��","��ǰ����","��ǰ����Ʈ","�����Ͻ�"};
	String nowId = null; //��ǰ���� �Է��� ���̵�
	
	void start() {
		m.add(new Member("222","11111","ȫ�浿","01035352651"));
		m.add(new Member("admin","11111","admin","01052351535"));
		m.add(new Member("333","11111","��ȫ��","01051352153"));
		m.add(new Member("111","11111","����ȫ","01052351535"));
	}
	
	//ȸ�� ����------------------------------------------------------------------
	void insert() {
		String id;	//���̵�
		String pw;	//��й�ȣ
		String name;	//�̸�
		String tel;	//��ȭ��ȣ
		
		Scanner scan = new Scanner(System.in);
		
		//���̵��Է�
		loop1:
		while(true) {
			System.out.println("���̵� �Է��ϼ���.(3~5�ڸ�) >>");
			id = scan.next().trim();
			//����üũ
			if(id.length() < 3 || id.length()>5 ) {
				System.out.println("3~5�ڸ��� �Է����ּ���");
				continue;
			}
			//�ߺ�üũ
			for (int i = 0; i < m.size(); i++) {
				Member mm = (Member)m.get(i);
				if(mm.id.equals(id)) {
					System.out.println("�̹� �����ϴ� ���̵� �Դϴ�.");
					continue loop1;
				}
			}
			System.out.println("��밡���� ���̵� �Դϴ�.");
			break;
		}//while
		
		//��й�ȣ �Է�
		while(true) {
			System.out.println("�н����带 �Է��ϼ���.(5~10�ڸ�) >>");
			pw = scan.next();
			//��й�ȣ ���� üũ
			if(pw.length() < 5 || pw.length()>10 ) {
				System.out.println("5~10�ڸ� �Է����ּ���");
				continue;
			}else {
				System.out.println("�н����带 �ѹ� �� �Է��ϼ���.��Ȯ��  >>");
				String pw_chk = scan.next();
				if(pw.equals(pw_chk)) {
					break; //while�� ����������
				}else {
					System.out.println("�Է��� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				}
			}
		}

		//�̸�
		System.out.println("�̸��� �Է��ϼ���. >>");
		name = scan.next();
		
		//��ȭ��ȣ
		System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
		tel = scan.next();
		
		//member ����Ʈ�� �־���
			m.add(new Member(id,pw,name,tel));
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			
	}//insert
	
	//�α���------------------------------------------------------------------
	void login() {
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		int index = 0;
		boolean chk = false;
		
		//�α���map�� ���������
		if(!(log.isEmpty())) {
			System.out.println("�̹� �α��λ����Դϴ�. �α׾ƿ� �� �ٽ� �α������ּ���.");
			return; //��������
		}
		
		while(true) {
		System.out.println("���̵� �Է��ϼ���.");
		id = scan.next();
		
		//�ߺ�üũ
		for (int i = 0; i < m.size(); i++) {
			Member mm = (Member)m.get(i);
			if(mm.id.equals(id)) {
				chk = true;//��ġ�ϴ� ���̵� ã��
				index = i; //�ε��� ����(��й�ȣ�� ���ؼ�)
				break;
			}
		}
		if(chk == false) {
			System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
			continue;
		}
		
		System.out.println("�н����带 �Է��ϼ���.");
		pw = scan.next();
		
		Member mm = (Member)m.get(index); //���̵�� ���� �ε����� ȸ�������� ������
		if(!(mm.pw.equals(pw))) {//�Է��� ��й�ȣ�� �н����尡 ��ġ���� ������
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			continue;//��������
		}//��ġ�ϸ� �׳� �Ѿ
		
		System.out.println(id+"ȸ������ �α����� �Ϸ�Ǿ����ϴ�.");
		
		nowId = id;//���� �α��� �Ǿ��ִ� ���̵� ��� String����
		log.put(id,pw); //�α��� ��ü�� �־���
		return;//�ǵ��� ����.
		}//while
	}//login
	
	//�α׾ƿ�------------------------------------------------------------------
	void logout() {
		Scanner scan = new Scanner(System.in);
		//�α���map�� �ƹ��͵� ������ (�α��� �� ���°� �ƴ϶��)
		if(log.isEmpty()) {
			System.out.println("�α��� ������ ȸ���� �����ϴ�.");
			return;
		}
		
		System.out.println("�α׾ƿ��Ͻðڽ��ϱ�? 1) ��    2)�ƴϿ�");
		switch (scan.nextInt()) {
		
		case 1:
			log.clear(); //�α��� ��ü �ʱ�ȭ
			nowId = null; // ���� �α��� ���̵� �������� �ٲ�
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
			break;
		case 2:
			return; //�ڷΰ���
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	//ȸ������ �˻�------------------------------------------------------------------
	void u_select() {
		//�α��� �Ǿ��ִ� ���̵� null or �α����� �Ǿ��ִٸ� id�� admin���� üũ
		if( nowId == null || !(nowId.equals("admin"))) {
			System.out.println("���ٱ����� �����ϴ�.");
			return;
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻�� �Է��ϼ���. >> ");
		String text = scan.next();
		boolean chk = false; //��ȸ����� ã�� ����
		
		//�������Ʈ�� �ƹ��� ������
		if(m.isEmpty()) {
			System.out.println("���Ե� ȸ���� �����ϴ�.");
			return;
		}
		
		System.out.println("---------'"+text+"'(��)�� �˻��� ȸ������Ʈ�Դϴ�.--------");
		
		//sub���
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
		System.out.println();
		
		//���
		for (int i = 0; i < m.size(); i++) {
			Member mm = (Member)m.get(i);
			if(mm.name.contains(text)) { //�Է��� �ܾ �̸��� ���Ե� ������ ã�´�
				System.out.print(mm.id+"\t");
				System.out.print(mm.pw+"\t");
				System.out.print(mm.name+"\t");
				System.out.print(mm.tel+"\t");
				System.out.print(mm.money+"\t");
				System.out.println(mm.bonuspoint);
				chk = true; //�˻������ �ϳ��� ������
			}
		}
		//�˻� ����� ������
		if(chk == false) {
			System.out.println("��ȸ����� �����ϴ�.");
		}
	}
	
	//ȸ����������(�̸����� ��������)------------------------------------------------------------------
	void u_list() {
		Scanner scan = new Scanner(System.in);
		//�α����� �Ǿ����� ������.
		if( nowId==null || log.isEmpty()) {
			System.out.println("���ٱ����� �����ϴ�.");
			return;
		}
		//admin���� �α��� �Ǿ�������
		if(nowId.equals("admin")) {
			//���Ե� ȸ���� ������
			if(m.isEmpty()) {
				System.out.println("���Ե� ȸ���� �����ϴ�.");
				return;
			}
			//��¹�� ����
			System.out.println("1) �Է¼�    2) ���̵��    3) �̸���");
			switch (scan.nextInt()) {
			case 1: //�Է¼�
				//�׳� ����Ѵ�.
				break;
			case 2: //���̵��
				//���̵������ ����...
				Collections.sort(m,new Comparator<Member>() {
					@Override
					public int compare(Member o1, Member o2) {
						// TODO Auto-generated method stub
						return o1.id.compareTo(o2.id);
					}
				});
				break;
			case 3: //�̸���
				//�̸����� ����...
				Collections.sort(m,new Comparator<Member>() {
					@Override
					public int compare(Member o1, Member o2) {
						// TODO Auto-generated method stub
						return o1.name.compareTo(o2.name);
					}
				});
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				break;
			}

		//sub���
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"\t");
		}
			System.out.println();
		//��ü ȸ�� ���
		for (int i = 0; i < m.size(); i++) {
			Member mm = (Member)m.get(i);
			System.out.print(mm.id+"\t");
			System.out.print(mm.pw+"\t");
			System.out.print(mm.name+"\t");
			System.out.print(mm.tel+"\t");
			System.out.print(mm.money+"\t");
			System.out.println(mm.bonuspoint);
		}
		//�ڽ��� ������ ���
		}else {
			for (int i = 0; i < m.size(); i++) {
				Member mm = (Member)m.get(i);
				if(mm.id.equals(nowId)) { //���� �α��� �� ȸ���� ��ġ�ϴ� ����
				System.out.print(mm.id+"\t");
				System.out.print(mm.pw+"\t");
				System.out.print(mm.name+"\t");
				System.out.print(mm.tel+"\t");
				System.out.print(mm.money+"\t");
				System.out.println(mm.bonuspoint);
				}
			}
		}
	}
	
	//���� ��� ------------------------------------------------------------------
	void buy_list() {
		int sum = 0;// ���� �Ѿ�
		int cnt = 0; //���� ����

		//�α����� �ƴϸ�
		if(log.isEmpty()) {
			System.out.println("�α��� �� ��ȸ �����մϴ�.");
			return;
		}
		
		//sub���
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]+"\t");
		}
		System.out.println();
		
		//admin�� ��� ��ü ���� ���
		if(nowId.equals("admin")) {
			for (int i = 0; i < buy.size(); i++) {
				Buy b = (Buy)buy.get(i);
					sum += b.price; // �����տ� ����
					cnt++; //���� �߰�
					System.out.print(b.id+"\t");
					System.out.print(b.name+"\t");
					System.out.print(b.price+"\t");
					System.out.print(b.bonuspoint+"\t");
					System.out.println(b.d+"\t");
					
			}
			System.out.println("-----------------------------------------");
			System.out.println("�� �Ǿ� �ݾ� :"+sum);
			System.out.println("�� �Ǹ� ���� :"+cnt);
			
		}else {//admin�� �ƴ� ���, �α����� ȸ���� ���� ���
			for (int i = 0; i < buy.size(); i++) {
				Buy b = (Buy)buy.get(i);
				if(b.id.equals(nowId)) {
					sum += b.price;
					cnt++;
					System.out.print(b.id+"\t");
					System.out.print(b.name+"\t");
					System.out.print(b.price+"\t");
					System.out.print(b.bonuspoint+"\t");
					System.out.println(b.d+"\t");
				}
			}
			System.out.println("-----------------------------------------");
			System.out.println("�� ���� �ݾ� :"+sum);
			System.out.println("�� ���� ���� :"+cnt);
		}
	}
	
	//Tv����------------------------------------------------------------------
	void tv(Tv t) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ǰ�� :"+t.name);
		System.out.println("���� :"+t.price +" ��" );
		System.out.println("ȭ�� :"+t.screen);
		System.out.println("ȭ����ġ :"+t.inch+"��ġ");
		System.out.println("1) �����ϱ�   2)�ڷΰ���");
		switch (scan.nextInt()) {
		case 1:
			
			if(log.isEmpty()) {
				System.out.println("�α��� �� �̿��ϼ���.");
				break;
			}
			
			for (int i = 0; i < m.size(); i++) {
				Member mm = (Member)m.get(i);
				if(mm.id.equals(nowId)){
					
					if(mm.money < t.price) {
						System.out.println("�ܾ��� �����մϴ�.");
						return;
					}
					
					mm.money -= t.price; //������
					mm.bonuspoint += t.bonusPoint; //����Ʈ ����
					buy.add(new Buy(mm.id,t.name,t.price,t.bonusPoint));
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
				}
			}
			System.out.println();
			break;
		case 2:
			return;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	//����� ����------------------------------------------------------------------
	void ref(Ref r) {
		Scanner scan = new Scanner(System.in);

		System.out.println("��ǰ�� :"+r.name);
		System.out.println("���� :"+r.price +"��");
		System.out.println("ũ�� :"+r.liter +"����");
		System.out.println("�� �������� :"+r.door +"��");
		System.out.println("1) �����ϱ�   2)�ڷΰ���");
		switch (scan.nextInt()) {
		case 1:
			
			if(log.isEmpty()) {
				System.out.println("�α��� �� �̿��ϼ���.");
				break;
			}
			
			for (int i = 0; i < m.size(); i++) {
				Member mm = (Member)m.get(i);
				if(mm.id.equals(nowId)){ //�α��ε� ���̵� == ȸ�����̵�
					
					if(mm.money < r.price) {
						System.out.println("�ܾ��� �����մϴ�.");
						return;
					}
					
					mm.money -= r.price; //������
					mm.bonuspoint += r.bonusPoint; //����Ʈ ����
					buy.add(new Buy(mm.id,r.name,r.price,r.bonusPoint));
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
				}
			}
			System.out.println();
			break;
		case 2:
			return;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	//��Ź�� ����------------------------------------------------------------------
	void wash(Wash w) {
		Scanner scan = new Scanner(System.in);

		System.out.println("��ǰ�� :"+w.name);
		System.out.println("���� :"+w.price+"��");
		System.out.println("ũ�� :"+w.size+" ����");
		System.out.println("��� :"+w.shape +" ����");
		System.out.println("1) �����ϱ�   2)�ڷΰ���");
		switch (scan.nextInt()) {
		case 1:
			
			if(log.isEmpty()) {
				System.out.println("�α��� �� �̿��ϼ���.");
				break;
			}
			
			for (int i = 0; i < m.size(); i++) {
				Member mm = (Member)m.get(i);
				if(mm.id.equals(nowId)){ //�α��ε� ���̵� == ȸ�����̵�
					
					if(mm.money < w.price) {
						System.out.println("�ܾ��� �����մϴ�.");
						return;
					}
					
					
					mm.money -= w.price; //������
					mm.bonuspoint += w.bonusPoint; //����Ʈ ����
					buy.add(new Buy(mm.id,w.name,w.price,w.bonusPoint));
					System.out.println("���Ű� �Ϸ�Ǿ����ϴ�.");
				}
			}
			System.out.println();
			break;
		case 2:
			return;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
	
	
}
