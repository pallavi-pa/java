package day4;

public class constructor_example {
	int a;
	int b;
	public constructor_example(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_example c=new constructor_example(30,40);
		c.add();

	}

}
