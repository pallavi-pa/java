package day5;

public class method_overloading {
	void show() {
		System.out.println("good morning");
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method_overloading m=new method_overloading();
		m.show();
		m.show(2,3);
		m.show(2.3,1);
		m.show("pallavi","patil");

	}

}
