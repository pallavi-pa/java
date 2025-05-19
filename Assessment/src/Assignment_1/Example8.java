package Assignment_1;
interface RCB{
	void home_ground();
}
interface CSK{
	void best_player();
}
interface MI{
	void captain();
}
interface IPL extends RCB,CSK,MI{
	void best_team();
}
class Cricket implements IPL{
	public void home_ground() {
		System.out.println("RCB home_ground is chinnaSwamy");
	}
	public void best_player() {
		System.out.println("best player of csk is Dhoni");
	}
	public void captain() {
		System.out.println("Mi caption is Hardik");
	}
	public void best_team() {
		System.out.println("RCB is the best team of IPL");
	}
	void display() {
		System.out.println("-------IPL Facts------");
	}
}

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c=new Cricket();
		c.display();
		c.best_team();
		c.captain();
		c.best_player();
		c.home_ground();

	}

}
