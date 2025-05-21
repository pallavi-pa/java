package day6;

public class Method_inner_class {
	void show() {
		System.out.println("hi");
		class Inner{
			void print() {
				System.out.println("hello");
			}
		}
		Inner i=new Inner();
		i.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Method_inner_class s=new  Method_inner_class();
		s.show();

	}

}
