package day5;
class fruit{
	void benifits() {
		System.out.println("health");
	}
}
class mango extends fruit{
	void color() {
		System.out.println("yellow");
	}
}
class apple extends fruit{
	void price() {
		System.out.println("100kg");
	}
}
class banana extends fruit{
	void taste() {
		System.out.println("sweet");
	}
}
public class MULTI_PATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mango m=new mango();
		m.color();
		m.benifits();
		apple a=new apple();
		a.price();
		a.benifits();
		banana b=new banana();
		b.taste();
		b.benifits();

	}

}
