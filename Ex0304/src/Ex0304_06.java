import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Ex0304_06 {

	public static void main(String[] args) {
		/*	< 회원가입 >
		 * 객체에 저장하기 ArrayList
		 * 
		 * 1)회원입력    2)회원출력
		 * 입력받을 때      id 대문자 1개이상, 5자리 이상, 중복체크 
		 * 			 pw 특수문자 1개이상, 길이는 8자리 이상
		 * 			주민번호 - 포함해서 14자리 까지 입력
		 * 			email @,.있는지 체크
		 * 
		 * 출력 		gender 0: 남자, 1:여자 (숫자로입력받는다 아니면 다시입력)
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);	
		User u = new User();
		
		while(true) {
		System.out.println("1) 회원입력         2) 회원출력");
		switch (scan.nextInt()) {
		case 1:
			System.out.println(" [  회원입력   ] ");
			u.insert();
			break;
		case 2:
			u.print();
			break;
		default:
			System.out.println("**** 잘못된 입력입니다. ****");
			break;
		}
		}
	}
}

class User{
	ArrayList<Member> m = new ArrayList<Member>();
	String[] sub = {"아이디","비밀번호","이름","주민번호","성별","이메일","전화번호"}; 
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		String id;
		String pw;
		String name;
		String s_number; //주민번호
		int gender; //성별
		String email; 
		String tel;
		
		//id
		while(true) {
			System.out.println("아이디를 입력하세요. (대문자 1개 포함, 5자리 이상)>>");
			id = scan.next();
			
			//아이디 중복체크
			if(!(m.isEmpty())) {
				boolean chk = id_chk(id); 
				if(chk == false) {
					System.out.println("**** 이미 존재하는 아이디입니다. ****");
					continue;
				}
			}
			
			//아이디 길이체크
			if(id.length() < 5) {
				System.out.println("**** 5자리 이상 입력해주세요 ****");
				continue;
			}
			
			//아이디 대문자 체크
			int id_cnt = 0;
			for (int i = 0; i < id.length(); i++) {
				if( id.charAt(i)>='A' && id.charAt(i) <= 'Z') { //대문자가 1개라도 들어가면
					id_cnt++;
				}
				if(id_cnt != 0) {
					break;
				}
			}
			if(id_cnt==0) {
				System.out.println("**** 대문자를 포함해야 합니다. ****");
				continue;
			}
		 break;
		}
			
			//비밀번호
		while(true) {
			System.out.println("비밀번호를 입력하세요. ( 특수문자 1개이상, 길이 8자리 이상 )");
			pw = scan.next();
			int pw_cnt = 0;
			if(pw.length() < 8) {
				System.out.println("**** 8자리 이상 입력하세요. ****");
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
				System.out.println("**** 특수문자를 1개이상 포함해야합니다. ****");
				continue;
			}
			
			break;
		}
		
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		
		//주민번호 입력
		while(true) {
		System.out.println("주민번호를 입력하세요. (-포함 14자리)");
		s_number = scan.next();
		if(s_number.length() != 14) {
			System.out.println("**** 잘못된 입력입니다. ****");
			continue;
		}
		
		if(!(s_number.contains("-"))) {
			System.out.println("'-'를 포함하여 입력하여주세요.");
			continue;
		}
			break;
		}
		
		//성별
		while(true) {
		System.out.println("성별을 선택하세요 0:남자  1:여자");
		gender = scan.nextInt();
			if(gender!=0 && gender!=1) {
				System.out.println("**** 잘못된 입력입니다. ****");
				continue;
			}
			break;
		}
		
		//이메일
		while(true) {
		System.out.println("이메일을 입력하세요.");
		email = scan.next();
		
		if(!(email.contains("@")&&email.contains("."))){
			System.out.println("**** 잘못된 이메일 형식입니다. 다시 입력하세요. ****");
			continue;
		}
		break;
		}
		
		System.out.println("전화번호를 입력하세요.");
		tel = scan.next();
		
		m.add(new Member(id,pw,name,s_number,gender,email,tel));
		System.out.println("회원등록이 완료되었습니다.");
		
		return;
	}
	
	//아이디 중복체크
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
			System.out.println("**** 입력된 회원이 없습니다. ****");
			return;
		}
		System.out.println(" [  회원출력   ] ");
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
				System.out.print("남자\t");
			}else if(m1.gender == 1){
				System.out.print("여자\t");
			}
			System.out.print(m1.email+"\t");
			System.out.println(m1.tel);
		}
	}
	
}
