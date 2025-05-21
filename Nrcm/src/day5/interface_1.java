package day5;
interface I3{
	void add();
}
interface I2{
	void sub();
}
class S1{
	void add1() {
		System.out.println("hello world");
	}
}

public class interface_1 extends S1 implements I3,I2 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_1 i=new interface_1();
		i.add();
		i.sub();
		i.add1();

	}

}
