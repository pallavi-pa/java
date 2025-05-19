package Assignment_1;
interface movie {
	void name();
}
interface character{
	void hero();
}
interface  movie_type{
	void action();
}
class movie1 implements movie{
	void print() {
		System.out.println("Movie details");
	}
	public void name() {
		System.out.println("hit-3");
	}
}
class character1 implements character{
	void print1() {
		System.out.println("printing character details");
	}
	public void hero() {
		System.out.println("Nani");
	}
}
class movie_type1 implements movie_type{
	void print2() {
		System.out.println("printing movie_type");
	}
	public void action() {
		System.out.println("action movie");
	}
}

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movie1 m=new movie1();
		m.print();
		m.name();
		character1 c=new character1();
		c.print1();
		c.hero();
		movie_type1 m1=new movie_type1();
		m1.print2();
		m1.action();
		

	}

}
