package day5;
class Bike {
	void Speed() {
		System.out.println("250 km per hours");
	}
}
class Bmw extends Bike{
	void rev(){
		System.out.println("10000cc");
	}
}
class Model extends Bmw{
	void price() {
		System.out.println("just 30 lakhs");
	}
}

public class multi_level {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m=new Model();
		m.Speed();
		m.rev();
		m.price();

	}

}
