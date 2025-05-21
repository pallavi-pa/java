package cdc;

public class demo3 {
	static int r=4,l=5,b=3;
	int s=6;
	void area_of_circle() {
		System.out.println(3.14*r*r);
	}
	static void area_of_rectangle() {
		System.out.println(l*b);
	}
	void area_of_square() {
		System.out.println(s*s);
	}
	static void area_of_triangle() {
		int x=5,y=3;
		System.out.println(0.5*(x+y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 d=new demo3();
		d.area_of_circle();
		area_of_rectangle();
		d.area_of_square();
		area_of_triangle();

	}

}
