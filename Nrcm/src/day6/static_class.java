package day6;
class Sample26{
	private static void show() {
		System.out.println("hi");
	}
	static class Test26{
		static void print() {
			System.out.println("hello");
			show();
		}
	}
}
public class static_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample26.Test26.print();

	}

}
