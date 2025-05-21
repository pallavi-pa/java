package day5;
class Sample44{
	public Sample44(){
		System.out.println("good evening");
	}
	int x=99;
	void print() {
		System.out.println("hello");
	}
}

public class super_ extends Sample44 {
	public super_() {
		super();
	}
	int y=10;
	void show() {
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		super_ s=new super_();
		s.show();

	}

}
