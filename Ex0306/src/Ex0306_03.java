import java.util.HashMap;
import java.util.Scanner;

public class Ex0306_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap map = new HashMap();
		map.put("myid", "1234");
		map.put("aaa", "1234");
		map.put("koitt", "k001");
		map.put("bbb", "1111");
		map.put("dream", "d0001");
		
		while(true) {
			System.out.println("id와 password를 입력하세요.(대소문자 구별) >>");
			System.out.print("id :");
			String id = scan.next().trim(); //trim() 앞뒤공백 없애줌
			
			//아이디 중복체크
			map.containsKey(id); //boolean으로 반환
			if(map.containsKey(id)==false) { //이 key값이 존재하는지?
				System.out.println("존재하지 않는 아이디 입니다.");
				continue;
			}
			System.out.print("password :");
			String pw = scan.next().trim(); //trim() 앞뒤공백 없애줌
			
			if(!(map.get(id).equals(pw))) { //value값 반환
				System.out.println("비밀번호가 일치하지 않습니다.");
				continue;
			}else {
				System.out.println("로그인이 완료되었습니다.");
				break;
			}
			
		}//while
		
		System.out.println("시스템종료");
		
	}
}
