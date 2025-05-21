package day5;
interface I1{
	void add();
	void sub();
}

public class interface_ implements I1 {
	public void add() {
		System.out.println("hi");
	}
	public void sub() {
		System.out.println("hello");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface_ i=new interface_();
		i.add();
		i.sub();

	}

}
