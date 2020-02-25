
public class Product {

	static int count;
	int serialNo;
	String color;// white, black, red
	int tvInch; //42 50 72
	String standard; // lcd, led

	/*생성자의 공통적인 부분들을 인스턴스 초기화블럭으로 빼면 한번만 사용할 수 있다.
	 *공통적인게 없으면 만들 필요가 없다.
	 *	count++;
		serialNo = count;
	 */
	{
		count++;
		serialNo = count;
	}//초기화 블록
	
	
	Product(){
		//기본생성자
		
	}
	
	Product(String color, int tvInch, String standard){
		this.color = color;
		this.tvInch = tvInch;
		this.standard = standard;
	}
	
	
}
