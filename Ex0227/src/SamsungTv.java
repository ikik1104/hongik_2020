
public class SamsungTv extends Product{
	static int cnt;
	int product_n = 1000;
	
	{
		product_n += ++cnt;
	}
	
	SamsungTv(){
		price = 1000;
		name = "TV";
	}
}
