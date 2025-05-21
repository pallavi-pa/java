package day6;
class Outer_class{
	void show() {
		System.out.println("hi");
	}
	class Inner_class{
		void print() {
			System.out.println("hello");
		}
	}
}

public class inner_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer_class o=new Outer_class();
		o.show();
		Outer_class.Inner_class i=new Outer_class().new Inner_class();
		i.print();
		

	}

}
