
public class Ref extends Product{ //�����
	
	static int cnt1;
	int product_n = 2000;
	{
		product_n += ++cnt1;
	}
	
	Ref(){
		price = 1500;
		name = "�����";
	}

}
