package day4;
class test{
	private void add() {
		System.out.println("hi");
	}
}

public class Access_specifiers extends test {

	public static void main(String[] args) {
		Access_specifiers a=new Access_specifiers();
		a.add();// we are trying to access the private method
	}

}
