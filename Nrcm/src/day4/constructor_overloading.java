package day4;

public class constructor_overloading {
	int x,y,z;
	public  constructor_overloading() {
		System.out.println("welcome to my profile");
	}
	public  constructor_overloading(int x) {
		this.x=x;
		System.out.println("10th marks:"+x);
	}
	public  constructor_overloading(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("10th and inter marks:"+x + ","+y);
	}
	public  constructor_overloading(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("10th ,inter and btech marks:"+x + ","+y +","+z);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor_overloading c=new constructor_overloading();
		constructor_overloading c1=new constructor_overloading(10);
		constructor_overloading c2=new constructor_overloading(10,959);
		constructor_overloading c3=new constructor_overloading(10,959,88);
		
	}

}
