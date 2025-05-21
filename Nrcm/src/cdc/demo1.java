package cdc;

public class demo1 {
	int x=67,y=20;
	static int p=30,q=40;
	void add() {
		int a=20,b=2;
		System.out.println(x+y);
		System.out.println(p+q);
		System.out.println(a+b);
	}
	static void show() {
		int a=3,b=4;
		System.out.println(p+q);
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 d=new demo1();
		d.add();
		show();
		

	}

}
