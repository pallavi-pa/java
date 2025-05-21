package cdc;

public class demo {
	int a=6,b=5;
	static int p=3,q=5;
	void not() {
		int x=5,y=4;
		System.out.println(!(x>y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d=new demo();
		System.out.println((d.a>d.b)&&(d.a>=d.b));
		System.out.println((p>q)||(p>=q));
		d.not();

	}

}
