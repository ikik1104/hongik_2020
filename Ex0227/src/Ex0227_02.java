
public class Ex0227_02 {

	public static void main(String[] args) {
		Tv t = new Tv();
		CaptionTv c = new CaptionTv();
		CaptionTv c2 = new CaptionTv();
		Tv t2 = new CaptionTv();
//		t2.caption(); 
		t2 = (Tv)c2;
		c2 = (CaptionTv) t2;
		
		t2.power();
		t2.channel=7;
		
		
		
		t.power();
		t.channel = 7;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println("Tv��ü ä�� :"+t.channel);
		
		c.power();
		c.channel=11;
		c.channelDown();
		c.channelDown();
		c.caption();
		c.text = "�ܿ�ձ�2 ��ȭ�ڸ��� �߰��Ǿ����ϴ�.";
		c.caption();
		System.out.println("CaptionTv ��ü ä�� :"+c.channel);
		
	}
	
	
}
