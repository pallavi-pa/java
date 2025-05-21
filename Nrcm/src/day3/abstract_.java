package day3;
abstract class test1{
	abstract void add();
	abstract void sub();
	static void mul() {
		System.out.println("multiplication:"+3*4);
	}
	void div() {
		System.out.println("division:"+4/2);
	}
	void mod() {
		System.out.println("modulo:"+4%2);
	}
}
class test2 extends test1{
	public void add() {
		System.out.println("addition:"+ (2+3));
	}
	public void sub() {
		System.out.println("substraction:" +( 6-4));
	}
	
}
public class abstract_{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 a=new test2();
		a.add();
		a.sub();
		a.div();
		a.mod();
		test1.mul();

	}

}
