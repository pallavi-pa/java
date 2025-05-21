package day5;
interface A1{
	void add1();
}
interface A2{
	void add2();
}
interface A3 extends A1,A2{
	void add3();
}

public class interface2 implements A3{
	public void add1() {
		System.out.println("hi");
	}
	public void add2() {
		System.out.println("hello");
	}
	public void add3() {
		System.out.println("hello world");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 i=new interface2();
		i.add1();
		i.add2();
		i.add3();

	}

}
