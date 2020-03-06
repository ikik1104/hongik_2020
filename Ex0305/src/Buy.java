import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Buy {
	String id;
	String name; //제품명
	int price; //제품가격
	int bonuspoint;//적립된 포인트
	String d;
	
	//??????????...............
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm");
	
	Buy(){
		
	}
	
	Buy(String id, String name, int price, int bonuspoint){
		this.id = id;
		this.name = name;
		this.price = price;
		this.bonuspoint = bonuspoint;
		this.d = format.format(cal.getTime());
		
	}

}
