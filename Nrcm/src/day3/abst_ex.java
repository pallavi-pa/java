package day3;
abstract class test {
	abstract void show1();
	static void show2() {
		System.out.println("hi");
	}
	static void show3() {
		System.out.println("hello");
	}
	void show4() {
		System.out.println("hello worls");
	}
	
}
class test6 extends test{
	public void show1(){
		System.out.println("in show1 method");
		
	}
	void show5() {
		System.out.println("in show5 method");
	}
}

public class abst_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test6 t=new test6();
		t.show1();
		test.show2();
		test.show3();
		t.show4();
		t.show5();
		

	}

}
