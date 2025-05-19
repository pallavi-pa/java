package Assignment_1;
interface Hyderabad{
	void famous_dish();
}
interface Maharastra{
	void famous_crop();
}
interface UttarPradesh extends Hyderabad,Maharastra{
	void famous_place();
}
class State{
	void Rajesthan() {
		System.out.println("Rajesthan is famous for sweets");
	}
}
class Country extends State implements UttarPradesh{
    void print() {
    	System.out.println("------Various famous this all over India------");
    }
	public void famous_dish() {
		System.out.println("Hyderabad is Famous for Biryani");
	}
	public void famous_crop() {
		System.out.println("Maharastra's Famous crop is wheat");
	}
	public void famous_place() {
		System.out.println("Famous Place in UttarPradesh is payagraj");
	}
}

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.print();
		c.famous_dish();
		c.famous_crop();
		c.famous_place();
		c.Rajesthan();
		

	}

}
