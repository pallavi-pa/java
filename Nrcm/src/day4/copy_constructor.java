package day4;

public class copy_constructor {
	int x;
	int y;
	public copy_constructor(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public copy_constructor(copy_constructor c1) {
		this.x=c1.x;
		this.y=c1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy_constructor c1=new copy_constructor(30,20);
		copy_constructor c2=new copy_constructor(c1);

	}

}
