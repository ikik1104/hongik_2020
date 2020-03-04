
public class Ex0303_04 {
	public static void main(String[] args) {
		
		Exception e = new Exception("고의로 발생시켰음");
		System.out.println(1);
		System.out.println(2);
		try {
			throw e;//예외 발생
		} catch (Exception e2) {
			System.out.println("에러 메세지 :"+ e.getMessage());
			e.printStackTrace();
			System.out.println();
		}
		System.out.println(3);
		System.out.println("완료");
	}
}
