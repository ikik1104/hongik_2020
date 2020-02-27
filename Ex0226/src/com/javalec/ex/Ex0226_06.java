package com.javalec.ex;

class Ex0226_06 {


public static void main(String[] args) {
	Data d = new Data();
	d.x = 10;
	System.out.println(d.x);
	
	Time t = new Time();
	t.setT(10);
	System.out.println(t.getT());
}



}

class Data{
	int x ;

}


class Time{
	private int t;
	int t1;

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}
	
}