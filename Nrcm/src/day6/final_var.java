package day6;
class test1{
	final void show() {
		System.out.println("hi");
	}
}

public class final_var extends test1 {
	void show() {                       //we cannot access final method here 
	    final int a=23;
		System.out.println(a);
		a=34;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final_var f=new final_var();
		f.show();

	}

}
