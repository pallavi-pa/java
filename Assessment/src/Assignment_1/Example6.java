package Assignment_1;
interface Animal{
	void dog();
}
class Bird{
	void peacock() {
		System.out.println("Peacock Danceses");
	}
}
class Action extends Bird implements Animal{
	void print() {
		System.out.println("Actions done by and birds And Animals");
	}
	public void dog() {
		System.out.println("Dogs bark");
   }
	
}
class water_animal {
	void fish() {
		System.out.println("fish swims");
	}
}
class waterAndLandAnimal extends water_animal{
	void frog() {
		System.out.println("frog lives both inside and outside of water");
	}
}

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action a=new Action();
		a.print();
		a.dog();
		a.peacock();
		waterAndLandAnimal w=new waterAndLandAnimal();
		w.fish();
		w.frog();
		

	}

}
