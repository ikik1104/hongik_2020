
public class Condi extends Product {
	static int cnt2;
	int product_n = 3000;

	{
		product_n += ++cnt2;
	}
	
	Condi(){
		price = 900;
		name = "¿¡¾îÄÁ";
	}
}
