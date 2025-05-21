package day5;
class Animal{
	void Sleep() {
		System.out.println("Sleeping");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("dog is barking");
	}
}

public class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.bark();
		d.Sleep();
	}

}
